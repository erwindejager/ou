lola --formula="(in.client.handleCase > 0) -> (ALLPATH ALWAYS EXPATH EVENTUALLY (p62 > 0))" HandleCaseProcess_ch.lola
lola --formula="(in.client.handleCase > 0) -> (AG EF (p62 > 0))" HandleCaseProcess_ch.lola
lola --formula="(in.client.handleObjection > 0) -> (ALLPATH ALWAYS NOT DEADLOCK)" HandleCaseProcess_ch.lola -s -p
lola --formula="(in.client.handleObjection > 0) -> (AG NOT DEADLOCK)" HandleCaseProcess_ch.lola -s -p
lola --formula="(in.client.handleObjection > 0) -> (AG EF (p62 > 0))" HandleCaseProcess_ch.lola -s -p

ALLPATH ALWAYS EXPATH EVENTUALLY (p988 > 0)
lola --formula="(ALLPATH ALWAYS EXPATH EVENTUALLY (p988 > 0))" HandleCaseProcess_pn.lola
lola --formula="(AG EF (p988 > 0))" HandleCaseProcess_pn.lola
lola --formula="(p5 > 0) -> (ALLPATH ALWAYS NOT DEADLOCK)" HandleCaseProcess_pn.lola -s -p 