package Yogurt.demo.services.Impl;
import Yogurt.demo.model.Yogurt;
import Yogurt.demo.repository.YogurtRepository;
import Yogurt.demo.services.IYogurtService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class YogurtService implements IYogurtService {

     private final YogurtRepository yogurtRepository;

    @Override
    public List<Yogurt> findAllYogurts() {
        return yogurtRepository.findAll();
    }

    @Override
    public void updateYogurt(Yogurt yogurt) {
        yogurtRepository.save(yogurt);
    }

    @Override
    public void saveYogurt(Yogurt yogurt) {
        yogurtRepository.save(yogurt);
    }

    @Override
    public void deleteYogurtById(Long idYogurt) {
        yogurtRepository.deleteById(idYogurt);
    }

    @Override
    public Yogurt findYogurtById(Long idYogurt) {
        return yogurtRepository.findById(idYogurt).orElse(null);
    }

}
