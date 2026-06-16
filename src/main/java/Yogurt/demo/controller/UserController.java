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
@CrossOrigin(origins = "*")
public class UserController {
    private final IUserService userService;

    @PostMapping ("save")
    public ResponseEntity<?> save(@RequestBody @Valid User user){
        userService.saveUser(user);
        return ResponseEntity.ok("Usuario Creado con exito");

    }
    @PostMapping ("validate")
    public ResponseEntity<?> validateLogin(@RequestParam String email, @RequestParam String password ){
        String nombreUsuario = userService.passwordValidate(email,password);
        if(nombreUsuario != null){
            return ResponseEntity.ok(nombreUsuario);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Credenciales Incorrectas");
    }
}
