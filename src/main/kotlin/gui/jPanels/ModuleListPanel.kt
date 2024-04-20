package git.overlord.gui.jPanels

import git.overlord.core.ListSearchJTextField
import git.overlord.gui.jLists.ModuleList
import net.miginfocom.swing.MigLayout
import javax.swing.JPanel
import javax.swing.JScrollPane

class ModuleListPanel: JPanel(MigLayout()) {

    init {
        val scroll = JScrollPane(ModuleList.instance).apply {
            horizontalScrollBarPolicy = JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
            verticalScrollBarPolicy = JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
        }
        val search = ListSearchJTextField(22, ModuleList.instance)

        add(search, "wrap")
        add(scroll, "width 250::")
    }
}