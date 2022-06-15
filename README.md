# Buscador-Imagenes-Poo
// Para poder ejecutar el codigo, primero se debe clonar el repositorio o en otro caso descargarlo por medio del zip
// Ya que se tenga clonado o descargado, es importante ir a la carpeta de build.grade para poder ingresar las dependencias, las cuales vendrian de la siguiente manera:

 // https://mvnrepository.com/artifact/com.google.firebase/firebase-admin
    runtimeOnly group: 'com.google.firebase', name: 'firebase-admin', version: '8.2.0

    implementation 'com.google.api-client:google-api-client:1.33.0'
    implementation 'com.google.oauth-client:google-oauth-client-jetty:1.32.1'
    implementation 'com.google.apis:google-api-services-people:v1-rev20210903-1.32.1'
    
Ahora para ejecutar el codigo puede hacerlo desde la terminar utilizando el comando gradle run o si se esta en algun IDE como eclipse o netbeans, solamente se debe de correr el codigo
