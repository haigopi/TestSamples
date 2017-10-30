Notes:
You will need to download mysql binaries (just the executable is fine, admin console not required)
depending on the OS platform

Install my SQL
================
mysqld --console

Go to mysql bin dir:
mysqladmin -u root  password 'password'

mysql -u root -p
Enter password: password

create database demo;
use demo;

mysql> create table user(
    user_id varchar(30) NOT NULL,
    email_address varchar(30) NOT NULL,
    name varchar(30) NOT NULL,
    primary key (user_id));
Query OK, 0 rows affected (0.12 sec)


mysql> insert into user (user_id, email_address, name) values ('chitnis', 'venkatesh.chitnis@gmail.com', 'venkatesh chitnis');
Query OK, 1 row affected (0.00 sec)

mysql> alter table user add column zipcode varchar(5);
Query OK, 0 rows affected (0.11 sec)
Records: 0  Duplicates: 0  Warnings: 0

References:
===========
mysql cheatsheet: http://cse.unl.edu/~sscott/ShowFiles/SQL/CheatSheet/SQLCheatSheet.html
http://en.wikipedia.org/wiki/List_of_object-relational_mapping_software
http://www.tutorialspoint.com/hibernate/hibernate_or_mappings.htm
http://docs.oracle.com/javaee/5/tutorial/doc/bnbpz.html
http://oauth.net/2/
http://aws.amazon.com/
