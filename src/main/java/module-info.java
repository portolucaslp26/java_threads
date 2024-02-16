module com.example.threads {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.threads to javafx.fxml;
    exports com.example.threads;
    exports com.example.threads.lazyCalculator;
    opens com.example.threads.lazyCalculator to javafx.fxml;
}