INSERT INTO book (name, author, publisher, isbn, genre, rate) VALUES ('아빠책', '아빠', '우리집', '1111111111111', '소설', 5);
INSERT INTO book (name, author, publisher, isbn, genre, rate) VALUES ('엄마책', '엄마', '우리집', '1111111111112', '소설', 4);

INSERT INTO tag (name) VALUES ('테스트');
INSERT INTO tag (name) VALUES ('test');


INSERT INTO book_tag (book_id, tag_id) VALUES (1, 1);
INSERT INTO book_tag (book_id, tag_id) VALUES (1, 2);
INSERT INTO book_tag (book_id, tag_id) VALUES (2, 1);
INSERT INTO book_tag (book_id, tag_id) VALUES (2, 2);