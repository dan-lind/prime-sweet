package org.primefaces.examples.moviecollector.service;

import java.util.List;

import org.primefaces.examples.moviecollector.domain.Category;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;


public interface UserService {

	public void createNewUser(String userName, String password, String groupName);
	
	public List<UserDetails> findAll();
//	
//	public List<Category> findRootNodes();
//	
//	public List<Category> findChildren(Category category);
//	
	public List<UserDetails> findByUsername(String userName);
	
	public List<String> getGroups();
//	
//	public void update(Category category);
//	
//	public void remove(Category category);
//	
//	public Category findById(Long id);
	
}
