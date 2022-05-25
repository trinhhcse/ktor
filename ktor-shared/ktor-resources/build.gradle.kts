description = "Common code for Resources feature"

plugins {
    kotlin("plugin.serialization")
}

kotlin.sourceSets {
    commonMain {
        dependencies {
            api(project(":ktor-http"))
            api(project(":ktor-utils"))
            api(libs.kotlinx.serialization.core)
        }
    }
}
