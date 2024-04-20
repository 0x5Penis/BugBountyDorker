package git.overlord.frames

import git.overlord.gui.jPanels.ModulePanel
import git.overlord.menu.RootMenuBar
import javax.swing.JFrame

class WindowFrame: JFrame("Bug Bounty Kit") {
    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        isResizable = false

        jMenuBar = RootMenuBar()

        add(ModulePanel())

        pack()
        setLocationRelativeTo(null)
        isVisible = true
    }
}