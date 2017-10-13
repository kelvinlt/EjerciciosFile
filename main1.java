package p1;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class main1 {
    static File file = new File("prueba.txt");
    static File path = new File("/practica1");
    static File path1 = new File("/Users/alu2012095/Desktop/ejefile1");
    static int number = 1;

    public static void main(String[] args) throws IOException{
        //1
        fileGrande(path1);
        //3
        buscaExercici(path1);
        //4
        listaInventari(path1);
    }

    public static void fileGrande(File directorio){
        String masGrande = "";
        //comprobar ruta valida .exist y .isDirectory
        //Escribir por pantalla el fichero mas grande
        if(directorio.exists() && directorio.isDirectory()){
            for (File file : directorio.listFiles()){
                //Lo comentado es un ejemplo de no tener 2 puntos en una linea y poder arreglar fallos mas visibles
                //String nombreActual = f.getName();
                //if(nombreActual.length() > masGrande.length()){
                if(file.getName().length() > masGrande.length()){
                    masGrande = file.getName();
                }
            }
            System.out.println("Archivo mas grande en el directorio:");
            System.out.println("-"+masGrande);
            System.out.println("====================================");
        }else{
            System.out.println("Error1");
            System.out.println("====================================");
        }

    }

    public static void buscaExercici(File directorio){
        if(directorio.exists() && directorio.isDirectory()){
            File[] directorioExercici = directorio.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name){
                    return name.contains("exercici");
                }
            });
            System.out.println("Documentos con exercici en el nombre:");
            for (File file : directorioExercici){
                System.out.println("-"+file.getName());
            }
            System.out.println("====================================");
        }else{
            System.out.println("Error2");
            System.out.println("====================================");
        }
    }

    public static void listaInventari(File directorio){
        if(directorio.exists() && directorio.isDirectory()){
            File[] listaDirectorio = directorio.listFiles();
            for (File file: listaDirectorio){
                System.out.println("-"+ file.getName());
            }

        }else{
            System.out.println("Error3");
            System.out.println("====================================");
        }
    }

    public static void deleteAllWithNumber(File directorio){

    }

    public static void createNewFolderForEachFile(File directorio){

    }

}
