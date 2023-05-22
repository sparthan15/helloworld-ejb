package com.example;
 

/**
 * Session Bean implementation class HellowWorld
 */
@jakarta.ejb.Stateless
public class HellowWorldBean implements HellowWorldRemote {


	@Override
	public String hellowWorld() {
		return "Yeaaaaa!!";
	}

}
