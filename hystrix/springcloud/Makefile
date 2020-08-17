#
# start eurekaserver, eurekaclient and feign
# access http://localhost:8081/index
# stop eurekaclient, the fuse works
# to monitor the fuse, access http://localhost:8081/hystrix
#
build: clean
	mvn package
	mvn install

eurekaserver_exec:
	mvn exec:java -pl eurekaserver -Dexec.mainClass="com.lynn.Application"

eurekaclient_exec:
	mvn exec:java -pl eurekaclient -Dexec.mainClass="com.lynn.Application"

feign_exec:
	 mvn exec:java -pl feign -Dexec.mainClass="com.lynn.feign.Application"

clean:
	mvn clean
