package com.example.elasticsearchheritage.Controllers;

import com.example.elasticsearchheritage.Entities.BaseEntity;
import com.example.elasticsearchheritage.Entities.SubEntity;
import com.example.elasticsearchheritage.Services.BaseEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController("/apis")
public class BaseEntityController {

    private final BaseEntityService myService;

    @Autowired

    public BaseEntityController(BaseEntityService myService) {
        this.myService = myService;
    }

    @PostMapping("/saveBaseEntity")
    public ResponseEntity<String> saveBaseEntity(@RequestBody BaseEntity baseEntity) {
        myService.saveEntity(baseEntity);
        return new ResponseEntity<>("BaseEntity saved successfully", HttpStatus.CREATED);
    }

    @PostMapping("/saveSubEntity")
    public ResponseEntity<String> saveSubEntity(@RequestBody SubEntity subEntity) {
        myService.saveEntity(subEntity);
        return new ResponseEntity<>("SubEntity saved successfully", HttpStatus.CREATED);
    }

    @GetMapping("/getEntityById/{id}")
    public ResponseEntity<?> getEntityById(@PathVariable String id) {
        Optional<BaseEntity> entityOptional = myService.findById(id);

        if (entityOptional.isPresent()) {
            return new ResponseEntity<>(entityOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Entity not found", HttpStatus.NOT_FOUND);
        }
    }
}
