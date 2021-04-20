use db_loja;

create table tb_produtos(
	id bigint auto_increment,
    nome varchar(255) not null,
    preco decimal(10,2) not null,
    peso decimal(10,2), -- peso está em KG
    marca varchar(255) not null,
    primary key(id)
    
);

insert into tb_produtos(nome, preco, peso, marca) values ("GTX-1050TI", 1749.99, 0.8, "Asus");
insert into tb_produtos(nome, preco, peso, marca) values ("FX-4300", 379.99, 0.06, "AMD");
insert into tb_produtos(nome, preco, peso, marca) values ("GTX-3070", 11999.99, 1.2, "Galax");
insert into tb_produtos(nome, preco, peso, marca) values ("I9-9900K", 2214.99, 0.1, "Intel");
insert into tb_produtos(nome, preco, peso, marca) values ("GTX-1070TI", 4954.99, 0.9, "Zotac");
insert into tb_produtos(nome, preco, peso, marca) values ("GTX-2080TI", 4999.99, 0.8, "Zotac");
insert into tb_produtos(nome, preco, peso, marca) values ("Gabinete-RGB", 439.99, 2, "Redragon");
insert into tb_produtos(nome, preco, peso, marca) values ("GTX-750TI", 685.99, 0.6, "Asus");

select * from tb_produtos where preco > 500;
select * from tb_produtos where preco < 500;

update tb_produtos set preco = 399.99 where id = 2; 