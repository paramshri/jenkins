package com.test
class Test implements Serializable {
	final jenkins
	Test(jenkins){
		jenkins.echo "Hi"
		jenkins.echo jenkins.getClass().toString()
		String cmd = """echo command triggered"""
		jenkins.echo jenkins.command cmd
		jenkins.echo "Hello world"
	}

}