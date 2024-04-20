package git.overlord.menu.menuItems.themes

import git.overlord.core.defaults.DefaultThemeMenuItem
import git.overlord.core.Theme

class MotifItem: DefaultThemeMenuItem(
    "Motif",
    Theme.StringTheme("com.sun.java.swing.plaf.motif.MotifLookAndFeel")
)