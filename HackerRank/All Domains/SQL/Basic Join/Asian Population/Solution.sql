SELECT SUM(City.Population) FROM CITY
INNER JOIN
Country ON
City.CountryCode=Country.Code AND Continent='Asia';