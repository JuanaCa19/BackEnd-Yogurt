package Yogurt.demo.controller;

import Yogurt.demo.model.User;
import Yogurt.demo.services.IUserService;
import Yogurt.demo.services.Impl.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping ("/api/user/")

public class UserController {
    private final IUserService userService;

    @PostMapping ("save")
    public void save(@RequestBody @Valid User user){
        userService.saveUser(user);
    }
    @PostMapping ("validate")
    public ResponseEntity<?> validateLogin(@RequestParam String nombre, @RequestParam String password ){
        if(userService.passwordValidate(nombre,password)){
            return ResponseEntity.status(HttpStatus.FOUND).body("Usuario Validado");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no Validado");
    }
}
