package neurona;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * @author Foxcal
 */
public class neurona extends javax.swing.JFrame {
int[][] tabla = {{1, 1, 1}, {1, -1, 1}, {-1, 1, 1}, {-1, -1, -1}};
        double w1 = 0;//valores proximos a 0
        double w2 = 0;
        double θ = 0;
        double y = 0;
        int y2;
        double E = 0;//Factor de aprendizaje  
    /**
     * Creates new form neurona
     */
    public neurona() {
        initComponents();
        btnprueba.setEnabled(false);
        btnnuevo.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtx1 = new javax.swing.JTextField();
        txtx2 = new javax.swing.JTextField();
        txtQ = new javax.swing.JTextField();
        txte = new javax.swing.JTextField();
        txty = new javax.swing.JTextField();
        btniniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnprueba = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("X1");

        jLabel2.setText("X2");

        jLabel3.setText("θ");

        jLabel4.setText("Y");

        jLabel5.setText("E");

        txtx1.setNextFocusableComponent(txtx2);

        txtx2.setNextFocusableComponent(txtQ);

        txtQ.setNextFocusableComponent(txte);

        txte.setNextFocusableComponent(btniniciar);

        btniniciar.setText("Iniciar Aprendizaje");
        btniniciar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });
        btniniciar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btniniciarKeyPressed(evt);
            }
        });

        Area.setColumns(20);
        Area.setRows(5);
        jScrollPane1.setViewportView(Area);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neurona/neurona.jpg"))); // NOI18N

        btnprueba.setText("Iniciar Prueba");
        btnprueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpruebaActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtx2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtx1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(txty, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btniniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnprueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btniniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnprueba, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btniniciarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btniniciarKeyPressed
          int a = (txtx1.getText().length() == θ) ? 0 : 1;
          int b = (txtx2.getText().length() == θ) ? 0 : 1;
          int c = (txtQ.getText().length() == θ) ? 0 : 1;
          int d = (txte.getText().length() == θ) ? 0 : 1;
          
        if((a==1) && (b==1) && (c==1) && (d==1) ){
            if(Double.parseDouble(txtQ.getText())<=1  ){
            btniniciar.setEnabled(false);
          btnprueba.setEnabled(true); 
            proceso();}
            else{
                txtQ.setText("");
                JOptionPane.showMessageDialog(null, "Error en dato θ");}
            
        }else
        {JOptionPane.showMessageDialog(null, "Datos Vacios");}

    }//GEN-LAST:event_btniniciarKeyPressed

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
          int a = (txtx1.getText().length() == θ) ? 0 : 1;
          int b = (txtx2.getText().length() == θ) ? 0 : 1;
          int c = (txtQ.getText().length() == θ) ? 0 : 1;
          int d = (txte.getText().length() == θ) ? 0 : 1;
          
        if((a==1) && (b==1) && (c==1) && (d==1) ){
            if(Double.parseDouble(txtQ.getText())<=1  ){
            btniniciar.setEnabled(false);
          btnprueba.setEnabled(true); 
            proceso();}
            else{
                txtQ.setText("");
                JOptionPane.showMessageDialog(null, "Error en dato θ");}
            
        }else
        {JOptionPane.showMessageDialog(null, "Datos Vacios");}
    }//GEN-LAST:event_btniniciarActionPerformed

    private void btnpruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpruebaActionPerformed
       btnprueba.setEnabled(false);
       btnnuevo.setEnabled(true);
prueba();
    }//GEN-LAST:event_btnpruebaActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
       btniniciar.setEnabled(true);
       btnprueba.setEnabled(false);
       btnnuevo.setEnabled(false);
       txtx1.setText("");
       txtx2.setText("");
       txte.setText("");
       txtQ.setText("");
       txty.setText("");
       Area.setText("");
       txtx1.setBackground(Color.white);
       txtx2.setBackground(Color.white);
       txtQ.setBackground(Color.white);
    }//GEN-LAST:event_btnnuevoActionPerformed

    public void prueba(){
    double dato1=0;
    double dato2=0;
    
    dato1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese Valor 1"));
    dato2= Double.parseDouble(JOptionPane.showInputDialog("Ingrese Valor 2 "));
            y = Math.tanh((dato1 * w1) + (dato2 * w2) + (-1 * θ));
            y = (y >= θ) ? 1 : -1;
            txty.setText(String.format("%.1f", y));
            
    }
    
    public void proceso(){
      w1=Double.parseDouble(txtx1.getText());
        w2=Double.parseDouble(txtx2.getText());
        θ=Double.parseDouble(txtQ.getText());
        E=Double.parseDouble(txte.getText());
        
        Area.append("Entrada: ");
        Area.append(System.getProperty("line.separator"));
        Area.append("w1 = " + String.format("%.1f", w1));
                Area.append(System.getProperty("line.separator"));
        Area.append("w2 = " + String.format("%.1f", w2));
                Area.append(System.getProperty("line.separator"));
        Area.append("θ = " + String.format("%.1f", θ));
        Area.append(System.getProperty("line.separator"));
        Area.append(System.getProperty("line.separator"));
        
        int cont = 1;
        int i=0;
             Area.append("Aplicacion formula de propagacion");
              Area.append(System.getProperty("line.separator"));
        
        while (i<4){
            y = Math.tanh((tabla[i][0] * w1) + (tabla[i][1] * w2) + (-1 * θ));
            y2 = (y >= θ) ? 1 : -1;
            y = (y >= θ) ? 1 : -1;
         

         Area.append("y = ( "+tabla[i][0] + " * " + String.format("%.1f", w1) + " ) + ( "+ tabla[i][1]+" * "+ String.format("%.1f", w2) +" ) + ( -1 * " + String.format("%.1f", θ) +" ) =  " + String.format("%.1f", y) + " >= " + String.format("%.1f", θ) + " ---> y = " + y2   );
         Area.append(System.getProperty("line.separator"));
         
         if(y==tabla[i][2]){
         i++;
         }else{
             Area.append(System.getProperty("line.separator"));
             Area.append("El valor esperado es diferente. Reajustando peso de fila " +  (i+1)  + "....");
             Area.append(System.getProperty("line.separator"));
             
             double pa = w1 + 2 * E * tabla[i][2] * tabla[i][0];
             Area.append("w1 = " + String.format("%.1f", w1)  + " + (2 * " + E + " * "+ tabla[i][2]+" * " + tabla[i][0]+" ) = " + String.format("%.1f", pa));
             Area.append(System.getProperty("line.separator"));
             w1 = w1 + 2 * E * tabla[i][2] * tabla[i][0];
             
             double pb = w2 + 2 * E * tabla[i][2] * tabla[i][1];
             Area.append("w2 = " + String.format("%.1f", w2) + " + (2 * " + E + " * "+tabla[i][2]+" * " + tabla[i][1]+" ) = " + String.format("%.1f", pb));
             Area.append(System.getProperty("line.separator"));
             w2 = w2 + 2 * E * tabla[i][2] * tabla[i][1];
             
             double pc = θ + 2 * E * tabla[i][2] * (-1);
             Area.append("θ = " + String.format("%.1f", θ) + " + (2 * " + E + " * "+tabla[i][2]+" * -1 ) = " + String.format("%.1f", pc));
             Area.append(System.getProperty("line.separator"));
             θ = θ + 2 * E * tabla[i][2] * (-1);
             Area.append("_______________________________");
             Area.append(System.getProperty("line.separator"));
             
             Area.append("Aplicacion formula de propagacion");
             Area.append(System.getProperty("line.separator"));

            i=0;
         }
        }
        Area.append(System.getProperty("line.separator"));
        Area.append("Fase de aprendizaje terminado con exito ");
        Area.append(System.getProperty("line.separator"));
        Area.append("Resultado: ");
        Area.append(System.getProperty("line.separator"));
        Area.append("w1 = " + String.format("%.1f", w1));
        txtx1.setText(String.format("%.1f", w1));
        txtx1.setBackground(Color.green);
        Area.append(System.getProperty("line.separator"));
        Area.append("w2 = " + String.format("%.1f", w2));
        txtx2.setText(String.format("%.1f", w2));
        txtx2.setBackground(Color.green);
        Area.append(System.getProperty("line.separator"));
        Area.append("θ = " + String.format("%.1f", θ));
        txtQ.setText(String.format("%.1f", θ));
        txtQ.setBackground(Color.green);
        JOptionPane.showMessageDialog(null, "Fase de aprendizaje terminado con exito");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new neurona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area;
    private javax.swing.JButton btniniciar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnprueba;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtQ;
    private javax.swing.JTextField txte;
    private javax.swing.JTextField txtx1;
    private javax.swing.JTextField txtx2;
    private javax.swing.JTextField txty;
    // End of variables declaration//GEN-END:variables
}
