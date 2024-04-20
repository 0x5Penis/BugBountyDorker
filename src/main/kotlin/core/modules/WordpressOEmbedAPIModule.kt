package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class WordpressOEmbedAPIModule: DefaultModule(
    "Wordpress oEmbed API",
    " inurl:\"/wp-json/oembed/1.0/embed?url=\"",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)
