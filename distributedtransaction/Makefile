
# 1. create two databases with name test01 and test02
# 2. create one table with name test_user in the two databases created above

# 经过测试，如果没有报错，则数据被分别添加到两个数据库表中，如果有报错，则数据不会增加。

build:
	mvn package

exec:
	mvn exec:java -Dexec.mainClass="com.lynn.demo.Application"

clean:
	mvn clean
