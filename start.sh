git pull origin master

docker rm $(docker stop $(docker ps -a -q --filter ancestor=huhx/core-http-service --format="{{.ID}}"))

./gradlew build docker

docker run -d -p 9095:9095 --name core-http-service huhx/core-http-service

echo 'success'