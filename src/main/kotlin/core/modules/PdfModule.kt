package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class PdfModule: DefaultModule(
    "PDF",
    "filetype:pdf",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)