package git.overlord.menu

import git.overlord.core.handlers.ThemeMenuItemHandler
import git.overlord.menu.menuItems.ExitItem
import javax.swing.JMenu
import javax.swing.JMenuBar

class RootMenuBar: JMenuBar() {

    private val file   = JMenu("File")
    private val themes = JMenu("Themes")

    init {
        ThemeMenuItemHandler.menuItemList.forEach {
            themes.add(it)
        }

        file.add(themes)

        file.add(ExitItem())

        add(file)
    }
}