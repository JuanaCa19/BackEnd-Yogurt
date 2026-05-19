package Yogurt.demo.servicios;

import Yogurt.demo.Modelo.Yogurt;
import Yogurt.demo.repositorio.YogurtRepositorio;

import java.util.List;

public interface IYogurtServicio{
    public List<Yogurt> listarYogurts();
    public void actualizar(Yogurt yogurt);
}
