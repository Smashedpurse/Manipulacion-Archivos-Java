import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulacionArchivos {
    public static void main(String[] args) {

        //SINTAXIS PARA LA CREACION DE UN ARCHIVO POR MEDIO DE LA CLASE FILE CON EL METODO createNewFile();
        File file = new File("folder\\miPrimerArchivo.txt");
        File folder = new File("folder");
        try {
            boolean folderCreated = folder.mkdir();
            boolean fileCreated = file.createNewFile();

            //DECLARACION DE OBJETO DE LA CLASE FILEWRITER PARA ESCRIBIR EN UN ARCHIVO
            FileWriter fileWriter = new FileWriter(file); //INDICAMOS LA RUTA POR MEDIO DEL PARÁMETRO
            fileWriter.write("This is my first write trought JAVA"); //INDICAMOS EL TEXTO
            fileWriter.close(); //INGRESAMOS LA INSTRUCCION CLOSE PARA QUE EL TEXTO SEA ESCRITO
            
            //CREACION DE FOLDER
            if(folderCreated){
                System.out.println("La carpeta se creo de manera correcta");
            }else {
                System.out.println("El carpeta no se pudo crear o ya ha sido creado");
            }
            //CREACION DE ARCHIVO
            if(fileCreated){
                System.out.println("El archivo se creo de manera correcta");
            }else {
                System.out.println("El archivo no se pudo crear o ya ha sido creado");
            }
        } catch (IOException e){
            System.out.println("Exepcion al crear el archivo" + e);
        }
    }
}
