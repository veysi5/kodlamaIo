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


		        String mainMessage = "********** xxx sistemine ho� geldiniz **********\n\n" +
		                "1. Giri� yap\n" +
		                "2. Google ile giri� yap\n" +
		                "3. Kay�t ol\n" +
		                "4. ��k�� Yap\n" +
		                "0. Ana mesaj� g�ster\n" +
		                "************************************************";
		        String loggedMessage = "********** xxx sistemine ho� geldiniz **********\n\n" +
		                "1. Hesab�m� sil\n"+
		                "2. ��k�� yap\n" +
		                "0. Mesaj� g�ster\n" +
		                "************************************************";;

		        /*User user = new User(1,"Salih","Yanbal","test@test.com","1234567");
		        User user1 = new User("test@test.com","1234567");
		        authManager.register(user);
		        authManager.login(user1);*/
		        System.out.println(mainMessage);
		        int key;
		        while (true){
		            System.out.print("L�tfen i�lem se�iniz: ");
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
		                    System.out.println("L�tfen do�ru se�im yap�n�z.");
		            }
		            while (loggedIn){
		                System.out.print("L�tfen i�lem se�iniz: ");
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
		                        System.out.println("L�tfen do�ru se�im yap�n�z.");
		                }
		            }
		        }
		    }

		    public static void register(){
		        scan.nextLine();
		        String firstName,lastName,mail,password;
		        System.out.print("L�tfen ad�n�z� giriniz: ");
		        firstName = scan.nextLine();
		        System.out.print("L�tfen soyad�n�z� giriniz: ");
		        lastName = scan.nextLine();
		        System.out.print("L�tfen mailinizi giriniz: ");
		        mail = scan.nextLine();
		        System.out.print("L�tfen parolan�z� giriniz: ");
		        password = scan.nextLine();
		        User user = new User(SqlDatabaseDao.getLastId() + 1,firstName,lastName,mail,password, loggedIn);
		        loggedIn = authManager.register(user);
		    }

		    public static void login(){
		        scan.nextLine();
		        String mail,password;
		        System.out.print("L�tfen mailinizi giriniz: ");
		        mail = scan.nextLine();
		        System.out.print("L�tfen parolan�z� giriniz: ");
		        password = scan.nextLine();
		        User user = new User(0, mail,password, password, password, loggedIn);
		        loggedIn = authManager.login(user);
		    }

		    public static void loginWithGoogle(){
		        scan.nextLine();
		        String mail,password;
		        System.out.print("L�tfen mailinizi giriniz: ");
		        mail = scan.nextLine();
		        System.out.print("L�tfen parolan�z� giriniz: ");
		        password = scan.nextLine();
		        User user = new User(0, mail,password, password, password, loggedIn);
		        loggedIn = authManager.loginWithGoogle(user);
		    }

		    public static void deleteAccount(){
		        System.out.println("Sistem hen�z eklenmemi�!");
		    
	}

}
