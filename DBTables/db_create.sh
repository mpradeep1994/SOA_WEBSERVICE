# /bin/bash/

# Start mySql
mysql -u root -p <<EOF

# Create Database and user and grant privileges to the user
create database apa_logistics;
GRANT ALL PRIVILEGES on apa_logistics.* TO aswin@localhost IDENTIFIED BY 'root';

EOF

#Exit Connection
exit
