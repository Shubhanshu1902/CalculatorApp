stage('Pull Github Repository'){
    steps {
        git branch: 'main' , url: 'https://github.com/Shubhanshu1902/CalculatorApp.git'
    }
}

stage('Build Pulled Code Using Maven'){
    steps {
        sh 'mvn clean install'
    }
}