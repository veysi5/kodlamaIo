package eTicaretSistemi.bussiness.concretes;

import eTicaretSistemi.bussiness.abstracts.AuthService;
import eTicaretSistemi.bussiness.abstracts.UserService;
import eTicaretSistemi.bussiness.abstracts.VerificationService;
import eTicaretSistemi.entities.concretes.User;

public class AuthManger implements AuthService{
	
	private UserService userService;
	private VerificationService verificationService;
	//private LoginWithGmailService loginWithGmailService;
	
	
	

	@Override
	public boolean login(User user) {
		
		  User userToCheck = this.userService.getByMail(user.getEmail());
	        if(userToCheck == null){
	            System.out.println("Kayýtlý kullanýcý bulunamadý");
	            return false;
	        }
	        if(!user.getPassword().equals(userToCheck.getPassword())){
	            System.out.println("Mail ya da parola yanlýþ");
	            return false;
	        }
	        System.out.println("Giriþ baþarýlý...");
	        return true;
	
	}

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean loginWithGoogle(User user) {
		
	     if(!(this.userService.checkMailCorret(user.getEmail()) &&
	                this.userService.getByMail(user.getEmail()) == null &&
	                user.getName().length() >= 2 && user.getSurname().length() >= 2 &&
	                user.getPassword().length() >= 6)){
	            System.out.println("Kayýt baþarýsýz...");
	            return false;
	        }
	        System.out.println("Mail gönderiliyor...");
	        if(!verificationService.verificate(user.getEmail())){
	            System.out.println("Kodu doðru girmelisiniz!");
	            return false;
	        }
	        System.out.println("Hesabýnýz onaylandý ve kaydýnýz yapýldý.");
	        this.userService.add(user);
	        return true;
	}
	
	
}
