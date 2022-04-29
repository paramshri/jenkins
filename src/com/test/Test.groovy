package com.test
class Test implements Serializable {
	final jenkins
	Test(jenkins){
		jenkins.echo "Hi"
		jenkins.echo jenkins.getClass().toString()
		Class thisClass = jenkins.getClass;
            Method[] methods = thisClass.getDeclaredMethods();

            for (int i = 0; i < methods.length; i++) {
                jenkins.echo methods[i].toString()
            }
		jenkins.echo "Hello world"
	}

}