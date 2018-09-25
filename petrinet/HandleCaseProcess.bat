rem run  BPEL2PNML
java -jar BPEL2PNML.jar HandleCaseProcess.bpel > HandleCaseProcessBPEL2PNML.info

rem run bpel2owfn petrinet
bpel2owfn.exe -i HandleCaseProcess.bpel -m petrinet -f lola -f info --output=HandleCaseProcess_pn 2> HandleCaseProcessBPEL2OWFN_PN.info

rem run bpel2owfn petrinet
bpel2owfn.exe --input=HandleCaseProcess.bpel  --mode=choreography --format=lola --parameter=communicationonly -f dot -f info --output=HandleCaseProcess_ch 2> HandleCaseProcessBPEL2OWFN_CH.info

rem fix dot file
sed -e s/fixedsize// HandleCaseProcess_ch.dot > HandleCaseProcess_ch.tmp
copy /Y HandleCaseProcess_ch.tmp HandleCaseProcess_ch.dot
del /Q HandleCaseProcess_ch.tmp

rem run wofbpel
wofbpel.exe +b HandleCaseProcessBPEL2PNML.xml > HandleCaseProcess.wofbpel
echo +b >> HandleCaseProcess.wofbpel
wofbpel.exe +l HandleCaseProcessBPEL2PNML.xml >> HandleCaseProcess.wofbpel
echo +l >> HandleCaseProcess.wofbpel
wofbpel.exe +m HandleCaseProcessBPEL2PNML.xml >> HandleCaseProcess.wofbpel
echo +m >> HandleCaseProcess.wofbpel
wofbpel.exe +s HandleCaseProcessBPEL2PNML.xml >> HandleCaseProcess.wofbpel
echo +s >> HandleCaseProcess.wofbpel

rem run lola
lola -c full HandleCaseProcess_pn.lola 2>HandleCaseProcessLOLA_PN.output
lola -c full HandleCaseProcess_ch.lola 2>HandleCaseProcessLOLA_CH.output

dot -Tbmp HandleCaseProcess_ch.dot -o HandleCaseProcess_ch.bmp




	