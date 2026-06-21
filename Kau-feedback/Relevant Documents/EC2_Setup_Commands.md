# EC2 Instance Setup Commands - KauFeedback Project

## 1. Install MariaDB Client

```bash
yum install mariadb* -y
```

If dependency issues occur:

```bash
yum install mariadb* -y --skip-broken
```

## 2. Connect to Amazon RDS MySQL

Connect using admin user:

```bash
mysql -u admin -h kaufeedback-db.c7y4264wsewk.ap-south-1.rds.amazonaws.com -p
```

## 3. Update Packages

```bash
sudo dnf update -y
```

## 4. Install Git

```bash
sudo dnf install git -y
git --version
```

## 5. Install Java 17

```bash
sudo dnf install java-21-amazon-corretto -y
java -version
```

## 6. Install Maven

```bash
sudo dnf install maven -y
mvn -version
```

## 7. Install Docker

```bash
sudo dnf install docker -y
```

## 8. Start and Enable Docker

```bash
sudo systemctl start docker
sudo systemctl enable docker
```

## 9. Add User to Docker Group

```bash
sudo usermod -aG docker ec2-user
groups
```

## Tools Installed

- MariaDB Client
- Git
- Java 21 (Amazon Corretto)
- Maven
- Docker

These tools were used for building and deploying the KauFeedback application.
