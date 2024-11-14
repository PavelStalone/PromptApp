package com.rut.promptapp.convention

import com.android.build.api.variant.LibraryAndroidComponentsExtension
import org.gradle.api.Project

internal fun LibraryAndroidComponentsExtension.disableUnnecessaryAndroidTests(
    project: Project,
) = beforeVariants { builder ->
    builder.androidTest.enable = builder.androidTest.enable
            && project.projectDir.resolve("src/androidTest").isDirectory
}
