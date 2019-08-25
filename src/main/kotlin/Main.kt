import kotlinx.html.dom.create
import kotlinx.html.js.div
import kotlinx.html.js.h1
import kotlin.browser.document

fun main() {
    println("toto titi tutu")
    val title = document.create.h1 { +"Hello Kotlin" }
    val root = requireNotNull(document.getElementById("root"))
    root.appendChild(title)

    val myDate = document.create.div {
        +dayjs().add(-1, "month").format("YYYY-MM-DD")
    }
    root.appendChild(myDate)
}