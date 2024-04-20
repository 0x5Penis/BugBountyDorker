package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class SQLErrorsModule: DefaultModule(
    "SQL Errors",
    " AND (intext:\"sql syntax near\" | intext:\"syntax error has occurred\" | intext:\"incorrect syntax near\" | intext:\"unexpected end of SQL command\" | intext:\"Warning: mysql_connect()\" | intext:\"Warning: mysql_query()\" | intext:\"Warning: pg_connect()\")",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)