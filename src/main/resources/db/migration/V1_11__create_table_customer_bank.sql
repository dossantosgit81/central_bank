create table if not exists customer(
    id_customer bigint(20) not null primary key auto_increment,
    first_name_customer varchar(20) not null,
    last_name_customer varchar(30) not null,
    social_security_number_customer varchar(11) unique not null,
    type_customer varchar(4) not null,
    status_data_base varchar(20) default 'ACTIVE',
    rf_bank bigint(20) not null,
    foreign key(rf_bank) references bank(id_bank)
) engine innodb default charset=utf8;