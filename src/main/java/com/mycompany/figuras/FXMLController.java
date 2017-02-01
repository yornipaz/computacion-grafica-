package com.mycompany.figuras;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class FXMLController implements Initializable {
    
    @FXML private Button triangulo;
    @FXML private Button rombo;
    @FXML private Button rectangulo;
     @FXML private Button limpiar;
     @FXML private Canvas canvas;
    @FXML private GraphicsContext lienzo;
    boolean mostrar;
  
    
    @FXML
    private void triangulo(ActionEvent event) {
         double x[] = {100, 150, 200};
      double y[] = {300, 100, 200};
        lienzo.setLineWidth(2);
        lienzo.setFill(Color.GREEN);
        lienzo.fillPolygon(x, y, 3); 
        
    }
    private void rectangulo(ActionEvent event) {
       
        lienzo.setLineWidth(2);
        lienzo.setStroke(Color.GREEN);
        lienzo.strokeRect(20, 20, 90, 30);
        
        
        
    }
     private void rombo(ActionEvent event) {
        double x[] = {300, 300, 350, 350};
        double y[] = {200, 150, 200, 250};
        lienzo.setLineWidth(2);
        lienzo.setFill(Color.AZURE);
        lienzo.fillPolygon(x, y, 4);
        lienzo.setStroke(Color.DARKRED);
        lienzo.strokePolygon(x, y, 4);
      
        
    }
        private void limpiar(ActionEvent event){
      lienzo = canvas.getGraphicsContext2D();
        double w = canvas.getWidth();
        double h = canvas.getHeight();
        lienzo.clearRect(2, 2, w-3, h-3);
        
    
    }

    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      lienzo = canvas.getGraphicsContext2D();
        double w = canvas.getWidth();
        double h = canvas.getHeight();
        lienzo.clearRect(0, 0, w, h);
        lienzo.setStroke(Color.WHITE);
        lienzo.setLineWidth(1);
        lienzo.strokeRect(0, 0, w, h);
        mostrar = false;
    }    
}
