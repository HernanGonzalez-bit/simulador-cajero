
package IGU;

import javax.swing.JOptionPane;
import Sistema.SistemaAtm;



public class ATM extends javax.swing.JFrame {

    //Variables locales 
    boolean opcionDepositar = false;
    boolean opcionRetirar = false ;
    double nuevaCantidad =0;

    String nuevoNumero;
    //--------------------------------------
   
    SistemaAtm atm = new SistemaAtm();
  
    public ATM() {
        initComponents();
        txt_cantidad.setText("");
        txt_nombre.setText("");
        
        panel_opcion.setVisible(false);
        
        btn_depositar.setEnabled(false);
        btn_retirar.setEnabled(false);
        btn_salir.setEnabled(false);
         
        btn_1.setEnabled(false);
        btn_2.setEnabled(false);
        btn_3.setEnabled(false);
        btn_4.setEnabled(false);
        btn_5.setEnabled(false);
        btn_6.setEnabled(false);
        btn_7.setEnabled(false);
        btn_8.setEnabled(false);
        btn_9.setEnabled(false);
        btn_0.setEnabled(false);
        
        btn_aceptar.setEnabled(false);
        btn_borrar.setEnabled(false);
        btn_cancelar.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btn_borrar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_saldo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panel_opcion = new javax.swing.JPanel();
        txt_opcion = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JLabel();
        btn_depositar = new javax.swing.JButton();
        btn_retirar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setForeground(new java.awt.Color(0, 0, 0));

        btn_1.setBackground(new java.awt.Color(204, 204, 204));
        btn_1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_1.setForeground(new java.awt.Color(0, 0, 0));
        btn_1.setText("1");
        btn_1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(204, 204, 204));
        btn_3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_3.setForeground(new java.awt.Color(0, 0, 0));
        btn_3.setText("3");
        btn_3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_4.setBackground(new java.awt.Color(204, 204, 204));
        btn_4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_4.setForeground(new java.awt.Color(0, 0, 0));
        btn_4.setText("4");
        btn_4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_5.setBackground(new java.awt.Color(204, 204, 204));
        btn_5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_5.setForeground(new java.awt.Color(0, 0, 0));
        btn_5.setText("5");
        btn_5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_6.setBackground(new java.awt.Color(204, 204, 204));
        btn_6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_6.setForeground(new java.awt.Color(0, 0, 0));
        btn_6.setText("6");
        btn_6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_7.setBackground(new java.awt.Color(204, 204, 204));
        btn_7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_7.setForeground(new java.awt.Color(0, 0, 0));
        btn_7.setText("7");
        btn_7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setBackground(new java.awt.Color(204, 204, 204));
        btn_8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_8.setForeground(new java.awt.Color(0, 0, 0));
        btn_8.setText("8");
        btn_8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_0.setBackground(new java.awt.Color(204, 204, 204));
        btn_0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_0.setForeground(new java.awt.Color(0, 0, 0));
        btn_0.setText("0");
        btn_0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_9.setBackground(new java.awt.Color(204, 204, 204));
        btn_9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_9.setForeground(new java.awt.Color(0, 0, 0));
        btn_9.setText("9");
        btn_9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_2.setBackground(new java.awt.Color(204, 204, 204));
        btn_2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_2.setForeground(new java.awt.Color(0, 0, 0));
        btn_2.setText("2");
        btn_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_borrar.setBackground(new java.awt.Color(255, 255, 0));
        btn_borrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_borrar.setText("Borrar");
        btn_borrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_aceptar.setBackground(new java.awt.Color(0, 204, 51));
        btn_aceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_aceptar.setForeground(new java.awt.Color(0, 0, 0));
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(255, 51, 51));
        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btn_ingresar.setBackground(new java.awt.Color(0, 255, 204));
        btn_ingresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_ingresar.setText("Ingresar");
        btn_ingresar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel6.setBackground(new java.awt.Color(102, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario :");

        txt_nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Saldo :  $");

        txt_saldo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_saldo.setForeground(new java.awt.Color(0, 0, 0));
        txt_saldo.setText("0.00");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Depositar");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Retirar");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Salir");

        panel_opcion.setBackground(new java.awt.Color(51, 255, 153));
        panel_opcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0), 2));

        txt_opcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_opcion.setForeground(new java.awt.Color(0, 0, 0));
        txt_opcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_opcion.setText("Opcion ");

        txt_cantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_cantidad.setForeground(new java.awt.Color(0, 0, 0));
        txt_cantidad.setText("Cantidad :");
        txt_cantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0)));

        javax.swing.GroupLayout panel_opcionLayout = new javax.swing.GroupLayout(panel_opcion);
        panel_opcion.setLayout(panel_opcionLayout);
        panel_opcionLayout.setHorizontalGroup(
            panel_opcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_opcionLayout.createSequentialGroup()
                .addComponent(txt_opcion, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addComponent(txt_cantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_opcionLayout.setVerticalGroup(
            panel_opcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_opcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_opcion)
                .addGap(18, 18, 18)
                .addComponent(txt_cantidad)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(panel_opcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(29, 29, 29))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(504, 504, 504)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_saldo))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7))
                    .addComponent(panel_opcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_depositar.setBackground(new java.awt.Color(0, 0, 0));
        btn_depositar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn_depositar.setForeground(new java.awt.Color(255, 255, 255));
        btn_depositar.setText("<");
        btn_depositar.setBorder(null);
        btn_depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_depositarActionPerformed(evt);
            }
        });

        btn_retirar.setBackground(new java.awt.Color(0, 0, 0));
        btn_retirar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn_retirar.setForeground(new java.awt.Color(255, 255, 255));
        btn_retirar.setText("<");
        btn_retirar.setBorder(null);
        btn_retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retirarActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(0, 0, 0));
        btn_salir.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("<");
        btn_salir.setBorder(null);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btn_retirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_depositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_depositar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btn_retirar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton 0
    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
      if (txt_cantidad.getText().equals(" ")) {
           txt_cantidad.setText( " ");
           nuevoNumero = txt_cantidad.getText() + "0";
           txt_cantidad.setText(nuevoNumero);
           
       } else {
           nuevoNumero = txt_cantidad.getText()+ "0";
           txt_cantidad.setText(nuevoNumero);
           
       }
    }//GEN-LAST:event_btn_0ActionPerformed

    
    //Boton Cancelar 
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        txt_cantidad.setText("");
    }//GEN-LAST:event_btn_cancelarActionPerformed


    
    //Boton de ingresar
    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
       
        
        txt_nombre.setText(JOptionPane.showInputDialog("Ingrese su nombre."));
        
        if  (txt_nombre.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "No puede ingresar sin su usuario");
        }
        else { 
         btn_ingresar.setEnabled(true);
        btn_depositar.setEnabled(true);
        btn_retirar.setEnabled(true);
        btn_salir.setEnabled(true);
        }
        txt_saldo.setText("2000");
       
    }//GEN-LAST:event_btn_ingresarActionPerformed

    //Boton Depositar
    private void btn_depositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_depositarActionPerformed
        opcionDepositar= true;
        
        btn_retirar.setEnabled(false);
        btn_depositar.setEnabled(false);
         panel_opcion.setVisible(true);
         
        txt_opcion.setText("[Deposito] - Ingrese una cantidad -");
        
        btn_1.setEnabled(true);
        btn_2.setEnabled(true);
        btn_3.setEnabled(true);
        btn_4.setEnabled(true);
        btn_5 .setEnabled(true);
        btn_6.setEnabled(true);
        btn_7.setEnabled(true);
        btn_8.setEnabled(true);
        btn_9.setEnabled(true);
        btn_0.setEnabled(true);
        
        btn_cancelar.setEnabled(true);
        btn_borrar.setEnabled(true);
        btn_aceptar.setEnabled(true);
    }//GEN-LAST:event_btn_depositarActionPerformed

    //Boton de Retirar
    private void btn_retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retirarActionPerformed
        opcionRetirar=true;
        
            btn_retirar.setEnabled(false);
            btn_depositar.setEnabled(false);
            panel_opcion.setVisible(true);
         
            txt_opcion.setText("[Retiro] - Ingrese una cantidad -");
        
            btn_1.setEnabled(true);
            btn_2.setEnabled(true);
            btn_3.setEnabled(true);
            btn_4.setEnabled(true);
            btn_5  .setEnabled(true);
            btn_6.setEnabled(true);
            btn_7.setEnabled(true);
            btn_8.setEnabled(true);
            btn_9.setEnabled(true);
            btn_0.setEnabled(true);
        
            btn_cancelar.setEnabled(true);
            btn_borrar.setEnabled(true);
            btn_aceptar.setEnabled(true);
    }//GEN-LAST:event_btn_retirarActionPerformed

 //boton salir
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        if (opcionDepositar ==true || opcionRetirar==true ) {
            
            opcionDepositar= false ; 
            opcionRetirar= false ;
            
            panel_opcion.setVisible(false);
            btn_retirar.setEnabled(true);
            btn_depositar.setEnabled(true);
            
            btn_1.setEnabled(false);
            btn_2.setEnabled(false);
            btn_3.setEnabled(false);
            btn_4.setEnabled(false);
            btn_5.setEnabled(false);
            btn_6.setEnabled(false);
            btn_7.setEnabled(false);
            btn_8.setEnabled(false);
            btn_9.setEnabled(false);
            btn_0.setEnabled(false);
        
            btn_aceptar.setEnabled(false);
            btn_borrar.setEnabled(false);
            btn_cancelar.setEnabled(false);
            
            txt_cantidad.setText(" ");
           
        }
        else { 
            
            JOptionPane.showMessageDialog(null,"Su saldo :\n $" + SistemaAtm.saldoActual  );
            atm.mostarDepositos(nuevaCantidad);
            atm.mostrarRetiros(nuevaCantidad);
            
            System.exit(0);
        
    }//GEN-LAST:event_btn_salirActionPerformed
    }
       
    
//Boton 1 
    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
       if (txt_cantidad.getText().equals(" ")) {
           txt_cantidad.setText( " ");
           nuevoNumero = txt_cantidad.getText() + "1";
           txt_cantidad.setText(nuevoNumero);
           
       } else {
           nuevoNumero = txt_cantidad.getText()+ "1";
           txt_cantidad.setText(nuevoNumero);
           
       }
    }//GEN-LAST:event_btn_1ActionPerformed
  

//Boton 2 
    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
         if (txt_cantidad.getText().equals(" ")) {
           txt_cantidad.setText( " ");
           nuevoNumero = txt_cantidad.getText() + "2";
           txt_cantidad.setText(nuevoNumero);
           
       } else {
           nuevoNumero = txt_cantidad.getText()+ "2";
           txt_cantidad.setText(nuevoNumero);
           
       }
    }//GEN-LAST:event_btn_2ActionPerformed
 
    
//Boton 3
    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
         if (txt_cantidad.getText().equals(" ")) {
           txt_cantidad.setText( " ");
           nuevoNumero = txt_cantidad.getText() + "3";
           txt_cantidad.setText(nuevoNumero);
           
       } else {
           nuevoNumero = txt_cantidad.getText()+ "3";
           txt_cantidad.setText(nuevoNumero);
           
       }
    }//GEN-LAST:event_btn_3ActionPerformed
  

//Boton 4
    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        if (txt_cantidad.getText().equals(" ")) {
           txt_cantidad.setText( " ");
           nuevoNumero = txt_cantidad.getText() + "4";
           txt_cantidad.setText(nuevoNumero);
           
       } else {
           nuevoNumero = txt_cantidad.getText()+ "4";
           txt_cantidad.setText(nuevoNumero);
           
       }
    }//GEN-LAST:event_btn_4ActionPerformed
  

//Boton 5
    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
         if (txt_cantidad.getText().equals(" ")) {
           txt_cantidad.setText( " ");
           nuevoNumero = txt_cantidad.getText() + "5";
           txt_cantidad.setText(nuevoNumero);
           
       } else {
           nuevoNumero = txt_cantidad.getText()+ "5";
           txt_cantidad.setText(nuevoNumero);
           
       }
    }//GEN-LAST:event_btn_5ActionPerformed

    
      //Boton 6
    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        if (txt_cantidad.getText().equals(" ")) {
           txt_cantidad.setText( " ");
           nuevoNumero = txt_cantidad.getText() + "6";
           txt_cantidad.setText(nuevoNumero);
           
       } else {
           nuevoNumero = txt_cantidad.getText()+ "6";
           txt_cantidad.setText(nuevoNumero);
           
       }
    }//GEN-LAST:event_btn_6ActionPerformed

    
      //Boton 7
    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
         if (txt_cantidad.getText().equals(" ")) {
           txt_cantidad.setText( " ");
           nuevoNumero = txt_cantidad.getText() + "7";
           txt_cantidad.setText(nuevoNumero);
           
       } else {
           nuevoNumero = txt_cantidad.getText()+ "7";
           txt_cantidad.setText(nuevoNumero);
           
       }
    }//GEN-LAST:event_btn_7ActionPerformed

    
      //Boton 8
    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
         if (txt_cantidad.getText().equals(" ")) {
           txt_cantidad.setText( " ");
           nuevoNumero = txt_cantidad.getText() + "8";
           txt_cantidad.setText(nuevoNumero);
           
       } else {
           nuevoNumero = txt_cantidad.getText()+ "8";
           txt_cantidad.setText(nuevoNumero);
           
       }
    }//GEN-LAST:event_btn_8ActionPerformed

    
      //Boton 9
    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
         if (txt_cantidad.getText().equals(" ")) {
           txt_cantidad.setText( " ");
           nuevoNumero = txt_cantidad.getText() + "9";
           txt_cantidad.setText(nuevoNumero);
           
       } else {
           nuevoNumero = txt_cantidad.getText()+ "9";
           txt_cantidad.setText(nuevoNumero);
           
       }
    }//GEN-LAST:event_btn_9ActionPerformed

             //Boton Borrar
    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
       txt_cantidad.setText(txt_cantidad.getText().substring(0,txt_cantidad.getText().length()-1));
       
       if(txt_cantidad.getText().equals(" ")) {
           
           txt_cantidad.setText(" ");
       }
    }//GEN-LAST:event_btn_borrarActionPerformed

    
        //Boton Aceptar
    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        if (txt_cantidad.getText().equals("")) {
            opcionDepositar= false;
            opcionRetirar  = false;
            
            panel_opcion.setVisible(true);
            btn_depositar.setEnabled(true);
            btn_retirar.setEnabled(true);
            txt_cantidad.setText("");
            
            
             btn_1.setEnabled(false);
            btn_2.setEnabled(false);
            btn_3.setEnabled(false);
            btn_4.setEnabled(false);
            btn_5.setEnabled(false);
            btn_6.setEnabled(false);
            btn_7.setEnabled(false);
            btn_8.setEnabled(false);
            btn_9.setEnabled(false);
            btn_0.setEnabled(false);
        
            btn_aceptar.setEnabled(false);
            btn_borrar.setEnabled(false);
            btn_cancelar.setEnabled(false);
            
            
        }else if (opcionDepositar==true) {
            
            opcionDepositar=false;
            
            nuevaCantidad = Double.parseDouble(String.valueOf(txt_cantidad.getText()));
            atm.depositar(nuevaCantidad);
            
            
            txt_saldo.setText(String.valueOf(atm.obtenerSaldo()));
            panel_opcion.setVisible(false);
            txt_cantidad.setText(" ");
            btn_depositar.setEnabled(true);
            btn_retirar.setEnabled(true);
            
             btn_1.setEnabled(false);
            btn_2.setEnabled(false);
            btn_3.setEnabled(false);
            btn_4.setEnabled(false);
            btn_5.setEnabled(false);
            btn_6.setEnabled(false);
            btn_7.setEnabled(false);
            btn_8.setEnabled(false);
            btn_9.setEnabled(false);
            btn_0.setEnabled(false);
        
            btn_aceptar.setEnabled(false);
            btn_borrar.setEnabled(false);
            btn_cancelar.setEnabled(false);
               
            
        }
        else if (opcionRetirar==true ) {
            opcionDepositar=false;
            
            nuevaCantidad= Double.parseDouble(String.valueOf(txt_cantidad.getText()));
            atm.retirar(nuevaCantidad);
            
            txt_saldo.setText(String.valueOf(atm.obtenerSaldo()));
            
             panel_opcion.setVisible(false);
            txt_cantidad.setText(" ");
            btn_depositar.setEnabled(true);
            btn_retirar.setEnabled(true);
            
             btn_1.setEnabled(false);
            btn_2.setEnabled(false);
            btn_3.setEnabled(false);
            btn_4.setEnabled(false);
            btn_5.setEnabled(false);
            btn_6.setEnabled(false);
            btn_7.setEnabled(false);
            btn_8.setEnabled(false);
            btn_9.setEnabled(false);
            btn_0.setEnabled(false);
        
            btn_aceptar.setEnabled(false);
            btn_borrar.setEnabled(false);
            btn_cancelar.setEnabled(false);
               
                    
            
            
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed
  
    
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
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_depositar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_retirar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel panel_opcion;
    private javax.swing.JLabel txt_cantidad;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_opcion;
    private javax.swing.JLabel txt_saldo;
    // End of variables declaration//GEN-END:variables
}
