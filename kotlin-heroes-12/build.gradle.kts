plugins {
    kotlin("jvm") version "2.1.10"
}

group = "com.tigcal.projects.kotlinheroes"
version = "12.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}