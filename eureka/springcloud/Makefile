
build: clean
	mvn package

eurekaserver_exec:
	mvn exec:java -pl eurekaserver -Dexec.mainClass="com.lynn.Application"

eurekaclient_exec:
	mvn exec:java -pl eurekaclient -Dexec.mainClass="com.lynn.Application"

clean:
	mvn clean
