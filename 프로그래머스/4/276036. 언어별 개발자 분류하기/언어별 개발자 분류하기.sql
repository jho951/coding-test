-- 1. 프론트엔드 카테고리에 속하는 스킬 코드의 총합을 구합니다.
WITH FRONT_END AS (
    SELECT SUM(CODE) AS CODE_SUM
    FROM SKILLCODES
    WHERE CATEGORY = 'Front End'
)

-- 2. 각 개발자의 스킬 코드를 비트 연산하여 등급을 매기고 정렬합니다.
SELECT 
    CASE 
        -- A 등급: 프론트엔드 스킬이 있으면서 Python(code: 256) 스킬도 있는 경우
        WHEN (DEVELOPERS.SKILL_CODE & (SELECT CODE_SUM FROM FRONT_END)) > 0 
             AND (DEVELOPERS.SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'Python')) > 0 THEN 'A'
        -- B 등급: C#(code: 1024) 스킬이 있는 경우
        WHEN (DEVELOPERS.SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'C#')) > 0 THEN 'B'
        -- C 등급: Python을 제외한 프론트엔드 스킬이 있는 경우
        WHEN (DEVELOPERS.SKILL_CODE & (SELECT CODE_SUM FROM FRONT_END)) > 0 THEN 'C'
    END AS GRADE,
    ID,
    EMAIL
FROM 
    DEVELOPERS
-- 등급이 매겨진 개발자만 필터링합니다.
HAVING 
    GRADE IS NOT NULL
-- GRADE 기준 오름차순, 같다면 ID 기준 오름차순 정렬합니다.
ORDER BY 
    GRADE ASC, 
    ID ASC;
