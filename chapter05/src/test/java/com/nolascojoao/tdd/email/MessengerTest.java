package com.nolascojoao.tdd.email;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class MessengerTest {

	private static final String CLIENT_EMAIL = "some@email.com";
	private static final String MSG_CONTENT = "Dear John! You are hired.";

	@Test
	public void shouldSendEmail() {
		// Mock objects for dependencies
		Template template = mock(Template.class);
		Client client = mock(Client.class);
		MailServer mailServer = mock(MailServer.class);
		TemplateEngine templateEngine = mock(TemplateEngine.class);

		// Creating instance of Messenger with mocked dependencies
		Messenger sut = new Messenger(mailServer, templateEngine);

		// Stubbing behavior for mocked objects
		when(client.getEmail()).thenReturn(CLIENT_EMAIL);
		when(templateEngine.prepareMessage(template, client)).thenReturn(MSG_CONTENT);

		// Calling method to test
		sut.sendMessage(client, template);

		// Verifying interaction
		verify(mailServer).send(CLIENT_EMAIL, MSG_CONTENT);
	}

}
