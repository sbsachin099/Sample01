pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Commands to build your project (e.g., compiling code)
                sh 'mvn clean package' // Example for Maven project
            }
        }
        stage('Test') {
            steps {
                // Commands to run your test cases
                sh 'mvn test' // Example for Maven project
            }
        }
    }
}
