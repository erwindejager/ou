package casusgenst.ou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.jxpath.JXPathContext;

import casusgenrt.antlr.ou.HandleCaseProcessLexer;
import casusgenrt.antlr.ou.HandleCaseProcessParser;

public class Utils {
	
	static int result = 0;
	
	public static int testRequirement(String requirement, int i) throws IOException {
		result = 0;
		StringReader sr = new StringReader(requirement);
        BufferedReader br = new BufferedReader(sr);
        
		CodePointCharStream input = CharStreams.fromReader(br);
		
		HandleCaseProcessLexer lexer = new HandleCaseProcessLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		HandleCaseProcessParser parser = new HandleCaseProcessParser(tokens);
		
		List<String> syntaxErrors = new ArrayList<>();
		
		parser.removeErrorListeners();
		parser.addErrorListener(new BaseErrorListener() {
			@Override
			public void syntaxError(org.antlr.v4.runtime.Recognizer<?,?> recognizer, 
					java.lang.Object offendingSymbol, int line, int charPositionInLine, 
					java.lang.String msg, org.antlr.v4.runtime.RecognitionException e) {
				syntaxErrors.add(msg);
				System.out.println(Integer.toString(i) +  " FAIL : "+ msg);
				Utils.result = -1;
			}			
		});		
		
		parser.setErrorHandler(new BailErrorStrategy());
		
		try {
			ParseTree tree = parser.handlecaseprocess(); 
	//		System.out.println(Integer.toString(i) + " PASSED : "+ tree.toStringTree(parser)); // print LISP-style tree
			result = 1;
		} catch (ParseCatchException e) {
			if (e.isError()) {
				System.out.println(Integer.toString(i) + " FAIL : " + e.getMsg());	
				result = -2;
			} else {
	//			System.out.println(Integer.toString(i) + " PASSED : Handle catch : " + e.getMsg());
				result = 2;
			}
		} catch (Exception e) {
//			System.out.println(Integer.toString(i) + " Parse exception : " + e.toString());			
//			System.out.println(Integer.toString(i) + " Parse exception : " + e.getCause());			
		}
		
		return result;
	}
	
	// add and remove single quotes in Strings
	public static String addQuote(String s) {
		return "'" + s + "'";
	}

	public static String trimQuote(String s) {
		return s.replace("'", "");
	}

	public static boolean verify(Map<String, String> vMap,Map<String,Object> varMap) {
		boolean result = true;
		for (String key : vMap.keySet()) {
			if (isTypeString(key, varMap)) {
				String expectedVal = Utils.trimQuote(vMap.get(key));
				String actualValue = getVarValue(key, varMap);
				if (!expectedVal.equals(actualValue)) {
					System.out.println(
							"Actual: " + key + " : " + actualValue + " <> Expected: " + key + " : " + expectedVal);
					result = false;
				}
			} else {
				int expectedVal = Integer.valueOf(Utils.trimQuote(vMap.get(key))).intValue();
				int actualValue = getVarValueInt(key, varMap);
				if (expectedVal != actualValue) {
					System.out.println("Actual: " + key + " : " + Integer.valueOf(actualValue).toString()
							+ " <> Expected: " + key + " : " + Integer.valueOf(expectedVal).toString());
					result = false;
				}
			}
		}
		return result;
	}

	public static void setVarValue(String path, String value, Map<String,Object> varMap) {
		getCtx(path, varMap).createPathAndSetValue(getxPath(path), value);
	}

	public static String getVarValue(String path, Map<String,Object> varMap) {
		return (String) getCtx(path, varMap).getValue(getxPath(path));
	}

	public static Object getVarValueO(String path, Map<String,Object> varMap) {
		return getCtx(path, varMap).getValue(getxPath(path));
	}

	public static Integer getVarValueInt(String path, Map<String,Object> varMap) {
		Integer i = 0;
		if (getCtx(path, varMap).getValue(getxPath(path)) instanceof Double) {
			Double dd = (Double) getCtx(path, varMap).getValue(getxPath(path));
			i = dd.intValue();
		} else {
			i = (Integer) getCtx(path, varMap).getValue(getxPath(path));
		}
		return i;
	}
	
	private static JXPathContext getCtx(String varPath, Map<String,Object> varMap) {
		// System.out.println("s0: " + varPath);
		String s = getCleanPath(varPath);
		// System.out.println("s1: " + s);
		if (s.indexOf('.') != -1) {
			s = s.substring(0, s.indexOf('.'));
		} else if (s.indexOf('/') != -1) {
			s = s.substring(0, s.indexOf('/'));
		}
		// System.out.println("s2: " + s);
		return (JXPathContext) varMap.get(s);
	}

	private static String getxPath(String varPath) {
		String path = getCleanPath(varPath);
		if (varPath.indexOf('.') != -1) {
			path = path.substring(path.indexOf('.') + 1);
		} else if (path.indexOf('/') != -1) {
			path = path.substring(path.indexOf('/') + 1);
		}
		if (!varPath.equals(getCleanPath(varPath))) {
			path = varPath.replace(getCleanPath(varPath), path);
		}
		return path.replace(".", "/");
	}

	private static String getCleanPath(String s) {
		String result = s;
		Pattern pattern = Pattern.compile("\\((.*?)\\)");
		Matcher matcher = pattern.matcher(s);
		if (matcher.find()) {
			result = matcher.group(1);
			result = (result != null && result.length() > 0) ? result : s;
		}
		return result;
	}

	private static boolean isTypeString(String path, Map<String,Object> varMap) {
		return (getCtx(path, varMap).getValue(getxPath(path)) instanceof String);
	}

}
