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




### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.2/maven-plugin/reference/html/#build-image)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.5.2/reference/htmlsingle/#boot-features-security)

### Guides
The following guides illustrate how to use some features concretely:

* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)






