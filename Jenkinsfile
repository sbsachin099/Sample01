pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Commands to build your project (e.g., compiling code)
                bat 'mvn clean package' // Use 'bat' instead of 'sh' for Windows
            }
        }
        stage('Test') {
            steps {
                // Commands to run your test cases
                bat 'mvn test' // Use 'bat' instead of 'sh' for Windows
            }
        }
    }
}
