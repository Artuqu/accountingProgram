INSERT INTO publisher(id, name) VALUES (1, 'PWN'), (2, 'Ossolineum'), (3, 'Helion');
-- INSERT INTO publisher(id, name) VALUE (4,'Prentice Hall');
-- Helion ma bruce eckel
INSERT INTO author(id,name,lastName) VALUES (1,'Bolesław','Prus'), (2, 'Bruce', 'Eckel'), (3, 'Henryk', 'Sienkiewicz');


INSERT INTO books(id, isbn, title, type, author_id, publisher_id)
VALUES (1, 9780130273635, 'Thinking in Java','programming', 2, 3),
(2, 8371977093, 'Thinking in C++', 'programming', 2, 3),(3,  9788380598218, 'W pustyni i w puszczy', 'adventure', 3, 1);
