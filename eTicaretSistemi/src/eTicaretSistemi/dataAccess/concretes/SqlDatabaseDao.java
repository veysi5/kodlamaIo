package eTicaretSistemi.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;


import eTicaretSistemi.dataAccess.abstracts.UserDao;
import eTicaretSistemi.entities.concretes.User;

public class SqlDatabaseDao implements UserDao {
	
	private List<User> users;

	private Object mail;
	
	private static int lastId;
	
	public  SqlDatabaseDao() {
		this.users=new ArrayList<User>();
		lastId =0;
	}

	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("Kullanıc Sql veritabanına eklendi  ");
		lastId++;
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullancıc güncelendi ");
		
	}

	@Override
	public void delete(User user) {
		int userToDelete =this.users.indexOf(user);
		this.users.remove(userToDelete);
		System.out.println("Kullanıcı Sql veritabanından silindi  ");
		lastId--;
		
		
	}

	@Override
	public User get(int id) {
		
		  User userToReturn = null;
	        for(User user: this.users){
	            if(user.getId() == id){
	                userToReturn = user;
	                break;
	            }
	        }
			return userToReturn;
		
	}

	@Override
	public User getByMail(String mail) {

	       User userToReturn = null;
	        for(User user: this.users){
	            if(user.getEmail().equals(mail)){
	                userToReturn = user;
	                break;
	            }
	        }

	        /*User userToReturn = this.users.stream()
	                .filter((user) -> user.getMail().equals(mail))
	                .findFirst()
	                .orElse(null);*/
	        return userToReturn;
	    }
	            



	@Override
	public List<User> getAll() {
		return users;
	
	            
	        }
	

	@Override
	public boolean isVerified(User user) {
		User userToCheck = get(user.getId());
        return userToCheck.isVerified() ?
                true : false;
	}
	
	public static int getLastId() {
		return lastId;
	}
	
	public static void setLastId(int lastId) {
		SqlDatabaseDao.lastId=lastId;
	}

	@Override
	public User getByMail(boolean mail) {
		// TODO Auto-generated method stub
		return null;
	}

}
