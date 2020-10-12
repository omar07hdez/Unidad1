package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField Frase;
    @FXML
    Label resultado;
    @FXML
    ListView lista;
    @FXML
    ComboBox comboBox;
    @FXML  protected void initialize(){
        comboBox.getItems().addAll("cat at","ends with", "replace","compareTo","EqualsIgnoreCase"
        ,"IndexOf","LastIndexOf","ReplaceFirst","split","startswith","substring");


    }
    public void Aceptar(ActionEvent event){
        String text=Frase.getText();
        switch (comboBox.getSelectionModel().getSelectedIndex()){
            case 0:{
                char res=text.charAt(2);
                resultado.setText(res + "");

                break;
            }
            case 1:{
                boolean res=text.endsWith("ol");
                resultado.setText(res + "");

                break;
            }
            case 2:{
                String ra= text.replace("s","p");
                resultado.setText(ra);
                break;
            }
            case 3:{
                int co=text.compareTo("hola");
                resultado.setText(co + "");

            }
            case 4:{
                boolean eq= text.equalsIgnoreCase("estadio");
                resultado.setText(eq + "");


            }
            case 5:{
                Integer in=text.indexOf("telefono");

                resultado.setText(in+"");


            }
            case 6:{
                Integer last=text.lastIndexOf("azul");
                resultado.setText(last+"");
            }
            case 7:{

                String str = Frase.getText();

                String str1 = str.replaceFirst("s", "9");
                resultado.setText(str1);
            }
            case 8:{


                String sp = Frase.getText();
                String[] palabras = sp.split(" ");

                for (int i=0; i< palabras.length;i++){
                    lista.getItems().add(palabras[i]);
                    System.out.println(palabras[i]);
                }


            }
            case 9:{
             boolean sta= text.startsWith("p");
             resultado.setText(sta+"");
             break;
                }
            case 10:{
                String sub=text.substring(5);
                resultado.setText(sub);
                break;


            }

            }




        }


    }

