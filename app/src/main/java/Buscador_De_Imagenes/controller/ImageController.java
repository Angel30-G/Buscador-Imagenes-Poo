/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buscador_De_Imagenes.controller;

import Buscador_De_Imagenes.objects.Imagen;
import com.google.api.core.ApiFuture;
import org.springframework.stereotype.Service;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabian_
 */
@Service
public class ImageController {
    public String saveImage(Imagen imagen) {
        try {
            Firestore dbFirestore = FirestoreClient.getFirestore();
            ApiFuture collectionApiFiture = dbFirestore.collection("imagenes").document().set(imagen);
            return collectionApiFiture.get().toString();
        } catch (InterruptedException ex) {
            Logger.getLogger(ImageController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(ImageController.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null; 
    }
}
