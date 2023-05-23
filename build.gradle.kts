plugins {
    id("java")
}

group = "com.lololchike"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    //spark java
    //sql2o
    //postgres
    //spark-template-handlers
}

tasks.test {
    useJUnitPlatform()
}