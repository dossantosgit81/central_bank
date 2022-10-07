package br.com.centralbank.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder(toBuilder = true)
@Table(name = "transaction_transfer")
public class TransactionTransfer extends Transaction{

    @ManyToOne
    @JoinColumn(name = "rf_bank_owner")
    private Bank institutionOwner;

    @ManyToOne
    @JoinColumn(name = "rf_bank_recipient")
    private Bank institutionRecipient;

    @Column(name = "amount_sent_balance")
    private BigDecimal amountSentBalance;

}
