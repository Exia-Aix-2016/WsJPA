# WsJPA
Prosit Java EE JPA
Workshop CESI about Java persistence API


All instruction are in WS Etudiant.docx

## I. Create Database with docker

```
docker run --name mysql -e MYSQL_ROOT_PASSWORD=admin -p 3306:3306 -d mysql
```
### Init database
you will find in the bdd folder the sql script to create the database.

## II. Requirement
### Distribution
Ubuntu version 20+
### OpenJDK

Version required: 8

```
sudo apt update
sudo apt install openjdk-8-jdk
```
### Maven
```
sudo apt install maven
```
## Setup Payara
### Get Payara
Follow the link to download the version needed for the project
https://search.maven.org/artifact/fish.payara.distributions/payara/5.191/zip

Unzip the file where you want, that's it, it's installed !

### Get JDBC Driver to connect payara to mysql

follow the link and download
https://dev.mysql.com/downloads/file/?id=494900

Unzip the archive and put the mysql-connector-java.jar into :
```
./payara/glassfish/lib/
```

### Environment variables

Edit ~/.profile to add at the bottom of the file this :

```sh
export M2_HOME="/usr/share/maven"
GLASSFISH_HOME="<your path>/payara5"
export PATH="$PATH:$GLASSFISH_HOME/bin"
```
change "your path" by where your payara folder is



### Configure Payara
First of all to execute command on payara you must go into ./payara/bin/
and execute asadmin script

#### Start and stop
```
asadmin start-domain
asadmin stop-domain
```
To access to the admin console go to **localhost:4848**

#### About Domain
For this workshop you can use the default domain, domain1

#### Configure pool connection (bdd)
To configure the pool connection to enable payara to connect to mysql bdd type this command :

```
asadmin add-resources ./appli/bookStore/src/main/setup/glassfish-resources.xml
```
If after that your unable to connect, you can check in the admin console