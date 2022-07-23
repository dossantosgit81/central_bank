create table if not exists bank(
    id_bank bigint(20) not null primary key auto_increment,
    name_bank varchar(70) not null,
    acronym_bank varchar(5) not null,
    doc_fee decimal(10, 2) default 0,
    ted_fee decimal(10, 2) default 0,
    monthly_free_transfers bigint(3) default 0,
    rf_agency bigint(20) not null,
    status_data_base varchar(8) default 'ACTIVE',
    foreign key(rf_agency) references agency(id_agency)
)engine innoDB default charset=utf8;