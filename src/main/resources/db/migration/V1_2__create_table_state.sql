create table if not exists state(
    id_state bigint(20) not null primary key auto_increment,
    name_state varchar(100) not null,
    acronym_state varchar(5) not null,
    rf_region bigint(20) not null,
    foreign key(rf_region) references region(id_region)
)engine InnoDB default charset=utf8;