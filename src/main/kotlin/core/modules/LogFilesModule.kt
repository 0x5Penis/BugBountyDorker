package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class LogFilesModule: DefaultModule(
    "Log Files",
    " ext:log | ext:txt",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)
