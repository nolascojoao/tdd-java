package com.nolascojoao.tdd.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserServiceImplTest {

	private UserServiceImpl userService;
	private UserDAO userDAO;
	private SecurityService securityService;

	@BeforeEach
	public void setUp() {
		userDAO = mock(UserDAO.class);
		securityService = mock(SecurityService.class);
		userService = new UserServiceImpl(userDAO, securityService);
	}

	@Test
	public void testAssignPassword() throws Exception {
		User user = new User("username", "oldPassword");
		String newPassword = "newPassword";
		when(securityService.md5("oldPassword")).thenReturn(newPassword);

		userService.assignPassword(user);

		assertEquals(newPassword, user.getPassword());
		verify(userDAO).updateUser(user);
	}

}
