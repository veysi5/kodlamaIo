package eTicaretSistemi.core;

import eTicaretSistemi.Google.LoginWithGmail;

public class LoginWithGmailAdapter implements LoginWithGmailService {

	@Override
	public boolean �ogin(String mail, String password) {
		LoginWithGmail loginWithGmail = new LoginWithGmail();
		return loginWithGmail.login(mail, password);
	}

}
