package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule

class SensitiveJavaDataModule: DefaultModule(
    "Sensitive Data In Java",
    " ext:java intext:\"executeUpdate\"",
    "google.com/search?q=",
    ""
)
//https://www.exploit-db.com/ghdb/8400