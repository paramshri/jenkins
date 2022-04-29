package com.test
class Test implements Serializable {
	final jenkins
	Test(jenkins){
		jenkins.echo "Hi"
		jenkins.echo jenkins.getClass().toString()
		def methods = jenkins.getClass().declaredMethods.collect { it.name }
		jenkins.command(cmd:"""echo Hi""", returnStdout:true)
		jenkins.echo methods.toString()
	}

}