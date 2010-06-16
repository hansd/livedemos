package ${packageName}

import spock.lang.Specification

class ${testName} extends Specification {
    def mySpec() {
        Thread.sleep(${sleep})

        expect:
        2 == 2
    }
}