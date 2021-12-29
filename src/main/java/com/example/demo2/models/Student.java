package com.example.demo2.models;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class Student {
@Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;
@Column(name = "first_name")
    private String first_name;
@Column(name = "last_name")
    private  String last_name;
@Column(name = "password")
    private String password;
@ManyToOne
    @JoinColumn(name = "id",referencedColumnName = "id")
    private  Group group;

}
