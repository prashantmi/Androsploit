/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;


public class file_browser extends javax.swing.JFrame {
static String setothers;
String selected;
String set;
    /** Creates new form file_browser */
    public file_browser() {
        initComponents();
    }
 public file_browser(String get_value)
    {
        
       
         initComponents();
         setothers=get_value;
         System.out.println(setothers);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("ROOTDIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EXTRACT DATA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE DATA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("RENAME ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("File Browser");

        jButton5.setText("SD CARD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("MODIFY PERMISSION");

        jButton8.setText("Open");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Androidsploit");

        jButton7.setText("PREVIOUS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(478, 478, 478)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton5))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(26, 26, 26)
                        .addComponent(jButton6)
                        .addGap(26, 26, 26)
                        .addComponent(jButton7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cmd="adb shell ls";
       String line;
       
    
        try{
        Runtime run=Runtime.getRuntime();
           Process pr1;
           
           pr1=run.exec(cmd);
           pr1.waitFor();
           DefaultListModel ob=new DefaultListModel();
             BufferedReader buf = new BufferedReader(new InputStreamReader(pr1.getInputStream()));
       
        
              while ((line=buf.readLine())!=null) {
                   
                    ob.addElement(line);
                   
              }
               jList1.setModel(ob);
               jTextArea1.setText("/"); 
                 
  
   }catch(Exception e)
        {
            e.printStackTrace();
        }
        
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
      if (!evt.getValueIsAdjusting()){
          
      
        String selected = jList1.getSelectedValue();
       String set=(selected.concat("/"));
  
         jTextArea1.append(set);

      }
        /* else
         {
                selected = jList1.getSelectedValue();
       
         jTextArea1.append(selected+"/");
                 }*/
   
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  String cmd="adb shell ls /storage/emulated/0";
 String cmd1="adb shell ls /storage/sdcard0";
   String cmd2="adb shell ls /storage/sdcard1";
  DefaultListModel ob=new DefaultListModel();
  DefaultListModel ob1=new DefaultListModel();
  DefaultListModel ob2=new DefaultListModel();
       String line,line1,line2,source1=null,source=null,source2=null;
      Boolean found,found1,found2; 
        String str="such";
    
        try{
        Runtime run=Runtime.getRuntime();
           Process pr;
          
           pr=run.exec(cmd);
           BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
       
        
              while ((line=buf.readLine())!=null) {
                 ob.addElement(line);
                   source=source + line;
                   System.out.println(line);
              }
 
                   found=source.contains(str);
                  System.out.println(found);
                   if(found==false)
                       
                   {
                      jTextArea1.setText("/storage/emulated/0/");
                  
                         jList1.setModel(ob);  
                     
                   }
                                 

                               else
                   {
                        
                        
                       Process pr1;
                       pr1=run.exec(cmd1);
                        BufferedReader buff = new BufferedReader(new InputStreamReader(pr1.getInputStream()));
     
        
              while ((line1=buff.readLine())!=null) {
                    ob1.addElement(line1);
                 source1=source1 + line1;
              }
              found1=source1.contains(str);
                System.out.println(found1);
             if (found1==false){
              jTextArea1.setText("/storage/sdcard0/");
              jList1.setModel(ob1); 
              }
             
             else
             {
                                       
           Process pr2;
           
          pr2=run.exec(cmd2);
        BufferedReader buf1 = new BufferedReader(new InputStreamReader(pr2.getInputStream()));
       
         jTextArea1.setText("/storage/sdcard1/");
              while ((line2=buf1.readLine())!=null) {
                 ob2.addElement(line2);
                   
                   source2=source2 + line2;
                   
              }
              found2=source2.contains(str);
                System.out.println(found2);
             if(found2==false)
              {
                jList1.setModel(ob2);  
              }
              else
                   {
                       ob2.addElement("ERROR!!");
                       jList1.setModel(ob2);
                   }
                                  
             } }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     String str=jTextArea1.getText();
        String cmd="adb shell ls ".concat(jTextArea1.getText());
      
       String line;
      
       try{
        Runtime run=Runtime.getRuntime();
           Process pr;
          
           pr=run.exec(cmd);
            pr.waitFor();
           DefaultListModel obp=new DefaultListModel();
             BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
       
        
              while ((line=buf.readLine())!=null) {
                  
                    obp.addElement(line);
                   
              }
               jList1.setModel(obp);
           
           
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String get_file=jTextArea1.getText();
        int i=get_file.length();
        String subget=get_file.substring(0,i-1);
        System.out.println(subget);
        String cmd2="adb pull ".concat(subget);
         System.out.println(cmd2);
         System.out.println("cvbcxmv"+setothers);
        // String p="C:\\Users\\Prashansha\\Desktop\\Androsploit\\AndroidData\\Others";
        String put_cmd=cmd2.concat(" "+setothers);
        System.out.println(put_cmd);
        try{
            Process pre;
           Runtime run=Runtime.getRuntime();
           pre=run.exec(put_cmd);
            pre.waitFor();
        }catch(Exception e)
        {
        }  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String del="adb shell rm -r";// %vsource2%
                 String get_file_delete=jTextArea1.getText();
                  int i=get_file_delete.length();
        String subget=get_file_delete.substring(0,i-1);
        String del_file=del.concat(" "+subget);
               System.out.println(del_file);
        try{
            Process pre;
           Runtime run=Runtime.getRuntime();
           pre=run.exec(del_file);
            pre.waitFor();
        }catch(Exception e)
        {
        }     
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       Menu3 ob=new Menu3();
       file_browser.this.setVisible(false);
       ob.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(file_browser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(file_browser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(file_browser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(file_browser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                universal_method create=new universal_method();
                create.createFile();
                new file_browser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
