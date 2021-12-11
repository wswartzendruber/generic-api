import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm").version("1.6.0")
    id("org.springframework.boot").version("2.6.1")
    id("io.spring.dependency-management").version("1.0.11.RELEASE")
    application
}

tasks {
    withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}

dependencies {
    implementation(platform(kotlin("bom")))
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}

application {
    mainClass.set("genericapi.ApplicationKt")
}
