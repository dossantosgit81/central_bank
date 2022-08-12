create table if not exists central_transaction(
    id_central_transaction bigint(20) not null primary key auto_increment,
    rf_bank int(3) zerofill not null,
    rf_agency int(5) zerofill not null,
    rf_account int(9) zerofill not null,
    date_transaction datetime not null,
    amount_sent_balance decimal(10, 2) not null,
    foreign key(rf_bank) references bank(id_bank),
    foreign key(rf_agency) references agency(id_agency),
    foreign key(rf_account) references account(id_account),
    status_transaction varchar(50) not null,
    error_reason varchar(50) null
)engine InnoDB default charset=utf8;

--Criar enum de erros para popular error_reson