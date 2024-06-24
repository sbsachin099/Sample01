pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout code from GitHub repository
                git branch: 'main', url: 'https://github.com/sbsachin099/Sample01.git'
            }
        }
        
        stage('Build') {
            steps {
                // Build the Maven project
                sh 'mvn clean package'
            }
        }
        
        stage('Test') {
            steps {
                // Run the tests
                sh 'mvn test'
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline successfully completed!'
        }
        failure {
            echo 'Pipeline failed :('
        }
        always {
            echo 'Pipeline finished.'
        }
    }
}
