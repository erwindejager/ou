lola --formula="(in.client.handleRequest > 0) -> (ALLPATH ALWAYS EXPATH EVENTUALLY (p42 > 0))" HandleRequest_ch.lola
lola --formula="(in.client.handleRequest > 0) -> (AG EF (p42 > 0))" HandleRequest_ch.lola
lola --formula="(in.client.handleComplexRequest > 0) -> (ALLPATH ALWAYS NOT DEADLOCK)" HandleRequest_ch.lola -s -p
lola --formula="(in.client.handleComplexRequest > 0) -> (AG NOT DEADLOCK)" HandleRequest_ch.lola -s -p
lola --formula="(in.client.handleComplexRequest > 0) -> (AG EF (p42 > 0))" HandleRequest_ch.lola -s -p