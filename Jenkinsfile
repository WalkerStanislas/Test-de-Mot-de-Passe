pipeline {
    agent any
    stages {
        stage("Build: Compiler le code source Java") {
            steps {
                // Compile both PasseTest and Test_ classes
                bat 'javac -cp "C:\\Users\\HP\\IdeaProjects\\TEST Logiciel\\junit-4.13.2.jar;build/classes" -sourcepath src -d build/classes src/*.java'
            }
        }
        stage ("Compilation et exécution du code de test") {
            steps {
                // Run JUnit tests
                bat "java -cp "junit-4.13.2.jar;hamcrest-core-2.2.jar;build/classes" org.junit.runner.JUnitCore Test_"
            }
        }
    }
}

