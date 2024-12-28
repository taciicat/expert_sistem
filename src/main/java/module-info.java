module com.example.expert_sistem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.expert_sistem to javafx.fxml;
    exports com.example.expert_sistem;
}