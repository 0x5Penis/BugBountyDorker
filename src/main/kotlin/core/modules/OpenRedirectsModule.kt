package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class OpenRedirectsModule: DefaultModule(
    "Open Redirects",
    " AND (inurl:redir | inurl:url | inurl:redirect | inurl:return | inurl:location | inurl:next | inurl:dest | inurl:src=http | inurl:r=http)",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)
