create database db_empresa;

use db_empresa;

create table tb_funcionarios(
	id bigint auto_increment,
    nome varchar(255),
    cpf bigint,
    idade tinyint,
    salario float,
	primary key(id)
);

insert into tb_funcionarios(nome, cpf, idade, salario) values ("Lucas", 856258452-85, 18, 6852.25);
insert into tb_funcionarios(nome, cpf, idade, salario) values ("Pedro", 856258442-85, 18, 1895.20);
insert into tb_funcionarios(nome, cpf, idade, salario) values ("Bruna", 852258452-85, 18, 9586.50);
insert into tb_funcionarios(nome, cpf, idade, salario) values ("Carlos", 856255452-85, 18, 3500.25);
insert into tb_funcionarios(nome, cpf, idade, salario) values ("João", 856258482-85, 18, 1024.38);
insert into tb_funcionarios(nome, cpf, idade, salario) values ("Dante", 856258952-85, 18, 3552.80);
insert into tb_funcionarios(nome, cpf, idade, salario) values ("Cléber", 856258652-85, 18, 4852.25);
insert into tb_funcionarios(nome, cpf, idade, salario) values ("Luiz", 856258452-85, 18, 2752.67);
insert into tb_funcionarios(nome, cpf, idade, salario) values ("Luis", 856258452-85, 18, 800.98);
insert into tb_funcionarios(nome, cpf, idade, salario) values ("Ana", 856258452-85, 18, 852.76);
insert into tb_funcionarios(nome, cpf, idade, salario) values ("Bruno", 856258452-85, 18, 1500.28);
insert into tb_funcionarios(nome, cpf, idade, salario) values ("Rafael", 856258452-85, 18, 1349.53);

select * from tb_funcionarios;

select * from tb_funcionarios where salario > 2000;
select * from tb_funcionarios where salario < 2000;

update tb_funcionarios set salario = 2500.43 where id = 10;

