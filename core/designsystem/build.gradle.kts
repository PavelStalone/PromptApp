plugins {
    id("rut.android.library")
    id("rut.android.library.compose")
}

android {
    namespace = "com.rut.promptapp.core.designsystem"
}

dependencies {
    api(platform(libs.androidx.compose.bom))

    api(libs.android.material)

    api(libs.androidx.ui)
    api(libs.androidx.material3)
    api(libs.androidx.ui.graphics)
    api(libs.androidx.ui.tooling.preview)

    api(libs.androidx.activity.compose)
    api(libs.androidx.lifecycle.viewmodel.compose)
}
