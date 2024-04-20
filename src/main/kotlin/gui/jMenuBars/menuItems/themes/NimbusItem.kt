package git.overlord.menu.menuItems.themes

import git.overlord.core.defaults.DefaultThemeMenuItem
import git.overlord.core.Theme

class NimbusItem : DefaultThemeMenuItem(
    "Nimbus",
    Theme.StringTheme("javax.swing.plaf.nimbus.NimbusLookAndFeel")
)