pipeline {
  agent any
  tools {
    maven 'maven'
  }
  stages {
    stage("clean"){
      step{
        sh 'mvn clean'
      }
    }
  
    stage("compile"){
      step{
        sh 'mvn compile'
      }
    }  
    stage("test"){
      steps{
        sh 'mvn test'
      }
    }
    stage("package"){
      steps{
        sh 'mvn package'
      }
    }
  }
}
