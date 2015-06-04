package com.feng.demo.groovy.grammar

class GroovyString {

	static main(args) {
		def name = 'tom'
		def age = 10
		def all = "$name is $age years old"
		def all2 = '$name is $age years old'
		assert all == 'tom is 10 years old'
		assert all2 == '$name is $age years old'
		
		def threesingle = '''long long ago
								long long ago'''
		
		def threedouble = """many many $name
							
							"""
		assert threedouble.contains('tom') == true
		assert threesingle.length() == 35
		
		def date = new Date()
		println("today is ${date.getDateString()}")
	}

}
