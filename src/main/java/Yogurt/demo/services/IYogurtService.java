package Yogurt.demo.services;

import Yogurt.demo.model.Yogurt;
import java.util.List;

public interface IYogurtService {

    public List<Yogurt> findAllYogurts();

    public void updateYogurt(Yogurt yogurt);

    public void saveYogurt(Yogurt yogurt);

    public void deleteYogurtById(Long idYogurt);
}
