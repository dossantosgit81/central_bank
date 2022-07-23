create table if not exists city(
    id_city bigint(20) not null primary key auto_increment,
    name_city varchar(50) not null,
    rf_state bigint(20) not null,
    foreign key(rf_state) references state(id_state)
)engine InnoDB default charset=utf8;