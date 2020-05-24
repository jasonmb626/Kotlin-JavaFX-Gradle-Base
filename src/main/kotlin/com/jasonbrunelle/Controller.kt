package com.jasonbrunelle

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Button
import javafx.scene.control.Label
import java.net.URL
import java.util.*

class Controller  : Initializable {
    @FXML
    lateinit var btn: Button
    @FXML
    lateinit var label: Label

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        btn.setOnAction { label.text = "There" }
    }
}