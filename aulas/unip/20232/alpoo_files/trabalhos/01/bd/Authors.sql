CREATE TABLE Authors (
  author_id int NOT NULL AUTO_INCREMENT, 
  name varchar(255) NOT NULL,
  fname varchar(255) NOT NULL,
  PRIMARY KEY (author_id)
);
INSERT INTO Authors VALUES ('5698', 'Alexander', 'Christopher');
INSERT INTO Authors VALUES ('6299', 'Brooks', 'Frederick P.');
INSERT INTO Authors VALUES ('7927', 'Cormen', 'Thomas H.');
INSERT INTO Authors VALUES ('8549', 'Date', 'C. J.');
INSERT INTO Authors VALUES ('8527', 'Darwen', 'Hugh');
INSERT INTO Authors VALUES ('0938', 'Feiner', 'Steven K.');
INSERT INTO Authors VALUES ('0658', 'Flanagan', 'David');
INSERT INTO Authors VALUES ('0969', 'Foley', 'James D.');
INSERT INTO Authors VALUES ('1577', 'Gamma', 'Erich');
INSERT INTO Authors VALUES ('1520', 'Garfinkel', 'Simson');
INSERT INTO Authors VALUES ('2938', 'Hein', 'Trent R.');
INSERT INTO Authors VALUES ('2967', 'Helm', 'Richard');
INSERT INTO Authors VALUES ('2907', 'Hopcroft', 'John E.');
INSERT INTO Authors VALUES ('2512', 'Hughes', 'John F.');
INSERT INTO Authors VALUES ('3323', 'Ishikawa', 'Sara');
INSERT INTO Authors VALUES ('4928', 'Johnson', 'Ralph');
INSERT INTO Authors VALUES ('5528', 'Kahn', 'David');
INSERT INTO Authors VALUES ('5928', 'Kernighan', 'Brian');
INSERT INTO Authors VALUES ('5388', 'Kidder', 'Tracy');
INSERT INTO Authors VALUES ('5854', 'Knuth', 'Donald E.');
INSERT INTO Authors VALUES ('6933', 'Leiserson', 'Charles E.');
INSERT INTO Authors VALUES ('7947', 'Motwani', 'Rajeev');
INSERT INTO Authors VALUES ('8979', 'Nemeth', 'Evi');
INSERT INTO Authors VALUES ('2597', 'Raymond', 'Eric');
INSERT INTO Authors VALUES ('2347', 'Ritchie', 'Dennis');
INSERT INTO Authors VALUES ('2369', 'Rivest', 'Ronald R.');
INSERT INTO Authors VALUES ('3728', 'Schneier', 'Bruce');
INSERT INTO Authors VALUES ('3996', 'Seebass', 'Scott');
INSERT INTO Authors VALUES ('3366', 'Silverstein', 'Murray');
INSERT INTO Authors VALUES ('3898', 'Snyder', 'Garth');
INSERT INTO Authors VALUES ('3493', 'Stein', 'Clifford E.');
INSERT INTO Authors VALUES ('3496', 'Stoll', 'Clifford');
INSERT INTO Authors VALUES ('3425', 'Strassmann', 'Steven');
INSERT INTO Authors VALUES ('3429', 'Stroustrup', 'Bjarne');
INSERT INTO Authors VALUES ('5667', 'Ullman', 'Jeffrey D.');
INSERT INTO Authors VALUES ('6588', 'van Dam', 'Andries');
INSERT INTO Authors VALUES ('6633', 'Vlissides', 'John');
INSERT INTO Authors VALUES ('7933', 'Weise', 'Daniel');
SELECT * FROM Authors;
