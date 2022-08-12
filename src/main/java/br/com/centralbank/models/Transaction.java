package br.com.centralbank.models;

import br.com.centralbank.models.enums.ErrorResonEnum;
import br.com.centralbank.models.enums.StatusTransactionEnum;
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
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "central_transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_central_transaction")
    private Long idCentralTransaction;

    @ManyToOne
    @JoinColumn(name = "rf_bank")
    private Bank institution;

    @ManyToOne
    @JoinColumn(name = "rf_agency")
    private Agency agency;

    @ManyToOne
    @JoinColumn(name = "rf_account")
    private Account account;

    @Column(name = "amount_sent_balance")
    private BigDecimal amountSentBalance;

    @Column(name = "date_transaction")
    private LocalDateTime dateTransaction;

    @Column(name = "status_transaction")
    @Enumerated(EnumType.STRING)
    private StatusTransactionEnum statusTransaction;

    @Column(name = "error_reson")
    @Enumerated(EnumType.STRING)
    private ErrorResonEnum errorResonEnum;


}
