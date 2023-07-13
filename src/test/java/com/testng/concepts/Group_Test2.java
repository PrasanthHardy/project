package com.testng.concepts;

import org.testng.annotations.Test;

public class Group_Test2 {
	private void searchlaptop() {
		System.out.println("search laptop");

		}
		@Test(groups = {"smoke","sanity"})
		private void searchheadset() {
		System.out.println("searchheadset");
		}
		@Test(groups = {"smoke","sanity"})
		private void verifyhomepage() {
		System.out.println("verify the homepage");
		}
		@Test
		private void logout() {
		System.out.println("logout");

		}
		@Test
		private void browserclose() {
			System.out.println("browserclose");
		}
		@Test
		private void browserquit() {
		System.out.println("browser quit");
		}
		}




