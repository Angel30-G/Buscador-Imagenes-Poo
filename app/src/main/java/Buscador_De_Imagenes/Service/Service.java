/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buscador_De_Imagenes.Service;

import Buscador_De_Imagenes.controller.ImageController;
import Buscador_De_Imagenes.objects.Imagen;
import java.util.concurrent.ExecutionException;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Fabian
 */
@RestController
public class Service {
    @Autowired
    ImageController imageController;
    
    @PostMapping("/agregarImagen")
    public String saveImagen(@RequestBody Imagen imagen) throws ExecutionException, InterruptedException{
        imageController = new ImageController();
    return imageController.saveImage(imagen); 
    }
    
}
