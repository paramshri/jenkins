package com.test
class Test implements Serializable {
	final jenkins
	Test(jenkins){
		jenkins.echo "Hi"
		jenkins.echo jenkins.getClass().toString()
		def methods = jenkins.getClass().declaredMethods.collect { it.name }
		def output = jenkins.command(cmd:"""echo Hi""", returnStdout:true)
		
		output.each{ls -> jenkins.echo ls}

		jenkins.echo methods.toString()
	}

}