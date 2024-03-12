pipeline {
  agent any
  stages{
    stage ("Cloner github"){
      steps{
        bat "git clone https://github.com/WalkerStanislas/Test-de-Mot-de-Passe.git"
      }
    }
    stage("import des dépendances"){
      bat "import static org.junit.Assert.assertEquals;"
      bat "import static org.junit.Assert.assertNotEquals;"
    }
    stage("Build: compiler le code source java"){
      steps{
        bat "javac -cp 'C:\\Users\\HP\\IdeaProjects\\TEST Logiciel\\junit-4.13.2.jar;.' -sourcepath src -d build/classes src/*.java"
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
