package git.overlord.core.handlers

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.modules.*
import javax.swing.JOptionPane

class ModuleHandler {
    companion object {
        var moduleList: MutableList<DefaultModule> = mutableListOf()

        init {
            initDefault()
            organizeAddons()
            moduleList = moduleList.sortedBy { it.name.lowercase() }.toMutableList()
        }

        private fun initDefault() {
            moduleList.add(AllFilesModule())
            moduleList.add(BackupAndOldFilesModule())
            moduleList.add(ConfigurationFilesModule())
            moduleList.add(DatabaseFilesModule())
            moduleList.add(DirectoryListingModule())
            moduleList.add(GitFolderModule())
            moduleList.add(LogFilesModule())
            moduleList.add(LoginPagesModule())
            moduleList.add(OpenRedirectsModule())
            moduleList.add(PdfModule())
            moduleList.add(PHPErrorsModule())
            moduleList.add(PHPInfoModule())
            moduleList.add(PublicDocsModule())
            moduleList.add(SQLErrorsModule())
            moduleList.add(TrelloModule())
            moduleList.add(WordpressFilesModule())
            moduleList.add(WordpressModule())
            moduleList.add(XAMPPDashboardModule())
            moduleList.add(WordpressOEmbedAPIModule())
            moduleList.add(SensitiveJavaDataModule())
            moduleList.add(InsecureModule())
            moduleList.add(SetupFilesModule())
        }

        fun getSelectedModule(moduleName: String): DefaultModule? {
            return moduleList.find { it.name == moduleName }
        }

        private fun organizeAddons() {
            AddonsHandler.moduleList.forEach() { module ->
                if (moduleList.any { it.name == module.name }) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Found plugin matching default module name: ${module.name}\nThis plugin will not be added.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                    )
                } else if (AddonsHandler.moduleList.count { it.name == module.name } < 1) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Found duplicate plugin: ${module.name}\nThis plugin will not be added.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                    )
                } else {
                    moduleList.add(module)
                }
            }
        }
    }
}