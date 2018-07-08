pipeline {
  agent any
  stages {
    stage('Get Code') {
      parallel {
        stage('Get Code') {
          steps {
            git 'https://github.com/kuankuo123/SingleProjectDemo.git/'
          }
        }
        stage('') {
          steps {
            echo 'Parrallen'
          }
        }
      }
    }
    stage('ode Analysis') {
      steps {
        bat(script: 'mvn clean', returnStatus: true, returnStdout: true)
        bat 'mvn compile'
      }
    }
    stage('Testing') {
      steps {
        bat 'mvn test'
      }
    }
    stage('Package') {
      steps {
        bat 'mvn -Dmaven.test.skip=true package'
        archive 'target/*.jar'
      }
    }
    stage('Deploy') {
      steps {
        echo 'pipeline success'
      }
    }
  }
}