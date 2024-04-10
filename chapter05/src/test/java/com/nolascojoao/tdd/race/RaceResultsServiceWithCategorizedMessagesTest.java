package com.nolascojoao.tdd.race;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class RaceResultsServiceWithCategorizedMessagesTest {

	@Test
	public void subscribedClientShouldReceiveMessagesInSelectedCategory() {
		RaceResultsServiceWithCategorizedMessages raceResults = new RaceResultsServiceWithCategorizedMessages(
				mock(Logger.class));
		Message message = mock(Message.class);
		Client clientA = mock(Client.class);

		// Subscribe client to horse racing category
		raceResults.addSubscriber(clientA, "horse");
		raceResults.send(message, "horse");

		// Verify that the client receives the message
		verify(clientA).receive(message);
	}

	@Test
	public void subscribedClientShouldNotReceiveMessagesInDifferentCategory() {
		RaceResultsServiceWithCategorizedMessages raceResults = new RaceResultsServiceWithCategorizedMessages(
				mock(Logger.class));
		Message message = mock(Message.class);
		Client clientA = mock(Client.class);

		// Subscribe client to horse racing category
		raceResults.addSubscriber(clientA, "horse");
		raceResults.send(message, "f1"); // Sending message in F1 category

		// Verify that the client does not receive the message
		verify(clientA, never()).receive(message);
	}

	@Test
	public void unsubscribedClientTryingToUnsubscribeShouldNotCauseError() {
		RaceResultsServiceWithCategorizedMessages raceResults = new RaceResultsServiceWithCategorizedMessages(
				mock(Logger.class));
		Client clientA = mock(Client.class);

		// Unsubscribe a client that is not subscribed
		raceResults.removeSubscriber(clientA, "horse");

		// No error should occur
		// We just want to verify that no method calls on the client occur
		verifyNoInteractions(clientA);
	}

}
