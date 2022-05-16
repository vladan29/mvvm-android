// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id ("com.android.application") version "7.2.0" apply false
    id ("com.android.library") version "7.2.0" apply false
    id ("org.jetbrains.kotlin.android") version "1.6.21" apply false
}
buildscript {
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Version.hilt}")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}