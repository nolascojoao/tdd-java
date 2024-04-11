package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyNoInteractions;

import org.junit.jupiter.api.Test;

public class RequestHandlerTest {

	/**
	 * Verifies that an InvalidRequestException is thrown when an invalid request is handled,
	 * and ensures that no interactions occur with the RequestProcessor.
	 */
	@Test
	public void shouldThrowInvalidRequestException() {
		Request invalidRequest = createInvalidRequest();
		RequestProcessor requestProcessor = mock(RequestProcessor.class);
		RequestHandler sut = new RequestHandler(requestProcessor);

		// Ensure that an InvalidRequestException is thrown when handling the invalid request
		assertThrows(InvalidRequestException.class, () -> {
			sut.handle(invalidRequest);
		});

		// Verify that no interactions occur with the RequestProcessor
		verifyNoInteractions(requestProcessor);
	}

	private Request createInvalidRequest() {
		return new Request(null);
	}

}
