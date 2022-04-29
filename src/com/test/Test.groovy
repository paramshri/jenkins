package com.test
class Test implements Serializable {
	final jenkins
	Test(jenkins){
		jenkins.echo "Hi"
		jenkins.echo jenkins.getClass().toString()
		jenkins.command("echo command triggered")
		jenkins.echo "Hello world"
	}

}