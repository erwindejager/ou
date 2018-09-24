GNU BPEL2oWFN 2.0.3 (compiled Jul 20 2007)

Copyright (C) 2006, 2007 Niels Lohmann, Christian Gierds and Martin Znamirowski
Copyright (C) 2005 Niels Lohmann and Christian Gierds

License GPLv3+: GNU GPL version 3 or later <http://gnu.org/licenses/gpl.html>
GNU BPEL2oWFN is free software: you are free to change and redistribute it.
There is NO WARRANTY, to the extent permitted by law.

See http://www.gnu.org/software/bpel2owfn for more information

<wofbpel version="1.0.2" status="unreleased">
Usage: wofbpel [+-][blmrst1] xml-file
Options:
	b: Behavioral analysis.
	   Gives all transitions that are not relaxed sound.
	l: Look-ahead analysis.
	   Gives per action the events that may follow that action.
	m: Multiple event-handler analysis.
	   Checks for mulitple event-handlers for the same event.
	r: Reduction.
	   Reduces the net using specialized Murata reduction rules
	s: Structural analysis.
	   Gives all transitions that are not covered by any transition invariant.
	t: TPN file.
	   Gives the Petri net in TPN file format.
	1: In case of an unbounded Petri net, this setting will generate a larger coverability graph.
	   (In the regular coverability graph, the proper completion marking might not be present.

Options are switched on using +, and switched off using -.
</wofbpel> :http://yawlfoundation.org/babeltools/

BPEL2PNML : http://yawlfoundation.org/babeltools/

LoLA 2.0 : http://service-technology.org/lola/index.html / https://www2.informatik.hu-berlin.de/top/lola/loladoku/index.html