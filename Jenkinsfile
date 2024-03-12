pipeline {
  agent any
  stages{
    stage ("Cloner github"){
      steps{
        bat "git clone https://github.com/WalkerStanislas/Test-de-Mot-de-Passe.git"
      }
    }
    stage("Build: compiler le code source java"){
      steps{
        bat "javac -sourcepath src -d build/classes src/*.java"
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
