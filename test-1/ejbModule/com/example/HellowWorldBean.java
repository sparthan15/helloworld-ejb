package com.example;
 
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HellowWorld
 */
@Stateless(name = "HellowWorld")
public class HellowWorldBean implements HellowWorldRemote {


	@Override
	public String hellowWorld() {
		return "Yeaaaaa!!";
	}

}
