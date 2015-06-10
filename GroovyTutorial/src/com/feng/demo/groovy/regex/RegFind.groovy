package com.feng.demo.groovy.regex

class RegFind {

	static main(args) {

		assert '\\java' == /\java/
		
		def str = 'i have a dream'
		assert str =~ /\w/
		assert str =~ /^i/
		assert str =~ /m$/
		
		def finder = (str =~ /\b/)
		assert finder instanceof java.util.regex.Matcher;
		
	}

}
