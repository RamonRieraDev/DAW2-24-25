/* 2.1 - Author's name and the number of books written by them.*/
SELECT CONCAT(A.NAME, ' ', A.SURNAMES) AS AUTHOR, 
COUNT(B.AUTHOR_CODE) AS 'NUMBER OF BOOKS', B.AUTHOR_CODE
FROM AUTHOR A, BOOK B
WHERE B.AUTHOR_CODE = A.AUTHOR_CODE
GROUP BY A.AUTHOR_CODE
HAVING COUNT(B.AUTHOR_CODE) > 6;

/* 2.2 - Books title and the amount of copies of each book.*/
SELECT B.TITLE

SELECT * FROM BOOK;