plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.stremniapp"
    compileSdk = 35  // CHANGED: Updated to SDK 35

    defaultConfig {
        applicationId = "com.example.stremniapp"
        minSdk = 24
        targetSdk = 35 // Keep target at 34 for compatibility
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        release {
            // Turn off shrinking for now
            minifyEnabled = false
            shrinkResources = false

            // If you want proguard/shrinking later, enable these:
            // minifyEnabled = true
            // shrinkResources = true
            // proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

flutter {
    source = "../.."
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    
    // ML Kit for OCR (Text Recognition)
    implementation("com.google.mlkit:text-recognition:16.0.0")
    
    // For screen capture
    implementation("androidx.media3:media3-common:1.2.0")
}
