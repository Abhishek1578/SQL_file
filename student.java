1.create database student;
Query OK, 1 row affected (0.01 sec)
mysql> use student;
Database changed
mysql> create table tbIParent(
    -> parentid int unique not null,
    -> parent_name varchar(20),
    -> city varchar(20),
    -> age int ,
    -> annual_income int,
    -> occupation varchar(20),
    -> email_id varchar(20));
Query OK, 0 rows affected (0.05 sec)

2.update tbIParent set email_id="NA";
Query OK, 10 rows affected (0.01 sec)
Rows matched: 10  Changed: 10  Warnings: 0

3.select count(annual_income) from tbIParent where annual_income>600000;
+----------------------+
| count(annual_income) |
+----------------------+
|                    5 |
+----------------------+
1 row in set (0.01 sec)



4.select* from tbIParent where city='ahmendabad' or city='delhi' or city='mumbai' or city='chennai' or city='banglore';
+----------+-------------+------------+------+---------------+-------------------+--------------------+
| parentid | parent_name | city       | age  | annual_income | occupation        | email_id           |
+----------+-------------+------------+------+---------------+-------------------+--------------------+
|      101 | supriya     | mumbai     |   21 |       2500000 | software engineer | supriya@gmail.com  |
|      102 | abhishek    | chennai    |   21 |         90000 | software develoer | abhishek@gmail.com |
|      103 | avanish     | ahmendabad |   22 |       7000000 | java developer    | avanish@gmail.com  |
|      104 | vishal      | banglore   |   23 |         80000 | master            | vishal@gmail.com   |
|      105 | priya       | delhi      |   24 |       1000000 | model             | priya@gmail.com    |
|      109 | mahesh      | mumbai     |   21 |       8000000 | java developer    | mahesh@gmail.com   |
+----------+-------------+------------+------+---------------+-------------------+--------------------+
6 rows in set (0.00 sec)




 5.select * from tbIParent where annual_income<500000;
+----------+-------------+---------------+------+---------------+---------------------+--------------------+
| parentid | parent_name | city          | age  | annual_income | occupation          | email_id           |
+----------+-------------+---------------+------+---------------+---------------------+--------------------+
|      102 | abhishek    | chennai       |   21 |         90000 | software develoer   | abhishek@gmail.com |
|      104 | vishal      | banglore      |   23 |         80000 | master              | vishal@gmail.com   |
|      107 | deepak      | uttarPradesh  |   23 |         90000 | artist              | deepak@gmail.com   |
|      108 | suryansh    | madhyapradesh |   24 |        100000 | pilot               | suryansh@gmail.com |
|      110 | arjun       | thane         |   23 |         70000 | mechanical engineer | arjun@gmail.com    |
+----------+-------------+---------------+------+---------------+---------------------+--------------------+
5 rows in set (0.00 sec)





5.mysql> select  * from tbIParent where age>45;
+----------+-------------+--------+------+---------------+----------------+-------------------+
| parentid | parent_name | city   | age  | annual_income | occupation     | email_id          |
+----------+-------------+--------+------+---------------+----------------+-------------------+
|      106 | supriya     | agra   |   50 |       1100000 | pilot          | supriya@gmail.com |
|      109 | mahesh      | mumbai |   55 |       8000000 | java developer | mahesh@gmail.com  |
+----------+-------------+--------+------+---------------+----------------+-------------------+
2 rows in set (0.00 sec)





6. create table students(
    -> sid int not null auto_increment primary key,
    -> sname varchar(200),
    -> math int,
    -> science int,
    -> pid int, foreign key(pid) references tbiparent(parentid)
    -> );
Query OK, 0 rows affected (0.07 sec)

 select*from students;
+-----+-----------+------+---------+------+
| sid | sname     | math | science | pid  |
+-----+-----------+------+---------+------+
| 101 | abhishek  |   56 |      70 |  101 |
| 102 | abhi      |   53 |      40 |  102 |
| 103 | abhilasha |   52 |      39 |  103 |
| 104 | abhilasha |   52 |      39 |  106 |
+-----+-----------+------+---------+------+
4 rows in set (0.00 sec)