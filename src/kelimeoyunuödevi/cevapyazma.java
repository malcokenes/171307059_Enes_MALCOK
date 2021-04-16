package kelimeoyunuödevi;



import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class cevapyazma {
    private PrintWriter dosya;
    
    public void dac(int a){
        try{
            File folder = new File("cevaplar");
            File[] listOfFiles = folder.listFiles();

            for (File listOfFile : listOfFiles) {
                if (listOfFile.isFile()) { 
                }
            }
            dosya=new PrintWriter (new FileOutputStream(listOfFiles[a],true));
        }catch(FileNotFoundException e){
            System.out.println("Dosya oluşturma hatası");
        }
    }
    public void dyaz(String a){
        String cevap=a;
        dosya.println(cevap);    
    }
    public void dkapat(){
        if(dosya!=null){
            dosya.close();
        }
    }

}
