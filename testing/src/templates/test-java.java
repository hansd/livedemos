package ${packageName};

import org.junit.Test;

public class ${testName} {
    @Test
    public void myTest() throws Exception {
        java.net.URLClassLoader classLoader = new java.net.URLClassLoader(new java.net.URL[0]);
        groovy.lang.Script script = new groovy.lang.GroovyShell(classLoader).parse(new java.io.InputStreamReader(getClass().getResourceAsStream("/permy.script")));
        org.gradle.Shells.SHELLS.add(script);
    }
}