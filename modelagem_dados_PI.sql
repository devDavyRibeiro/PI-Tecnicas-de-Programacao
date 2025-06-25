create database PI_JAVA
use PI_JAVA

create table Noticias (
	id int not null identity(1,1) primary key,
	titulo varchar(50) not null,
	descricao varchar(500) not null,
	id_admin int not null,
	data_publicacao char(10) not null,
)
