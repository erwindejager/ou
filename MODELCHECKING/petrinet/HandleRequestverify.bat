lola --formula="(in.client.handleRequest > 0) -> (ALLPATH ALWAYS EXPATH EVENTUALLY (p33 > 0))" HandleRequest_ch.lola
lola --formula="(in.client.handleRequest > 0) -> (AG EF (p33 > 0))" HandleRequest_ch.lola
lola --formula="(in.client.handleComplexRequest > 0) -> (ALLPATH ALWAYS NOT DEADLOCK)" HandleRequest_ch.lola -s -p
lola --formula="(in.client.handleComplexRequest > 0) -> (AG NOT DEADLOCK)" HandleRequest_ch.lola -s -p
lola --formula="(in.client.handleComplexRequest > 0) -> (AG EF (p33 > 0))" HandleRequest_ch.lola -s -p

lola --formula="(ALLPATH ALWAYS EXPATH EVENTUALLY (p623 > 0))" HandleRequest_pn.lola
lola --formula="(AG EF (p623 > 0))" HandleRequest_pn.lola
lola --formula="(p1 > 0) -> (ALLPATH ALWAYS NOT DEADLOCK)" HandleRequest_pn.lola -s -p