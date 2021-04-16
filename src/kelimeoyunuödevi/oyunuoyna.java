package kelimeoyunuödevi;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malco
 */
public class oyunuoyna extends javax.swing.JFrame {
static int sayac2=1;
static int sayac3=1;
static int sayac4=1;
static int sayac5=0;
static int sayac6=0;
static int sayac7=0;
static int sayac8=0;
static int bmin=3;
static int bsec=59;
int min,sec,min1,sec1;
boolean flag;
boolean ifstop;
boolean ifgeri;
int h=20;
int c=0;
Timer timer2=new Timer(1000 ,new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               
               String min2=String.valueOf(h);
               Timer2.setForeground(Color.black);
               Timer2.setText(min2);
              
               if(h<10){
               Timer2.setForeground(Color.red);
               }
               
               h--;
               
               if(h==-1){
                   int k=scokuma.secilencevap.length();
                   tahminetme.puan-=(k-sayac7)*100;
                   tahminetme.puan1=String.valueOf(tahminetme.puan);
                
                   oyunuoyna mesaj=new oyunuoyna();
                   if(sayac6!=14){
                      JOptionPane.showMessageDialog(mesaj,"Süre Doldu "+"\n"+"Sonraki Soruya Geçiniz","Süre Bitti",0); 
                   }else 
                   
                   {if(c==0){
                       LocalDate date = LocalDate.now();
                       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                       JOptionPane.showMessageDialog(mesaj,"Kalan süreniz :"+"\n"+bmin+" dakika "+bsec+" saniye "+"\n"+"Oyun Sonu Puanınız :"+tahminetme.puan+"\n"+"En Yüksek Skor :"+tahminetme.Highscore+"\n"+"Oynadığınız Tarih :"+date.format(formatter),"Oyun Bitti",0);
                   }
                       
                   }
                   
                   timer2.stop();
                   sor.setEnabled(true);
                   tahminetme1.setEnabled(false);
                   gönder.setEnabled(false);
                   Timer2.setVisible(false);
                   h=20;
               }
                
               
               }
          
       
       });
Timer timer=new Timer(1000 ,new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               
               
               String min=String.valueOf(bmin);
               String sec=String.valueOf(bsec);
               lblmin.setForeground(Color.black);
               lblsec.setForeground(Color.black);
               lblmin.setText(min);
               lblsec.setText(sec);
               
               if(ifstop){
                   bmin=min1;
                   bsec=sec1;
                   ifstop=false;
               }
               
              
               if(bmin==0){
               lblmin.setForeground(Color.red);
               lblsec.setForeground(Color.red);
               }
               
               bsec--; 
               if(bsec<0){
               bsec=59;
               bmin--;
                 lblsec.setText("0"+sec);
               }
               else if(bsec<9){
                   lblsec.setText("0"+sec);
                   flag=false;
               }
               else{
                   lblsec.setText(sec);
                         flag=false;
               }
               if(bmin<0){
                   tahminetme sdoldu=new tahminetme();
                   try {
                       sdoldu.hesaplama("s");
                   } catch (IOException ex) {
                       Logger.getLogger(oyunuoyna.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   LocalDate date = LocalDate.now();
                   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                   oyunuoyna mesaj=new oyunuoyna();
                   JOptionPane.showMessageDialog(mesaj,"Süre Doldu    Puanınız: "+tahminetme.puan+"\n"+"En Yüksek Skor :"+tahminetme.Highscore+"\n"+"Oynadığınız Tarih :"+date.format(formatter),"Süre Bitti",0);
                   
                   bmin=0;bsec=0;
                   timer.stop();
               }
                
               lblmin.setText("0"+min);
               if(flag){
               lblmin.setText(min);
               lblsec.setText(sec);
               }
               }
          
       
       });
               

    /**
     * Creates new form oyunuoyna
     */
    public oyunuoyna() {
        this.setResizable(false);
        this.setBounds(500,200,500,500);
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        ikinokta1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        gönder = new javax.swing.JButton();
        geri1 = new javax.swing.JButton();
        sorualanı = new javax.swing.JTextField();
        sor = new javax.swing.JButton();
        tahminetmetext = new javax.swing.JTextField();
        kaçıncı = new javax.swing.JLabel();
        tahminetme1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cevap = new javax.swing.JTextField();
        puanınız = new javax.swing.JLabel();
        puandurumu = new javax.swing.JLabel();
        Timer2 = new javax.swing.JLabel();
        süreniz = new javax.swing.JLabel();
        lblsec = new javax.swing.JLabel();
        ikinokta = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        harfiste = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        ikinokta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ikinokta1.setText(":");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oyunu Oyna");

        gönder.setText("Gönder");
        gönder.setEnabled(false);
        gönder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gönderActionPerformed(evt);
            }
        });

        geri1.setText("Geri");
        geri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geri1ActionPerformed(evt);
            }
        });

        sorualanı.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sorualanı.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sorualanı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorualanıActionPerformed(evt);
            }
        });

        sor.setText("SOR");
        sor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorActionPerformed(evt);
            }
        });

        tahminetmetext.setEnabled(false);

        kaçıncı.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        kaçıncı.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tahminetme1.setText("Tahmin Et");
        tahminetme1.setEnabled(false);
        tahminetme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahminetme1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cevap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cevap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cevap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cevapActionPerformed(evt);
            }
        });

        puanınız.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        puanınız.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puanınız.setText("Puanınız");

        puandurumu.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        puandurumu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puandurumu.setText("0");

        Timer2.setVisible(false);
        Timer2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Timer2.setText("00");

        süreniz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        süreniz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        süreniz.setText("Süreniz");

        lblsec.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblsec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsec.setText("00");

        ikinokta.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ikinokta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ikinokta.setText(":");

        lblmin.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmin.setText("00");

        harfiste.setText("Harf İste");
        harfiste.setEnabled(false);
        harfiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harfisteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(kaçıncı, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(geri1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(süreniz, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblmin)
                        .addGap(18, 18, 18)
                        .addComponent(ikinokta)
                        .addGap(27, 27, 27)
                        .addComponent(lblsec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(194, 194, 194)
                .addComponent(harfiste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(puanınız)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(puandurumu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(sorualanı, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tahminetmetext, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cevap, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tahminetme1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(gönder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(sor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(Timer2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(geri1)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(kaçıncı, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sorualanı, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(cevap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblmin)
                                .addComponent(lblsec)
                                .addComponent(ikinokta)
                                .addComponent(harfiste))
                            .addComponent(puandurumu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(süreniz, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(puanınız, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(tahminetmetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(tahminetme1)
                .addGap(9, 9, 9)
                .addComponent(Timer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gönder)
                .addGap(68, 68, 68)
                .addComponent(sor)
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorActionPerformed
        sayac7=0;
        tahminetme1.setEnabled(true);
        harfiste.setEnabled(true);
        if(sayac2==14)
        {
            sor.setVisible(false);
        }
        kaçıncı.setText(""+sayac2+"."+"Soru");
        if(ifgeri){
            ifgeri=false;
        }
        timer.start();
        //scokuma nesne=new scokuma();
        String soru = scokuma.dokusoru(oyunuoyna.sayac2);
        sayac2++;
        sorualanı.setText(soru);
        //doğrucevap cevap1=new doğrucevap();
        String cevap2=doğrucevap.yazdır(sayac4);
        sayac4++;
        sayac5++;
        sayac7=0;
        sayac8++;
        sayac6++;
        cevap.setText(cevap2);
        tahminetmetext.setText("");
        puandurumu.setText(tahminetme.puan1);
        harfiste.setVisible(true);
        tahminetme1.setVisible(true);
        
    }//GEN-LAST:event_sorActionPerformed

    private void gönderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gönderActionPerformed
        sor.setEnabled(true);
        
        harfiste.setEnabled(false);
        tahminetme1.setEnabled(false);
        tahminetme hesaplama=new tahminetme();
        String tahmin=tahminetmetext.getText();
        try {
            hesaplama.hesaplama(tahmin);
        } catch (IOException ex) {
            Logger.getLogger(oyunuoyna.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(sayac6==14){timer2.stop();
            oyunuoyna mesaj=new oyunuoyna();
            if(c==0){
                c=1;
                LocalDate date = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                if(tahminetme.puan<=0)
                JOptionPane.showMessageDialog(mesaj,"Sayın "+Arayüz.adı_soyadı+"\n"+"Kalan süreniz :"+"\n"+bmin+" dakika "+bsec+" saniye "+"\n"+"Oyun Sonu Puanınız : 0"+"\n"+"En Yüksek Skor :"+tahminetme.Highscore+"\n"+"Oynadığınız Tarih :"+date.format(formatter),"Oyun Bitti",0);
                else
                JOptionPane.showMessageDialog(mesaj,"Sayın "+Arayüz.adı_soyadı+"\n"+"Kalan süreniz :"+"\n"+bmin+" dakika "+bsec+" saniye "+"\n"+"Oyun Sonu Puanınız :"+tahminetme.puan+"\n"+"En Yüksek Skor :"+tahminetme.Highscore+"\n"+"Oynadığınız Tarih :"+date.format(formatter),"Oyun Bitti",0);
            }
            
           
        }
        gönder.setVisible(false);

        timer2.stop();
        h=20;
        Timer2.setVisible(false);
        lblmin.setVisible(true);
        lblsec.setVisible(true);
        ikinokta.setVisible(true);
        

    }//GEN-LAST:event_gönderActionPerformed

    private void tahminetme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahminetme1ActionPerformed
        gönder.setEnabled(true);
        tahminetmetext.setEnabled(true);
        sor.setEnabled(false);
        harfiste.setEnabled(false);
        gönder.setVisible(true);
        Timer2.setVisible(true);
        timer2.start();
        min1=bmin;
        sec1=bsec;
        ifstop=true;
        timer.stop();
    }//GEN-LAST:event_tahminetme1ActionPerformed

    private void harfisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harfisteActionPerformed
        
        //doğrucevap cevap1=new doğrucevap();
        String cevap2=doğrucevap.harfiste(sayac5);
        sayac7++;
        cevap.setText(cevap2);
    }//GEN-LAST:event_harfisteActionPerformed

    private void cevapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cevapActionPerformed

    }//GEN-LAST:event_cevapActionPerformed

    private void geri1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geri1ActionPerformed
        this.setVisible(false);
        new Arayüz().setVisible(true);
        sayac2=1;
        sayac3=1;
        sayac4=1;
        sayac5=0;
        sayac6=0;
        sayac7=0;
        sayac8=0;
        int d=3;
        int s=59;
        bmin=d;
        bsec=s;
        ifgeri=true;
        timer.stop();
        timer2.stop();

        doğrucevap.asılekran1="_ _ _ _";
        doğrucevap.asılekran2="_ _ _ _";
        doğrucevap.asılekran3="_ _ _ _ _";
        doğrucevap.asılekran4="_ _ _ _ _";
        doğrucevap.asılekran5="_ _ _ _ _ _";
        doğrucevap.asılekran6="_ _ _ _ _ _";
        doğrucevap.asılekran7="_ _ _ _ _ _ _";
        doğrucevap.asılekran8="_ _ _ _ _ _ _";
        doğrucevap.asılekran9="_ _ _ _ _ _ _ _";
        doğrucevap.asılekran10="_ _ _ _ _ _ _ _";
        doğrucevap.asılekran11="_ _ _ _ _ _ _ _ _";
        doğrucevap.asılekran12="_ _ _ _ _ _ _ _ _";
        doğrucevap.asılekran13="_ _ _ _ _ _ _ _ _ _";
        doğrucevap.asılekran14="_ _ _ _ _ _ _ _ _ _";
        tahminetme.puan=0;
        tahminetme.puan1="0";
    }//GEN-LAST:event_geri1ActionPerformed

    private void sorualanıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorualanıActionPerformed

    }//GEN-LAST:event_sorualanıActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(oyunuoyna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oyunuoyna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oyunuoyna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oyunuoyna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oyunuoyna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Timer2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cevap;
    private javax.swing.JButton geri1;
    private javax.swing.JButton gönder;
    private javax.swing.JButton harfiste;
    private javax.swing.JLabel ikinokta;
    private javax.swing.JLabel ikinokta1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel kaçıncı;
    private javax.swing.JLabel lblmin;
    private javax.swing.JLabel lblsec;
    private javax.swing.JLabel puandurumu;
    private javax.swing.JLabel puanınız;
    private javax.swing.JButton sor;
    private javax.swing.JTextField sorualanı;
    private javax.swing.JLabel süreniz;
    private javax.swing.JButton tahminetme1;
    private javax.swing.JTextField tahminetmetext;
    // End of variables declaration//GEN-END:variables
}
