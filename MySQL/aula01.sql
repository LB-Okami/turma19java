-- Cria uma DB
create database db_quitanda2;

-- Acessa o banco de dados
use db_quitanda;

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null, 
-- decimal para dinheiro e float para números científicos
preco float not null,
-- Defina quem será a chave primária
primary key(id)

);

insert into tb_produtos (nome, preco) values ("Pastel", 11.50);
insert into tb_produtos (nome, preco) values ("Coxinha", 5.30);

select * from tb_produtos;

alter table tb_produtos add descricao varchar(255);


delete from tb_produtos where id = 10;

update tb_produtos set preco = 10 where id = 9;

use db_estoque;

create table tb_marcas(
	id bigint auto_increment,
    nome varchar(255) not null,
    ativo boolean,
    primary key(id)
    
);

create table tb_produtos(
	id bigint auto_increment,
    nome varchar(50) not null,
    preco decimal(10,2),
    marca_id bigint not null, 
	primary key(id),
    foreign key(marca_id) references tb_marcas (id)
    
);

insert into tb_produtos (nome, preco, marca_id) values ("Tênis", 200, 9);

select * from tb_produtos where preco > 100;


