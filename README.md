# spring-boot
All Spring Boot Applications &amp; Microservices


# Getting Started

## Steps to run this application
**Step(1):** Login the docker
	`docker login`
	
**Step(2):** Start the mysql server
	`docker run -d -p 6033:3306 --name=rmanoj-docker-mysql --env="MYSQL_ROOT_PASSWORD=root" --env="MYSQL_PASSWORD=root" --env="MYSQL_DATABASE=logindb" mysql:8.0.25`

**Step(3):** Execute mysql client
	`docker exec -it rmanoj-docker-mysql mysql -uroot -proot logindb < login_mgr.sql `
	`docker exec -it rmanoj-docker-mysql bash`
	`config get *`

