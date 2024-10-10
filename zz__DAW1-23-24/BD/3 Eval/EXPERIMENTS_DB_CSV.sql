use classicmodels;

drop table if exists discounts;
CREATE TABLE discounts (
    id INT NOT NULL AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    expired_date DATE NOT NULL,
    amount DECIMAL(10 , 2 ) NULL,
    PRIMARY KEY (id)
);

SELECT @@secure_file_priv;

LOAD DATA INFILE '/home/horabaixa/Escritorio/DAW1 23-24/BD/3 Eval/discounts.csv'
INTO TABLE discounts 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

select * from discounts;
