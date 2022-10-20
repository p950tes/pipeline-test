
void call() {
    echo "my pipeline"
    pipeline {
        agent any

        stages {
            stage ("call github lib") {
                steps {
                    helloWorld()
                }
            }
        }
    }
}
