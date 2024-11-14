plugins {
    id("rut.android.library.compose")
    id("rut.android.hilt")
}


android {
    namespace = "com.rut.promptapp.core.ui"
}

dependencies {
    implementation(project(":core:designsystem"))
}
