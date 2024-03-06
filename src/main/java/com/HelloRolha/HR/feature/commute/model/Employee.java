package com.HelloRolha.HR.feature.commute.model;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime start_time;
    private LocalDateTime end_time;

//    @Builder
//    public Employee(Integer id, LocalDateTime start_time, LocalDateTime end_time){
//        this.id = id;
//        this.start_time = start_time;
//        this.end_time = end_time;
//    }

}
