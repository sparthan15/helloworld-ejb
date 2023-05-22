package com.cliente.example;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.example.ExampleRemote;
import com.example.HellowWorldRemote;

public class Test1 {

	public static void main(String[] args) {

		Properties prop = new Properties();
		prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		prop.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		prop.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		prop.put("jboss.naming.client.ejb.context", true);
		Context context;
		try {
			context = new InitialContext(prop);
			System.out.println("Hello");
			ExampleRemote exampleRemote = (ExampleRemote) context
					.lookup("ejb:/test-2/ExampleRemoteImpl!com.example.ExampleRemote");
			System.out.println(exampleRemote.yea());
			HellowWorldRemote hellowWorld = (HellowWorldRemote) context
					.lookup("ejb:/test-1/HellowWorldBean!com.example.HellowWorldRemote");

			System.out.println(hellowWorld);
			System.out.println(hellowWorld.hellowWorld());
			System.out.println("Hello2");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
