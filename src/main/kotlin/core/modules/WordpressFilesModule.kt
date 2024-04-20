package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class WordpressFilesModule: DefaultModule(
    "Wordpress Files",
    " ((inurl:wp-content OR inurl:wp-includes) OR inurl:wp-config.php intext:DB_PASSWORD OR intitle:\"Index of\" wp-admin)",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)
