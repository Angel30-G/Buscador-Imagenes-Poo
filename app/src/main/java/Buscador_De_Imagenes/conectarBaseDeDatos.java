/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buscador_De_Imagenes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 *
 * @author gabri
 */
public class conectarBaseDeDatos {
    public static void conectar() throws FileNotFoundException{
        FileInputStream serviceAccount
           = new FileInputStream("path/to/serviceAccountKey.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://buscadorimagenespoo-default-rtdb.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);
    }
}
