/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpacalculator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Ansary
 */
public class windowOne extends javax.swing.JFrame {
    
    ArrayList<Person> PersonList = new ArrayList<>();
    private Object ob;
    //Person ob = new Person();
    String path="";
    int student;

    /**
     * Creates new form windowOne
     */
    public windowOne() {
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

        jLabel1 = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        labelBirthDay = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        buttonList = new javax.swing.JButton();
        fieldSub1 = new javax.swing.JTextField();
        fieldSub2 = new javax.swing.JTextField();
        fieldSub3 = new javax.swing.JTextField();
        number = new javax.swing.JLabel();
        fieldSub4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldSub5 = new javax.swing.JTextField();
        eeeLab = new javax.swing.JTextField();
        dldLab = new javax.swing.JTextField();
        dsLab = new javax.swing.JTextField();
        sdLab = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N

        labelName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelName.setText("Math");

        labelAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelAddress.setText("DLD");

        labelBirthDay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelBirthDay.setText("EEE");

        buttonSave.setBackground(new java.awt.Color(0, 0, 0));
        buttonSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonSave.setForeground(new java.awt.Color(255, 255, 255));
        buttonSave.setText("SAVE");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonList.setBackground(new java.awt.Color(0, 0, 0));
        buttonList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonList.setForeground(new java.awt.Color(255, 255, 255));
        buttonList.setText("LIST");
        buttonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListActionPerformed(evt);
            }
        });

        fieldSub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSub1ActionPerformed(evt);
            }
        });

        fieldSub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSub2ActionPerformed(evt);
            }
        });

        number.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        number.setText("HUM");

        fieldSub4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSub4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("DS");

        dldLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dldLabActionPerformed(evt);
            }
        });

        dsLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsLabActionPerformed(evt);
            }
        });

        sdLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdLabActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Write Your Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("EEE Lab");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("DLD Lab");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("DS Lab");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("SD Lab");

        jLabel8.setBackground(new java.awt.Color(240, 92, 95));
        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(21, 26, 35));
        jLabel8.setText("CGPA CALCULATOR");

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student 1", "Student 2", "Student 3" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(154, 154, 154))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dsLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dldLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eeeLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sdLab, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(138, 138, 138)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(408, 408, 408)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonList, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(fieldSub5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(number)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelName)
                                                    .addComponent(labelBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(fieldSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(fieldSub4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(fieldSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(fieldSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(24, 24, 24)
                                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)
                                                .addComponent(add)))))
                                .addGap(48, 48, 48)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(labelBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(labelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldSub4)
                            .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldSub5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eeeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dldLab, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dsLab, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sdLab)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonList, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        
        Person ob = new Person();
        
        
        
        ob.Name1 = name.getText().trim();
        
        ob.Sub1=Integer.parseInt(fieldSub1.getText().trim());
        ob.Sub2=Integer.parseInt(fieldSub2.getText().trim());
        ob.Sub3=Integer.parseInt(fieldSub3.getText().trim());
        ob.Sub4=Integer.parseInt(fieldSub4.getText().trim());
        ob.Sub5=Integer.parseInt(fieldSub5.getText().trim());
        
        
        ob.eeeLab=Integer.parseInt(eeeLab.getText().trim());
        ob.dldLab=Integer.parseInt(dldLab.getText().trim());
        ob.dsLab=Integer.parseInt(dsLab.getText().trim());
        ob.sdLab=Integer.parseInt(sdLab.getText().trim());
        //ob.email=Integer.parseInt(fieldEmail.getText());
        
        PersonList.add(ob);
        
       
        
        
        /*
        try{
			
			String writePath = "D:\\student_out.txt";
			FileWriter fw = new FileWriter(writePath);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String firstLine;
			firstLine="Name\t" + "S1\t" + "S2\t" + "S3\t" + "S4\t" + "S5\t" + "L1\t"+ "L2\t" + "L3\t" + "L4\t" +"CGPA";
			bw.write(firstLine);
			bw.newLine();
			for( int i = 0 ; i < 1 ; i ++ ){
				String line;
				line = ob.Name1+"\t"+ob.Sub1 +"\t" + ob.Sub2+"\t"+
                                        ob.Sub3+"\t" + ob.Sub4+"\t" +
                                        ob.Sub5+"\t" + ob.eeeLab+"\t"+
                                        ob.dldLab+"\t"+ ob.dsLab+"\t"+ob.sdLab+"\t"+ob.cgpa()+"\t";
                        
				
				bw.write(line);
				bw.newLine();
			}
			
			bw.close();
			fw.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}*/
        
        fieldSub1.setText(null);
        fieldSub2.setText(null);
        fieldSub3.setText(null);
        fieldSub4.setText(null);
        fieldSub5.setText(null);
        
        
        eeeLab.setText(null);
        dldLab.setText(null);
        dsLab.setText(null);
        sdLab.setText(null);
        
        name.setText("");
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListActionPerformed
        // TODO add your handling code here:
        windowTwo obj = new windowTwo(PersonList);
        obj.setVisible(true);
    }//GEN-LAST:event_buttonListActionPerformed

    private void fieldSub4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSub4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSub4ActionPerformed

    private void fieldSub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSub1ActionPerformed

    private void sdLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdLabActionPerformed

    private void dsLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsLabActionPerformed

    private void fieldSub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSub2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSub2ActionPerformed

    private void dldLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dldLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dldLabActionPerformed
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
       if(student == 1){
            path = "E:\\Student1.txt";
        }
        if(student == 2){
            path = "E:\\Student2.txt";
        }
        if(student == 3){
            path = "E:\\Student3.txt";
        }
        
        try{
			System.out.println("Reading file");
			String readpath = path;
			FileReader fr = new FileReader(readpath);
			BufferedReader br = new BufferedReader(fr);
			
                        String line = "";
                        
			String line1 = br.readLine();
                        //int i=0;
			while((line = br.readLine())!= null){
				String val[] = line.trim().split("\t");
				
                               
           
        name.setText(val[0]);                       
                                
        fieldSub1.setText(val[1]);
        fieldSub2.setText(val[2]);
        fieldSub3.setText(val[3]);
        fieldSub4.setText(val[4]);
        fieldSub5.setText(val[5]);
        
        
        eeeLab.setText(val[6]);
        dldLab.setText(val[7]);
        dsLab.setText(val[8]);
        sdLab.setText(val[9]);
        
        
                                
                              

                                
			}
			
			
			br.close();
			fr.close();
			
			
		}catch( Exception e ){
			e.printStackTrace();
		}
    }//GEN-LAST:event_addActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        int a= jComboBox1.getSelectedIndex();
        
        if(a==0){
            student=1;
        }
        if(a==1){
            student=2;
        }
        if(a==2){
            student =3;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(windowOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                windowOne ob=new windowOne();
                ob.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton buttonList;
    private javax.swing.JButton buttonSave;
    private javax.swing.JTextField dldLab;
    private javax.swing.JTextField dsLab;
    private javax.swing.JTextField eeeLab;
    private javax.swing.JTextField fieldSub1;
    private javax.swing.JTextField fieldSub2;
    private javax.swing.JTextField fieldSub3;
    private javax.swing.JTextField fieldSub4;
    private javax.swing.JTextField fieldSub5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelBirthDay;
    private javax.swing.JLabel labelName;
    private javax.swing.JTextField name;
    private javax.swing.JLabel number;
    private javax.swing.JTextField sdLab;
    // End of variables declaration//GEN-END:variables
}
