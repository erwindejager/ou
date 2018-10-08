lola --formula="in.client.process > 0 -> AG EF(p4 > 0)" GitTest_ch.lola
lola --formula="in.client.process > 0 -> AG EF(p4 > 0 AND out.client.process > 0)" GitTest_ch.lola
lola --formula="in.client.process > 0 -> ALLPATH ALWAYS NOT DEADLOCK" GitTest_ch.lola -s -p