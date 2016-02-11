SELECT Name FROM 
(
    SELECT Name, SUBSTR(Name, length(Name)-2) AS sub_name 
    FROM Students
    WHERE marks > 75 ORDER BY sub_name, id ASC
);