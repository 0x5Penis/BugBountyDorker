package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class PublicDocsModule: DefaultModule(
    "Public Documents",
    " ext:doc | ext:docx | ext:odt | ext:pdf | ext:rtf | ext:sxw | ext:psw | ext:ppt | ext:pptx | ext:pps | ext:csv | intitle:\"Index of /confidential\"",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)

/**
 * intitle:"Index of /confidential"
 * https://www.exploit-db.com/ghdb/8420
 */