def call() {
    pipeline {
        agent any
        stages {
            stage('Shared Library Stage') {
                steps {
                    echo '✅ Executing from shared library!'
                }
            }
        }
    }
}
