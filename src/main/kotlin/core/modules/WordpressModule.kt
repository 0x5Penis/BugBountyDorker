package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class WordpressModule: DefaultModule(
    "Wordpress",
    " inurl:wp- | inurl:wp-content | inurl:plugins | inurl:uploads | inurl:themes | inurl:download",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)