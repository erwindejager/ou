%- Fresh Market Update Service
%- three peers: customer, broker, research department.

Topdown {
	Schema{
		PeerList{Customer, Broker, ResearchDept},
		TypeList{
				Register[
					orderID[xsd:bool], 
				    requestlist[
					  stockID[xsd:int]{1,3}
					] ,
				    payment [
					  accountNum [xsd:int] |
					  creditCard [xsd:int]
					]
				], 

				Reject[
					orderID[xsd:bool] 
				],

				Accept[
					orderID[xsd:bool] 
				],

				Cancel[
					orderID[xsd:bool]
				],

				Bill[
					orderID[xsd:bool]
				],
				

				Ack[
					orderID[xsd:bool]
				],

				Request[
					orderID[xsd:bool] ,
					stockID[xsd:int]
				],

				Report[
					orderID[xsd:bool] ,
					stockID[xsd:int]
				],

				Terminate[
					orderID[xsd:bool] 
				]
		},
		MessageList{
			reginfo { Customer -> Broker : Register},
			cancel { Customer -> Broker : Cancel},
			ack { Customer -> Broker : Ack},
			reject { Broker -> Customer: Reject},
			accept { Broker -> Customer: Accept},
			bill { Broker -> Customer: Bill},
			request { Broker -> ResearchDept : Request},
			report { ResearchDept -> Customer : Report},
			terminate { Broker -> ResearchDept : Terminate }
		} 
	},

	%-  guarded conversation protocol
	GProtocol{
		States{s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12},
		InitialState {s1},
		FinalStates{s4},
		TransitionRelation{
			t1{ s1 -> s2 : reginfo, 
				Guard{ true	} 
			},

			t2{ s2 -> s3 : reject, 
				Guard{ 	true	=> 
						$reject[
							//orderID:= $reginfo//orderID
						]
				} 
			},

			t3{ s3 -> s4 : terminate, 
				Guard{ 	true	=> 
						$terminate[
							//orderID:= $reginfo//orderID
						]
				} 
			},

			

			t4{ s2 -> s5 : accept, 
				Guard{ true	=>
						$accept[
							//orderID:= $reginfo//orderID
						]
				} 
			},

			t5{ s5 -> s6 : request, 
				Guard{ true	=>
						$request[
							//orderID:= $reginfo//orderID,
							//stockID:= $reginfo//stockID[position()=1]
						]
				} 
			},

			t6{ s6 -> s7 : report, 
				Guard{ true	=>
						$report[
							//orderID:= $request//orderID
						]
				} 
			},

			t7{ s7 -> s8 : ack, 
				Guard{ true	=>
						$ack[
							//orderID:= $report//orderID
						]
				} 
			},

			t8{ s8 -> s9 : request, 
				Guard{ $request//stockID != $reginfo//stockID
						[position() = last()] =>
						$request[
							//orderID:= $reginfo//orderID,
							//stockID:= $reginfo//stockID 
								 [position() = 
								  $reginfo//stockID[/. = $request//stockID]
										/position() + 1
								 ] 
						]
				} 
			},

			t9{ s9 -> s10 : report, 
				Guard{ true	=>
						$report[
							//orderID:= $request//orderID
						]
				} 
			},

			t10{ s10 -> s8 : ack, 
				Guard{ true	=>
						$ack[
							//orderID:= $report//orderID
						]
				} 
			},
			t11{ s7 -> s11 : cancel, 
				Guard{ true	=>
						$cancel[
							//orderID:= $reginfo//orderID
						]
				} 
			},
			t12{ s10 -> s11 : cancel, 
				Guard{ true	=>
						$cancel[
							//orderID:= $reginfo//orderID
						]
				} 
			},

			t13{ s11 -> s12 : bill, 
				Guard{ 
						true	=>
						$bill[
							//orderID:= $reginfo//orderID
						]
				} 
			},

			t14{ s8 -> s12 : bill, 
				Guard{ 
						$request//stockID = 
						$reginfo//stockID [position() = last()] =>
						$bill[
							//orderID:= $reginfo//orderID
						]
				} 
			},

			t15{ s12 -> s4: terminate, 
				Guard{ true	=>
						$terminate[
							//orderID:= $reginfo//orderID
						]
				} 
			}


		}
	}
}
