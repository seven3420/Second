plugins {
    alias(libs.plugins.android.application)
}

android {
        namespace = "cn.edu.sicnu.cs.stu.zhuoyilin.third"
        compileSdk = 37

        buildFeatures {
            viewBinding = true
        }

    defaultConfig {
        applicationId = "cn.edu.sicnu.cs.stu.zhuoyilin.third"
        minSdk = 26
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.constraintlayout)
}


