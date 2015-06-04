package com.feng.demo.groovy.firsttry

class FirstTry {

	static main(args) {
	 def list = [1,2,'mylist','4']
	 def ret = []
	 list.each { ret.add(it+1)}
	 assert 2 == ret[0]
	 assert 3 == ret[1]
	 assert 'mylist1' == ret[2]
	 assert '41' == ret[3]
	}

}
