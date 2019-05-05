Topdown{
	Schema{
		PeerList{ A, B, C, D },
		MessageList{
				a{A -> B: EmptyType}, 
				c{C -> D: EmptyType}
		} 
	},

	SProtocol{
		States{s1,s2,s3},
		InitialState {s1},
		FinalStates{s3},
		TransitionRelation{
			t1{ s1 -> s2: a, Guard{true} },
			t2{ s2 -> s3: c, Guard{true} }
		}
	}
}
