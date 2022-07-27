create table if not exists bank(
    id_bank int(3) zerofill not null primary key auto_increment,
    name_bank varchar(70) not null,
    acronym_bank varchar(5) not null,
    status_data_base varchar(8) default 'ACTIVE',
    thirst_bank int(4) zerofill null unique
)engine innoDB default charset=utf8;