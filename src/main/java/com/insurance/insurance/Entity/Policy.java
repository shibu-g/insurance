package com.insurance.insurance.Entity;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="policy_db")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="policy_no")
    private int no;

    @Column(name="policy_type")
    private String type;
    @Column(name="policy_covarage")
    private int covarage;
    @Column(name="policy_premium")
    private int premium;
    @Column(name="start_date")
    private LocalDate start;

    @Column(name="end_date")
    private LocalDate end;
    @Column(name="client_id")
    private int clientid;

}
