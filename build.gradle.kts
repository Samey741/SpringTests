plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:7.8.0")
}

tasks.test {
    useTestNG()
    {
        suites("src/test/resources/testing.xml")
    }
}