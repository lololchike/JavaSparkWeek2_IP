plugins {
    id("java")
}

group = "com.lololchike"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.sql2o:sql2o:1.6.0")
    implementation("com.sparkjava:spark-template-handlebars:2.7.1")
    implementation("com.sparkjava:spark-template-handlebars:2.7.1")
    implementation("com.sparkjava:spark-core:2.9.4")
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