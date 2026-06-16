package Yogurt.demo.services.Impl;

import Yogurt.demo.model.User;
import Yogurt.demo.repository.UserRepository;
import Yogurt.demo.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        user.setPassword(BCrypt.hashpw(user.getPassword(),BCrypt.gensalt(12)));
        userRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public String passwordValidate( String email , String password) {
        List<User> users =userRepository.findAll();
        for(User user :users){
            if(user.getEmail().equals(email) && BCrypt.checkpw(password,user.getPassword())){
                return user.getNombre();
            }
        }
     return null;
    }
}
