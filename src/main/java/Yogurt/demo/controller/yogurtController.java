package Yogurt.demo.controller;

import Yogurt.demo.model.Yogurt;
import Yogurt.demo.services.IYogurtService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/yogurt/")
@CrossOrigin(origins = "*")
public class yogurtController {

    private final IYogurtService yogurtService;

    @PostMapping("save")
    public void saveYogurt(@RequestBody @Valid Yogurt yogurt){
        yogurtService.saveYogurt(yogurt);
    }

    @GetMapping("findAll")
    public List<Yogurt> findAllYogurt(){
        return yogurtService.findAllYogurts();
    }

    @DeleteMapping("delete/{id}")
    public void deleteYogurtById(@PathVariable Long id){
         yogurtService.deleteYogurtById(id);
    }

    @GetMapping("findById/{id}")
    public Yogurt findYogurtById(@PathVariable Long id){
        return yogurtService.findYogurtById(id);
    }
    @PutMapping
    public void updateYogurt(@RequestBody @Valid Yogurt yogurt){
        yogurtService.updateYogurt(yogurt);
    }
}
