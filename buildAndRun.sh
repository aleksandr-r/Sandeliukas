#!/bin/sh
mvn clean package && docker build -t one/one .
docker rm -f one || true && docker run -d -p 8080:8080 -p 4848:4848 --name one one/one 
