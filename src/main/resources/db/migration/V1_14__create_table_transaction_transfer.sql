create table if not exists transaction_transfer(
    id_central_transaction bigint(20) not null primary key auto_increment,
    rf_bank_owner int(3) zerofill not null,
    rf_bank_recipient int(3) zerofill not null,
    bank_fee_amount decimal(10, 2) not null,
    date_transaction datetime not null,
    type_transaction varchar(50) not null,
    amount_sent_balance decimal(10, 2) not null,
    status_transaction varchar(50) not null,
    error_reason varchar(50) null,
    foreign key(rf_bank_owner) references bank(id_bank),
    foreign key(rf_bank_recipient) references bank(id_bank)

)engine InnoDB default charset=utf8;

--Criar enum de erros para popular error_reson