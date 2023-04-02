package com.insurance.insurance.Entity;

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
@Table(name="claims_db")
public class Claims {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="claim_no")
    private int no;
    @Column(name="claim_description")
    private String description;
    @Column(name="claim_status")
    private String status;

    @Column(name="claim_date")
    private LocalDate date;

    @Column(name="policy_no")
    private int policy_no;

}
