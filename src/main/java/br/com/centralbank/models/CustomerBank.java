package br.com.centralbank.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@IdClass(CustomerBankId.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "customer_bank")
public class CustomerBank {

    @Id
    @Column(name = "rf_customer")
    private Long customer;

    @Id
    @Column(name = "rf_bank")
    private Long bank;
}
