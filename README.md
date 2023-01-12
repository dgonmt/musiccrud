# musiccrud
A simple ORM-app is creating Artist-objects from MYSQL-database.
Will print every artist and albums.



## Instructions  
cd ~  
mkdir ws  
git clone https://github.com/dgonmt/musiccrud.git  
cd musiccrud  
curl -L  https://gist.github.com/miwashiab/e39a3228f0b389b6f3eca1b8c613bb2e/raw/db.sql -o db.sql

## TODO  
1) Make sure you have MYSQL running in a Docker container
2) Assuming the container name is iths-mysql, run:  
	docker exec -i ihts-mysql mysql -uroot -proot < db.sql  
	docker exec -i iths-mysql mysql -uroot -proot <<< "GRANT INSERT, SELECT, UPDATE, DELETE ON Chinook.* to 'iths'@'%';"
3) To run the app and print artists and albums, run:  
	gradle run