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
                // Example: Maven dependency installation
                sh 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                // Example: Run test cases (adjust as per your test framework and commands)
                sh 'mvn test'  // Replace with your actual test execution command
            }
        }
    }

    post {
        always {
            // Cleanup steps if needed
        }
    }
}
