package com.feng.demo.groovy.xml

class XMLHandler {

	static main(args) {
		
		String xml = '''
		<list>
        	<technology>
            	<name>Groovy</name>
        	</technology>
		</list>
        '''
		
		def XMLHandler handler = new XMLHandler()
		assert handler.getNameByParser(xml) == 'Groovy'
		assert handler.getNameBySlurper(xml) == 'Groovy'
	
	}
	//lazy load, good for short xml,need to reload if xml is changed
	def String getNameBySlurper(String xml)
	{
		def list = new XmlSlurper().parseText(xml);
		assert list instanceof groovy.util.slurpersupport.GPathResult
		list.technology.name
	}
	
	//all load, good for update and read
	def String getNameByParser(String xml)
	{
		def list = new XmlParser().parseText(xml)		
		assert list instanceof groovy.util.Node
		list.technology.name.text()
	}

}
