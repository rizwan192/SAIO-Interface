package saio.pkginterface;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 * @author rizwan
 */
public class FXMLController implements Initializable {
    @FXML
    private TextField url;
    @FXML
    private Button submit;
    @FXML
    private TextArea output;
    /**
     * Initializes the controller class.
     */
    public static String commands;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void submit(javafx.event.ActionEvent event) throws IOException{
         commands = url.getText();
            //curl -X GET http://google.com
       { 
            try 
            { 
                Process p=Runtime.getRuntime().exec(commands); 
                p.waitFor(); 
                BufferedReader reader=new BufferedReader(
                new InputStreamReader(p.getInputStream())); 
                String line; 
                String n="";
                while((line = reader.readLine()) != null) 
                { 
                    System.out.println(line);
                    n=n+line+"\n";
                } 
                    output.setText(n);
            }
            catch(IOException e1) {e1.printStackTrace();} 
            catch(InterruptedException e2) {e2.printStackTrace();
            }   
       
       
       
       
    }
    }
}