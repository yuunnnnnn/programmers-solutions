SELECT
    dr_name, 
    dr_id, 
    mcdp_cd, 
    hire_ymd
FROM 
    doctor
ORDER BY
    hire_ymd DESC,
    dr_name ASC;

-- https://school.programmers.co.kr/learn/courses/30/lessons/132203