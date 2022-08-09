package br.com.centralbank.models;

import br.com.centralbank.models.enums.CustomerType;
import br.com.centralbank.models.enums.StatusDataBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.status.StatusData;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private Long idCustomer;

    @Column(name = "first_name_customer")
    private String firstName;

    @Column(name = "last_name_customer")
    private String lastNameCustomer;

    @Column(name = "social_security_number_customer")
    private String socialSecurityNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_customer")
    private CustomerType customerType;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_data_base")
    private StatusDataBase stat;



}
