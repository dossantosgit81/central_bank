create table if not exists agency(
    id_agency bigint(20) not null primary key auto_increment,
    name_agency varchar(50) not null,
    neighborhood_agency varchar(50) null,
    road_agency varchar(20) null,
    house_number_agency varchar(20),
    rf_state bigint(20) not null,
    rf_city bigint(20) not null,
    foreign key(rf_state) references state(id_state),
    foreign key(rf_city) references city(id_city)
)engine InnoDB default charset=utf8;