
build:
	mvn package

exec:
	mvn exec:java -Dexec.mainClass="com.lynn.Application"

exec_jar:
	rm -rf target/eurekaserver-1.0-SNAPSHOT
	cd target && unzip eurekaserver-1.0-SNAPSHOT-full.zip && java -cp eurekaserver-1.0-SNAPSHOT/eurekaserver-1.0-SNAPSHOT.jar com.lynn.Application

clean:
	mvn clean
