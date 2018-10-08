bpel2owfn.exe -i GitTest.bpel -m petrinet -f pnml -f dot -o
voeg header en page toe conform hp.pnml

ndrio GitTest.pnml GitTest.lola

ndrio -PNML HandleRequest.pnml -dot
ndrio -PNML GitTest.pnml -dot > GitTestndrio.dot

lola --detailed-help >detailhelp

lola --formula="ALLPATH ALWAYS EXPATH EVENTUALLY (1.internal.Exiting > 0)" GitTest.lola
lola --formula="EF DEADLOCK" HandleRequest.lola -s -p
lola --formula="AG (p583 > 0)" HandleRequest.lola


lola --formula="EF (out.HandleRequestWSPL.checkProcessability = 0)" HandleRequestndrio.lola

delete fixedsize uit *.dot
dot -Tbmp loan.dot -o loan.bmp

c:\ws\tst>ndrio -NDR -pnml swtpn.ndr swtpn.pnml

c:\ws\tst>ndrio -NDR -lola swtpn.ndr
