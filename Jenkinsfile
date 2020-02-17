pipeline {
    agent any

    stages {

        stage('FirstStage') {
            steps {
                // sh 'docker --version'
                echo 'Executing First Stage'
            }
        }

        stage('SecondState') {
            steps {
                echo 'Executing Second Stage'
            }
        }
        stage('DeployStage') {
            steps {   
                echo 'Starting to deploy docker image!!'
            }
        }

        
       
    }
}