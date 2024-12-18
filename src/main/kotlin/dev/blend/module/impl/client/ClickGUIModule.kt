package dev.blend.module.impl.client

import dev.blend.module.Module
import dev.blend.module.api.Category
import dev.blend.module.api.ModuleInfo
import dev.blend.ui.dropdown.DropdownClickGUI
import dev.blend.value.impl.ModeValue
import org.lwjgl.glfw.GLFW

@ModuleInfo(
    names = ["ClickGUI", "GUI"],
    description = "Displays a GUI for the user to edit the client's features in.",
    category = Category.CLIENT,
    key = GLFW.GLFW_KEY_RIGHT_SHIFT
)
object ClickGUIModule: Module() {

    val style = ModeValue("Style", this, arrayOf("Dropdown"))

    override fun onEnable() {
        mc.setScreen(DropdownClickGUI)
    }

    override fun onDisable() {
        mc.setScreen(null)
    }

}