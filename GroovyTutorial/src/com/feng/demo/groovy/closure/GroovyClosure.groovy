package com.feng.demo.groovy.closure

class GroovyClosure {

	static main(args) {
		//eachLine will auto close resource
		def content = '';
		new File('resources/testfile.txt').eachLine {line -> content += line+' '}
		assert 'this is first line this is second line this is last line ' == content

		// use range and it
		def sum = 0
		(1..10).each {sum += it}
		assert sum == 55

		//define a closure
		def closureA = {line -> println line}
		(1..5).each(closureA);
		//closure method
		(1..5).each (getPrinter())
		//use a common method as a closure, use &
		assert (5..15).find (new GroovyClosure().&checkBigValue) == 11
		
		//invoke a closure
		def adder = {x,y -> return x+y}
		assert adder(2,4) == 6
		assert adder.call(5,7) == 12
		
		//grep
		assert [1,2,3,4,5].grep{it > 2} == [3,4,5]
	}

	def static Closure getPrinter(){
		return {line -> println line}
	}
	def boolean checkBigValue(int value){
		//bigger than 10 is a big value
		return value>10 ?true:false
	}
}
