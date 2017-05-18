pipeline {
    agent any
    triggers {
        cron('* * * * * *')
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
    }
}
