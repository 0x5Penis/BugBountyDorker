package git.overlord.core.handlers

import git.overlord.menu.menuItems.themes.*
import javax.swing.JMenuItem

class ThemeMenuItemHandler {
    companion object {
        var menuItemList: MutableList<JMenuItem> = mutableListOf()

        init {
            menuItemList.add(DefaultItem())
            menuItemList.add(MotifItem())
            menuItemList.add(WindowsItem())
            menuItemList.add(WindowsClassicItem())
            menuItemList.add(NimbusItem())
            menuItemList.add(FlatLafLightItem())
            menuItemList.add(FlatLafDarkItem())
        }
    }
}