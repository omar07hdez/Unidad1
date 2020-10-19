package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Controller {
    @FXML
    TextArea txtReceta,txtIngredientes,txtPreparacion,txtPreguntas;

    @FXML protected void initialize(){
        try{
            File f=new File("./src/sample/Receta.txt");
            BufferedReader br=new BufferedReader((new FileReader(f)));
            String texto="";
            while ((texto=br.readLine())!=null){
                txtReceta.appendText("\n"+texto);
            }
        }catch (Exception e){
            txtReceta.setText(e.getMessage());

        }
    }
    public void procesar (ActionEvent event){
        boolean encontrar =false;
        boolean encontrar2 =true;
        boolean encontrar3 =false;
        boolean encontrar4 =true;
        boolean encontrar5 =false;
        boolean encontrar6=true;

        boolean encontrar7=true;

        double resultado;
        String[] arregloLineas= txtReceta.getText().split("\n");
        for (int x=0;x<arregloLineas.length;x++){
            if(encontrar7){

            if (arregloLineas[x].contains("chile")) {
                String[] arr2=arregloLineas[x].split(" ");
                System.out.println(arr2[0]);

            }
            }
            if(arregloLineas[x]==arregloLineas[7]){
                encontrar7=false;
            }



            if (encontrar){

                if (encontrar2){
                    txtIngredientes.appendText("\n"+arregloLineas[x]);

                }

                if (arregloLineas[x].contains("______")){
                    encontrar2=false;
                }
                if (encontrar3){
                    if (encontrar4){
                        txtPreparacion.appendText("\n"+arregloLineas[x]);
                    }
                    if (arregloLineas[x].contains("______")){
                        encontrar4=false;
                    }
                    if (encontrar5){

                        if (encontrar6){
                            txtPreguntas.appendText("\n"+arregloLineas[x]);

                        }
                        if (arregloLineas[x]== arregloLineas[34]){


                        }
                        if (arregloLineas[x]== arregloLineas[35]){
                    txtPreguntas.appendText("\n"+arregloLineas[27]);


                        }
                        if (arregloLineas[x]== arregloLineas[36]){
//                    txtPreguntas.appendText("\n"+arregloLineas[27]);
                            txtPreguntas.appendText("\n"+"");

                        }
                        if (arregloLineas[x]== arregloLineas[37]){
//                    txtPreguntas.appendText("\n"+arregloLineas[27]);
                            txtPreguntas.appendText("\n"+"");

                        }






                    }
                    if (arregloLineas[x].contains("______")) {
                        encontrar5 = true;
                    }

                }
                if (arregloLineas[x].contains("______")){
                    encontrar3=true;
                }
            }

            if (arregloLineas[x].contains("______")){
                encontrar=true;


            }





        }



    }

}
