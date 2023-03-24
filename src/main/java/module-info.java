module com.example.javasudokudemoo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires eu.hansolo.tilesfx;

    opens sudoku to javafx.fxml;
    exports sudoku;
}