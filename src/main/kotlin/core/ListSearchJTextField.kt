package git.overlord.core

import git.overlord.core.handlers.ModuleHandler
import javax.swing.DefaultListModel
import javax.swing.JList
import javax.swing.JTextField
import javax.swing.event.DocumentEvent
import javax.swing.event.DocumentListener

class ListSearchJTextField(columns: Int, list: JList<String>) : JTextField(columns) {
    init {
        document.addDocumentListener(object : DocumentListener {
            override fun insertUpdate(e: DocumentEvent?) {
                updateList(list)
            }

            override fun removeUpdate(e: DocumentEvent?) {
                updateList(list)
            }

            override fun changedUpdate(e: DocumentEvent?) {
                updateList(list)
            }
        })
    }

    fun updateList(list: JList<String>) {
        val listModel = DefaultListModel<String>()
        ModuleHandler.moduleList.forEach {
            if (it.name.lowercase().startsWith(text.lowercase())) {
                listModel.addElement(it.name)
            }
        }
        list.model = listModel
    }
}