package com.nolascojoao.tdd.email;

public interface TemplateEngine {
	
	String prepareMessage(Template template, Client client);

}
