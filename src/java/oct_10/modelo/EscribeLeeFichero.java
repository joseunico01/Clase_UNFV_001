package oct_10.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribeLeeFichero {
   FileWriter fichero=null;
   PrintWriter pw= null;
   File archivo= null;
   FileReader fr= null;
   BufferedReader br= null;
   String nombre[] ={"Ivan","Larina","Juan","Alberto","Andre"};
   
   
   public void EscribeFichero(){
      try {
         fichero=new FileWriter("archivo.txt");
         pw=new PrintWriter(fichero);

         for(int i=0;i<5;i++){
            pw.println(nombre[i]);
         }
      fichero.close();
         
      } catch (Exception e) {
      }
   }
   
   
   public String LeeFichero(){
      String linea,acumulador="";
      try{
         archivo=new File("achivo.txt");
         fr=new FileReader(archivo);
         br=new BufferedReader(fr);
         linea=br.readLine();
         acumulador+="<table border=10>";
         while((linea=br.readLine())!=null){
            acumulador+="<tr>";
            acumulador+="<td>"+linea+"</td>";
            acumulador+="</tr>";
         }
            acumulador+="</table>";
         fr.close();
         
      }catch(Exception e){
      }
      return acumulador;
   }
   
}