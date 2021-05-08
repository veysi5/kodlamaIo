package eTicaretSistemi;

import java.util.*;

import eTicaretSistemi.bussiness.abstracts.UserService;
import eTicaretSistemi.bussiness.concretes.AuthManger;
import eTicaretSistemi.bussiness.concretes.UserManager;
import eTicaretSistemi.bussiness.concretes.VerificationManager;
import eTicaretSistemi.dataAccess.concretes.SqlDatabaseDao;
import eTicaretSistemi.entities.concretes.User;

public class Main {

		  static boolean loggedIn;
		    static Scanner scan = new Scanner(System.in);
		    static UserService userService = new UserManager(new SqlDatabaseDao());
		    static AuthManger authManager = new AuthManger(userService,new VerificationManager(new VerificationManager());
		    public static void main(String[] args) {


		        String mainMessage = "********** xxx sistemine hoþ geldiniz **********\n\n" +
		                "1. Giriþ yap\n" +
		                "2. Google ile giriþ yap\n" +
		                "3. Kayýt ol\n" +
		                "4. Çýkýþ Yap\n" +
		                "0. Ana mesajý göster\n" +
		                "************************************************";
		        String loggedMessage = "********** xxx sistemine hoþ geldiniz **********\n\n" +
		                "1. Hesabýmý sil\n"+
		                "2. Çýkýþ yap\n" +
		                "0. Mesajý göster\n" +
		                "************************************************";;

		        /*User user = new User(1,"Salih","Yanbal","test@test.com","1234567");
		        User user1 = new User("test@test.com","1234567");
		        authManager.register(user);
		        authManager.login(user1);*/
		        System.out.println(mainMessage);
		        int key;
		        while (true){
		            System.out.print("Lütfen iþlem seçiniz: ");
		            key = scan.nextInt();
		            switch (key){
		                case 1:
		                    login();
		                    break;
		                case 2:
		                    loginWithGoogle();
		                    break;
		                case 3:
		                    register();
		                    break;
		                case 4:
		                    return;
		                case 0:
		                    System.out.println(mainMessage);
		                    break;
		                default:
		                    System.out.println("Lütfen doðru seçim yapýnýz.");
		            }
		            while (loggedIn){
		                System.out.print("Lütfen iþlem seçiniz: ");
		                key = scan.nextInt();
		                switch (key){
		                    case 1:
		                        deleteAccount();
		                        break;
		                    case 2:
		                        System.out.println(mainMessage);
		                        loggedIn = false;
		                        break;
		                    case 0:
		                        System.out.println(loggedMessage);
		                        break;
		                    default:
		                        System.out.println("Lütfen doðru seçim yapýnýz.");
		                }
		            }
		        }
		    }

		    public static void register(){
		        scan.nextLine();
		        String firstName,lastName,mail,password;
		        System.out.print("Lütfen adýnýzý giriniz: ");
		        firstName = scan.nextLine();
		        System.out.print("Lütfen soyadýnýzý giriniz: ");
		        lastName = scan.nextLine();
		        System.out.print("Lütfen mailinizi giriniz: ");
		        mail = scan.nextLine();
		        System.out.print("Lütfen parolanýzý giriniz: ");
		        password = scan.nextLine();
		        User user = new User(SqlDatabaseDao.getLastId() + 1,firstName,lastName,mail,password, loggedIn);
		        loggedIn = authManager.register(user);
		    }

		    public static void login(){
		        scan.nextLine();
		        String mail,password;
		        System.out.print("Lütfen mailinizi giriniz: ");
		        mail = scan.nextLine();
		        System.out.print("Lütfen parolanýzý giriniz: ");
		        password = scan.nextLine();
		        User user = new User(0, mail,password, password, password, loggedIn);
		        loggedIn = authManager.login(user);
		    }

		    public static void loginWithGoogle(){
		        scan.nextLine();
		        String mail,password;
		        System.out.print("Lütfen mailinizi giriniz: ");
		        mail = scan.nextLine();
		        System.out.print("Lütfen parolanýzý giriniz: ");
		        password = scan.nextLine();
		        User user = new User(0, mail,password, password, password, loggedIn);
		        loggedIn = authManager.loginWithGoogle(user);
		    }

		    public static void deleteAccount(){
		        System.out.println("Sistem henüz eklenmemiþ!");
		    
	}

}
