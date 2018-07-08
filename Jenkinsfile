pipeline {
  agent any
  stages {
    stage('Get Code') {
      steps {
        bat(returnStdout: true, returnStatus: true, script: 'git \'https://github.com/kuankuo123/SingleProjectDemo.git/\'')
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
      }
    }
    stage('Deploy') {
      steps {
        echo 'pipeline success'
      }
    }
  }
}