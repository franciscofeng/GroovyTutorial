package com.feng.demo.groovy.grammar

class Numbers {

	static main(args) {
		def a = 3;
		assert a.plus('2') == '32'
		assert a.plus(2) == 5
		
		assert a+3 == 6
		assert a**2 == 9
	}

}
