package git.overlord.menu.menuItems.themes

import git.overlord.core.defaults.DefaultThemeMenuItem
import git.overlord.core.Theme

class DefaultItem : DefaultThemeMenuItem(
    "Default",
    Theme.StringTheme("javax.swing.plaf.metal.MetalLookAndFeel")
)