package br.com.centralbank.models;

import br.com.centralbank.models.enums.CustomerTypeEnum;
import br.com.centralbank.models.enums.StatusDataBaseEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

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
    private CustomerTypeEnum customerType;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_data_base")
    private StatusDataBaseEnum statusDataBase;

    @OneToMany(mappedBy = "customer")
    private List<Account> accounts;

}
