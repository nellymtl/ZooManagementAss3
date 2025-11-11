module com.example.zoomanagementass3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.example.zoomanagementass3;
    requires javafx.graphics;


    opens com.example.zoomanagementass3 to javafx.fxml;
    exports com.example.zoomanagementass3;
    exports com.example.zoomanagementass3.Controllers;
    opens com.example.zoomanagementass3.Controllers to javafx.fxml;
}