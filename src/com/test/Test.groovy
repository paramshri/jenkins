package com.test
class Test implements Serializable {
	final jenkins
	Test(jenkins){
		jenkins.echo "Hi"
		jenkins.echo jenkins.getClass().toString()
		jenkins.echo jenkins.command(cmd="echo command triggered",returnStdout=true)
		jenkins.echo "Hello world"
	}

}