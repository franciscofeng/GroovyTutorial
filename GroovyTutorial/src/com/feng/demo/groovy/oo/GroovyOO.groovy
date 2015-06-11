package com.feng.demo.groovy.oo

class GroovyOO {
	String name = ''
	int age = 0

	GroovyOO(name,age)
	{
		this.name = name
		this.age = age
	}
	
	GroovyOO()
	{
		
	}
	static main(args) {
		def GroovyOO demo = new GroovyOO()
		//attribute access
		demo.setName('tom')
		assert demo.name == 'tom'
		
		demo['age'] = 10
		assert demo.getAge() == 10
		
		// use ? operator to avoid null check 
		demo.setName(null);
		assert demo?.name?.length() == null
		
		//construct
		def first = new GroovyOO('first',1)
		assert first.name == 'first'
		def second = ['second',2] as GroovyOO
		assert second['age'] == 2
		GroovyOO third = ['third',3]
		assert third.getName() == 'third'
		def fouth = new GroovyOO(name:'fouth')
		assert fouth.name == 'fouth'
		
		//dynamic invoke
		Object a = 10
		Object b = 'something'
		assert demo.returnStr(a) == 'object'
		assert demo.returnStr(b) == 'string'
		
	}
	
	String returnStr(Object o)
	{
		return 'object'
	}
	String returnStr(String s)
	{
		return 'string'
	}

}
