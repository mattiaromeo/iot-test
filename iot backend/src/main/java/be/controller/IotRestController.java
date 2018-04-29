package be.controller;

import be.domain.Service;
import be.domain.TempData;
import be.domain.TempDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/iot")
public class IotRestController {
    @Autowired
    private Service service;

    @GetMapping("/getTempData")
    public String getTempData() {
        return "some data";
    }

    @PostMapping(value = "/storeTempData",produces = "application/json")
    public void storeTempData(@RequestBody TempDataDTO tempDataDTO){
        System.out.println(tempDataDTO);
        service.storeTempData(tempDataDTO);
    }

    @GetMapping("/getAllTempData")
    public List<TempData> getAllTempData() {
        return service.getAllTempData();
    }
}

