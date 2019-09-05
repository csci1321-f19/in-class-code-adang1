package drmario

import scalafx.application.JFXApp
import scalafx.scene.Scene
import java.awt.Canvas

object Main extends JFXApp {
    stage = new JFXApp.PrimaryStage {
        title = "DR. Mario"
        scene = new Scene(800, 800) {
            val canvas = new scalafx.scene.canvas.Canvas(800,800)
            content = canvas
        }
        }
}