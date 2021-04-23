create table tb_categoria(
	id bigint auto_increment,
    tipo char(15),
    promocional boolean,
	primary key(id)
);

insert tb_categoria(tipo, promocional) values ("Bovino", false);
insert tb_categoria(tipo, promocional) values ("Aves", true);
insert tb_categoria(tipo, promocional) values ("Suíno", false);
insert tb_categoria(tipo, promocional) values ("Peixes", false);
insert tb_categoria(tipo, promocional) values ("Embutidos", false);

create table tb_produtos(
	id bigint auto_increment,
    nome varchar(255),
    preco decimal(5,2),
    id_produtos bigint,
    validade tinyint(12), -- em meses
    primary key(id),
    foreign key(id_produtos) references tb_categoria(id)
);

insert tb_produtos(nome, preco, id_produtos, validade) values ("Picanha", 43.22, 1, 9);
insert tb_produtos(nome, preco, id_produtos, validade) values ("Coração", 20.87, 2, 7);
insert tb_produtos(nome, preco, id_produtos, validade) values ("Patinho", 37.64, 1, 11);
insert tb_produtos(nome, preco, id_produtos, validade) values ("Tulipinha", 21.53, 2, 8);
insert tb_produtos(nome, preco, id_produtos, validade) values ("Salmão", 83.47, 4, 12);
insert tb_produtos(nome, preco, id_produtos, validade) values ("Presunto", 10.14, 5, 6);
insert tb_produtos(nome, preco, id_produtos, validade) values ("Atum", 67.75, 5, 8);
insert tb_produtos(nome, preco, id_produtos, validade) values ("Bacon", 20.34, 3, 5);

select * from tb_produtos where preco > 50;
select * from tb_produtos where preco between 3 and 60;
select * from tb_produtos where nome like "%c%";
select * from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.id_produtos;
select * from tb_produtos where id_produtos = 1;
