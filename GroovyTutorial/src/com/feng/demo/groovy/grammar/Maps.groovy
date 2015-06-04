package com.feng.demo.groovy.grammar

class Maps {

	static main(args) {
		def map = ['tom':1,'jerry':2]
		map['john'] = 3
		assert map['tom'] == 1
		assert map.get('jerry') == 2
		assert map.size() == 3
	
	}

}
