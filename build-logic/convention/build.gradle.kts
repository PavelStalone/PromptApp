plugins {
    `kotlin-dsl`
}

group = "com.ortin.ortinfy.buildlogic"

dependencies {
    compileOnly(libs.gradlePlugin.android)
    compileOnly(libs.gradlePlugin.kotlin)
    compileOnly(libs.gradlePlugin.ksp)
}

gradlePlugin {
    plugins {
        register("androidLibrary") {
            id = "rut.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "rut.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("androidHilt") {
            id = "rut.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }
        register("androidFeature") {
            id = "rut.android.feature"
            implementationClass = "AndroidFeatureConventionPlugin"
        }
        register("androidSerialization") {
            id = "rut.android.serialization"
            implementationClass = "AndroidSerializationConventionPlugin"
        }
    }
}
