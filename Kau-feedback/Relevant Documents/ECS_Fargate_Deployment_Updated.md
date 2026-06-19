# 09_ECS_Fargate_Deployment.md

# Amazon ECS Fargate Deployment

## Overview

Amazon ECS resources were created manually using the AWS Management Console. Jenkins CI/CD was responsible for building Docker images and pushing them to Amazon ECR. The ECS infrastructure itself was provisioned manually.

---

## Amazon ECR Repository

- Created manually through AWS Console.
- Enabled Enhanced Image Scanning.
- Jenkins pushes Docker images to the repository.

---

## ECS Cluster

An ECS Cluster was created manually using the AWS Management Console.

Configuration:

- Launch Type: AWS Fargate
- Region: ap-south-1

---

## Task Definition

A Task Definition was created manually.

Configuration:

- Launch Type: Fargate
- Container Image: Amazon ECR Image URI
- Port Mapping: 8080
- CPU and Memory configured
- Java Spring Boot container

---

## ECS Service

A Service was created manually.

Configuration:

- Desired Count: 1
- Associated Task Definition
- Security Group attached
- Networking configured

---

## Deployment Flow

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
(ECR Repository already exists)
↓
Amazon ECS Fargate
(Cluster, Task Definition and Service created manually)
↓
Spring Boot Application
↓
Amazon RDS MySQL

---

## Summary

Infrastructure resources such as Amazon ECR, ECS Cluster, Task Definition and Service were created manually through AWS Console, while Jenkins automated Docker image creation and push operations.
