package git.overlord.core.modules

import git.overlord.core.defaults.DefaultModule
import git.overlord.core.SearchOperators

class LoginPagesModule: DefaultModule(
    "Login Pages",
    " inurl:login | inurl:signin | intitle:Login | intitle: signin | inurl:auth | inurl: register | inurl: signup | intitle: Signup",
    "google.com/search?q=",
    SearchOperators.GOOGLE_SITE_OPERATOR
)
/** inurl
 * login
 * signin
 * auth
 * register
 * signup
 */

/** intitle
 * Login
 * signin
 * Signup
 */