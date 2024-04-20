package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class XAMPPDashboardModule: DefaultModule(
    "XAMPP Dashboards",
    " (intext:\"Welcome to XAMPP for *\" intitle:\"Welcome to XAMPP\" inurl:/dashboard) OR (intext:apache + mariadb + php + perl intext:\"welcome to xampp for *\") OR (intitle:\"welcome to xampp\")",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)
// https://www.exploit-db.com/ghdb/8421