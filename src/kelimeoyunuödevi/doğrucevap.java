/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelimeoyunuödevi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author malco
 */
public class doğrucevap {
       private Scanner oku;
       
       static int sayac9=0;
       
       static String asılekran;
       static String asılekran1="_ _ _ _";
       static String asılekran2="_ _ _ _";
       static String asılekran3="_ _ _ _ _";
       static String asılekran4="_ _ _ _ _";
       static String asılekran5="_ _ _ _ _ _";
       static String asılekran6="_ _ _ _ _ _";
       static String asılekran7="_ _ _ _ _ _ _";
       static String asılekran8="_ _ _ _ _ _ _";
       static String asılekran9="_ _ _ _ _ _ _ _";
       static String asılekran10="_ _ _ _ _ _ _ _";
       static String asılekran11="_ _ _ _ _ _ _ _ _";
       static String asılekran12="_ _ _ _ _ _ _ _ _";
       static String asılekran13="_ _ _ _ _ _ _ _ _ _";
       static String asılekran14="_ _ _ _ _ _ _ _ _ _";
    
    
    
    public static String yazdır(int a){
        switch(a){
            case 1:
              
              asılekran=asılekran1;
                break;
             case 2:
              
              asılekran=asılekran2;
                break;
                case 3:
              
              asılekran=asılekran3;
                break;
                case 4:
              
              asılekran=asılekran4;
                break;
                case 5:
              
              asılekran=asılekran5;
                break;
                case 6:
              
              asılekran=asılekran6;
                break;
                case 7:
              
              asılekran=asılekran7;
                break;
                case 8:
              
              asılekran=asılekran8;
                break;
                case 9:
              
              asılekran=asılekran9;
                break;
                case 10:
              
              asılekran=asılekran10;
                break;
                case 11:
              
              asılekran=asılekran11;
                break;
                case 12:
              
              asılekran=asılekran12;
                break;
                case 13:
              
              asılekran=asılekran13;
                break;
                case 14:
              
              asılekran=asılekran14;
                break;
            default:
              asılekran="Bitti";
                break;}
        return asılekran;
    }
    public static String harfiste (int a) {
        
        
        switch(a){
            case 1:
                
        String ekran=asılekran1;
        char[] cevap = new char[ekran.length()];
        for (int i = 0; i < ekran.length(); i++) { 
            cevap[i] = ekran.charAt(i);
          
        }
        char[] schar = new char[scokuma.secilencevap1.length()];
        for (int i = 0; i < scokuma.secilencevap1.length(); i++) { 
            schar[i] = scokuma.secilencevap1.charAt(i); 
        }
        Random rastgele = new Random();
        int rand_int2 = rastgele.nextInt(schar.length);
        int sayac=0;
        while(cevap[rand_int2+rand_int2]!='_'&&sayac!=schar.length){
            rand_int2 = rastgele.nextInt(schar.length);
            sayac++;
        }
        cevap[rand_int2+rand_int2]=schar[rand_int2];
        asılekran1=String.valueOf(cevap);
        asılekran=asılekran1;
        break;
        
        case 2:
                
        ekran=asılekran2;
        cevap = new char[ekran.length()];
        for (int i = 0; i < ekran.length(); i++) { 
            cevap[i] = ekran.charAt(i);
          
        }
        schar = new char[scokuma.secilencevap2.length()];
        for (int i = 0; i < scokuma.secilencevap2.length(); i++) { 
            schar[i] = scokuma.secilencevap2.charAt(i); 
        }
        rastgele = new Random();
        rand_int2 = rastgele.nextInt(schar.length);
        sayac=0;
        while(cevap[rand_int2+rand_int2]!='_'&&sayac!=schar.length){
            rand_int2 = rastgele.nextInt(schar.length);
            sayac++;
        }
        cevap[rand_int2+rand_int2]=schar[rand_int2];
        asılekran2=String.valueOf(cevap);
        asılekran=asılekran2;
        break;
        
        case 3:
                
        ekran=asılekran3;
        cevap = new char[ekran.length()];
        for (int i = 0; i < ekran.length(); i++) { 
            cevap[i] = ekran.charAt(i);
          
        }
        schar = new char[scokuma.secilencevap3.length()];
        for (int i = 0; i < scokuma.secilencevap3.length(); i++) { 
            schar[i] = scokuma.secilencevap3.charAt(i); 
        }
        rastgele = new Random();
        rand_int2 = rastgele.nextInt(schar.length);
        sayac=0;
        while(cevap[rand_int2+rand_int2]!='_'&&sayac!=schar.length){
            rand_int2 = rastgele.nextInt(schar.length);
            sayac++;
        }
        cevap[rand_int2+rand_int2]=schar[rand_int2];
        asılekran3=String.valueOf(cevap);
        asılekran=asılekran3;
        break;
        
        case 4:
                
        ekran=asılekran4;
        cevap = new char[ekran.length()];
        for (int i = 0; i < ekran.length(); i++) { 
            cevap[i] = ekran.charAt(i);
          
        }
        schar = new char[scokuma.secilencevap4.length()];
        for (int i = 0; i < scokuma.secilencevap4.length(); i++) { 
            schar[i] = scokuma.secilencevap4.charAt(i); 
        }
        rastgele = new Random();
        rand_int2 = rastgele.nextInt(schar.length);
        sayac=0;
        while(cevap[rand_int2+rand_int2]!='_'&&sayac!=schar.length){
            rand_int2 = rastgele.nextInt(schar.length);
            sayac++;
        }
        cevap[rand_int2+rand_int2]=schar[rand_int2];
        asılekran4=String.valueOf(cevap);
        asılekran=asılekran4;
        break;
        
        case 5:
                
        ekran=asılekran5;
        cevap = new char[ekran.length()];
        for (int i = 0; i < ekran.length(); i++) { 
            cevap[i] = ekran.charAt(i);
          
        }
        schar = new char[scokuma.secilencevap5.length()];
        for (int i = 0; i < scokuma.secilencevap5.length(); i++) { 
            schar[i] = scokuma.secilencevap5.charAt(i); 
        }
        rastgele = new Random();
        rand_int2 = rastgele.nextInt(schar.length);
        sayac=0;
        while(cevap[rand_int2+rand_int2]!='_'&&sayac!=schar.length){
            rand_int2 = rastgele.nextInt(schar.length);
            sayac++;
        }
        cevap[rand_int2+rand_int2]=schar[rand_int2];
        asılekran5=String.valueOf(cevap);
        asılekran=asılekran5;
        break;
        
        case 6:
                
        ekran=asılekran6;
        cevap = new char[ekran.length()];
        for (int i = 0; i < ekran.length(); i++) { 
            cevap[i] = ekran.charAt(i);
          
        }
        schar = new char[scokuma.secilencevap6.length()];
        for (int i = 0; i < scokuma.secilencevap6.length(); i++) { 
            schar[i] = scokuma.secilencevap6.charAt(i); 
        }
        rastgele = new Random();
        rand_int2 = rastgele.nextInt(schar.length);
        sayac=0;
        while(cevap[rand_int2+rand_int2]!='_'&&sayac!=schar.length){
            rand_int2 = rastgele.nextInt(schar.length);
            sayac++;
        }
        cevap[rand_int2+rand_int2]=schar[rand_int2];
        asılekran6=String.valueOf(cevap);
        asılekran=asılekran6;
        break;
        
        case 7:
                
        ekran=asılekran7;
        cevap = new char[ekran.length()];
        for (int i = 0; i < ekran.length(); i++) { 
            cevap[i] = ekran.charAt(i);
          
        }
        schar = new char[scokuma.secilencevap7.length()];
        for (int i = 0; i < scokuma.secilencevap7.length(); i++) { 
            schar[i] = scokuma.secilencevap7.charAt(i); 
        }
        rastgele = new Random();
        rand_int2 = rastgele.nextInt(schar.length);
        sayac=0;
        while(cevap[rand_int2+rand_int2]!='_'&&sayac!=schar.length){
            rand_int2 = rastgele.nextInt(schar.length);
            sayac++;
        }
        cevap[rand_int2+rand_int2]=schar[rand_int2];
        asılekran7=String.valueOf(cevap);
        asılekran=asılekran7;
        break;
        
        case 8:
                
        ekran=asılekran8;
        cevap = new char[ekran.length()];
        for (int i = 0; i < ekran.length(); i++) { 
            cevap[i] = ekran.charAt(i);
          
        }
        schar = new char[scokuma.secilencevap8.length()];
        for (int i = 0; i < scokuma.secilencevap8.length(); i++) { 
            schar[i] = scokuma.secilencevap8.charAt(i); 
        }
        rastgele = new Random();
        rand_int2 = rastgele.nextInt(schar.length);
        sayac=0;
        while(cevap[rand_int2+rand_int2]!='_'&&sayac!=schar.length){
            rand_int2 = rastgele.nextInt(schar.length);
            sayac++;
        }
        cevap[rand_int2+rand_int2]=schar[rand_int2];
        asılekran8=String.valueOf(cevap);
        asılekran=asılekran8;
        break;
        
        case 9:
                
        ekran=asılekran9;
        cevap = new char[ekran.length()];
        for (int i = 0; i < ekran.length(); i++) { 
            cevap[i] = ekran.charAt(i);
          
        }
        schar = new char[scokuma.secilencevap9.length()];
        for (int i = 0; i < scokuma.secilencevap9.length(); i++) { 
            schar[i] = scokuma.secilencevap9.charAt(i); 
        }
        rastgele = new Random();
        rand_int2 = rastgele.nextInt(schar.length);
        sayac=0;
        while(cevap[rand_int2+rand_int2]!='_'&&sayac!=schar.length){
            rand_int2 = rastgele.nextInt(schar.length);
            sayac++;
        }
        cevap[rand_int2+rand_int2]=schar[rand_int2];
        asılekran9=String.valueOf(cevap);
        asılekran=asılekran9;
        break;
        
        case 10:
                
        ekran=asılekran10;
        cevap = new char[ekran.length()];
        for (int i = 0; i < ekran.length(); i++) { 
            cevap[i] = ekran.charAt(i);
          
        }
        schar = new char[scokuma.secilencevap10.length()];
        for (int i = 0; i < scokuma.secilencevap10.length(); i++) { 
            schar[i] = scokuma.secilencevap10.charAt(i); 
        }
        rastgele = new Random();
        rand_int2 = rastgele.nextInt(schar.length);
        sayac=0;
        while(cevap[rand_int2+rand_int2]!='_'&&sayac!=schar.length){
            rand_int2 = rastgele.nextInt(schar.length);
            sayac++;
        }
        cevap[rand_int2+rand_int2]=schar[rand_int2];
        asılekran10=String.valueOf(cevap);
        asılekran=asılekran10;
        break;
        
        case 11:
                
        ekran=asılekran11;
        cevap = new char[ekran.length()];
        for (int i = 0; i < ekran.length(); i++) { 
            cevap[i] = ekran.charAt(i);
          
        }
        schar = new char[scokuma.secilencevap11.length()];
        for (int i = 0; i < scokuma.secilencevap11.length(); i++) { 
            schar[i] = scokuma.secilencevap11.charAt(i); 
        }
        rastgele = new Random();
        rand_int2 = rastgele.nextInt(schar.length);
        sayac=0;
        while(cevap[rand_int2+rand_int2]!='_'&&sayac!=schar.length){
            rand_int2 = rastgele.nextInt(schar.length);
            sayac++;
        }
        cevap[rand_int2+rand_int2]=schar[rand_int2];
        asılekran11=String.valueOf(cevap);
        asılekran=asılekran11;
        break;
        
        case 12:
                
        ekran=asılekran12;
        cevap = new char[ekran.length()];
        for (int i = 0; i < ekran.length(); i++) { 
            cevap[i] = ekran.charAt(i);
          
        }
        schar = new char[scokuma.secilencevap12.length()];
        for (int i = 0; i < scokuma.secilencevap12.length(); i++) { 
            schar[i] = scokuma.secilencevap12.charAt(i); 
        }
        rastgele = new Random();
        rand_int2 = rastgele.nextInt(schar.length);
        sayac=0;
        while(cevap[rand_int2+rand_int2]!='_'&&sayac!=schar.length){
            rand_int2 = rastgele.nextInt(schar.length);
            sayac++;
        }
        cevap[rand_int2+rand_int2]=schar[rand_int2];
        asılekran12=String.valueOf(cevap);
        asılekran=asılekran12;
        break;
        
        case 13:
                
        ekran=asılekran13;
        cevap = new char[ekran.length()];
        for (int i = 0; i < ekran.length(); i++) { 
            cevap[i] = ekran.charAt(i);
          
        }
        schar = new char[scokuma.secilencevap13.length()];
        for (int i = 0; i < scokuma.secilencevap13.length(); i++) { 
            schar[i] = scokuma.secilencevap13.charAt(i); 
        }
        rastgele = new Random();
        rand_int2 = rastgele.nextInt(schar.length);
        sayac=0;
        while(cevap[rand_int2+rand_int2]!='_'&&sayac!=schar.length){
            rand_int2 = rastgele.nextInt(schar.length);
            sayac++;
        }
        cevap[rand_int2+rand_int2]=schar[rand_int2];
        asılekran13=String.valueOf(cevap);
        asılekran=asılekran13;
        break;
        
        case 14:
                
        ekran=asılekran14;
        cevap = new char[ekran.length()];
        for (int i = 0; i < ekran.length(); i++) { 
            cevap[i] = ekran.charAt(i);
          
        }
        schar = new char[scokuma.secilencevap14.length()];
        for (int i = 0; i < scokuma.secilencevap14.length(); i++) { 
            schar[i] = scokuma.secilencevap14.charAt(i); 
        }
        rastgele = new Random();
        rand_int2 = rastgele.nextInt(schar.length);
        sayac=0;
        while(cevap[rand_int2+rand_int2]!='_'&&sayac!=schar.length){
            rand_int2 = rastgele.nextInt(schar.length);
            sayac++;
        }
        cevap[rand_int2+rand_int2]=schar[rand_int2];
        asılekran14=String.valueOf(cevap);
        asılekran=asılekran14;
        break;
        
                default:          
        }
        return asılekran;
  
    }
    
    public void dkapat (){
        if(oku!=null)
            oku.close();
    }
}
