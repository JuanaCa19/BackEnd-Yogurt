package Yogurt.demo.controller;

import Yogurt.demo.Modelo.Yogurt;
import Yogurt.demo.servicios.IYogurtServicio;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.URL;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/yogurt")
public class yogurtController {

    private final IYogurtServicio yogurtServicio;
    @GetMapping("/listar")
    public List<Yogurt> listarYogurts(){
        return yogurtServicio.listarYogurts();
    }
    @PutMapping("/actualizar/{id}")
    public String actualizarYogurt(@PathVariable int id){

        yogurtServicio.actualizar(new Yogurt(1,"Melocoton","sdsfsdf",12341,2));
        return "Yogurt actualizado con exito";
    }
}
