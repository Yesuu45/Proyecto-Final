module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens co.edu.uniquindio.poo to javafx.fxml;
    opens co.edu.uniquindio.poo.view to javafx.fxml; 
    exports co.edu.uniquindio.poo;
    opens co.edu.uniquindio.poo.model to javafx.base;
    exports co.edu.uniquindio.poo.model;
    exports co.edu.uniquindio.poo.controller;
    opens co.edu.uniquindio.poo.controller to javafx.fxml;
}
