package com.jasonbrunelle

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class MainApplication : Application() {
    @Throws(Exception::class)
    override fun start(primaryStage: Stage) {
        println(javaClass.getResource("sample.fxml"))
        val root = FXMLLoader.load<Parent>(javaClass.getResource("sample.fxml"))
        primaryStage.title = "Hello World"
        primaryStage.scene = Scene(root, 300.0, 275.0)
        primaryStage.show()
    }
}

fun main(args: Array<String>) {
    Application.launch(MainApplication::class.java, *args)
}