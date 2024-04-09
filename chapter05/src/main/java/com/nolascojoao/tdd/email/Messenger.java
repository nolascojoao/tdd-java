package com.nolascojoao.tdd.email;

public class Messenger {

	private MailServer mailServer;
	private TemplateEngine templateEngine;

	// Collaborators injected using constructor
	public Messenger(MailServer mailServer, TemplateEngine templateEngine) {
		this.mailServer = mailServer;
		this.templateEngine = templateEngine;
	}
	
	/**
	 * Sends a message to the client using the provided template.
	 * 
	 * @param client	The client to whom the message will be sent.
	 * @param template	The template used for composing the message.
	 */
	public void sendMessage(Client client, Template template) {
		// Prepare message content using the template engine
		String msgContent = templateEngine.prepareMessage(template, client);
		
		// Send the message via the mail server
		mailServer.send(client.getEmail(), msgContent);
	}

}
