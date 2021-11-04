package clases;

import java.util.Scanner;

public class Restaurante {
 public static  String vrestaurante[]  = new String[50];  
public static void setCargarRestaurante(){
vrestaurante[0]="EL CORRAL";
vrestaurante[1]="RESTAURANTE LA DOCTORA";
vrestaurante[2]="LA PROVINCIA";
vrestaurante[3]="CAMBRÍA";
vrestaurante[4]="ELCIELO";
vrestaurante[5]="SANTA LEÑA";
vrestaurante[6]="LA CAUSA";
vrestaurante[7]="LEZZET";
vrestaurante[8]="CAFE BOTERO";
vrestaurante[9]="LA MATRIARCA";
vrestaurante[10]="VORAZ";}

public static String getVrestaurante(int codigo){

return vrestaurante[codigo];
}
public static void main(String[] args) {
    Scanner lea =new Scanner(System.in);
int code;
String restaurante;
System.out.println("ingrese el codigo de el hotel"); 
code = lea.nextInt();
setCargarRestaurante();
System.out.println(getVrestaurante(code));


}
}
