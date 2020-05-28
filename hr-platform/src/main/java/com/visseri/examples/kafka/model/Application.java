package com.visseri.examples.kafka.model;

import lombok.Data;

@Data
public class Application {

    private String uid;
    private String fullName;
    private String position;
    private Double expectedSalary;

}
