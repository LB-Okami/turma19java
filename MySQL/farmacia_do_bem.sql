create table tb_categoria(
	id bigint auto_increment,
    estoque boolean not null,
    tarja_preta boolean not null,
    primary key(id)
);

	insert tb_categoria(estoque, tarja_preta) values (true, false);
    insert tb_categoria(estoque, tarja_preta) values (true, true); -- ID-2 (trarja preta)
    insert tb_categoria(estoque, tarja_preta) values (false, false);
    insert tb_categoria(estoque, tarja_preta) values (true, false); -- ID-4 (tarja preta)
    insert tb_categoria(estoque, tarja_preta) values (true, true);

create table tb_produtos(
	id bigint auto_increment,
    nome varchar(255),
    id_produtos bigint,
    preco decimal(10,2),
    dosagem boolean, -- em mg
    primary key(id),
    foreign key(id_produtos) references tb_categoria(id)
    
);

	insert tb_produtos(nome, id_produtos, preco, dosagem) values ("Sorine", 1, 39.99, 0.5);
    insert tb_produtos(nome, id_produtos, preco, dosagem) values ("Symbicort", 3, 109.99, 5.2);
    insert tb_produtos(nome, id_produtos, preco, dosagem) values ("Neosoro", 4, 3.99, 0.5);
    insert tb_produtos(nome, id_produtos, preco, dosagem) values ("Alprazolam", 2, 47.99, 1);
    insert tb_produtos(nome, id_produtos, preco, dosagem) values ("Dorflex", 1, 17.83, 3);
    insert tb_produtos(nome, id_produtos, preco, dosagem) values ("Eno", 5, 18.73, 2);
    insert tb_produtos(nome, id_produtos, preco, dosagem) values ("Diazepam", 4, 89.99, 3.2);
    insert tb_produtos(nome, id_produtos, preco, dosagem) values ("Allegra", 5, 25.99, 2.3);

select * from tb_produtos where preco > 30;
select * from tb_produtos where preco between 20 and 40;
select * from tb_produtos where nome like "%B%";
select * from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.id_produtos;
select * from tb_produtos where id_produtos = 4;