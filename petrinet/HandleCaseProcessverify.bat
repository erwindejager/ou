lola --formula="(in.client.handleCase > 0) -> (ALLPATH ALWAYS EXPATH EVENTUALLY (p71 > 0))" HandleCaseProcess_ch.lola
lola --formula="(in.client.handleCase > 0) -> (AG EF (p71 > 0))" HandleCaseProcess_ch.lola
lola --formula="(in.client.handleObjection > 0) -> (ALLPATH ALWAYS NOT DEADLOCK)" HandleCaseProcess_ch.lola -s -p
lola --formula="(in.client.handleObjection > 0) -> (AG NOT DEADLOCK)" HandleCaseProcess_ch.lola -s -p
lola --formula="(in.client.handleObjection > 0) -> (AG EF (p57 > 0))" HandleCaseProcess_ch.lola -s -p