pipeline {
    agent any
    environment {
        registry = 'shubhanshu1902/calculatorapp'
        registryCredential = 'dockerhubconnect'
        dockerImage = ''
    }

    stages{
        stage('Pull GitHub Repository') {
            steps {
            // Get code from GitHub Repository
            git branch: 'main', url: 'https://github.com/Shubhanshu1902/CalculatorApp.git'
            }
        }

        stage('Build Code using Maven') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Creating Image using Docker') {
            steps {
                script {
                    dockerImage = docker.build registry + ":latest"
                }
            }
        }

        stage('Pushing the Image to Docker Repository') {
            steps {
                script {
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }

        stage('Remove Docker Image from Local System to free space') {
            steps {
                sh 'docker rmi $registry:latest'
            }
        }

        stage('Run ansible for deployment') {
            steps {
                ansiblePlaybook becomeUser: null,
                colorized: true,
                credentialsId: 'localhost',
                disableHostKeyChecking: true,
                installation: 'Ansible',
                inventory: 'inventory',
                playbook: 'playbook.yml',
                sudoUser: null,
                ansible_sudo_pass='raheja1907'
            }
        }
    }
}