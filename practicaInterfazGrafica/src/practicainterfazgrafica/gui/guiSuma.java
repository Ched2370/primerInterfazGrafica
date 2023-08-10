package practicainterfazgrafica.gui;

import javax.swing.JOptionPane;

public class guiSuma extends javax.swing.JFrame {

    public guiSuma() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLTitulo = new javax.swing.JLabel();
        JLEntero1 = new javax.swing.JLabel();
        JLEntero2 = new javax.swing.JLabel();
        JTFEntero2 = new javax.swing.JTextField();
        JTFEntero1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        JLResulatado = new javax.swing.JLabel();
        JBSumar = new javax.swing.JButton();
        JBLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JLTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLTitulo.setText("Suma de enteros");

        JLEntero1.setText("primer entero");

        JLEntero2.setText("segundo entero");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        JLResulatado.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        JLResulatado.setForeground(new java.awt.Color(51, 51, 255));
        JLResulatado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLResulatado.setText("Resultado");
        JLResulatado.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        JBSumar.setBackground(new java.awt.Color(153, 153, 153));
        JBSumar.setForeground(new java.awt.Color(255, 255, 255));
        JBSumar.setText("Sumar");
        JBSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSumarActionPerformed(evt);
            }
        });

        JBLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        JBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        JBLimpiar.setText("Limpiar");
        JBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(JLResulatado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(JBSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(JBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(JLResulatado)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLTitulo)
                .addGap(120, 120, 120))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLEntero2)
                            .addComponent(JLEntero1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFEntero1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(JTFEntero2))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTitulo)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEntero1)
                    .addComponent(JTFEntero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEntero2)
                    .addComponent(JTFEntero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSumarActionPerformed
        try {
            int nro1 = Integer.parseInt(JTFEntero1.getText());
            int nro2 = Integer.parseInt(JTFEntero2.getText());
            int Resultado = nro1 + nro2;
            JLResulatado.setText(Resultado + "");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Solo debe ingresar numeros enteros");
            JTFEntero1.setText("");
            JTFEntero2.setText("");
        }

    }//GEN-LAST:event_JBSumarActionPerformed

    private void JBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarActionPerformed
        JTFEntero1.setText("");
        JTFEntero2.setText("");
        JLResulatado.setText("Resultado");
    }//GEN-LAST:event_JBLimpiarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiSuma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBLimpiar;
    private javax.swing.JButton JBSumar;
    private javax.swing.JLabel JLEntero1;
    private javax.swing.JLabel JLEntero2;
    private javax.swing.JLabel JLResulatado;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JTextField JTFEntero1;
    private javax.swing.JTextField JTFEntero2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
