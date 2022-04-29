package com.test
class Test implements Serializable {
	final jenkins
	Test(jenkins){
		jenkins.echo "Hi"
		println jenkins.getClass()
		jenkins.echo "Hello world"
	}

}