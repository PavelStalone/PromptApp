import com.rut.promptapp.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidHiltConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.google.devtools.ksp")
                apply("com.google.dagger.hilt.android")
            }

            dependencies {
                add("implementation", libs.findLibrary("hilt.android").get())
                add("implementation", libs.findLibrary("hilt.ext.work").get())
                add("implementation", libs.findLibrary("hilt.ext.common").get())
                add("implementation", libs.findLibrary("hilt.navigation.compose").get())

                add("ksp", libs.findLibrary("hilt.android.compiler").get())
                add("ksp", libs.findLibrary("hilt.ext.compiler").get())
            }
        }
    }
}
