plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.developer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("com.google.truth:truth:1.4.2")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}