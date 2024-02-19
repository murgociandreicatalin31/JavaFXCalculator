module ro.ctrln.javafx.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens ro.ctrln.javafx.calculator to javafx.fxml;
    exports ro.ctrln.javafx.calculator;
    exports ro.ctrln.javafx.calculator.controller to javafx.fxml;
    opens ro.ctrln.javafx.calculator.controller to javafx.fxml;
}