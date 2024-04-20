package git.overlord.core.defaults

import git.overlord.Main
import git.overlord.core.Theme
import java.awt.Window
import javax.swing.JMenuItem
import javax.swing.LookAndFeel
import javax.swing.SwingUtilities
import javax.swing.UIManager

open class DefaultThemeMenuItem(name: String, theme: Theme): JMenuItem(name) {
    init {
        when (theme) {
            is Theme.LookAndFeelTheme -> setup(theme.lookAndFeel)
            is Theme.StringTheme -> setup(theme.string)
        }
    }

    private fun setup(theme: String) {
        addActionListener {
            UIManager.setLookAndFeel(theme)
            Window.getWindows().forEach {
                SwingUtilities.updateComponentTreeUI(it)
            }
            Main.MAIN_FRAME.pack()
        }
    }

    private fun setup(theme: LookAndFeel) {
        addActionListener {
            UIManager.setLookAndFeel(theme)
            Window.getWindows().forEach {
                SwingUtilities.updateComponentTreeUI(it)
            }
            Main.MAIN_FRAME.pack()
        }
    }
}