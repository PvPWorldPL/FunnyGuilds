dependencies {
    implementation(project(":funnyguilds-targets:spigot-server:nms:api"))
    // implementation(project(":nms:v1_8R3"))

    shadow("org.spigotmc:spigot:1.19.3-R0.1-SNAPSHOT")
    shadow("org.spigotmc:spigot-api:1.19.3-R0.1-SNAPSHOT")
    shadow("org.apache.commons:commons-lang3:3.12.0")
    shadow("io.netty:netty-all:4.1.87.Final")
    shadow("com.mojang:authlib:3.2.38")
    shadow("it.unimi.dsi:fastutil:8.5.11")
    shadow("com.mojang:brigadier:1.0.500")
}