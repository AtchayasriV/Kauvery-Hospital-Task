pipeline {
    agent any

    environment {
        AWS_REGION = "ap-south-1"
        ACCOUNT_ID = "922931546897"
        ECR_REPO = "kau-feedback"
        ECR_URL = "922931546897.dkr.ecr.ap-south-1.amazonaws.com/kau-feedback"
        IMAGE_NAME = "feedback-app"
        CLUSTER_NAME = "kauvery-feedback-cluster"
        SERVICE_NAME = "kau-feedback-task-service-innpbdpf"
    }

    stages {

        stage('1. Checkout Code') {
            steps {
                git 'https://github.com/AtchayasriV/Kauvery-Hospital-Task.git'
            }
        }

        stage('2. Build Docker Image') {
            steps {
                sh '''
                echo "Building Docker image..."
                docker build -t $IMAGE_NAME .
                '''
            }
        }

        stage('3. Login to ECR') {
            steps {
                sh '''
                echo "Logging into ECR..."
                aws ecr get-login-password --region $AWS_REGION | \
                docker login --username AWS --password-stdin $ACCOUNT_ID.dkr.ecr.$AWS_REGION.amazonaws.com
                '''
            }
        }

        stage('4. Tag Image') {
            steps {
                sh '''
                echo "Tagging image..."
                docker tag $IMAGE_NAME:latest $ECR_URL:latest
                '''
            }
        }

        stage('5. Push Image to ECR') {
            steps {
                sh '''
                echo "Pushing image to ECR..."
                docker push $ECR_URL:latest
                '''
            }
        }

        stage('6. Deploy to ECS') {
            steps {
                sh '''
                echo "Deploying to ECS..."
                aws ecs update-service \
                --cluster $CLUSTER_NAME \
                --service $SERVICE_NAME \
                --force-new-deployment
                '''
            }
        }
    }

    post {
        success {
            echo "PIPELINE SUCCESS 🚀 Application deployed!"
        }
        failure {
            echo "PIPELINE FAILED ❌ Check logs"
        }
    }
}
