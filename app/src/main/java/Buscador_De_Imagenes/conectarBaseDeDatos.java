/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buscador_De_Imagenes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import com.google.firebase.FirebaseOptions;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

/**
 *
 * @author gabri
 */
@Service
public class conectarBaseDeDatos {
    @PostConstruct
    public  void conectar() throws FileNotFoundException {
       try { 
           FileInputStream serviceAccount
                = new FileInputStream("./ServiceAccountFirebase.json");

        FirebaseOptions options;
    
            options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://demofirebase-7ef04.firebaseio.com")
                    .build();
     

        FirebaseApp.initializeApp(options);
       } catch (IOException ex) {
            Logger.getLogger(conectarBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
}
