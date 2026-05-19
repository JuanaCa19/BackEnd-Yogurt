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

}
