package oct_10_manejo_sesion.modelo;

public class ArregloObjetosDAO {
   
   ArregloObjetos x[];

   public ArregloObjetosDAO(){
      x=new ArregloObjetos[10];//Estoy redimensionando mi objeto
   }
   
   public void CargarDatos(){

      x[0]=new ArregloObjetos(45);
      x[1]=new ArregloObjetos(99);
      x[2]=new ArregloObjetos(68);
      x[3]=new ArregloObjetos(23);
      x[4]=new ArregloObjetos(79);
      x[5]=new ArregloObjetos(98);
      x[6]=new ArregloObjetos(12);
      x[7]=new ArregloObjetos(47);
      x[8]=new ArregloObjetos(81);
      x[9]=new ArregloObjetos(32);
   }

   public String MostrarDatos1(){
      String acumulador="";
      acumulador+="<table border=10>";
      for(int i=0;i<x.length;i++){
         acumulador+="<tr>";
         acumulador+="<tr>"+x[i].getNumero()+"</tr>";
         acumulador+="</tr>";
      }
      return acumulador;
   }
   public ArregloObjetos[] MostrarDatos2(){
   return x;
}
   
}
