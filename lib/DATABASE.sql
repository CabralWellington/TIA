create table PERSON(
ID_PERSON integer primary key auto_increment,
NAME_PERSON varchar(50) not null,
AGE_PERSON int(3),
PASSWORD_PERSON varchar(14) not null,
LOGIN_PERSON varchar(8) not null,
EMAIL_PERSON varchar(50)
 );

create table INSTITUTION(
ID_INSTITUTION int(3) primary key auto_increment,
NAME_INSTITUTION varchar(50) not null,
CITY_INSTITUTION varchar(25),
STATE_INSTITUTION varchar(25)
);

create table COURSE(
ID_COURSE integer primary key auto_increment,
NAME_COURSE varchar(25) not null,
DESCRIPTION varchar(50)
);

create table HALF(
ID_HALF integer primary key auto_increment,
NAME_HALF varchar(10) not null
);

create table ARCHIVE(
ID_ARCHIVE bigint primary key auto_increment,
Name_ARCHIVE varchar(50) not null,
DESCRIPTION_ARCHIVE varchar(50),
PATH_ARCHIVE varchar(250) not null
);
