d:\tools\pc_spin648>spin649_windows64.exe ./hello.pml
      passed first test!
1 process created

d:\tools\pc_spin648>spin649_windows64.exe ./m/request.pml
spin: ./m/request.pml:73, Error: syntax error   saw 'an identifier' near 'type_type_chaineCaracteres'
spin: ./m/request.pml:87, Error: syntax error   saw 'an identifier' near 'type_type_chaineCaracteres'
spin: ./m/request.pml:92, Error: syntax error   saw 'an identifier' near 'type_type_chaineCaracteres'
spin: ./m/request.pml:95, Error: syntax error   saw 'an identifier' near 'type_type_chaineCaracteres'
spin: ./m/request.pml:148, Error: undeclared variable: payload  saw 'operator: ='

d:\tools\pc_spin648>spin649_windows64.exe -p ./m/gittest.pml
  0:    proc  - (:root:) creates proc  0 (:init:)
Starting client with pid 1
  1:    proc  0 (:init::1) creates proc  1 (client)
  1:    proc  0 (:init::1) ./m/gittest.pml:52 (state 1) [(run client())]
Starting GitTest with pid 2
  2:    proc  0 (:init::1) creates proc  2 (GitTest)
  2:    proc  0 (:init::1) ./m/gittest.pml:53 (state 2) [(run GitTest())]
  3:    proc  1 (client:1) ./m/gittest.pml:24 (state 3) [(1)]
  4:    proc  1 (client:1) ./m/gittest.pml:24 (state 4) [valclient = 10]
  5:    proc  1 (client:1) ./m/gittest.pml:26 (state 6) [.(goto)]
  6:    proc  1 (client:1) ./m/gittest.pml:26 (state 7) [output_Send.payload = valclient]
  7:    proc  1 (client:1) ./m/gittest.pml:27 (state 8) [canal_client_IN!process,input_Receive.payload]
  8:    proc  2 (GitTest:1) ./m/gittest.pml:35 (state 1)        [canal_client_IN?process,input.payload]
  9:    proc  2 (GitTest:1) ./m/gittest.pml:40 (state 2)        [output.payload = input.payload]
 10:    proc  2 (GitTest:1) ./m/gittest.pml:43 (state 3)        [canal_client_OUT!process,output.payload]
 10:    proc  2 (GitTest:1)               terminates
 11:    proc  1 (client:1) ./m/gittest.pml:28 (state 9) [canal_client_OUT?process,output_Send.payload]
 11:    proc  1 (client:1)           terminates
 11:    proc  0 (:init::1)       terminates
3 processes created

D:\tools\pc_spin648>spin649_windows64.exe -run -DSAFETY ./m/gittest.pml

(Spin Version 6.4.9 -- 29 June 2018)
        + Partial Order Reduction

Full statespace search for:
        never claim             - (none specified)
        assertion violations    +
        cycle checks            - (disabled by -DSAFETY)
        invalid end states      +

State-vector 148 byte, depth reached 13, errors: 0
       24 states, stored
        3 states, matched
       27 transitions (= stored+matched)
        1 atomic steps
hash conflicts:         0 (resolved)

Stats on memory usage (in Megabytes):
    0.004       equivalent memory usage for states (stored*(State-vector + overhead))
    0.291       actual memory usage for states
  128.000       memory used for hash table (-w24)
    0.534       memory used for DFS stack (-m10000)
  128.730       total actual memory usage


unreached in proctype client
        (0 of 10 states)
unreached in proctype GitTest
        (0 of 4 states)
unreached in init
        (0 of 4 states)

pan: elapsed time 0.015 seconds
pan: rate      1600 states/second

D:\tools\pc_spin648>spin649_windows64.exe -run -DNP -l ./m/gittest.pml

(Spin Version 6.4.9 -- 29 June 2018)
        + Partial Order Reduction

Full statespace search for:
        never claim             + (:np_:)
        assertion violations    + (if within scope of claim)
        non-progress cycles     + (fairness disabled)
        invalid end states      - (disabled by never claim)

State-vector 156 byte, depth reached 26, errors: 0
       47 states, stored (70 visited)
       57 states, matched
      127 transitions (= visited+matched)
        2 atomic steps
hash conflicts:         0 (resolved)

Stats on memory usage (in Megabytes):
    0.008       equivalent memory usage for states (stored*(State-vector + overhead))
    0.291       actual memory usage for states
  128.000       memory used for hash table (-w24)
    0.534       memory used for DFS stack (-m10000)
  128.730       total actual memory usage


unreached in proctype client
        (0 of 10 states)
unreached in proctype GitTest
        (0 of 4 states)
unreached in init
        (0 of 4 states)

pan: elapsed time 0.034 seconds
pan: rate 2058.8235 states/second

gebruiker@Asus-R556L /cygdrive/d/tools/pc_spin648
$ ./spin649_windows64.exe  -g -l -p -r -s -X gittest.pml
  0:    proc  - (:root:) creates proc  0 (:init:)
Starting client with pid 1
  1:    proc  0 (:init::1) creates proc  1 (client)
  1:    proc  0 (:init::1) gittest.pml:52 (state 1)     [(run client())]

Starting GitTest with pid 2
  2:    proc  0 (:init::1) creates proc  2 (GitTest)
  2:    proc  0 (:init::1) gittest.pml:53 (state 2)     [(run GitTest())]

  3:    proc  1 (client:1) gittest.pml:23 (state 1)     [(1)]
                client(1):output_Send.payload = 0
                client(1):input_Receive.payload = 0

  4:    proc  1 (client:1) gittest.pml:23 (state 2)     [valclient = 100]
                queue 1 (canal_client_IN):
                client(1):valclient = 100
                client(1):output_Send.payload = 0
                client(1):input_Receive.payload = 0

  5:    proc  1 (client:1) gittest.pml:26 (state 6)     [.(goto)]
                client(1):output_Send.payload = 0
                client(1):input_Receive.payload = 0

  6:    proc  1 (client:1) gittest.pml:26 (state 7)     [output_Send.payload = valclient]
                client(1):output_Send.payload = 100
                client(1):input_Receive.payload = 0

  7:    proc  1 (client:1) gittest.pml:27 (state -)     [values: 1!process,0]
  7:    proc  1 (client:1) gittest.pml:27 (state 8)     [canal_client_IN!process,input_Receive.payload]
                queue 1 (canal_client_IN): [process,0]
                client(1):output_Send.payload = 100
                client(1):input_Receive.payload = 0

  8:    proc  2 (GitTest:1) gittest.pml:35 (state -)    [values: 1?process,0]
  8:    proc  2 (GitTest:1) gittest.pml:35 (state 1)    [canal_client_IN?process,input.payload]
                queue 1 (canal_client_IN):
                queue 2 (canal_client_OUT):

  9:    proc  2 (GitTest:1) gittest.pml:40 (state 2)    [output.payload = input.payload]

 10:    proc  2 (GitTest:1) gittest.pml:43 (state -)    [values: 2!process,0]
 10:    proc  2 (GitTest:1) gittest.pml:43 (state 3)    [canal_client_OUT!process,output.payload]
                queue 2 (canal_client_OUT): [process,0]

 11:    proc  1 (client:1) gittest.pml:28 (state -)     [values: 2?process,0]
 11:    proc  1 (client:1) gittest.pml:28 (state 9)     [canal_client_OUT?process,output_Send.payload]
                queue 2 (canal_client_OUT):
                client(1):output_Send.payload = 0
                client(1):input_Receive.payload = 0

 11:    proc  2 (GitTest:1) terminates
 11:    proc  1 (client:1) terminates
 11:    proc  0 (:init::1) terminates
3 processes created
