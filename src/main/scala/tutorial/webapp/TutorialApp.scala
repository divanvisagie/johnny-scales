package tutorial.webapp

import scala.scalajs.js.JSApp
import scala.scalajs.js
import js.DynamicImplicits._
import js.Dynamic.{global => g}

object TutorialApp extends JSApp {
  val five = g.require("johnny-five")

  def main(): Unit = {
    five.Board().on("ready", () => {
      println("Board ready")
      val led = five.Led(13)
      led.blink(500)
    })
  }
}
