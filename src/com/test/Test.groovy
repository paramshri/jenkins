package com.test
class Test implements Serializable {
	final jenkins
	Test(jenkins){
		jenkins.echo "Hi"
		jenkins.echo jenkins.getClass().toString()
		String cmd = """echo command triggered"""
		def output = jenkins.command(cmd, true, '#/bin/bash +x')
		jenkins.echo $output
		jenkins.echo "Hello world"
	}

}