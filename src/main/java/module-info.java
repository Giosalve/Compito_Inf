module com.example.contenitorebrani {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.contenitorebrani to javafx.fxml;
    exports com.example.contenitorebrani;
}