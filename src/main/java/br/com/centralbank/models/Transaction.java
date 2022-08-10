package br.com.centralbank.models;

import br.com.centralbank.models.enums.StatusTransaction;
import lombok.*;

import javax.persistence.*;
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
    /*
    * id_central_transaction bigint(20) not null primary key auto_increment,
    rf_bank int(3) zerofill not null,
    rf_agency int(5) zerofill not null,
    rf_account int(9) zerofill not null,
    date_transaction datetime not null,
    amount_sent_balance decimal(10, 2) not null,
    foreign key(rf_bank) references bank(id_bank),
    foreign key(rf_agency) references agency(id_agency),
    foreign key(rf_account) references account(id_account),
    status_transaction varchar(50) not null
    *
    * */

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
    private StatusTransaction statusTransaction;

}
