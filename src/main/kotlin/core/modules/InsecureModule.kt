package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class InsecureModule: DefaultModule(
    "Insecure",
    "inurl:\"?url=http\"",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)