package git.overlord.core

import javax.swing.LookAndFeel

sealed class Theme {
    data class LookAndFeelTheme(val lookAndFeel: LookAndFeel): Theme()
    data class StringTheme(val string: String): Theme()
}