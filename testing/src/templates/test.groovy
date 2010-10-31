package ${packageName}

import spock.lang.Specification

class ${testName} extends Specification {
    def mySpec() {
        Thread.sleep(${sleep})
//        URLClassLoader classLoader = new URLClassLoader(new URL[0])
//        Script script = new GroovyShell(classLoader).parse(getClass().getResourceAsStream("/permy.script"));
//        org.gradle.Shells.shells.add(script);

        expect:
        2 == 2
    }
}