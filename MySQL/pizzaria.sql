use db_pizzaria_legal;

create table tb_categoria(
	id bigint auto_increment,
    delivery boolean,
    tempo tinyint not null, -- em minutos 
    estoque boolean,
    caixa_reciclavel boolean,
    primary key(id)
);

	insert tb_categoria(delivery, tempo, estoque, caixa_reciclavel) values (true, 40, true, false);
    insert tb_categoria(delivery, tempo, estoque, caixa_reciclavel) values (true, 50, true, true);
    insert tb_categoria(delivery, tempo, estoque, caixa_reciclavel) values (false, 45, true, false);
    insert tb_categoria(delivery, tempo, estoque, caixa_reciclavel) values (true, 40, true, true);
    insert tb_categoria(delivery, tempo, estoque, caixa_reciclavel) values (false, 30, true, false);

create table tb_pizza(
	id bigint auto_increment,
    sabor varchar(255),
    id_categoria bigint,
    preco decimal(10,2),
    promocional boolean,
    primary key(id),
    foreign key(id_categoria) references tb_categoria(id)
    
);

	insert tb_pizza(sabor, id_categoria, preco, promocional) values ("Marguerita", 2, 29.99, false);
    insert tb_pizza(sabor, id_categoria, preco, promocional) values ("Portuguesa", 1, 24.99, true);
    insert tb_pizza(sabor, id_categoria, preco, promocional) values ("Queijo", 4, 34.99, false);
    insert tb_pizza(sabor, id_categoria, preco, promocional) values ("Chocolate", 5, 44.99, false);
    insert tb_pizza(sabor, id_categoria, preco, promocional) values ("4 queijos", 1, 29.99, true);
    insert tb_pizza(sabor, id_categoria, preco, promocional) values ("Romeu e Julieta", 5, 21.99, true);
    insert tb_pizza(sabor, id_categoria, preco, promocional) values ("Brotinho queijo", 3, 14.99, false);
    insert tb_pizza(sabor, id_categoria, preco, promocional) values ("Frango e Catupiry", 4, 29.99, false);

select * from tb_pizza where preco > 30;
select * from tb_pizza where preco between 20 and 40;
select * from tb_pizza where sabor like "C%";
select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.id_categoria;
select * from tb_pizza where id_categoria = 4;
