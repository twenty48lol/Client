package dev.blend.handler.api

import dev.blend.handler.Handler
import dev.blend.handler.impl.*
import dev.blend.util.interfaces.IManager

object HandlerManager: IManager {

    val handlers = mutableListOf<Handler>()

    override fun initialize() {
        handlers.addAll(arrayOf(
            KeyPressHandler(),
            ChatMessageHandler(),
            ThemeHandler
        ))
        handlers.forEach {
            it.register()
        }
    }

}