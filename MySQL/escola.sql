use db_escola;

create table tb_alunos(
	id bigint auto_increment,
    nome varchar(255) not null,
    nota decimal(5,1) not null,
    cpf varchar(255),
    idade varchar(255) not null,
    primary key(id)
    
);

insert into tb_alunos(nome, nota, cpf, idade) values ("Lucas", 6.9, "565.854.552-96", 18);
insert into tb_alunos(nome, nota, cpf, idade) values ("Pedro", 4.3, "565.854.552-96", 23);
insert into tb_alunos(nome, nota, cpf, idade) values ("Júlia", 8.2, "565.854.552-96", 34);
insert into tb_alunos(nome, nota, cpf, idade) values ("Marcos", 3.1, "565.854.552-96", 21);
insert into tb_alunos(nome, nota, cpf, idade) values ("Pedro", 8.9, "565.854.552-96", 18);
insert into tb_alunos(nome, nota, cpf, idade) values ("Leandro", 10, "565.854.552-96", 20);
insert into tb_alunos(nome, nota, cpf, idade) values ("Rafael", 5, "565.854.552-96", 19);
insert into tb_alunos(nome, nota, cpf, idade) values ("Fernanda", 4.5, "565.854.552-96", 43);

select * from tb_alunos where nota > 7.0;
select * from tb_alunos where nota < 7.0;

update tb_alunos set nota = 8 where id = 2; 