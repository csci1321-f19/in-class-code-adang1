package basics

import graphicgame.Entity
import org.w3c.dom.Entity
/**
This is a basic main for you to start off with.
*/
object HelloWorld {
	def main(args: Array[String]): Unit = {
		println("Hello Vau!")

		val e1 = new Entity(2,4)
		val e2 = new Entity(1,3)
		println(e1.intersects(e2))
	}
	
	def square(x: Double) = x*x
	
	def cube(x: Double) = x*x*x
}
