create database manytomany;

use manytomany;

create table tb_product (
	id int auto_increment primary key,
	name varchar(150) not null,
	price decimal(10,2) not null
);


create table tb_purchase (
	id int auto_increment primary key,
	date datetime default current_timestamp  not null
);

CREATE TABLE tb_purchaseproduct (
    purchase_id int not null,
    product_id int not null,
    quantity int not null,
    primary key (purchase_id, product_id),
    foreign key (purchase_id) references tb_purchase(id) on delete cascade,
    foreign key (product_id) references tb_product(id) on delete cascade
);


insert into tb_purchase (date) values
(NOW()),
(NOW()),
(NOW()),
(NOW()),
(NOW()),
(NOW()),
(NOW()),
(NOW()),
(NOW()),
(NOW());

insert into tb_product (name, price) values
('Café Aromático', 10.00),
('Té Verde Orgánico', 15.50),
('Chocolate Artesanal', 20.00),
('Galletas de Avena', 25.00),
('Mermelada de Fresa', 30.00),
('Aceite de Oliva Extra Virgen', 35.00),
('Vinagre Balsámico', 40.00),
('Especias Exóticas', 45.00),
('Sopa de Lentejas Gourmet', 50.00),
('Salsas Picantes Caseras', 55.00),
('Pasta Italiana Fresca', 60.00),
('Arroz Basmati', 65.00),
('Frutos Secos Mixtos', 70.00),
('Snack de Quinoa', 75.00),
('Miel de Abeja Pura', 80.00),
('Tortillas de Maíz', 85.00),
('Chocolate Blanco con Almendras', 90.00),
('Cereal Integral', 95.00),
('Granola Casera', 100.00),
('Barras Energéticas', 105.00),
('Fruta Deshidratada', 110.00),
('Batido de Proteína', 115.00),
('Tamarindo Natural', 120.00),
('Sirope de Agave', 125.00),
('Harina de Almendra', 130.00),
('Lentejas Rojas', 135.00),
('Semillas de Chía', 140.00),
('Puré de Manzana', 145.00),
('Gelatina de Frutas', 150.00),
('Té de Hierbas', 155.00),
('Sushi de Verduras', 160.00),
('Tacos de Pescado', 165.00),
('Pizzas Artesanales', 170.00),
('Nachos con Queso', 175.00),
('Sopa de Tomate', 180.00),
('Ensalada César', 185.00),
('Wraps de Pollo', 190.00),
('Pasta con Pesto', 195.00),
('Cuscús Mediterráneo', 200.00),
('Croquetas de Jamón', 205.00),
('Paté de Olivas', 210.00),
('Sal de Mar Gourmet', 215.00),
('Pimientos Rellenos', 220.00),
('Galletas de Chocolate', 225.00),
('Tortas de Espinaca', 230.00),
('Pasta de Arachide', 235.00),
('Hamburguesas Veganas', 240.00),
('Bebida de Coco', 245.00),
('Limonada Casera', 250.00),
('Zumo de Naranja Natural', 255.00);


insert into tb_purchaseproduct (purchase_id, product_id, quantity) values
(1, 1, 2),
(1, 5, 1),
(1, 10, 3),
(2, 2, 1),
(2, 3, 2),
(3, 4, 1),
(3, 6, 1),
(4, 7, 2),
(4, 8, 1),
(5, 9, 5),
(5, 11, 1),
(6, 12, 2),
(6, 13, 3),
(7, 14, 2),
(8, 15, 1),
(9, 16, 2),
(10, 17, 1),
(10, 18, 1),
(10, 19, 4),
(10, 20, 1);


create view vw_detailpurchase
as
Select  pp.purchase_id "id_purchase",
        pro.id "id_product",
        pro.name "name_product",
        pp.quantity "quantity"
from tb_purchaseproduct as pp
inner join tb_product as pro on pro.id = pp.product_id;



DELIMITER //
CREATE PROCEDURE usp_detailpurchase()
BEGIN
    SELECT
        id_purchase,
        id_product,
        name_product,
        quantity
    FROM vw_detailpurchase;
END //
DELIMITER ;



