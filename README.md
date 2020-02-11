# food-information-service
This project is a Spring Boot API that searches for and retrieves nutritional data for foods. The relational data is provided by the USDA, and was imported into MySQL (USDA Nutrient Database). Redis is used for caching. ElasticSearch will be used for the API search.

## Prerequisites
MySQL database must be running locally.

Redis must be running locally.


## Building this project
`mvn clean install`

`java -jar -Dspring.profiles.active=prod food-information-service.jar`

## Rest API endpoints
Search API
http://api.food-information.com/search?searchTerm=chocolate

Get Food API
http://api.food-information.com/food?foodId=19125
