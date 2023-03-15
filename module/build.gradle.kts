import com.example.included.MyOperationIdGenerator

buildscript {
    dependencies {
        classpath("included:included-build")
    }
}

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.apollographql.apollo3")
}
repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.apollo.runtime)
}

apollo {
    service("service") {
        packageName.set("com.example")
        operationIdGenerator.set(MyOperationIdGenerator())
    }
}