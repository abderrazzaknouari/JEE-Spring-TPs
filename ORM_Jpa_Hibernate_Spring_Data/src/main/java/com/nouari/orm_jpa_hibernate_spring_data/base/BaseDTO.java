package com.nouari.orm_jpa_hibernate_spring_data.base;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class BaseDTO<ID extends Long> {
    protected ID id;

}
