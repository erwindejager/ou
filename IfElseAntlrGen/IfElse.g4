grammar IfElse;

options {language=Java;}

@header {
import java.util.HashMap;
import java.util.Map;
}

@members {
String input;
String output;
Map<String,String> varMap = new HashMap<>();
Map<String,String> vMap = new HashMap();

 boolean verify() {
  boolean result = true;
  for (String key : varMap.keySet()) {
   if (!varMap.get(key).equals(vMap.get(key + "_"))) {
    System.out.println(key + " : " + varMap.get(key) + " <> " + key + "_ : " + vMap.get(key + "_"));
    result = false; 
   }
  }
  return result;
 }
}

ifelse : v0 

'receive'

( 'If_0'
{ if (!input.equals("0")) System.out.println("ERROR: NOT input.equals('0')"); }

'Assign_1'
{
output="tns:result";
output="1";
}

'replyIf'

| 'else'
{ if (input.equals("0")) System.out.println("ERROR: input.equals('0')"); }

'Assign_0'
{
output="tns:result";
output="0";
}

'ReplyElse'
)
v;

v0 : '(' input','output ')'; 

v : '(' input_','output_ ')'
{
varMap.put("input", input);
varMap.put("output", output);
vMap.put("input_", $input_.text);
vMap.put("output_", $output_.text);

if (!verify()) {
 System.out.println("ERROR: unexpected output");
}
};

input : INT { input=$INT.text; };
output : INT { output=$INT.text; };
input_ : INT;
output_ : INT;

INT  : ([0-9|?])+ ;
WS  : [ \t\r\n]+ -> skip ;



