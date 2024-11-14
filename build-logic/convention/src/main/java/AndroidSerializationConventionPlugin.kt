import com.rut.promptapp.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidSerializationConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("kotlinx-serialization")
            }

            dependencies {
                add("implementation", libs.findLibrary("kotlinx.serialization.json").get())
            }
        }
    }
}
