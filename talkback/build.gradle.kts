plugins {
    id("com.android.library")
}

apply<Shared>()

android {
    namespace = "com.google.android.accessibility.talkback"
}

dependencies {
    implementation(project(":proguard"))
    implementation(project(":utils"))
    implementation(project(":compositor"))
    implementation(project(":brailleime"))
}

android {
    defaultConfig {
        buildConfigField("String", "TALKBACK_MAIN_PERMISSION", '"' + ConfigData.talkbackMainPermission + '"')
    }
}