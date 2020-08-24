#
# curl http://localhost:8080/EUREKACLIENT/index
#
build: clean
	mvn package
	mvn install

eurekaserver_exec:
	mvn exec:java -pl eurekaserver -Dexec.mainClass="com.lynn.Application"

eurekaclient1_exec:
	mvn exec:java -pl eurekaclient1 -Dexec.mainClass="com.lynn.Application"

eurekaclient2_exec:
	mvn exec:java -pl eurekaclient2 -Dexec.mainClass="com.lynn.Application"

gateway_exec:
	 mvn exec:java -pl gateway -Dexec.mainClass="com.lynn.gateway.Application"

clean:
	mvn clean
