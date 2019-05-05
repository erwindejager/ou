Topdown{
	Schema{
		PeerList{ U , V, X, Y},
		MessageList{
				uTox{U -> X : EmptyType}, 
				uToy{U -> Y : EmptyType}, 
				uTov{U -> V : EmptyType}, 
				xToy{X -> Y : EmptyType}, 
				xTov{X -> V : EmptyType}, 
				yTox{Y -> X : EmptyType}, 
				yTov{Y -> V : EmptyType}, 
				vTou{V -> U : EmptyType}, 
				vTox{V -> X : EmptyType}, 
				vToy{V -> Y : EmptyType} 
		} 
	},

	SProtocol{
		States{s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,
				s17,s18,s19,s20,s21},
		InitialState {s1},
		FinalStates{s8,s13,s21},
		TransitionRelation{
			t1{ s1 -> s2: uTox, Guard{ true } },
			t2{ s2 -> s3: uTov, Guard{ true } },
			t3{ s3 -> s4: vToy, Guard{ true } },
			t4{ s4 -> s5: xToy, Guard{ true } },
			t5{ s5 -> s6: xToy, Guard{ true } },
			t6{ s6 -> s7: yTox, Guard{ true } },
			t7{ s7 -> s8: xTov, Guard{ true } },
			t8{ s1 -> s9: uToy, Guard{ true } },
			t9{ s9 -> s10: uTox, Guard{ true } },
			t10{ s10 -> s11: xToy, Guard{ true } },
			t11{ s11 -> s12: xTov, Guard{ true } },
			t12{ s12 -> s13: yTov, Guard{ true } },
			t13{ s11 -> s14: yTov, Guard{ true } },
			t14{ s14 -> s13: xTov, Guard{ true } },
			t15{ s1 -> s15: uToy, Guard{ true } },
			t16{ s15 -> s16: uTov, Guard{ true } },
			t17{ s16 -> s17: vTox, Guard{ true } },
			t18{ s17 -> s18: xToy, Guard{ true } },
			t19{ s18 -> s19: yTox, Guard{ true } },
			t20{ s19 -> s20: xToy, Guard{ true } },
			t21{ s20 -> s21: yTov, Guard{ true } }
		}
	}
}
