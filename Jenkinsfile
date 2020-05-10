pipeline {
  
  environment {
    registry = "nisarg20/calctesting"
    registryCredential = 'dockerhub'
  }
  
  agent any
  stages {
          
    stage('Clean') {
        steps{    
            logstash{
                sh 'mvn clean'
                echo "clean"
            }
        }
    }
        
    stage('Compile') {
        steps{
            logstash{
                sh 'mvn package'
                echo "compile"
            }
        }
    }
    stage('Test') {
        steps{    
            logstash {
                sh 'mvn test'
                echo "test"
            }
        }
    }
    
    stage('Deploy Image on DockerHub') {
        steps{    
            logstash {
                script{
                   dockerImage = docker.build registry + ":calc"
                   docker.withRegistry( '', registryCredential){
                   dockerImage.push()
                  }
                }
            }
        }
    }

    stage('Execute image using Rundeck') {
        steps {
    	  logstash{
                script {
                  step([$class: "RundeckNotifier",
                      includeRundeckLogs: true,
                      jobId: "63eedae0-f343-4433-84f5-b80f5b763329",
                      rundeckInstance: "Rundeck",
                      shouldFailTheBuild: true,
                      shouldWaitForRundeckJob: true,
                      tailLog: true])
                }
           }
    	}
     }

  }
}
