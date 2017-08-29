package totoro.ocelot

import org.scalajs.jquery.jQuery

import scala.scalajs.js.timers._
import scala.util.Random


object Ocelot {
  private val meows: Array[String] = Array("meow", "meooow", ":3", "=(O.O)=")

  def main(args: Array[String]): Unit = {
    meow(Random.nextInt(20000))
  }

  def meow(duration: Double): Unit = {
    setTimeout(duration) {
      jQuery(".splash p").text(meows(Random.nextInt(meows.length)))
      setTimeout(1000) {
        jQuery(".splash p").text("{ Ocelot.Online }")
      }
      meow(Random.nextInt(20000))
    }
  }
}
