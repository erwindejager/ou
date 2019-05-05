Topdown{
	Schema{
		PeerList{ A, B, C },
		MessageList{
				aTob{A -> B : EmptyType}, 
				bToa{B -> A : EmptyType}, 
				aToc{A -> C : EmptyType} 
		} 
	},

	SProtocol{
		States{s1,s2,s3,s4,s5,s6},
		InitialState {s1},
		FinalStates{s3,s6},
		TransitionRelation{
			t1{ s1 -> s2 : bToa, Guard{ true } },
			t2{ s2 -> s3 : aTob, Guard{ true } },
			t3{ s1 -> s4 : aTob, Guard{ true } },
			t4{ s4 -> s5 : bToa, Guard{ true } },
			t5{ s5 -> s6 : aToc, Guard{ true } }
		}
	}
}
