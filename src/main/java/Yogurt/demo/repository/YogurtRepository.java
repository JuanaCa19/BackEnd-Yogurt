package Yogurt.demo.repository;

import Yogurt.demo.model.Yogurt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YogurtRepository extends JpaRepository<Yogurt,Long> {
}
