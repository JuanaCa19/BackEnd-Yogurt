package Yogurt.demo.servicios.Impl;
import Yogurt.demo.Modelo.Yogurt;
import Yogurt.demo.repositorio.YogurtRepositorio;
import Yogurt.demo.servicios.IYogurtServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class YogurtServicio implements IYogurtServicio {

     private final YogurtRepositorio yogurtRepositorio;

    @Override
    public List<Yogurt> listarYogurts() {
        return yogurtRepositorio.findAll();
    }

    @Override
    public void actualizar(Yogurt yogurt) {
        yogurtRepositorio.save(yogurt);
    }
}
