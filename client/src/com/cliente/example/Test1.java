package com.cliente.example;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.example.HellowWorldRemote;

public class Test1 {

	public static void main(String[] args) throws NamingException {
		Properties prop = new Properties();
		prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		prop.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		prop.put(Context.PROVIDER_URL, "remote://127.0.0.1:8080");
		//prop.put("jboss.naming.client.ejb.context", false);
		Context context = new InitialContext(prop);

		HellowWorldRemote hellowWorld = (HellowWorldRemote) context.lookup("ejb:/test-1/HellowWorld!com.example.HellowWorldRemote");
		System.out.println("Hello");
		System.out.println(hellowWorld.hellowWorld());
		System.out.println("Hello2");
	}

}
