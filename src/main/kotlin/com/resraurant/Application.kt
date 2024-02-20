package com.resraurant

import com.resraurant.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 9000, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSecurity()
    configureTemplating()
    configureSerialization()
    configureDatabases()
    configureSockets()
    configureRouting()
}
