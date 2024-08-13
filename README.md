# Housing-Data-Management-API

# Description
The Housing Data Management API is a powerful and efficient RESTful service designed to manage housing sale data. Built with Spring Boot and backed by a MySQL database, this API allows users to upload housing data in JSON format and retrieve various statistical insights directly from the database using optimized SQL queries.


# Key Features
Data Ingestion: The API enables the ingestion of housing data from a JSON file (housing_data.json). This data includes information such as location and sale price, which is then stored in a MySQL database.

Statistical Queries: Users can query the database to retrieve key statistics about housing prices, including:

Overall Average Sale Price: Compute the average sale price across all houses.

Location-Based Average Sale Price: Calculate the average sale price of houses within specific locations.

Maximum and Minimum Sale Prices: Identify the highest and lowest sale prices recorded.

Average Price by Specific Location: Get the average sale price for houses in a user-specified location.

SQL-Based Computation: All statistics are computed directly within the MySQL database using SQL queries, ensuring efficient and accurate data retrieval.

Error Handling: The API is equipped with robust error handling mechanisms, providing clear and informative error messages, along with appropriate HTTP response codes to guide users in case of issues.

JSON Responses: All API responses are formatted in JSON, ensuring compatibility with a wide range of clients and systems.

# Usage Scenarios
Real Estate Analysis: The API can be used by real estate professionals to analyze trends in housing prices across different locations.
Data Management: Developers and data engineers can leverage the API to manage and query large datasets of housing sale prices.
Market Insights: Investors and analysts can use the API to gain insights into the housing market by retrieving maximum, minimum, and average sale prices.

# Prerequisites
Spring Boot
MySQL database
Maven or Gradle (for dependency management)

# API Endpoints
1. Upload Housing Data
Endpoint: POST /api/houses/save
Description: Takes JSON data from housing_data.json and stores it in the MySQL database.

2. Get Average Sale Price (Overall)
Endpoint: GET /api/houses/getAverage
Description: Returns the average sale price of all houses.

3. Get Average Sale Price (Per Location)
Endpoint: GET /api/houses/avgLocation
Description: Returns the average sale price per location.

4.Get Maximum Sale Price
Endpoint: GET /api/houses/maxPrice
Description: Returns the maximum sale price of houses.

5. Get Minimum Sale Price
Endpoint: GET /api/houses/minPrice
Description: Returns the minimum sale price of houses.

6. Get Average Price by Location
Endpoint: GET /api/houses/avgLocation2?loc=A
Description: Returns the average sale price of houses in the specified location.
