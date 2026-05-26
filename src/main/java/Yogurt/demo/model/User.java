package Yogurt.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name ="users")

 public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


   @NotBlank(message = "No puede estar vacio")
   @Column(nullable = false, unique = true)
    private String email;

   @NotBlank(message = "No puede estar vacio")
   @Column(nullable = false)
   @Pattern(
           regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).+$",
           message = "Debe contener mayúscula, minúscula, número y carácter especial"
   )
    private String password;


    @NotBlank(message = "No puede estar vacio")
    @Column(nullable = false)
    private String nombre;

    private String rol;

}
