pipeline {
    agent any
    stages{
        stage('Pull GitHub Repository') {
            steps {
            // Get code from GitHub Repository
            git branch: 'main', url: 'https://github.com/dodopool/Calculator-SPE-MiniProject.git'
            }
        }

        stage('Build Code using Maven') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}