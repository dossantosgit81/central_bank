---idTransaction
---nameBank
---acronymBank
---idAgency
---nameAgency
---acronymAgency
---numberAgency
---socialSecurityNumberUserBank
---idUserBank
---fullNameUserBank
---typeUserBank
---idAccount
---numberAccount
---typeAccount
--dataTransacao
---amountSentBalance
create table if not exists central_transaction(
    id_central_transaction bigint(20) not null primary key auto_increment,
    rf_bank int(3) zerofill not null,
    rf_agency int(5) zerofill not null,
    rf_account int(9) zerofill not null,
    date_transaction datetime not null,
    amount_sent_balance decimal(10, 2) not null
    status_transaction --Agora é ver o que será status transaction
)engine InnoDB default charset=utf8;