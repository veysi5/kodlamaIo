package eTicaretSistemi.bussiness.concretes;

import java.util.*;

import eTicaretSistemi.bussiness.abstracts.VerificationService;
import eTicaretSistemi.core.MailSender;

public class VerificationManager implements VerificationService {
	
	 private MailSender mailSender;
	    public VerificationManager(MailSender mailSender){
	        this.mailSender = mailSender;
	    }

	@Override
	public boolean verificate(String mail) {
	     String code = "";
	        try{
	            Thread.sleep(1000);
	            code = mailSender.send(mail);
	        }catch (Exception e){
	            System.out.println("HATA!!!");
	        }
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Lütfen gelen kodu giriniz: ");
	        String enteredCode = scan.nextLine();
	        if(!code.equals(enteredCode)){
	            return false;
	        }
	        return true;
		
	}

}
