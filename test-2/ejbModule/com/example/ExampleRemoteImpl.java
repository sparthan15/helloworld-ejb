package com.example;

import jakarta.ejb.Stateless;

@Stateless
public class ExampleRemoteImpl implements ExampleRemote{

	@Override
	public String yea() {
		// TODO Auto-generated method stub
		return "Whaaaat!";
	}

}
