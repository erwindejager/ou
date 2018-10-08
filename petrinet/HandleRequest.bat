rem run  BPEL2PNML
java -jar BPEL2PNML.jar HandleRequest.bpel > HandleRequestBPEL2PNML.info

rem run bpel2owfn petrinet
bpel2owfn.exe -i HandleRequest.bpel -m petrinet -f lola -f info --output=HandleRequest_pn 2> HandleRequestBPEL2OWFN_PN.info

rem run bpel2owfn petrinet
bpel2owfn.exe -i HandleRequest.bpel -m petrinet -f lola -f dot -f info --output=HandleRequest_pn 2> HandleRequestBPEL2OWFN_PN.info
bpel2owfn.exe -i HandleRequest.bpel -m pretty --output=HandleRequest_pn
bpel2owfn.exe --input=HandleRequest.bpel  --mode=choreography --format=lola --parameter=communicationonly -f dot -f info --output=HandleRequest_ch 2> HandleRequestBPEL2OWFN_CH.info
bpel2owfn.exe -i HandleRequest.bpel -m pretty --output=HandleRequest_ch

rem fix dot file
sed -e s/fixedsize// HandleRequest_ch.dot > HandleRequest_ch.tmp
copy /Y HandleRequest_ch.tmp HandleRequest_ch.dot
del /Q HandleRequest_ch.tmp

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
lola -c full HandleRequest_pn.lola 2>HandleRequestLOLA_PN.output
lola -c full HandleRequest_ch.lola 2>HandleRequestLOLA_CH.output

dot -Tbmp HandleRequest_ch.dot -o HandleRequest_ch.bmp




	