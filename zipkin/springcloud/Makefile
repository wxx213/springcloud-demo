#
# curl http://localhost:8080/EUREKACLIENT/index
#
build: clean
	mvn package
	mvn install

eurekaserver_exec:
	mvn exec:java -pl eurekaserver -Dexec.mainClass="com.lynn.Application"

eurekaclient_exec:
	mvn exec:java -pl eurekaclient -Dexec.mainClass="com.lynn.Application"

config_exec:
	mvn exec:java -pl config -Dexec.mainClass="com.lynn.config.Application"

zipkin_exec:
	mvn exec:java -pl zipkin -Dexec.mainClass="com.lynn.zipkin.Application"

clean:
	mvn clean
