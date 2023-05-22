package com.example;

import jakarta.ejb.Remote;

@Remote
public interface HellowWorldRemote {

	String hellowWorld();
}
