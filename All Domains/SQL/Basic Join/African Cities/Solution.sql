SELECT City.Name FROM CITY 
INNER JOIN 
Country ON 
City.CountryCode=Country.Code AND Continent='Africa';