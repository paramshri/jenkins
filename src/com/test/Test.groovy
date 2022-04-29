package com.test
class Test implements Serializable {
	final jenkins
	Test(jenkins){
		jenkins.echo "Hi"
		jenkins.echo jenkins.getClass().toString()
		jenkins.echo jenkins.command.toString()
		jenkins.echo "Hello world"
	}

}