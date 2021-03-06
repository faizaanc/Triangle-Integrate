/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.ia;

/**
 *
 * @author Faizaan Chishtie
 */
public class GUI_Applet extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Applet
     */
    public GUI_Applet() {
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

        jPanel1 = new javax.swing.JPanel();
        times = new javax.swing.JTextField();
        x_intercept_button = new javax.swing.JButton();
        tri_summit = new javax.swing.JTextField();
        coefficient_of_x = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        constant = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Integrate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Out = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesActionPerformed(evt);
            }
        });

        x_intercept_button.setText("Calculate xint");
        x_intercept_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x_intercept_buttonActionPerformed(evt);
            }
        });

        coefficient_of_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coefficient_of_xActionPerformed(evt);
            }
        });

        jLabel3.setText("Position of Triangle Summit");

        jButton1.setText("1st Height");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("y=");

        jLabel2.setText("Enter the Coefficients in Form: y= -(a)x^2  + (b)x^0");

        Integrate.setText("Integrate");
        Integrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntegrateActionPerformed(evt);
            }
        });

        Out.setColumns(20);
        Out.setRows(5);
        jScrollPane1.setViewportView(Out);

        jLabel6.setText("#times");

        jProgressBar1.setStringPainted(true);

        jButton2.setText("Area Sequence");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(311, 311, 311))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(coefficient_of_x, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(constant, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(29, 29, 29)
                                        .addComponent(tri_summit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(times, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(x_intercept_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(121, 121, 121)
                        .addComponent(Integrate)
                        .addGap(79, 79, 79)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coefficient_of_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(constant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(times, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tri_summit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addComponent(x_intercept_button)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Integrate)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coefficient_of_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coefficient_of_xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coefficient_of_xActionPerformed

    private void IntegrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntegrateActionPerformed
        double x_coe = Double.parseDouble(coefficient_of_x.getText());
        if (x_coe < 0){
            x_coe = x_coe*-1;
        }
        double constant_val = Double.parseDouble(constant.getText());
        double tri = Double.parseDouble(tri_summit.getText());
        int times_val = Integer.parseInt(times.getText());
        TriangleIntegrate t = new TriangleIntegrate(-x_coe,constant_val,tri);
        double[] intercepts = TriangleIntegrate.x_intercepts(-x_coe,constant_val);
        double[] a = TriangleIntegrate.height_array(-x_coe,constant_val,intercepts, times_val,t);
        double lob = intercepts[0]/times_val;
        double[] b = TriangleIntegrate.triangle_array(a,lob); 
        double c = TriangleIntegrate.ret_area(b);
        String s = "";
        for (int i = 0; i<times_val; i++){
            s += "\n" + (i+1) + ") Height of triangle = " + a[i]+ "\n"  + "Area = " + b[i];
            int k = i;
            int l = k/times_val*100;
            jProgressBar1.setValue(l);
        }
        Out.setText(s + "\n" + "Total area: " + c);
        
    }//GEN-LAST:event_IntegrateActionPerformed

    private void timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timesActionPerformed

    private void x_intercept_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x_intercept_buttonActionPerformed
        double x_int = Double.parseDouble(coefficient_of_x.getText());
        if (x_int < 0){
            x_int = x_int*-1;
        }
        double tri = Double.parseDouble(tri_summit.getText());
        double constant_val = Double.parseDouble(constant.getText());
        TriangleIntegrate t = new TriangleIntegrate(-x_int,constant_val,tri);
        double[] intercepts = TriangleIntegrate.x_intercepts(-x_int,constant_val);
        Out.setText("x intercepts: " + intercepts[0] + " , " + intercepts[1]);
    }//GEN-LAST:event_x_intercept_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     double x_int = Double.parseDouble(coefficient_of_x.getText());
        if (x_int < 0){
            x_int = x_int*-1;
        }
        int times_val = Integer.parseInt(times.getText());
        double tri = Double.parseDouble(tri_summit.getText());
        double constant_val = Double.parseDouble(constant.getText());
        TriangleIntegrate t = new TriangleIntegrate(-x_int,constant_val,tri);
        
        Out.setText("First Height " + TriangleIntegrate.first_height(t,times_val));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       double x_int = Double.parseDouble(coefficient_of_x.getText());
        if (x_int < 0){
            x_int = x_int*-1;
        }
        int times_val = Integer.parseInt(times.getText());
        double tri = Double.parseDouble(tri_summit.getText());
        double constant_val = Double.parseDouble(constant.getText());
        
        for (int i = 1; i <= times_val; i++){
        double k = i;
        double[] intercepts = TriangleIntegrate.x_intercepts(-x_int,constant_val);
        double tri2 = tri*(intercepts[0]/k);//variable
        int times_val2 = i;
        TriangleIntegrate t = new TriangleIntegrate(-x_int,constant_val,tri2);
        double[] a = TriangleIntegrate.height_array(-x_int,constant_val,intercepts, times_val2,t);
        double lob = intercepts[0]/times_val2;
        double[] b = TriangleIntegrate.triangle_array(a,lob); 
        double c = TriangleIntegrate.ret_area(b);
        int value = (int)k/times_val*100;
        jProgressBar1.setValue(value);
        String s = Out.getText();
        Out.setText(s + "\n" + c);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Applet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Applet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Applet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Applet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Applet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Integrate;
    private javax.swing.JTextArea Out;
    private javax.swing.JTextField coefficient_of_x;
    private javax.swing.JTextField constant;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField times;
    private javax.swing.JTextField tri_summit;
    private javax.swing.JButton x_intercept_button;
    // End of variables declaration//GEN-END:variables
}
