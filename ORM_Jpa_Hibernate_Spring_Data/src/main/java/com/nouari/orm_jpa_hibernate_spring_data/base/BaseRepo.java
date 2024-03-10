package com.nouari.orm_jpa_hibernate_spring_data.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepo<T extends BaseEntity,ID extends Long> extends JpaRepository<T,ID> {

}
