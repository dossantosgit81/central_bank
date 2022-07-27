create table if not exists customer_bank(
    rf_customer bigint(20) not null primary key,
    rf_bank int(3) not null primary key,
    foreign key(rf_customer) references customer(id_customer),
    foreign key(rf_bank) references bank(id_bank)
)engine innodb default charset=utf8;