# consul-configuration
consul distibution config poc

# to run consul and ui on docker
docker run --name consul -p 8500:8500 consul agent -dev -ui -client=0.0.0.0 -bind=0.0.0.0
