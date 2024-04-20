package git.overlord.core.handlers

import com.google.gson.Gson
import git.overlord.core.controllers.Logger
import git.overlord.core.defaults.DefaultModule

class AddonsHandler {

    data class Addons(
        val addons: List<DefaultModule>
    )

    companion object {

        var moduleList: MutableList<DefaultModule> = mutableListOf()

        init {
            initAddons()
        }

        private fun initAddons() {
            DirectoryHandler.addonsDirectory.listFiles()?.forEach { file ->
                if (file.name == "example.json")
                    return@forEach
                val gson = Gson()
                val data = gson.fromJson(file.readText(), Addons::class.java)
                data.addons.forEach { addon ->
                    Logger.info("loaded addon ${addon.name}")
                    moduleList.add(addon)
                }
            }
        }
    }
}