git pull origin master

docker rm $(docker stop $(docker ps -a -q --filter ancestor=huhx/core-http-service --format="{{.ID}}"))

./gradlew build docker

echo 'success'