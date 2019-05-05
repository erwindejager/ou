#!/bin/sh

java wsat -BPEL loanapproval loanapproval.wsdl loanapproval.bpel assessor loanassessor.wsdl loanassessor.bpel approver loanapprover.wsdl loanapprover.bpel customer loanassessor.wsdl customer.bpel  -MAPENTRY approver customer loanapproval approver loanapproval -MAPENTRY customer approver loanapproval -MAPENTRY assessor customer loanapproval


