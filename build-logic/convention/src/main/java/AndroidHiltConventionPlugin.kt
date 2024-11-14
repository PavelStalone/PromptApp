import com.rut.promptapp.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidHiltConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("dagger.hilt.android.plugin")
                apply("com.google.devtools.ksp")
            }

            dependencies {
                add("implementation", libs.findLibrary("google.dagger.hilt.android").get())
                add("implementation", libs.findLibrary("androidx.hilt.ext.work").get())
                add("implementation", libs.findLibrary("androidx.hilt.ext.common").get())
                add("implementation", libs.findLibrary("androidx.hilt.navigation.compose").get())

                add("ksp", libs.findLibrary("google.dagger.hilt.android.compiler").get())
                add("ksp", libs.findLibrary("androidx.hilt.ext.compiler").get())

                // Testing
                add(
                    "testImplementation",
                    libs.findLibrary("google.dagger.hilt.android.testing").get()
                )
                add("kspTest", libs.findLibrary("google.dagger.hilt.android.testing").get())

                // Android testing
                add(
                    "androidTestImplementation",
                    libs.findLibrary("google.dagger.hilt.android.testing").get()
                )
                add("kspAndroidTest", libs.findLibrary("google.dagger.hilt.android.testing").get())
            }
        }
    }
}
