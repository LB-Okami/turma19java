create table tb_categoria(
	id bigint auto_increment,
    delivery boolean,
    tempo tinyint not null, -- em minutos 
    primary key(id)
);

	insert tb_categoria(delivery, tempo) values (true, 40);
    insert tb_categoria(delivery, tempo) values (true, 50);
    insert tb_categoria(delivery, tempo) values (false, 45);
    insert tb_categoria(delivery, tempo) values (true, 40);
    insert tb_categoria(delivery, tempo) values (false, 30);

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
    insert tb_pizza(sabor, id_categoria, preco, promocional) values ("Portuguesa", 1, 24.99, true,);
    insert tb_pizza(sabor, id_categoria, preco, promocional) values ("Marguerita", 2, 29.99, false);
    insert tb_pizza(sabor, id_categoria, preco, promocional) values ("Marguerita", 2, 29.99, false);
    insert tb_pizza(sabor, id_categoria, preco, promocional) values ("Marguerita", 2, 29.99, false);
    insert tb_pizza(sabor, id_categoria, preco, promocional) values ("Marguerita", 2, 29.99, false);
    insert tb_pizza(sabor, id_categoria, preco, promocional) values ("Marguerita", 2, 29.99, false);
    insert tb_pizza(sabor, id_categoria, preco, promocional) values ("Marguerita", 2, 29.99, false);
    
select * from tb_categoria;
