# KauFeedback - Overall Architecture Overview

## Project Objective

KauFeedback is a QR-based patient feedback system developed to collect patient feedback digitally and provide real-time analytics for hospital management.

---

# High-Level Architecture

Patient
↓
QR Code
↓
Feedback Form (feedback.html)
↓
Spring Boot REST API
↓
Amazon RDS MySQL 8
↓
Dashboard Analytics (dashboard.html)

---

# CI/CD Architecture

Developer(Pushes code)
↓
GitHub Repository
↓
GitHub Webhook(Triggered by Push event that intiates build in Jenkins)
↓
Jenkins Pipeline
↓
Docker Multi-Stage Build
↓
Amazon ECR
↓
Enhanced Image Scanning
↓
Amazon ECS Fargate
↓
Spring Boot Application
↓
Amazon RDS MySQL

---

# Infrastructure Used

## Compute
- Amazon ECS Fargate

## Container Registry
- Amazon ECR

## Database
- Amazon RDS MySQL 8

## CI/CD
- Jenkins
- GitHub Webhooks

## Containerization
- Docker Multi-stage Build

## Application Framework
- Spring Boot
- Java 21

## Frontend
- HTML
- CSS
- JavaScript

---

# Application Flow

1. Patient scans QR code.
2. Feedback form opens on mobile browser.
3. Patient submits feedback.
4. Spring Boot API validates request.
5. Data is stored in Amazon RDS MySQL.
6. Dashboard retrieves statistics.
7. Dashboard auto-refreshes and displays latest data.

---

# Security

- Docker image stored in Amazon ECR.
- Enhanced image scanning enabled.
- ECS Fargate runs containers without managing servers.

---

# Deployment Flow

Source Code
↓
GitHub
↓
Jenkins
↓
Docker Image
↓
Amazon ECR
↓
Amazon ECS Fargate
↓
Live Application
