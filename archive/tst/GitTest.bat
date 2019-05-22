rem run  BPEL2PNML
java -jar BPEL2PNML.jar GitTest.bpel > GitTestBPEL2PNML.info

rem run bpel2owfn petrinet
bpel2owfn.exe -i GitTest.bpel -m petrinet -f lola -f info --output=GitTest_pn 2> GitTestBPEL2OWFN_PN.info
bpel2owfn.exe -i GitTest.bpel -m pretty --output=GitTest_pn


rem run bpel2owfn petrinet
bpel2owfn.exe --input=GitTest.bpel  --mode=choreography --format=lola --parameter=communicationonly -f dot -f info --output=GitTest_ch 2> GitTestBPEL2OWFN_CH.info
bpel2owfn.exe -i GitTest.bpel -m pretty --output=GitTest_ch

rem fix dot file
sed -e s/fixedsize// GitTest_ch.dot > GitTest_ch.tmp
copy /Y GitTest_ch.tmp GitTest_ch.dot
del /Q GitTest_ch.tmp

sed -e s/fixedsize// GitTest_pn.dot > GitTest_pn.tmp
copy /Y GitTest_pn.tmp GitTest_pn.dot
del /Q GitTest_pn.tmp

rem run wofbpel
wofbpel.exe +b GitTestBPEL2PNML.xml > GitTest.wofbpel
echo +b >> GitTest.wofbpel
wofbpel.exe +l GitTestBPEL2PNML.xml >> GitTest.wofbpel
echo +l >> GitTest.wofbpel
wofbpel.exe +m GitTestBPEL2PNML.xml >> GitTest.wofbpel
echo +m >> GitTest.wofbpel
wofbpel.exe +s GitTestBPEL2PNML.xml >> GitTest.wofbpel
echo +s >> GitTest.wofbpel

rem run lola
lola -c full GitTest_pn.lola 2>GitTestLOLA_PN.output
lola -c full GitTest_ch.lola 2>GitTestLOLA_CH.output

dot -Tbmp GitTest_pn.dot -o GitTest_pn.bmp
dot -Tbmp GitTest_ch.dot -o GitTest_ch.bmp




	