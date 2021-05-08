package eTicaretSistemi.bussiness.concretes;

import java.util.List;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

import eTicaretSistemi.bussiness.abstracts.UserService;
import eTicaretSistemi.dataAccess.abstracts.UserDao;
import eTicaretSistemi.entities.concretes.User;

public class UserManager implements UserService {
	

    private static final String Pattern = null;
   private static final java.util.regex.Pattern VALID_EMAIL_TYPE = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE_ORDER);
    private UserDao dao;

    public UserManager(UserDao dao){
        this.dao = dao;
    }

	@Override
	public void add(User user) {
		this.dao.add(user);
		
	}

	@Override
	public void delete(User user) {
		 if(!(getByMail(user.getEmail()) != null) && isVerified(user)){
	            System.out.println("Kullanýcý silinemez.");
	            return;
		}
		this.dao.delete(user);
		
	}

	@Override
	public User get(int id) {
	return this.dao.get(id);
		
	}

	@Override
	public List<User> getAll() {
		return this.dao.getAll();
	}

	@Override
	public boolean checkMailCorret(String mail) {
		Matcher matcher =  VALID_EMAIL_TYPE.matcher(mail);
        return matcher.find();
	}




	@Override
	public boolean isVerified(User user) {
		return this.dao.isVerified(user);
		
	}

	@Override
	public void verificate(User user) {
		user.setVerified(true);		
	}

	@Override
	public User getByMail(String mail) {
		 User foundedUser = this.dao.getByMail(mail);
	        return foundedUser;
	}



	

	
}
