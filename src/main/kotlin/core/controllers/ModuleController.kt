package git.overlord.core.controllers

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.handlers.ModuleHandler

object ModuleController {
    fun getModule(moduleName: String): DefaultModule? {
        return ModuleHandler.moduleList.find { it.name == moduleName }
    }
}