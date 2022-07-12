pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                git branch: 'main', credentialsId: 'clarke-github-creds', url: 'https://github.com/ClarkeHall/GloablAPI2.git'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}