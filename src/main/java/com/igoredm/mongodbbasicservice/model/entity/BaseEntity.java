package com.igoredm.mongodbbasicservice.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class BaseEntity {

    @Id
    private String Id;
}
