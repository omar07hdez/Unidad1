package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

public class Controller {
    @FXML
    VBox vBox;
    @FXML
    TextField txtMensaje;

    public void enter(KeyEvent event){
        if (event.getCode() == KeyCode.ENTER){
            Label label=new Label("Usuario dice: "
            + txtMensaje.getText());
            vBox.getChildren().add(label);

            String repuesta = chatbot(txtMensaje.getText());
            Label label2= new Label( repuesta);
            vBox.getChildren().add(label2);
        }

    }
    boolean pidioPieza=false;
    public String chatbot(String mensaje){
        String respuesta="ChatBot dice: Podrias repetir la preguta";
        if (mensaje.contains("hola")){
            respuesta="Chat Bot dice: Muy bien y usted? en que le puedo ayudar";


        }else if (mensaje.contains("pieza")){
            respuesta="Chat Bot dice: Escriba la marca modelo y cual pieza necesita";
            pidioPieza=true;
        }else  if (pidioPieza){
            String[] datos=mensaje.split(" ");
            String modelo=datos[1];
            int indice1= mensaje.indexOf(modelo)+modelo.length();
            int indice2= mensaje.length();
            String pieza= mensaje.substring(indice1, indice2);
            respuesta="Chat Bot dice: La pieza "+pieza+" del auto "+datos[0]+
                    " "+datos[1]+" Si la tenemos en existencia";
            pidioPieza=false;
        }




        return respuesta;



    }

}
