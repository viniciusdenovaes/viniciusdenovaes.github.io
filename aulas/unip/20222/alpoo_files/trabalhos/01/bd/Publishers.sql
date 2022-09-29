CREATE TABLE Publishers (
  publisher_id int NOT NULL AUTO_INCREMENT, 
  name varchar(255) NOT NULL,
  url varchar(255) NOT NULL,
  PRIMARY KEY (publisher_id)
);
INSERT INTO Publishers VALUES ('0201', 'Addison-Wesley', 'www.aw-bc.com');
INSERT INTO Publishers VALUES ('0471', 'John Wiley & Sons', 'www.wiley.com');
INSERT INTO Publishers VALUES ('0262', 'MIT Press', 'mitpress.mit.edu');
INSERT INTO Publishers VALUES ('0596', 'O''Reilly', 'www.ora.com');
INSERT INTO Publishers VALUES ('019', 'Oxford University Press', 'www.oup.co.uk');
INSERT INTO Publishers VALUES ('013', 'Prentice Hall', 'www.phptr.com');
INSERT INTO Publishers VALUES ('0679', 'Random House', 'www.randomhouse.com');
INSERT INTO Publishers VALUES ('07434', 'Simon & Schuster', 'www.simonsays.com');
SELECT * FROM Publishers;
