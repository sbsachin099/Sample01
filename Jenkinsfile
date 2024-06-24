pipeline {
    agent any
    
    tools {
        maven 'Maven' // 'Maven' is the name of the Maven tool configured in Jenkins
    }
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/sbsachin099/Sample01.git'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
    
    post {
        always {
            echo 'Pipeline completed'
        }
    }
}
