pipeline {
    agent any

<<<<<<< HEAD
=======
    environment {
        // Define variables for image name and tag
        IMAGE_NAME = 'demoapp'
        IMAGE_TAG = '1.0.6'
        REGISTRY_URL = 'https://hub.docker.com/repository/docker/mkgoyal/demoapp'
        REGISTRY_USERNAME = 'mkgoyal'
        REGISTRY_PASSWORD = 'mkg@160901'
    }

>>>>>>> 85f0eed791481dbedb6bbfd411a9925a421e31b2
    stages {
        stage('Build Image') {
            steps {
                echo 'building application'
            }
        }

        stage('Test Image') {
            steps {
                echo 'Test application'
            }
        }

       stage('Deploy Image') {
            steps {
                echo 'Deploy application'
            }
        }
    }
}
