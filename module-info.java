module com.example.helooooooo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helooooooo to javafx.fxml;
    exports com.example.helooooooo;
}