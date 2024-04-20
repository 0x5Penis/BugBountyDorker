package git.overlord

import git.overlord.core.handlers.AddonsHandler
import git.overlord.core.handlers.DirectoryHandler
import git.overlord.core.handlers.ModuleHandler
import git.overlord.core.handlers.ThemeMenuItemHandler
import git.overlord.frames.WindowFrame
import javax.swing.SwingUtilities

class Main {
    companion object {
        val MAIN_FRAME = WindowFrame()

        fun run(): () -> Unit {
            return { MAIN_FRAME }
        }
    }
}

fun main() {
    ModuleHandler()
    AddonsHandler()
    ThemeMenuItemHandler()
    DirectoryHandler()
    SwingUtilities.invokeLater(Main.run())
}