import org.gradle.api.plugins.*
import org.gradle.api.tasks.*

// Apply the java plugin to add support for Java
apply<EclipsePlugin>()
apply<GroovyPlugin>()
apply<IdeaPlugin>()
apply<JavaPlugin>()

// In this section you declare where to find the dependencies of your project
repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    compile("org.codehaus.groovy:groovy:2.4.7")

    testCompile("junit:junit:4.12")
}
