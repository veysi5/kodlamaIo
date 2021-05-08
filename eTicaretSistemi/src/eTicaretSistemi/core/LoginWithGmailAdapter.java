package eTicaretSistemi.core;

import eTicaretSistemi.Google.LoginWithGmail;

public class LoginWithGmailAdapter implements LoginWithGmailService {

	@Override
	public boolean þogin(String mail, String password) {
		LoginWithGmail loginWithGmail = new LoginWithGmail();
		return loginWithGmail.login(mail, password);
	}

}
