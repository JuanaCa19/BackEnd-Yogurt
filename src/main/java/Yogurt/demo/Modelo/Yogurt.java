package Yogurt.demo.Modelo;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "yogurt")
public class Yogurt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank
    private String nombre;

    private String descripcion;

    @Column(nullable = false, precision = 10, scale = 2)
    @NotEmpty(message = "El precio no puede estar vacio")
    @Digits(integer = 10, fraction = 2 , message = "El precio debe tener menos de 10 digitos y maximo dos decimales")
    private BigDecimal precio;

    @NotNull(message = "La url no puede ser vacia")
    private String imagenUrl;

    @Column(nullable = false)
    private boolean activo = true;


    private int stock;

    private LocalDateTime fechaCreacion;




}
