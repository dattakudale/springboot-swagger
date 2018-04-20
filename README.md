# springboot-swagger
springboot swagger example

# Build image

docker build -t springboot-swagger:latest --build-arg  JAR_FILE=./target/springboot-swagger-1.0.0.jar  .

# Run image

docker run -t springboot-swagger
