package com.down.Static;

import org.junit.Test;

public class AccountTest {
	@Test
	public void testAccount() {
		Account a1 = new Account();
		Account a2 = new Account("asdfes",20000);
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a1.getBalance());
		System.out.println(a1.getId());
	}
}
