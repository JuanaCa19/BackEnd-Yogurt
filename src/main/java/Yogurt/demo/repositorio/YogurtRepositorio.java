package Yogurt.demo.repositorio;

import Yogurt.demo.Modelo.Yogurt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YogurtRepositorio extends JpaRepository<Yogurt,Integer> {
}
