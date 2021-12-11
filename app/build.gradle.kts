repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm").version("1.6.0")
    application
}

dependencies {
    implementation(platform(kotlin("bom")))
    implementation(kotlin("stdlib-jdk8"))
}

application {
    mainClass.set("genericapi.ApplicationKt")
}
