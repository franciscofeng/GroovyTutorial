package com.feng.demo.groovy.regex

class RegMatcher {

	static main(args) {
	
		def str = 'do you have any groovy book'
		
		assert str ==~ /(\w+ \w+)*/
		
		def matcher = (str ==~ /(\w+ \w+)*/)
		assert matcher instanceof java.lang.Boolean
		
		def s = 'sha she shi sho shu'
		assert s =~ /s.e/; //partial match
		assert (s ==~ /s.e/) == false; //not full match
		
		def aeiou = s.replaceAll(/sh/, '')
		assert aeiou == 'a e i o u'
		
		def words = s.split(/ /)
		assert words.size() == 5
		assert words[0] == 'sha'
	}

}
