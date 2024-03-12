pipeline {
  agent any
  stages{
  
   
    stage("Build: compiler le code source java"){
      steps{
        bat 'javac -cp "C:\\Users\\HP\\IdeaProjects\\TEST Logiciel\\junit-4.13.2.jar;." -sourcepath src -d build/classes src/*.java'
      }
    }
    stage ("Compilation et exécution du code de test"){
      steps{
        bat "javac -cp junit.jar:. Test_.java"
        bat "java -cp junit.jar:. org.junit.runner.JUnitCore Test_"
      }
    }
  }
}
