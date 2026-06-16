package Yogurt.demo.services;

import Yogurt.demo.model.User;

import java.util.List;

public interface IUserService {

    public void saveUser(User user);

    public List<User> findAllUsers ();

    public String passwordValidate(String email , String password);

}
