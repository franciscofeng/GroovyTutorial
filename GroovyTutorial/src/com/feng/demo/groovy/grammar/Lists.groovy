package com.feng.demo.groovy.grammar

class Lists {

	static main(args) {
		
		def alist = ['f','r','a','n','c','i','s']
		assert alist.size() == 7
		alist.add('c');
		alist[8] = 'o'
		assert alist[7] == 'c'
		assert alist.size() == 9
	
	}

}
