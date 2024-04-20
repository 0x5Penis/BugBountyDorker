package git.overlord.core.handlers

import java.io.File
import javax.swing.JOptionPane
import kotlin.system.exitProcess

class DirectoryHandler {
    companion object {
        private val directories: MutableList<File> = mutableListOf()
        private val binDirectory = File("./bin")
        val addonsDirectory = File("${binDirectory}/addons")

        init {
            initDirectories()
            directories.forEach { dir ->
                if (!dir.exists())
                    dir.mkdir()
                if (!dir.isDirectory) {
                    JOptionPane.showMessageDialog(null, "addons is not a directory", "Crucial Error", JOptionPane.ERROR_MESSAGE)
                    exitProcess(1)
                }
            }
        }

        private fun initDirectories() {
            directories.add(binDirectory)
            directories.add(addonsDirectory)
        }
    }
}