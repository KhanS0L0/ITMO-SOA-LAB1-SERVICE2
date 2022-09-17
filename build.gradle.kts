plugins {
    id("org.springframework.boot") version "2.7.3"
    id("io.spring.dependency-management") version "1.0.13.RELEASE"
    java
}

group = "ru.itmo.soa"
version = "0.0.1-SNAPSHOT"
val javaVersion = JavaVersion.VERSION_17

java {
    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("io.springfox:springfox-boot-starter:3.0.0")
    implementation("com.github.lkqm:spring-api-versioning:1.3.0")

    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

repositories {
    mavenCentral()
}