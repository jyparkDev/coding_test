-- 코드를 입력하세요 
select COUNT(A.NAME) FROM (SELECT NAME FROM ANIMAL_INS GROUP BY NAME) A