package br.com.centralbank.models;

import br.com.centralbank.models.enums.StatusDataBaseEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bank")
    private Long idBank;

    @Column(name = "name_bank")
    private String nameBank;

    @Column(name = "acronym_bank")
    private String acronymBank;

    @Column(name = "status_data_base")
    private StatusDataBaseEnum statusDtaBase;

    @OneToOne
    @JoinColumn(name = "thirst_bank")
    private Agency thirst;

    @Column(name = "bank_fee_amount")
    private BigDecimal bankValueFee;

    @OneToMany(mappedBy = "bankOwner")
    private List<Agency> agencies;

}
