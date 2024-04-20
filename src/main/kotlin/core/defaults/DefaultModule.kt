package git.overlord.core.defaults

import com.google.gson.annotations.SerializedName
import java.awt.Desktop
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.net.URI
import java.net.URLEncoder

open class DefaultModule(
    @SerializedName("name") val name: String,
    @SerializedName("searchOperators") private val searchOperators: String,
    @SerializedName("searchEngine") private val searchEngine: String,
    @SerializedName("siteSearchOperator") private val siteSearchOperator: String
) {
    private lateinit var url: URI

    open fun build(site: String, customOperators: String) {
        url = URI.create("https://$searchEngine${URLEncoder.encode("$siteSearchOperator$site $customOperators $searchOperators")}")
    }

    open fun execute() {
        Desktop.getDesktop().browse(url)
    }

    open fun copy() {
        val selection = StringSelection(url.toString())
        val clipboard = Toolkit.getDefaultToolkit().systemClipboard
        clipboard.setContents(selection, selection)
    }

    open fun getSearchOperators(): String {
        return searchOperators
    }

    open fun getSearchEngine(): String {
        return searchEngine
    }
}