# KauFeedback – QR-Based Patient Feedback System

## Project Overview
KauFeedback is a QR-based patient feedback platform developed to collect patient feedback through QR codes and provide real-time analytics for hospital management.

## Duration
4 Days

## License
MIT (Open Source)

---

# Project Flow

Spring Initializr
↓
GitHub
↓
EC2 Instance
↓
Spring Boot + HTML
↓
Amazon RDS MySQL
↓
Docker Multi-stage Build
↓
GitHub Webhook
↓
Jenkins CI/CD
↓
Amazon ECR
↓
ECR Image Scanning
↓
Amazon ECS Fargate
↓
Live Application

---

# Frontend

Static HTML pages:

- feedback.html – Patient Feedback Form
- dashboard.html – Real-time Dashboard

Features:
- QR code access
- Responsive design
- Thank-you screen
- Auto refresh dashboard

---

# Backend

Spring Boot REST API

Features:
- Input validation
- JSON responses
- Dashboard statistics

---

# Database

Amazon RDS MySQL 8

Table:
- feedback_entries

---

# Containerization

Multi-stage Dockerfile

Build Stage:
- Maven 3.9.6
- Java 21

Runtime Stage:
- Amazon Corretto 21

---

# CI/CD

GitHub
↓
GitHub Webhook
↓
Jenkins Pipeline
↓
Docker Build
↓
Amazon ECR
↓
ECR Image Scanning
↓
Amazon ECS Fargate

---

# Technologies

- Java 21
- Spring Boot
- MySQL
- Docker
- Jenkins
- GitHub Webhooks
- Amazon ECR
- Amazon ECS Fargate
- Amazon RDS
