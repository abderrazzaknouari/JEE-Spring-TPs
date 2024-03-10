package com.nouari.orm_jpa_hibernate_spring_data.base;

import jakarta.persistence.MappedSuperclass;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@NoArgsConstructor
@MappedSuperclass
public class BaseController<Service extends BaseService<Repo,Entity,ID>, Entity extends BaseEntity,Repo extends BaseRepo<Entity,ID>,ID extends Long> {

    @Autowired
    private Service service;

@GetMapping("")
    public Iterable<Entity> getAll(){
        return service.findAll(PageRequest.of(page, size));
    }

    @PostMapping()
    public Entity save(@RequestBody Entity entity){
        return service.save(entity);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id){
        service.delete(id);
    }

}




