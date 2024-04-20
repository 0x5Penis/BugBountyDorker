package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class SetupFilesModule: DefaultModule(
    "Setup Files",
    "  inurl:readme | inurl:license | inurl:install | inurl:setup | inurl:config",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)