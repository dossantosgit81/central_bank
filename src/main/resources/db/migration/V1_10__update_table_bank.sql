alter table bank add constraint `fk_agency` foreign key(thirst_bank) references agency(id_agency);
update bank set thirst_bank = 1 where id_bank = 1;