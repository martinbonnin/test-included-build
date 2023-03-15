plugins {
    id("org.jetbrains.kotlin.jvm").version("1.8.10")
}

repositories {
    mavenCentral()
}

group = "included"

dependencies {
    compileOnly(libs.apollo.gradle.plugin)
    implementation(libs.okio)
}