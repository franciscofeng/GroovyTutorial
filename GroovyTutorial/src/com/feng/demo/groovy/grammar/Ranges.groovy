package com.feng.demo.groovy.grammar

class Ranges {

	static main(args) {
		def rang = 1..5
		assert rang.reverse() == 5..1
		assert rang.contains(2) == true
		assert rang.get(1) == 2
		assert rang.from == 1
		assert rang.to == 5
		assert rang.size() == 5
	}

}
