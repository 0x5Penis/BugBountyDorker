package git.overlord.menu.menuItems.themes

import git.overlord.core.defaults.DefaultThemeMenuItem
import git.overlord.core.Theme

class WindowsClassicItem : DefaultThemeMenuItem(
    "Windows Classic",
    Theme.StringTheme("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel")
)