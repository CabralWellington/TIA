create table person(
ID_PERSON integer primary key auto_increment,
NAME_PERSON varchar(50) not null,
AGE_PERSON int(3),
PASSWORD_PERSON varchar(14) not null,
LOGIN_PERSON varchar(8) not null,
EMAIL_PERSON varchar(50)
 );

create table institution(
ID_INSTITUTION int(3) primary key auto_increment,
NAME_INSTITUTION varchar(50) not null,
CITY_INSTITUTION varchar(25),
STATE_INSTITUTION varchar(25)
);

create table Course(
ID_COURSE integer primary key auto_increment,
NAME_COURSE varchar(25) not null,
DESCRIPTION varchar(50)
);