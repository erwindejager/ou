rem run  BPEL2PNML
java -jar BPEL2PNML.jar HandleRequest.bpel > HandleRequestBPEL2PNML.info

rem run bpel2owfn
bpel2owfn.exe -i HandleRequest.bpel -m petrinet -f lola -f dot -o 2> HandleRequestBPEL2OWFN.info

rem fix dot file
sed -e s/fixedsize// HandleRequest.dot > HandleRequest.tmp
copy /Y HandleRequest.tmp HandleRequest.dot
del /Q HandleRequest.tmp

rem run wofbpel
wofbpel.exe +b HandleRequestBPEL2PNML.xml > HandleRequest.wofbpel
echo +b >> HandleRequest.wofbpel
wofbpel.exe +l HandleRequestBPEL2PNML.xml >> HandleRequest.wofbpel
echo +l >> HandleRequest.wofbpel
wofbpel.exe +m HandleRequestBPEL2PNML.xml >> HandleRequest.wofbpel
echo +m >> HandleRequest.wofbpel
wofbpel.exe +s HandleRequestBPEL2PNML.xml >> HandleRequest.wofbpel
echo +s >> HandleRequest.wofbpel

rem run lola
lola -c full HandleRequest.lola 2>HandleRequestLOLA.output
 
rem dot -Tbmp HandleRequest.dot -o HandleRequest.bmp




	