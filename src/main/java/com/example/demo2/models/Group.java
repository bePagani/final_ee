package com.example.demo2.models;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Group {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "group_name")
    private String groupName;
    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Department department;

}
