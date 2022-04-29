package com.test
class Test implements Serializable {
	final jenkins
	Test(jenkins){
		jenkins.echo "Hi"
		jenkins.echo jenkins.getClass().toString()
		jenkins.echo jenkins.command "echo command triggered", true
		jenkins.echo "Hello world"
	}

}