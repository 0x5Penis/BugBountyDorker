package git.overlord.gui.jLists

import git.overlord.core.handlers.ModuleHandler
import javax.swing.DefaultListModel
import javax.swing.JList

class ModuleList : JList<String>() {
    companion object {
        private var INSTANCE: ModuleList? = null

        init {
            val defaultListModel = DefaultListModel<String>()
            ModuleHandler.moduleList.forEach { defaultListModel.addElement(it.name) }

            instance.model = defaultListModel
            instance.visibleRowCount = 10
        }

        val instance: ModuleList
            get() {
                if (INSTANCE == null) {
                    INSTANCE = ModuleList()
                }
                return INSTANCE!!
            }
    }
}