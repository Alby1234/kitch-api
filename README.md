# kitch-api

The backend api for the kitch web app - being developed by Albert Lillington.

## Run
### `mvn spring-boot:run`

## Build and Deploy

Follow these instructions to build and deploy the application using Docker.

Execute locally:

```
mvn -D KITCH_DB_USERNAME=username -D KITCH_DB_PASSWORD=password package

docker build -t albylillington/kitch:tag-name .

docker push albylillington/kitch:tag-name
```

Execute on target machine (EC2):

###### _Note: only execute the following command if Docker is not yet running_
```
sudo service docker start
```
```
docker pull albylillington/kitch:tag-name

docker run -p 80:8080 -e KITCH_DB_USERNAME=username -e KITCH_DB_PASSWORD=password albylillington/kitch:tag-name

```

