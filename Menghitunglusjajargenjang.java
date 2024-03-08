/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menghitunglusjajargenjang;

/**
 *
 * @author hp
 */
public class Menghitunglusjajargenjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
   int alas = 4;
   int tinggi = 8;
   int luas = 4*8;
   
    System.out.println("Luas jajargenjang dengan alas" + alas + "dan tinggi" + tinggi + "adalah:" + luas);
    
  
  }
  
         class jajargenjang{
          private int alas; 
          private int tinggi;
                       

      
           public void setalas(int alas ){
             this.alas = alas ;
             
    }
           public int getalas(){
               return alas;
               
    }
      
           public void settinggi(int tinggi){
               this.tinggi = tinggi;
                       
      }
           public int gettinggi(){
               return tinggi;
           }
           public int hitungLuas(){
               return alas * tinggi;
           }
}
    
}
