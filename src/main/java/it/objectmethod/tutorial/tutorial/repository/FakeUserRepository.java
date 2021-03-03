package it.objectmethod.tutorial.tutorial.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import it.objectmethod.tutorial.tutorial.domain.User;

@Component
public class FakeUserRepository {

	public User findById(Long id) {
		User u = new User();
		u.setId(id);
		u.setUsername("user" + id);
		u.setNome("Nome" + id);
		u.setCognome("Cognome" + id);
		u.setPassword("12345");
		return u;
	}

	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		for (long i = 1; i < 5; i++) {
			users.add(findById(i));
		}
		return users;
	}

}
