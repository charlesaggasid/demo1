use adlister_db;

SELECT user, host FROM mysql.user;

drop user adlister_user@localhost;
create user 'adlister_user'@'localhost' identified by 'codeup';
grant all on *.* TO 'adlister_user'@'localhost';
