package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class PHPInfoModule: DefaultModule(
    "PHP Info",
    " ext:php intitle:phpinfo \"published by the PHP Group\"",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)
