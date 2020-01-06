package com.igoredm.mongodbbasicservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(collection = "log")
@NoArgsConstructor
@AllArgsConstructor
public class LogEntity extends BaseEntity {

    private String serviceName;
    private LocalDateTime dataInclusao;
    private List<String> descricao;
}
