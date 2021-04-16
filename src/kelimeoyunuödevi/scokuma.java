/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelimeoyunuödevi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author malco
 */
public class scokuma {
        private Scanner oku;   
        
        static String secilencevap;
        static String secilencevap1;
        static String secilencevap2;
        static String secilencevap3;
        static String secilencevap4;
        static String secilencevap5;
        static String secilencevap6;
        static String secilencevap7;
        static String secilencevap8;
        static String secilencevap9;
        static String secilencevap10;
        static String secilencevap11;
        static String secilencevap12;
        static String secilencevap13;
        static String secilencevap14;
       
        static String secilensoru; 
        static int secilen1;
        static int secilen2;
        static int secilen3;
        static int secilen4;
        static int secilen5;
        static int secilen6;
        static int secilen7;
        static int secilen8;
        static int secilen9;
        static int secilen10;
        static int secilen11;
        static int secilen12;
        static int secilen13;
        static int secilen14;
        static int secilensayi;
    
    public static String dokusoru (int sayac2)  {
        Scanner s;
        String secilensoru = "";
        File folder = new File("sorular");
        File[] listOfFiles = folder.listFiles();
        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
            }
        }
        File folder2 = new File("cevaplar");
        File[] listOfFiles2 = folder2.listFiles();
        for (File listOfFile2 : listOfFiles) {
            if (listOfFile2.isFile()) {
            }
        }
        int a = sayac2;

        switch(a) {
            case 1:
        try{
        s=new Scanner((listOfFiles[a]));
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        
        String[] str=listS.toArray(new String[listS.size()]);
        Random rastgele = new Random();
        secilen1 = rastgele.nextInt(str.length);
        secilensoru=(str[secilen1]);
        }
        
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        
        
        try{
        s=new Scanner(listOfFiles2[a]);
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        String[] str2=listS.toArray(new String[listS.size()]);
        secilencevap1=(str2[secilen1+1]);
        }
                
  
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        secilencevap=secilencevap1;          
        break;
            case 2:
        try{
        s=new Scanner((listOfFiles[a-1]));
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        
        String[] str=listS.toArray(new String[listS.size()]);
        Random rastgele = new Random();
        secilen2 = rastgele.nextInt(str.length);
        while(secilen1==secilen2){
            secilen2 = rastgele.nextInt(str.length);
        }
        secilensoru=str[secilen2];
        }
        
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        try{
        s=new Scanner(listOfFiles2[a-1]);
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        String[] str2=listS.toArray(new String[listS.size()]);
        secilencevap2=(str2[secilen2+1]);
        }
  
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        secilencevap=secilencevap2;        
        break;
 
        case 3:
        try{
        s=new Scanner((listOfFiles[a-1]));
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        
        String[] str=listS.toArray(new String[listS.size()]);
        Random rastgele = new Random();
        secilen3 = rastgele.nextInt(str.length);
        secilensoru=(str[secilen3]);
        }
        
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        try{
        s=new Scanner(listOfFiles2[a-1]);
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        String[] str2=listS.toArray(new String[listS.size()]);
        secilencevap3=(str2[secilen3+1]);
        }
  
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        secilencevap=secilencevap3;          
        break;
            case 4:
        try{
        s=new Scanner((listOfFiles[a-2]));
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        
        String[] str=listS.toArray(new String[listS.size()]);
        Random rastgele = new Random();
        secilen4 = rastgele.nextInt(str.length);
        while(secilen3==secilen4){
            secilen4 = rastgele.nextInt(str.length);
        }
        secilensoru=str[secilen4];
        }
        
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        try{
        s=new Scanner(listOfFiles2[a-2]);
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        String[] str2=listS.toArray(new String[listS.size()]);
        secilencevap4=(str2[secilen4+1]);
        }
  
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        secilencevap=secilencevap4;         
        break;
            case 5:
        try{
        s=new Scanner((listOfFiles[a-2]));
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        
        String[] str=listS.toArray(new String[listS.size()]);
        Random rastgele = new Random();
        secilen5 = rastgele.nextInt(str.length);
        secilensoru=(str[secilen5]);
        }
        
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        try{
        s=new Scanner(listOfFiles2[a-2]);
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        String[] str2=listS.toArray(new String[listS.size()]);
        secilencevap5=(str2[secilen5+1]);
        }
  
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        secilencevap=secilencevap5;          
        break;
            case 6:
        try{
        s=new Scanner((listOfFiles[a-3]));
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        
        String[] str=listS.toArray(new String[listS.size()]);
        Random rastgele = new Random();
        secilen6 = rastgele.nextInt(str.length);
        while(secilen5==secilen6){
            secilen6 = rastgele.nextInt(str.length);
        }
        secilensoru=str[secilen6];
        }
      
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        try{
        s=new Scanner(listOfFiles2[a-3]);
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        String[] str2=listS.toArray(new String[listS.size()]);
        secilencevap6=(str2[secilen6+1]);
        }
  
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        secilencevap=secilencevap6;          
        break;
            case 7:
        try{
        s=new Scanner((listOfFiles[a-3]));
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        
        String[] str=listS.toArray(new String[listS.size()]);
        Random rastgele = new Random();
        secilen7 = rastgele.nextInt(str.length);
        secilensoru=(str[secilen7]);
        }
        
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        try{
        s=new Scanner(listOfFiles2[a-3]);
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        String[] str2=listS.toArray(new String[listS.size()]);
        secilencevap7=(str2[secilen7+1]);
        }
  
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        secilencevap=secilencevap7;          
        break;
            case 8:
        try{
        s=new Scanner((listOfFiles[a-4]));
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        
        String[] str=listS.toArray(new String[listS.size()]);
        Random rastgele = new Random();
        secilen8 = rastgele.nextInt(str.length);
        while(secilen7==secilen8){
            secilen8 = rastgele.nextInt(str.length);
        }
        secilensoru=str[secilen8];
        }
        
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        try{
        s=new Scanner(listOfFiles2[a-4]);
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        String[] str2=listS.toArray(new String[listS.size()]);
        secilencevap8=(str2[secilen8+1]);
        }
  
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        secilencevap=secilencevap8;          
        break;
            case 9:
        try{
        s=new Scanner((listOfFiles[a-4]));
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        
        String[] str=listS.toArray(new String[listS.size()]);
        Random rastgele = new Random();
        secilen9 = rastgele.nextInt(str.length);
        secilensoru=(str[secilen9]);
        }
        
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        try{
        s=new Scanner(listOfFiles2[a-4]);
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        String[] str2=listS.toArray(new String[listS.size()]);
        secilencevap9=(str2[secilen9+1]);
        }
  
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        secilencevap=secilencevap9;          
        break;
            case 10:
        try{
        s=new Scanner((listOfFiles[a-5]));
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        
        String[] str=listS.toArray(new String[listS.size()]);
        Random rastgele = new Random();
        secilen10 = rastgele.nextInt(str.length);
        while(secilen9==secilen10){
            secilen10 = rastgele.nextInt(str.length);
        }
        secilensoru=str[secilen10];
        }
        
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        try{
        s=new Scanner(listOfFiles2[a-5]);
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        String[] str2=listS.toArray(new String[listS.size()]);
        secilencevap10=(str2[secilen10+1]);
        }
  
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        secilencevap=secilencevap10;          
        break;
            case 11:
        try{
        s=new Scanner((listOfFiles[a-5]));
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        
        String[] str=listS.toArray(new String[listS.size()]);
        Random rastgele = new Random();
        secilen11 = rastgele.nextInt(str.length);
        secilensoru=(str[secilen11]);
        }
        
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        try{
        s=new Scanner(listOfFiles2[a-5]);
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        String[] str2=listS.toArray(new String[listS.size()]);
        secilencevap11=(str2[secilen11+1]);
        }
  
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        secilencevap=secilencevap11;          
        break;
            case 12:
        try{
        s=new Scanner((listOfFiles[a-6]));
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        
        String[] str=listS.toArray(new String[listS.size()]);
        Random rastgele = new Random();
        secilen12 = rastgele.nextInt(str.length);
        while(secilen11==secilen12){
            secilen2 = rastgele.nextInt(str.length);
        }
        secilensoru=str[secilen12];
        }
        
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        try{
        s=new Scanner(listOfFiles2[a-6]);
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        String[] str2=listS.toArray(new String[listS.size()]);
        secilencevap13=(str2[secilen12+1]);
        }
  
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        secilencevap=secilencevap12;          
        break;
            case 13:
        try{
        s=new Scanner((listOfFiles[a-13]));
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        
        String[] str=listS.toArray(new String[listS.size()]);
        Random rastgele = new Random();
        secilen13 = rastgele.nextInt(str.length);
        secilensoru=(str[secilen13]);
        }
        
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        try{
        s=new Scanner(listOfFiles2[a-13]);
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        String[] str2=listS.toArray(new String[listS.size()]);
        secilencevap13=(str2[secilen13+1]);
        }
  
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        secilencevap=secilencevap13;          
        break;
            case 14:
        try{
        s=new Scanner((listOfFiles[a-14]));
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        
        String[] str=listS.toArray(new String[listS.size()]);
        Random rastgele = new Random();
        secilen14 = rastgele.nextInt(str.length);
        while(secilen13==secilen14){
            secilen14 = rastgele.nextInt(str.length);
        }
        secilensoru=str[secilen14];
        }
        
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        
        try{
        s=new Scanner(listOfFiles2[a-14]);
        ArrayList<String> listS=new ArrayList<>();
        while(s.hasNextLine()){
            listS.add(s.nextLine());
        }
        String[] str2=listS.toArray(new String[listS.size()]);
        secilencevap14=(str2[secilen14+1]);
        }
  
        catch(FileNotFoundException e){
                System.out.println("Dosya oluşturma hatası");}
        secilencevap=secilencevap14;        
        break;
         default:
             secilensoru="Bitti";
         break;   

        }
        return secilensoru;
    }
   
        
       
    public void dkapat (){
        if(oku!=null)
            oku.close();
    }

    
}
