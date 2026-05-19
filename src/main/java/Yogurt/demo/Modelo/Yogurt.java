package Yogurt.demo.Modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Yogurt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idYogurt;
    private String nombre;
    private String sabor;
    private double precio;
    private double tamaño;




}
