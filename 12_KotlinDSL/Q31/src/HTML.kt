class HTML(val content: StringBuilder = StringBuilder()) {
    fun body(init: Body.() -> Unit) {
        val body = Body().apply(init)
        content.append("<html><body>${body.content}</body></html>")
    }

    override fun toString() = content.toString()
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()
    html.apply(init)
    return html
}

class Body(val content: StringBuilder = StringBuilder()) {
    fun p(text: String) {
        content.append("<p>$text</p>")
    }
}

fun main() {
    val HTMLDocument = html {
        body {
            p("This is paragraph!")
        }
    }

    println(HTMLDocument)
}