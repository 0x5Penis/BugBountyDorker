package git.overlord.gui.jPanels

import git.overlord.core.ModifiedJTextField
import git.overlord.core.defaults.DefaultModule
import net.miginfocom.swing.MigLayout
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField

class ModuleInteractionPanel: JPanel(MigLayout()) {
    val openBtn        = JButton("Open")
    val copyBtn        = JButton("Copy")

    private val siteLb                = JLabel("Site:")
    val siteTxtFld            = JTextField(13)

    private val customOperatorsLb     = JLabel("Custom Operators:")
    val customOperatorsTxtFld = JTextField(13)

    private val nameLb                = JLabel("Name:")
    private val nameTxtFld            = ModifiedJTextField(13)

    private val siteOperatorsLb       = JLabel("Site Operators:")
    private val siteOperatorsTxtFld   = ModifiedJTextField(13)

    private val searchEngineLb        = JLabel("Search Engine:")
    private val searchEngineTxtFld    = ModifiedJTextField(13)

    init {
        nameTxtFld.isEditable          = false
        siteOperatorsTxtFld.isEditable = false
        searchEngineTxtFld.isEditable  = false

        add(openBtn,"split 2")
        add(copyBtn,"wrap")

        add(siteLb)
        add(siteTxtFld,"wrap")

        add(customOperatorsLb)
        add(customOperatorsTxtFld,"wrap")

        add(nameLb)
        add(nameTxtFld,"wrap")

        add(siteOperatorsLb)
        add(siteOperatorsTxtFld,"wrap")

        add(searchEngineLb)
        add(searchEngineTxtFld,"wrap")
    }

    fun updateModuleDetails(module: DefaultModule?) {
        module?.let {
            nameTxtFld.text = it.name
            siteOperatorsTxtFld.text = it.getSearchOperators()
            searchEngineTxtFld.text = it.getSearchEngine()
        }
    }
}