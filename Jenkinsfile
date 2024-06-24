pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from SCM (e.g., Git)
                git branch: 'main', url: 'https://github.com/sbsachin099/Sample01.git'
            }
        }

        stage('Install Dependencies') {
            steps {
                // Maven dependency installation
                sh 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                // Run test cases
                sh 'mvn test'  // Adjust as per your Maven project setup
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed'  // Example: Echo statement for completion
        }
    }
}
