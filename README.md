# kitch-api

The backend api for the kitch web app - being developed by Albert Lillington.

## Run
### `mvn spring-boot:run`

## Docker

Follow these instructions to build and run the applicaiton using Docker.

#### `mvn -DKITCH_DB_USERNAME=username -DKITCH_DB_PASSWORD=password package`

#### `docker build -t tag-name .`

#### `docker run -p 8080:8080 -e KITCH_DB_USERNAME=username -e KITCH_DB_PASSWORD=password tag-name`



