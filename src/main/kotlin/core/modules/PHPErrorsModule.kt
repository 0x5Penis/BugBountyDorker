package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class PHPErrorsModule: DefaultModule(
    "PHP Errors",
    " (\"PHP Parse error\" | \"PHP Warning\" | \"PHP Error\") OR \"Index of\" inurl:phpmyadmin",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)