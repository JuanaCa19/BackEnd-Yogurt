package Yogurt.demo.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

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
    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;

    private String categoria;

    @Column(nullable = false, precision = 10, scale = 2)
    @NotNull(message = "El precio no puede estar vacio")
    @Digits(integer = 10, fraction = 2 , message = "El precio debe tener menos de 10 digitos y maximo dos decimales")
    private BigDecimal precio;

    @NotNull(message = "La url no puede ser vacia")
    private String imagenUrl;

    @Column(nullable = false)
    private boolean activo = true;

    @Column(nullable = false)
    @Min(value = 0,message = "El stock no puede ser negativo")
    @NotNull(message = "El stcok no puede ser vacio")
    private int stock;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;




}
