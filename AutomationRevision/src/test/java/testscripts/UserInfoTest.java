package testscripts;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.UserInfoPage;

public class UserInfoTest extends Base {

	@Test
	public void testUserInfoPage() {
		// Navigate to User Info Page
		UserInfoPage userInfoPage = new UserInfoPage(driver);

		// Validate user information
		System.out.println("User Name: " + userInfoPage.getUserName());
		System.out.println("User Age: " + userInfoPage.getUserAge());
		System.out.println("User Address: " + userInfoPage.getUserAddress());

		for (int i = 0; i < userInfoPage.getRelationshipCount(); i++) {
			System.out.println(userInfoPage.getRelationshipName(i) + " - " + userInfoPage.getRelationshipAge(i));
		}

	}
}