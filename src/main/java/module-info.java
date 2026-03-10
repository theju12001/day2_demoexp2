module com.example.day2exp2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.day2exp2 to javafx.fxml;
    exports com.example.day2exp2;
}