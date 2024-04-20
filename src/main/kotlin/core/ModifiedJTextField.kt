package git.overlord.core

import javax.swing.JTextField
import javax.swing.event.DocumentEvent
import javax.swing.event.DocumentListener

class ModifiedJTextField(columns: Int) : JTextField(columns) {
    init {
        document.addDocumentListener(object : DocumentListener {
            override fun insertUpdate(e: DocumentEvent?) {
                update()
            }

            override fun removeUpdate(e: DocumentEvent?) {
                update()
            }

            override fun changedUpdate(e: DocumentEvent?) {
                update()
            }
        })
    }

    fun update() {
        toolTipText = if (text != "" && getFontMetrics(font).stringWidth(text) > width) {
            text
        } else {
            null
        }
    }
}