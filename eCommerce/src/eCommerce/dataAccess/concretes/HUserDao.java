package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HUserDao implements UserDao{
	
	List<User> users=new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println("Kullan�c� eklendi: " + user.getEmail());

	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi: " + user.getEmail());

	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� sisteme silindi: " + user.getEmail());

	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

}
