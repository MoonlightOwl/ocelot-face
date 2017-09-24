package totoro.ocelot

import org.scalajs.jquery.jQuery

/**
  * Entry point of application
  */

object Ocelot {
  private val greetings: String = "Come meow with us!"
  private val matrix: Seq[StringBuilder] = List.fill(25)(
    new StringBuilder("                                                                                ")
  )

  def main(args: Array[String]): Unit = {
    // greet console hackers
    println(greetings)
    // greet users
    set(2, 2, greetings)
  }

  private def set(x: Int, y: Int, string: String): Unit = {
    matrix(y-1).replace(x-1, x-1 + string.length, string)
    jQuery(s".l$y").text(matrix(y-1).mkString)
  }
}
