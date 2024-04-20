package git.overlord.gui.jPanels

import git.overlord.core.controllers.ModuleController
import git.overlord.core.handlers.ModuleHandler
import git.overlord.gui.jLists.ModuleList
import java.awt.BorderLayout
import javax.swing.JPanel
import javax.swing.JScrollPane

private const val CENTER = BorderLayout.CENTER
private const val EAST = BorderLayout.EAST

class ModulePanel: JPanel(BorderLayout()) {

    private val listPnl = ModuleListPanel()
    private val interactionPanel = ModuleInteractionPanel()

    init {
        setupUI()
        setupListeners()
    }

    private fun setupUI() {
        add(listPnl, CENTER)

        val scrollPane = JScrollPane(interactionPanel).apply {
            verticalScrollBarPolicy = JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
            horizontalScrollBarPolicy = JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
        }

        add(scrollPane, EAST)
    }

    private fun setupListeners() {
        ModuleList.instance.addListSelectionListener {
            val selectedModule = ModuleHandler.getSelectedModule(ModuleList.instance.selectedValue)
            interactionPanel.updateModuleDetails(selectedModule)
        }

        interactionPanel.openBtn.addActionListener {
            val module = ModuleController.getModule(ModuleList.instance.selectedValue)
            module?.build(interactionPanel.siteTxtFld.text, interactionPanel.customOperatorsTxtFld.text)
            module?.execute()
        }

        interactionPanel.copyBtn.addActionListener {
            val module = ModuleController.getModule(ModuleList.instance.selectedValue)
            module?.build(interactionPanel.siteTxtFld.text, interactionPanel.customOperatorsTxtFld.text)
            module?.copy()
        }
    }
}