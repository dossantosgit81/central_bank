create table if not exists account(
    id_account int(12) not null primary key,
    type_account varchar(15) not null,
    balance_account decimal(10, 2) default 0;
);