package com.service;




import java.util.List; 

import com.entities.User;

public interface IuserService {

	User saveUser(User user);

	List<User> findAllUsers();


}
