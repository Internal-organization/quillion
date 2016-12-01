insert into Resource (id,name) values (1,'Fer');
insert into Resource (id,name) values (2,'Acier');
insert into Resource (id,name) values (3,'Titane');

insert into User (id,first_name,last_name,age,email) values (1,'David','Bougearel',20,'david.bougearel@gmail.com');

insert into User_Resource (version,user_id,resource_id,quantity) values(1,1,1,5000);
insert into User_Resource (version,user_id,resource_id,quantity) values(1,1,2,2000);
insert into User_Resource (version,user_id,resource_id,quantity) values(1,1,3,7000);
