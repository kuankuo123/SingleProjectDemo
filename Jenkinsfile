pipeline {
  agent any
  stages {
    stage('Get Code') {
      steps {
        bat(returnStdout: true, returnStatus: true, script: 'mvn clean')
      }
    }
  }
}