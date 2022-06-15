package Buscador_De_Imagenes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
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

