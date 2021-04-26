job ('npm test')
{
    scm {
        git('https://github.com/pyrek7/new.git') { node ->
                node / gitConfigName('DSL script')
                node / gitConfigEmail('jenkins-dsl-script@altkom.com')
            }
    }

    triggers {
        scm('H/5 * * * *')
    }

    wrappers {
        nodejs('nodejs')
    }

    steps {
        	shell('npm test')
    }
}