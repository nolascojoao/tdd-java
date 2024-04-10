package com.nolascojoao.tdd.race;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class RaceResultsServiceWithCategorizedMessages {

	private Map<String, Set<Client>> subscribersByCategory = new HashMap<>();
	private Logger logger;

	public RaceResultsServiceWithCategorizedMessages(Logger logger) {
		this.logger = logger;
	}

	public void addSubscriber(Client client, String category) {
		subscribersByCategory.computeIfAbsent(category, k -> new HashSet<>()).add(client);
	}

	public void send(Message message, String category) {
		Set<Client> subscribers = subscribersByCategory.getOrDefault(category, new HashSet<>());
		for (Client client : subscribers) {
			client.receive(message);
			logger.log(null);
		}
	}

	public void removeSubscriber(Client client, String category) {
		Set<Client> subscribers = subscribersByCategory.get(category);
		if (subscribers != null) {
			subscribers.remove(client);
		}
	}

}
