pipeline {
    agent any

    environment {
        // Define variables for image name and tag
        IMAGE_NAME = demoapp
        IMAGE_TAG = '1.0.6'
        REGISTRY_URL = https://hub.docker.com/repository/docker/mkgoyal/demoapp
        REGISTRY_USERNAME = mkgoyal
        REGISTRY_PASSWORD = mkg@160901
    }

    stages {
        stage('Build Image') {
            steps {
                script {
                    // Execute Podman build command to build the container image
                    sh "podman build -t ${IMAGE_NAME}:${IMAGE_TAG} ."
                }
            }
        }

        stage('Login to Registry') {
            steps {
                script {
                    // Login to the container registry using Podman
                    sh "podman login -u ${REGISTRY_USERNAME} -p ${REGISTRY_PASSWORD} ${REGISTRY_URL}"
                }
            }
        }

        stage('Push Image to Registry') {
            steps {
                script {
                    // Push the built image to the container registry
                    sh "podman push ${IMAGE_NAME}:${IMAGE_TAG} ${REGISTRY_URL}/${IMAGE_NAME}:${IMAGE_TAG}"
                }
            }
        }
    }
}
