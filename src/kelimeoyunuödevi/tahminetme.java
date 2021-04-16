/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelimeoyunuödevi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import static kelimeoyunuödevi.doğrucevap.sayac9;


public class tahminetme {
    static String highscore;
    static int Highscore;
    public static int puan=0;
    public static String puan1="0";
    public String hesaplama(String a) throws FileNotFoundException, IOException{
        
        switch(oyunuoyna.sayac8){
        
            case 1:
            boolean x=a.equalsIgnoreCase(scokuma.secilencevap1);
            if(x){
                if(oyunuoyna.sayac7<=scokuma.secilencevap1.length()){
                 puan+=scokuma.secilencevap1.length()*100-(oyunuoyna.sayac7)*100;   
                }
            }else{
                puan-=scokuma.secilencevap1.length()*100-oyunuoyna.sayac7*100;
            }
            
            break;
            
             case 2: 
            x=a.equalsIgnoreCase(scokuma.secilencevap2);
            if(x){
                if(oyunuoyna.sayac7<=scokuma.secilencevap2.length()){
                   puan+=scokuma.secilencevap2.length()*100-(oyunuoyna.sayac7)*100; 
                }
            }else{
                puan-=scokuma.secilencevap2.length()*100-oyunuoyna.sayac7*100;
            }
            
            break;
            
             case 3: 
            x=a.equalsIgnoreCase(scokuma.secilencevap3);
            if(x){
                if(oyunuoyna.sayac7<=scokuma.secilencevap3.length()){
                    puan+=scokuma.secilencevap3.length()*100-(oyunuoyna.sayac7)*100;
                }
            }
            else{
                puan-=scokuma.secilencevap3.length()*100-oyunuoyna.sayac7*100;
            }
            
            
            break;
            
             case 4: 
            x=a.equalsIgnoreCase(scokuma.secilencevap4);
            if(x){
                if(oyunuoyna.sayac7<=scokuma.secilencevap4.length()){
            puan+=scokuma.secilencevap4.length()*100-(oyunuoyna.sayac7)*100; 
                }
            }else{
                puan-=scokuma.secilencevap4.length()*100-oyunuoyna.sayac7*100;
            }
            
            
            break;
            
             case 5: 
            x=a.equalsIgnoreCase(scokuma.secilencevap5);
            if(x){
                if(oyunuoyna.sayac7<=scokuma.secilencevap5.length()){
                   puan+=scokuma.secilencevap5.length()*100-(oyunuoyna.sayac7)*100; 
                }
            }else{
                puan-=scokuma.secilencevap5.length()*100-oyunuoyna.sayac7*100;
            }
                
            break;
            
             case 6: 
            x=a.equalsIgnoreCase(scokuma.secilencevap6);
            if(x){
                if(oyunuoyna.sayac7<=scokuma.secilencevap6.length()){
                   puan+=scokuma.secilencevap6.length()*100-(oyunuoyna.sayac7)*100; 
                }
            }else{
                puan-=scokuma.secilencevap1.length()*100-oyunuoyna.sayac7*100;
            }
            
            
            break;
            
             case 7: 
            x=a.equalsIgnoreCase(scokuma.secilencevap7);
            if(x){
                if(oyunuoyna.sayac7<=scokuma.secilencevap7.length()){
                   puan+=scokuma.secilencevap7.length()*100-(oyunuoyna.sayac7)*100;  
                }
            }else{
                puan-=scokuma.secilencevap1.length()*100-oyunuoyna.sayac7*100;
            }
            
            
            break;
            
             case 8: 
            x=a.equalsIgnoreCase(scokuma.secilencevap8);
            if(x){
                if(oyunuoyna.sayac7<=scokuma.secilencevap8.length()){
                    puan+=scokuma.secilencevap8.length()*100-(oyunuoyna.sayac7)*100;
                }
            
            }else{
                puan-=scokuma.secilencevap8.length()*100-oyunuoyna.sayac7*100;
            }
            
                
            break;
            
             case 9: 
            x=a.equalsIgnoreCase(scokuma.secilencevap9);
            if(x){
                if(oyunuoyna.sayac7<=scokuma.secilencevap9.length()){
                 puan+=scokuma.secilencevap9.length()*100-(oyunuoyna.sayac7)*100;   
                }
            
            }else{
                puan-=scokuma.secilencevap9.length()*100-oyunuoyna.sayac7*100;
            }
                
            break;
            
             case 10: 
            x=a.equalsIgnoreCase(scokuma.secilencevap10);
            if(x){
                if(oyunuoyna.sayac7<=scokuma.secilencevap10.length()){
                  puan+=scokuma.secilencevap10.length()*100-(oyunuoyna.sayac7)*100;  
                }
            
            }else{
                puan-=scokuma.secilencevap10.length()*100-oyunuoyna.sayac7*100;
            }
                
            break;
            
             case 11: 
            x=a.equalsIgnoreCase(scokuma.secilencevap11);
            if(x){
                if(oyunuoyna.sayac7<=scokuma.secilencevap11.length()){
                  puan+=scokuma.secilencevap11.length()*100-(oyunuoyna.sayac7)*100;  
                }
            
            }
            else{
                puan-=scokuma.secilencevap11.length()*100-oyunuoyna.sayac7*100;
            }
                
            break;
            
             case 12: 
            x=a.equalsIgnoreCase(scokuma.secilencevap12);
            if(x){
                if(oyunuoyna.sayac7<=scokuma.secilencevap12.length()){
                   puan+=scokuma.secilencevap12.length()*100-(oyunuoyna.sayac7)*100; 
                }
            
            }else{
                puan-=scokuma.secilencevap12.length()*100-oyunuoyna.sayac7*100;
            }
                
            break;
            
             case 13: 
            x=a.equalsIgnoreCase(scokuma.secilencevap13);
            if(x){
                if(oyunuoyna.sayac7<=scokuma.secilencevap13.length()){
                    puan+=scokuma.secilencevap13.length()*100-(oyunuoyna.sayac7)*100;
                }
            
            }else{
                puan-=scokuma.secilencevap13.length()*100-oyunuoyna.sayac7*100;
            }
               
            break;
            
             case 14: 
            x=a.equalsIgnoreCase(scokuma.secilencevap14);
            if(x){
                if(oyunuoyna.sayac7<=scokuma.secilencevap14.length()){
                 puan+=scokuma.secilencevap14.length()*100-(oyunuoyna.sayac7)*100;   
                }
            }else{
                puan-=scokuma.secilencevap14.length()*100-oyunuoyna.sayac7*100;
            }
            
            break;                                        
             default:
                 
        }
                 Scanner s;
                 s=new Scanner(new File("highscore.txt"));
                 highscore=s.next();
                 Highscore=Integer.parseInt(highscore);
                 if(puan>Highscore){
            try (PrintWriter dosya = new PrintWriter (new FileWriter("highscore.txt"))) {
                dosya.write(puan1);
            }
                 Highscore=puan;
                 }
                 
            
        puan1=String.valueOf(puan);
        return puan1;
        
        
    };
    
}
