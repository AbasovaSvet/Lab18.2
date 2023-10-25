                                                                                                                               package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

                                                                                                                               public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    void loadFile(ActionEvent event) {
        String fname = textFileName.getText;
        try {
            List<String> lines = loadTextFromFile(fname);
            showText(Lines);
        } catch (IOException e) {
            contens.setText("Файл не найден");
        }

    }
    private static  List<String> loadTextFromFile(String fname) throws IOException{
        List<String> lines = Files.readAllLines(Path.of(fname));
        lines.sort(Comparator.naturalOrder());
        return lines;
    }
    private  void showText(List<String> lines){
        contens.clear();
        for (String s; lines) {
            contens.appendText(s+"\n");
        }
    }
}