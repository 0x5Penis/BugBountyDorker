package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class ConfigurationFilesModule: DefaultModule(
    "Configuration Files",
    " ext:xml | ext:conf | ext:cnf | ext:reg | ext:inf | ext:rdp | ext:cfg | ext:txt | ext:ora | ext:ini | ext:env",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)
/**
 * conf
 * cnf
 * reg
 * inf
 * rdp
 * cfg
 * txt
 * ora
 * ini
 * env
 */