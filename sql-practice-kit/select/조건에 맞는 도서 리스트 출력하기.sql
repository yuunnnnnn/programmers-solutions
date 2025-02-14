SELECT
    book_id, 
    DATE_FORMAT(published_date, '%Y-%m-%d') AS published_date
FROM 
    book
WHERE 
    YEAR(published_date) = 2021
    AND category = '인문'
ORDER BY 
    published_date ASC;

-- https://school.programmers.co.kr/learn/courses/30/lessons/144853