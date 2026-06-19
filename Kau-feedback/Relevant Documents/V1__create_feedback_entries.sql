CREATE DATABASE IF NOT EXISTS kaufeedback;

CREATE TABLE feedback_entries(
id BIGINT PRIMARY KEY AUTO_INCREMENT,
patient_name VARCHAR(100),
age INT,
visit_type VARCHAR(50),
department VARCHAR(100),
service VARCHAR(100),
rating INT,
comments TEXT
);
