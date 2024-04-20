package git.overlord.menu.menuItems

import git.overlord.Main
import javax.swing.JMenuItem
import kotlin.system.exitProcess

class ExitItem : JMenuItem("Exit") {
    init {
        addActionListener {
            Main.MAIN_FRAME.dispose()
            exitProcess(0)
        }
    }
}