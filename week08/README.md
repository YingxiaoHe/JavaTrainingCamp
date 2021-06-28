### 插曲
    在部署、启动ShardingSphere时，出现了如下错误。在lib路径下添加JDBC的jar包可以解决。
```
Exception in thread "main" org.apache.shardingsphere.infra.exception.ShardingSphereException: Cannot load JDBC driver class `com.mysql.jdbc.Driver`, make sure it in ShardingSphere-Proxy's classpath.
        at org.apache.shardingsphere.proxy.backend.communication.jdbc.datasource.factory.JDBCRawBackendDataSourceFactory.validateDriverClassName(JDBCRawBackendDataSourceFactory.java:79)
        at org.apache.shardingsphere.proxy.backend.communication.jdbc.datasource.factory.JDBCRawBackendDataSourceFactory.build(JDBCRawBackendDataSourceFactory.java:59)
        at org.apache.shardingsphere.proxy.initializer.impl.AbstractBootstrapInitializer.createDataSources(AbstractBootstrapInitializer.java:94)
        at org.apache.shardingsphere.proxy.initializer.impl.AbstractBootstrapInitializer.lambda$createDataSourcesMap$0(AbstractBootstrapInitializer.java:88)
        at java.util.stream.Collectors.lambda$toMap$58(Collectors.java:1321)
        at java.util.stream.ReduceOps$3ReducingSink.accept(ReduceOps.java:169)
        at java.util.Iterator.forEachRemaining(Iterator.java:116)
        at java.util.Spliterators$IteratorSpliterator.forEachRemaining(Spliterators.java:1801)
        at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)
        at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
        at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:566)
        at org.apache.shardingsphere.proxy.initializer.impl.AbstractBootstrapInitializer.createDataSourcesMap(AbstractBootstrapInitializer.java:88)
        at org.apache.shardingsphere.proxy.initializer.impl.AbstractBootstrapInitializer.createSchemaContexts(AbstractBootstrapInitializer.java:73)
        at org.apache.shardingsphere.proxy.initializer.impl.AbstractBootstrapInitializer.init(AbstractBootstrapInitializer.java:63)
        at org.apache.shardingsphere.proxy.Bootstrap.main(Bootstrap.java:48)
```

### mysql客户端
```
mysql -uroot -h127.0.0.1 -P 3307 -p -A
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 10
Server version: 8.0.21-ShardingSphere-Proxy 5.0.0-RC1

Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use sharding_db;
Database changed
mysql> show tables;
+---------------------+
| Tables_in_demo_ds_0 |
+---------------------+
| t_order             |
| t_order_item        |
+---------------------+
2 rows in set (0.01 sec)

mysql> select * from t_order;
Empty set (0.04 sec)

mysql> insert into t_order(user_id, status) values (1, 'OK'),(1, 'FAIL');
       insert into t_order(user_id, status) values (2, 'OK'),(2, 'FAIL');
Query OK, 2 rows affected (0.42 sec)

Query OK, 2 rows affected (0.01 sec)

mysql> select * from t_order;
+--------------------+---------+--------+
| order_id           | user_id | status |
+--------------------+---------+--------+
| 616394853475397634 |       2 | FAIL   |
| 616394853475397633 |       2 | OK     |
| 616394852011585536 |       1 | OK     |
| 616394852011585537 |       1 | FAIL   |
+--------------------+---------+--------+
4 rows in set (0.01 sec)

mysql>

```

### ShardingSphere日志
```
[INFO ] 22:10:55.080 [ShardingSphere-Command-13] ShardingSphere-SQL - Logic SQL: show tables
[INFO ] 22:10:55.080 [ShardingSphere-Command-13] ShardingSphere-SQL - SQLStatement: MySQLShowTablesStatement(fromSchema=Optional.empty)
[INFO ] 22:10:55.080 [ShardingSphere-Command-13] ShardingSphere-SQL - Actual SQL: ds_0 ::: show tables
[INFO ] 22:10:55.080 [ShardingSphere-Command-13] ShardingSphere-SQL - Actual SQL: ds_1 ::: show tables
[INFO ] 22:11:22.935 [ShardingSphere-Command-14] ShardingSphere-SQL - Logic SQL: select * from t_order
[INFO ] 22:11:22.935 [ShardingSphere-Command-14] ShardingSphere-SQL - SQLStatement: MySQLSelectStatement(limit=Optional.empty, lock=Optional.empty)
[INFO ] 22:11:22.935 [ShardingSphere-Command-14] ShardingSphere-SQL - Actual SQL: ds_0 ::: select * from t_order_0
[INFO ] 22:11:22.935 [ShardingSphere-Command-14] ShardingSphere-SQL - Actual SQL: ds_0 ::: select * from t_order_1
[INFO ] 22:11:22.935 [ShardingSphere-Command-14] ShardingSphere-SQL - Actual SQL: ds_1 ::: select * from t_order_0
[INFO ] 22:11:22.935 [ShardingSphere-Command-14] ShardingSphere-SQL - Actual SQL: ds_1 ::: select * from t_order_1
[INFO ] 22:13:05.005 [ShardingSphere-Command-15] ShardingSphere-SQL - Logic SQL: insert into t_order(user_id, status) values (1, 'OK'),        (1, 'FAIL')
[INFO ] 22:13:05.005 [ShardingSphere-Command-15] ShardingSphere-SQL - SQLStatement: MySQLInsertStatement(setAssignment=Optional.empty, onDuplicateKeyColumns=Optional.empty)
[INFO ] 22:13:05.005 [ShardingSphere-Command-15] ShardingSphere-SQL - Actual SQL: ds_1 ::: insert into t_order_0(user_id, status, order_id) values (1, 'OK', 616394852011585536)
[INFO ] 22:13:05.005 [ShardingSphere-Command-15] ShardingSphere-SQL - Actual SQL: ds_1 ::: insert into t_order_1(user_id, status, order_id) values (1, 'FAIL', 616394852011585537)
[INFO ] 22:13:05.132 [ShardingSphere-Command-0] ShardingSphere-SQL - Logic SQL: insert into t_order(user_id, status) values (2, 'OK'),        (2, 'FAIL')
[INFO ] 22:13:05.132 [ShardingSphere-Command-0] ShardingSphere-SQL - SQLStatement: MySQLInsertStatement(setAssignment=Optional.empty, onDuplicateKeyColumns=Optional.empty)
[INFO ] 22:13:05.132 [ShardingSphere-Command-0] ShardingSphere-SQL - Actual SQL: ds_0 ::: insert into t_order_1(user_id, status, order_id) values (2, 'OK', 616394853475397633)
[INFO ] 22:13:05.132 [ShardingSphere-Command-0] ShardingSphere-SQL - Actual SQL: ds_0 ::: insert into t_order_0(user_id, status, order_id) values (2, 'FAIL', 616394853475397634)
[INFO ] 22:18:32.810 [ShardingSphere-Command-1] ShardingSphere-SQL - Logic SQL: select * from t_order
[INFO ] 22:18:32.810 [ShardingSphere-Command-1] ShardingSphere-SQL - SQLStatement: MySQLSelectStatement(limit=Optional.empty, lock=Optional.empty)
[INFO ] 22:18:32.810 [ShardingSphere-Command-1] ShardingSphere-SQL - Actual SQL: ds_0 ::: select * from t_order_0
[INFO ] 22:18:32.810 [ShardingSphere-Command-1] ShardingSphere-SQL - Actual SQL: ds_0 ::: select * from t_order_1
[INFO ] 22:18:32.810 [ShardingSphere-Command-1] ShardingSphere-SQL - Actual SQL: ds_1 ::: select * from t_order_0
[INFO ] 22:18:32.810 [ShardingSphere-Command-1] ShardingSphere-SQL - Actual SQL: ds_1 ::: select * from t_order_1
```

    可以看到，当对t_order进行查询时，ShardingSphere会去各个库、表查询然后把数据拼起来返回。
    当进行数据插入时，ShardingSphere会根据规则去相应的库、表添加数据。

