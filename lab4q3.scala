import scala.io.StdIn

object Main extends App {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    println(formatNames(names[0], toUpper))
    //println(formatNames(names[1], formatNames))
    println(formatNames(names[2], toLower))
    //println(formatNames())
}

def toUpper(name : String) : String = {
    name.toUpperCase
}

def toLower(name : String) : String = {
    name.toLowerCase
}

def formatNames(names : List[String], formatter: String => String) : List[String] = {
    names.map(formatter)
}

