package com.feng.demo.groovy.regex

import java.lang.String.CaseInsensitiveComparator;

class RegPattern {

	static main(args) {
		def str = 'sun son song so'
		def pattern = ~/so./ // pay attention to = ~,not =~
		def matcher = pattern.matcher(str) //pre-compile, faster than =~
		assert matcher[0] == 'son'
		
		assert (~/\w{4}/).isCase('this')
		
		switch('bear'){
			case ~/..../:
				assert true
				break
			default:
				assert false
				break
		}
		
		def companys = ['google','oracle','ibm','microsoft']
		assert companys.grep(~/\w{6}/) == ['google','oracle']
	}

}
