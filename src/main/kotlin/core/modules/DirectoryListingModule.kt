package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class DirectoryListingModule: DefaultModule(
    "Directory Listing",
    " intitle:index.of",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)
