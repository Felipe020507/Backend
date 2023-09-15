
CREATE DATABASE Agenda;

USE Agenda;

CREATE TABLE contato (
	id INT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255) NOT NULL,
    telefone INT
);


INSERT INTO contato (id, nome, email, telefone) VALUES
    ('23242', 'fabinho', 'shaolinmatadordeporco', '984532'),
    ('32456', 'carlos', 'flvainhodopneu', '969584'),
    ('45693', 'eduardo', 'coiteatrasdopapaleguas', '9543344'),
    ('54694', 'fred', 'fruedomalucototal', '993435'),
    ('65494', 'matheus', 'marioeluigieyoshcorrendo', '9853535' );
    
  SELECT * FROM pais limit 2, 1;
  select * from contato;

