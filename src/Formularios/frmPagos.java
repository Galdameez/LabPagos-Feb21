package Formularios;

import javax.swing.table.DefaultTableModel;
import Entidades.Cliente;
import java.util.ArrayList;

public class frmPagos extends javax.swing.JFrame {
    //Iniciar Cosas
    private double montoIngresado = 0;
    DefaultTableModel modelT;
    Cliente cliente;
    ArrayList <Cliente> lClientes = new ArrayList<>();
    
    public frmPagos() {
        initComponents();
        this.IniciarFrame();
        this.agregarList();
          actualizarTxt();
    }
    
    private void IniciarFrame(){
        setEnabled(true);
        setVisible(true);
        setTitle("Pagos");
    }
    
    private void agregarList(){
        this.cliente = new Cliente("0", 200);
        this.lClientes.add(cliente);
         this.cliente = new Cliente("1", 200);
         this.lClientes.add(cliente);
         this.cliente = new Cliente("2", 200);
         this.lClientes.add(cliente);
    }
    
    private void actualizarTxt(){
        this.txtMonto.setText("$ " + String.valueOf(this.lClientes.get(this.cboClientes.getSelectedIndex()).getMonto()));
    }
    
     private void actualizarMontoT(){
        this.txtMontoT.setText("$ " + String.valueOf(this.montoIngresado));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboClientes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        spnFecha = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        spnMonto = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnInsertarPago = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtMontoT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPagos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel1.setText("Cliente");

        cboClientes.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        cboClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alberto Galdámez", "René Salazar", "Mario Martinez" }));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel2.setText("Fecha");

        spnFecha.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnFecha.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(), new java.util.Date(1924992360000L), java.util.Calendar.DAY_OF_MONTH));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel3.setText("Monto $");

        spnMonto.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        spnMonto.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel4.setText("Monto Inicial");

        txtMonto.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        txtMonto.setText("$");
        txtMonto.setEnabled(false);

        btnInsertarPago.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnInsertarPago.setText("Insertar Pago");
        btnInsertarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarPagoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel5.setText("Monto Total");

        txtMontoT.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        txtMontoT.setText("$");
        txtMontoT.setEnabled(false);

        javax.swing.GroupLayout jpIngresoLayout = new javax.swing.GroupLayout(jpIngreso);
        jpIngreso.setLayout(jpIngresoLayout);
        jpIngresoLayout.setHorizontalGroup(
            jpIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngresoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jpIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIngresoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMontoT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnInsertarPago)
                    .addGroup(jpIngresoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jpIngresoLayout.setVerticalGroup(
            jpIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIngresoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtMontoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertarPago))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jtPagos.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jtPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Fecha", "Monto Inicial", "Actual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtPagos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(656, 546));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarPagoActionPerformed
        this.agregarArrow();
    }//GEN-LAST:event_btnInsertarPagoActionPerformed
    
    private void agregarArrow(){
        this.lClientes.get(this.cboClientes.getSelectedIndex()).restarSaldo((double) this.spnMonto.getValue());
        this.montoIngresado += (double) this.spnMonto.getValue();
        this.modelT = (DefaultTableModel) this.jtPagos.getModel();
        String pago [] = {this.cboClientes.getSelectedItem().toString(), this.spnFecha.getValue().toString(),
            String.valueOf(this.lClientes.get(this.cboClientes.getSelectedIndex()).getMonto() + (double) this.spnMonto.getValue()),
           String.valueOf( this.lClientes.get(this.cboClientes.getSelectedIndex()).getMonto())};
        this.modelT.addRow(pago);
        this.actualizarMontoT();
        actualizarTxt();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertarPago;
    private javax.swing.JComboBox<String> cboClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpIngreso;
    private javax.swing.JTable jtPagos;
    private javax.swing.JSpinner spnFecha;
    private javax.swing.JSpinner spnMonto;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtMontoT;
    // End of variables declaration//GEN-END:variables

}
