plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = Version.max_sdk
    namespace = "com.vladan.mvvm_android"

    defaultConfig {
        applicationId = "com.vladan.mvvm_android"
        minSdk = Version.min_sdk
        targetSdk = Version.max_sdk
        versionCode = 1
        versionName = "1.0"

        setProperty("archivesBaseName", "$versionName")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
        getByName("debug") {
            isDebuggable = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        dataBinding = true

    }

}

dependencies {

    common()
    ktx()
    networking()
    hilt()
    picasso()
    googlePlaces()
    room()
    test()
}

kapt {
    correctErrorTypes = true
}