pipeline {
    agent any
    triggers {
        pollSCM('* * * * *')
    }
    stages {
        stage('Compile') {
            steps {
                sh './mvnw compile'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }
        stage('Build') {
            steps {
                sh './mvnw package'
            }
        }
        stage('Dockerize') {
            steps {
                sh 'docker build -t localhost:5000/workshop .'
            }
        }
        stage('Push to registry') {
            steps {
                sh 'docker push localhost:5000/workshop'
            }
        }
    }
}
