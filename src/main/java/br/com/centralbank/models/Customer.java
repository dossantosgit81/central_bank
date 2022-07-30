package br.com.centralbank.models;

import br.com.centralbank.models.enums.CustomerType;
import br.com.centralbank.models.enums.StatusDataBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.status.StatusData;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    //create table if not exists customer(
    //    id_customer bigint(20) not null primary key auto_increment,
    //    first_name_customer varchar(20) not null,
    //    last_name_customer varchar(30) not null,
    //    social_security_number_customer varchar(11) unique not null,
    //    type_customer varchar(4) not null,
    //    status_data_base varchar(20) default 'ACTIVE'
    //) engine innodb default charset=utf8;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "status_data_base")
    private StatusDataBase stat;



}
