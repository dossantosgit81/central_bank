package br.com.centralbank.models;

import br.com.centralbank.models.enums.StatusDataBaseEnum;
import br.com.centralbank.models.enums.TypeAccountEnum;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_account")
    private Long idAccount;

    @Column(name = "type_account")
    @Enumerated(EnumType.STRING)
    private TypeAccountEnum typeAccount;

    @Column(name = "balance_account")
    private BigDecimal balanceAccount = BigDecimal.ZERO;

    @ManyToOne
    @JoinColumn(name = "rf_customer")
    private Customer customer;

    @Column(name = "status_data_base")
    @Enumerated(EnumType.STRING)
    private StatusDataBaseEnum statusDataBase;

    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions;
}
