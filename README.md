# Swagger example


## Build with maven 
mvn clean install

## Docker command

docker build -t swagger-service:v1 .

## Run with Docker

docker run swagger-service:v1


## Run with Kubernetes  using google cloud and use your porject.


docker tag swagger-service:v1 gcr.io/appsutility-141503/swagger-service:v1

gcloud docker -- push gcr.io/appsutility-141503/swagger-service:v1

## If you want run and validate

kubectl run swagger-service --image=gcr.io/appsutility-141503/swagger-service:v1


## Deploy spring boot using Kubernetes deployment file

kubectl create -f swagger-service.yaml	

## Update deployment with v2 version 

kubectl set image deployment/swagger-service swagger-service=gcr.io/appsutility-141503/swagger-service:v2


## Create multiple instances ( Replicas )   , below will create 3 instances of zuul proxy 

kubectl scale deployment swagger-service --replicas=3



