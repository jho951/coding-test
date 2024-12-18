SELECT 
    COUNT(*) AS COUNT
FROM 
    ecoli_data
WHERE 
    BIN(genotype) NOT REGEXP('^*1.$')
    AND BIN(genotype) REGEXP('(^*1$)|(^*1..$)');