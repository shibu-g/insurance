package com.insurance.insurance.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="client_db")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="client_id")
    private  int id;
    @Column(name = "client_name")
    private String name;
    @Column(name = "client_address")
    private String address;
    @Column(name = "client_dob")
    private LocalDate dob;
    @Column(name = "client_contact")
    private String contact;

}
