create table tb_classe(
	id bigint auto_increment,
    genero varchar(255) not null,
    disponivel boolean not null,
    primary key(id)
);

insert tb_classe(genero, disponivel) values ("Hack and slash", true);
insert tb_classe(genero, disponivel) values ("RPG", true);
insert tb_classe(genero, disponivel) values ("Aventura", false);
insert tb_classe(genero, disponivel) values ("FPS", true);
insert tb_classe(genero, disponivel) values ("TPS", false);

create table tb_personagem(
	id bigint auto_increment,
    nome varchar(255),
    usuario_magia boolean,
    pontos_de_vida smallint,
    genero_id bigint,
    preco decimal(10, 2),
    primary key(id),
    foreign key(genero_id) references tb_classe(id)
);

insert tb_personagem(nome, usuario_magia, pontos_de_vida, genero_id, preco) values ("Ellie", false, 25, 5, 159.99);
insert tb_personagem(nome, usuario_magia, pontos_de_vida, genero_id, preco) values ("Kratos", true, 240, 1, 59.99);
insert tb_personagem(nome, usuario_magia, pontos_de_vida, genero_id, preco) values ("Aloy", false, 40, 2, 119.99);
insert tb_personagem(nome, usuario_magia, pontos_de_vida, genero_id, preco) values ("Dante", true, 220, 1, 69.99);
insert tb_personagem(nome, usuario_magia, pontos_de_vida, genero_id, preco) values ("Nero", true, 220, 1, 100);
insert tb_personagem(nome, usuario_magia, pontos_de_vida, genero_id, preco) values ("Bayonetta", true, 210, 1, 164.99);
insert tb_personagem(nome, usuario_magia, pontos_de_vida, genero_id, preco) values ("Claire Redfield", false, 20, 3, 199.99);
insert tb_personagem(nome, usuario_magia, pontos_de_vida, genero_id, preco) values ("Leon", false, 30, 3, 29.99);

select * from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.genero_id;

select * from tb_personagem where preco < 100;

select * from tb_personagem where preco between 100 and 150;

select * from tb_personagem where nome like "%d%";

select nome from tb_personagem where genero_id = 1;
