create table if not exists bank(
    id_bank bigint(20) not null primary key auto_increment,
    name_bank varchar(70) not null,
    doc_fee decimal(10, 2) default 0,
    ted_fee decimal(10, 2) default 0,
    monthly_free_transfers bigint(3) default 0,
    status_data_base varchar(8) default 'ACTIVE'
)engine innoDB default charset=utf8;

alter table bank auto_increment = 001;