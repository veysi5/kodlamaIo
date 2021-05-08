package eTicaretSistemi.dataAccess.abstracts;

import java.util.List;

import eTicaretSistemi.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	User getByMail(boolean mail);
	List<User> getAll();
	boolean isVerified(User user);
	User getByMail(String mail);
}
