package com.feng.demo.groovy.grammar

class BeanClass {
	String name;
	Integer age;

	static main(args) {
		def bean = new BeanClass()
		bean.name = 'tom'
		bean.age = 3
		assert bean.getName() == 'tom'
		assert bean.getAt('age') == 3
		assert bean.getProperties().size() == 3 //class,age,name
	
	}

}
