package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule

class GitFolderModule: DefaultModule(
    ".git Folder",
    "inurl:\"/.git\" -site:github.com",
    "google.com/search?q=",
    ""
)