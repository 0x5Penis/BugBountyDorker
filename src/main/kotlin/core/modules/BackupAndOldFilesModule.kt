package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class BackupAndOldFilesModule: DefaultModule(
    "Backup/Old Files",
    " ext:bkf | ext:bkp | ext:bak | ext:old | ext:backup",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)
/**
 * bkf
 * bkp
 * bak
 * old
 * backup
 */