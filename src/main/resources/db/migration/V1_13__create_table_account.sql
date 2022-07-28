create table if not exists account(
    id_account int(9) zerofill not null primary key auto_increment,
    type_account varchar(15) not null,
    balance_account decimal(10, 2) default 0,
    rf_customer bigint(20) not null,
    status_data_base varchar(20) default 'ACTIVE',
    foreign key(rf_customer) references customer(id_customer)
);