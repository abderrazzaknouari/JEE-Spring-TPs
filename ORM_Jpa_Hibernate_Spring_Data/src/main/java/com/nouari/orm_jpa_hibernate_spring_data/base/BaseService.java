package com.nouari.orm_jpa_hibernate_spring_data.base;


import jakarta.persistence.MappedSuperclass;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;

import java.util.List;



@NoArgsConstructor
@MappedSuperclass
public class BaseService<Repo extends BaseRepo<Entity,ID>,Entity extends BaseEntity,ID extends Long> {

@Autowired
    private Repo repo;
    public BaseService(Repo repo) {
        this.repo = repo;
    }

@Cacheable(value ="findAll" ,key="#root.methodName")
    public List<Entity> findAll(PageRequest of){
        return repo.findAll();
    }

    @CacheEvict(value = "findAll", allEntries = true)
    public <S extends Entity> S save(S entity){
        return repo.save(entity);
    }
    public void delete(ID id){
        repo.deleteById(id);
    }
}
