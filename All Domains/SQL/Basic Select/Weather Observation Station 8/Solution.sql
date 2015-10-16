SELECT DISTINCT City
FROM Station
WHERE SUBSTR(LOWER(City),1,1) in ('a','e','i','o','u')
AND
SUBSTR(LOWER(City),LENGTH(City),1) in ('a','e','i','o','u')
ORDER BY City;