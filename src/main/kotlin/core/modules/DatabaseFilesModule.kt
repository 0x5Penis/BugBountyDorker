package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class DatabaseFilesModule: DefaultModule(
    "Database Files",
    " ext:sql | ext:db | ext:dbf | ext:mdb | ext:sql.gz | ext:db.gz",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)
/**
 * sql
 * db
 * dbf
 * mdb
 * sql.gz
 * db.gz
 */