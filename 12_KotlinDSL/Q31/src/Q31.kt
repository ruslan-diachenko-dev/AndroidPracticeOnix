fun main() {
    val htmlDocument = html {
        body {
            p("This is paragraph!")
        }
    }

    println(htmlDocument)
}