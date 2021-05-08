package eTicaretSistemi.bussiness.abstracts;

import java.util.List;

import eTicaretSistemi.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
	boolean checkMailCorret(String mail);
	User getByMail(String mail);
	boolean isVerified(User user);
	void verificate(User user);
	User getByMail(boolean mail);
		
}
