mysql -uhyx -pHyx123!@# -e "create database if not exists shop";
mvn clean compile flyway:migrate -Dmaster=mysql.camp.com -DdbName=shop
