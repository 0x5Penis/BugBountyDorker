package git.overlord.menu.menuItems.themes

import git.overlord.core.defaults.DefaultThemeMenuItem
import git.overlord.core.Theme

class WindowsItem : DefaultThemeMenuItem(
    "Windows",
    Theme.StringTheme("com.sun.java.swing.plaf.windows.WindowsLookAndFeel")
)