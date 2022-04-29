package com.test
class Test implements Serializable {
	final jenkins
	Test(jenkins){
		println jenkins.getClass()
		jenkins.echo "Hello world"
	}

}