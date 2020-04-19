package codigo;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Judith
 */
public class Principal extends javax.swing.JFrame {

    ArrayList<String> listaUsuarios = new ArrayList();
    CardLayout c;
    DefaultTableModel modeloT = new DefaultTableModel();

    private final DefaultListModel modeloL;

    public Principal() {
        initComponents();
        setTitle("Cincronos");
        //Para centrar la ventana.
        setLocationRelativeTo(null);
        c = (CardLayout) panelPrincipal.getLayout();

        entrar.setEnabled(false);
        //Declaramos el modelo de la lista
        modeloL = new DefaultListModel();
        listaU.setModel(modeloL);

        //Declaramos las columnas de la tabla
        modeloT.addColumn("Nombre");
        modeloT.addColumn("Contraseña");
        modeloT.addColumn("Edad");
        modeloT.addColumn("Cuenta");
        tabla.setModel(modeloT);

        //Añado usuarios a la lista
        listaUsuarios.add(" Nombre: Angela Contraseña: Usuario Edad: 19 Cuenta: VIP");
        listaUsuarios.add("\n Nombre: Fernando Contraseña: Usuario Edad: 19 Cuenta: Normal");
        listaUsuarios.add("\n Nombre: Gonzalo Contraseña: Usuario Edad: 20 Cuenta: Normal");
        listaUsuarios.add("\n Nombre: Alessandro Contraseña: Usuario Edad: 19 Cuenta: VIP");

        //Añado usuarios a la tabla 
        Object[] usuario1 = new Object[]{"Angela", "Usuario", 19, "VIP"};
        modeloT.addRow(usuario1);

        Object[] usuario2 = new Object[]{"Fernando", "Usuario", 19, "Normal"};
        modeloT.addRow(usuario2);

        Object[] usuario3 = new Object[]{"Gonzalo", "Usuario", 20, "Normal"};
        modeloT.addRow(usuario3);

        Object[] usuario4 = new Object[]{"Alessandro", "Usuario", 19, "VIP"};
        modeloT.addRow(usuario4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JPanel();
        elegir = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pelip1 = new javax.swing.JPanel();
        cuenta = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        peli1 = new javax.swing.JLabel();
        peli2 = new javax.swing.JLabel();
        peli3 = new javax.swing.JLabel();
        peli4 = new javax.swing.JLabel();
        peli5 = new javax.swing.JLabel();
        peli6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        iniciarSesion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        atras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        contraseñaT = new javax.swing.JLabel();
        nombreT = new javax.swing.JLabel();
        cuentaT = new javax.swing.JLabel();
        edadT = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        crearCuenta = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        edad = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        vip = new javax.swing.JRadioButton();
        normal = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        correcto = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaU = new javax.swing.JList<>();
        atras1 = new javax.swing.JButton();
        FondoEspacio = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(826, 539));
        setMinimumSize(new java.awt.Dimension(826, 539));
        setPreferredSize(new java.awt.Dimension(826, 539));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setOpaque(false);
        panelPrincipal.setLayout(new java.awt.CardLayout());

        elegir.setOpaque(false);
        elegir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Iniciar Sesión");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 204), null));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        elegir.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 180, 60));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Crear Cuenta");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 204), null));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        elegir.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 180, 60));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿No tienes cuenta?");
        elegir.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 180, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Tienes una cuenta?");
        elegir.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 190, -1));

        panelPrincipal.add(elegir, "elegir");
        panelPrincipal.add(pelip1, "pelip1");

        cuenta.setBackground(new java.awt.Color(102, 102, 102));
        cuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        peli1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/peli1.png"))); // NOI18N
        peli1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peli1MouseClicked(evt);
            }
        });
        jPanel1.add(peli1);

        peli2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/peli2.png"))); // NOI18N
        peli2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peli2MouseClicked(evt);
            }
        });
        jPanel1.add(peli2);

        peli3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/peli3.png"))); // NOI18N
        peli3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peli3MouseClicked(evt);
            }
        });
        jPanel1.add(peli3);

        peli4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/peli4.png"))); // NOI18N
        peli4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peli4MouseClicked(evt);
            }
        });
        jPanel1.add(peli4);

        peli5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/peli5.png"))); // NOI18N
        peli5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peli5MouseClicked(evt);
            }
        });
        jPanel1.add(peli5);

        peli6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/peli6.png"))); // NOI18N
        peli6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peli6MouseClicked(evt);
            }
        });
        jPanel1.add(peli6);

        jScrollPane3.setViewportView(jPanel1);

        cuenta.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 780, 330));

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Pulsa en una la pelicula para ver su información o comprar entrada.");
        cuenta.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 420, -1));

        jLabel16.setFont(new java.awt.Font("Dubai Medium", 0, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Cartelera");
        cuenta.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        panelPrincipal.add(cuenta, "cuenta");

        iniciarSesion.setOpaque(false);
        iniciarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cuenta seleccionada:");
        iniciarSesion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        tabla.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Contraseña", "Edad", "Cuenta"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        iniciarSesion.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 470, 90));

        atras.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        iniciarSesion.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Selecciona tu cuenta:");
        iniciarSesion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre:");
        iniciarSesion.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contraseña:");
        iniciarSesion.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Edad:");
        iniciarSesion.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cuenta:");
        iniciarSesion.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 80, -1));

        contraseñaT.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 14)); // NOI18N
        contraseñaT.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSesion.add(contraseñaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 170, 30));

        nombreT.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 14)); // NOI18N
        nombreT.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSesion.add(nombreT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 190, 30));

        cuentaT.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 14)); // NOI18N
        cuentaT.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSesion.add(cuentaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 160, 30));

        edadT.setFont(new java.awt.Font("Microsoft YaHei UI Light", 3, 14)); // NOI18N
        edadT.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSesion.add(edadT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 80, 30));

        entrar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        iniciarSesion.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, -1, -1));

        panelPrincipal.add(iniciarSesion, "iniciarSesion");

        crearCuenta.setOpaque(false);
        crearCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre:");
        crearCuenta.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, 20));

        nombreUsuario.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        crearCuenta.add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 140, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contraseña:");
        crearCuenta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));
        crearCuenta.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 140, 30));

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Edad:");
        crearCuenta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        edad.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        edad.setModel(new javax.swing.SpinnerNumberModel(18, 18, 100, 1));
        crearCuenta.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo de cuenta");
        crearCuenta.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 20));

        sexo.add(vip);
        vip.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        vip.setText("VIP");
        vip.setOpaque(false);
        crearCuenta.add(vip, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        sexo.add(normal);
        normal.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        normal.setSelected(true);
        normal.setText("Normal");
        normal.setOpaque(false);
        crearCuenta.add(normal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        jButton1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        jButton1.setText("Crear Cuenta ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        crearCuenta.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        correcto.setBackground(new java.awt.Color(255, 255, 255));
        correcto.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        correcto.setForeground(new java.awt.Color(0, 204, 0));
        crearCuenta.add(correcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 290, 30));

        error.setBackground(new java.awt.Color(255, 255, 255));
        error.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        error.setForeground(new java.awt.Color(204, 0, 0));
        crearCuenta.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 290, 30));

        jScrollPane1.setToolTipText("");

        listaU.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(listaU);

        crearCuenta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 280, 140));

        atras1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        atras1.setText("Atras");
        atras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atras1ActionPerformed(evt);
            }
        });
        crearCuenta.add(atras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, -1));

        panelPrincipal.add(crearCuenta, "crearCuenta");

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 800, 470));

        FondoEspacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        FondoEspacio.setMaximumSize(new java.awt.Dimension(871, 544));
        FondoEspacio.setMinimumSize(new java.awt.Dimension(871, 544));
        FondoEspacio.setPreferredSize(new java.awt.Dimension(871, 544));
        getContentPane().add(FondoEspacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 830, 640));

        jMenuBar1.setOpaque(false);

        jMenu1.setText("Cincronos");

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        panelPrincipal.add(iniciarSesion, "iniciarSesion");
        c.show(panelPrincipal, "iniciarSesion");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        panelPrincipal.add(crearCuenta, "crearCuenta");
        c.show(panelPrincipal, "crearCuenta");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*Se declara la variable nombre y en ella se
        guarda lo que se escriba en el jtextfield.*/
        String nombre = nombreUsuario.getText();

        /*Se declara la variable contraseña y en ella se
          guarda lo que se escriba en el jpassword.*/
        String contraseñaUsuario = contraseña.getText();

        /*Se declara la variable edad y en ella se
        guarda lo que se seleccione en el spinner,
                por defecto será 18. */
        int edadUsuario = (int) edad.getValue();

        /*Si el campo nombre no esta vacio se procede a la 
        comprobacion de la contraseña y si no esta 
        vacia se procede a guardar el nombre en la lista y en
        la coleccion, ademas de añadirlo a la tabla.*/
        if (!nombre.equals("")) {
            if (listaUsuarios.contains(nombre)) {
                /*si devuelve true, es que lo encuentra*/
                System.out.println("El nombre ya existe");
            } else {

                if (!contraseñaUsuario.equals("")) {
                    error.setText("");
                    nombreUsuario.setText("");
                    contraseña.setText("");
                    modeloL.addElement("Nombre: " + nombre);
                    modeloL.addElement("Contraseña: " + contraseñaUsuario);
                    modeloL.addElement("Edad: " + edadUsuario);
                    /*Este if sirve para que la cuenta sea Normal o VIP*/
                    if (normal.isSelected()) {
                        modeloL.addElement("Tipo de cuenta: normal");
                        //Se añade a la lista
                        listaUsuarios.add("\n Nombre: " + nombre + " Contraseña: "
                                + contraseñaUsuario + " Edad: " + edadUsuario + " Tipo de cuenta: Normal");

                        //Se añade a la tabla
                        Object[] nuevoUsuario = new Object[]{nombre, contraseñaUsuario, edadUsuario, "Normal"};
                        modeloT.addRow(nuevoUsuario);
                        tabla.setModel(modeloT);
                    } else {
                        modeloL.addElement("Tipo de cuenta: VIP");
                        //Se añade a la lista
                        listaUsuarios.add("\n Nombre: " + nombre + " Contraseña: "
                                + contraseñaUsuario + " Edad: " + edadUsuario + " Tipo de cuenta: VIP");

                        //Se añade a la tabla
                        Object[] nuevoUsuario = new Object[]{nombre, contraseñaUsuario, edadUsuario, "VIP"};
                        modeloT.addRow(nuevoUsuario);
                        tabla.setModel(modeloT);
                    }

                    nombreUsuario.setEnabled(false);
                    contraseña.setEnabled(false);
                    edad.setEnabled(false);
                    normal.setEnabled(false);
                    correcto.setText("Cuenta creada correctamente.");

                } else {
                    error.setText("Debe insertar la contraseña");
                }
            }
        } else {
            error.setText("Debe completar los campos.");

        }
        System.out.println(listaUsuarios);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        panelPrincipal.add(iniciarSesion, "iniciarSesion");
        c.show(panelPrincipal, "elegir");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_atrasActionPerformed

    private void atras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atras1ActionPerformed
        panelPrincipal.add(crearCuenta, "crearCuenta");
        c.show(panelPrincipal, "elegir");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
        nombreUsuario.setEnabled(true);
        contraseña.setEnabled(true);
        edad.setEnabled(true);
        normal.setEnabled(true);
        correcto.setText(" ");
        error.setText(" ");
        modeloL.removeAllElements();
    }//GEN-LAST:event_atras1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int seleccionar = tabla.rowAtPoint(evt.getPoint());
        nombreT.setText(String.valueOf(tabla.getValueAt(seleccionar, 0)));
        contraseñaT.setText(String.valueOf(tabla.getValueAt(seleccionar, 1)));
        edadT.setText(String.valueOf(tabla.getValueAt(seleccionar, 2)));
        cuentaT.setText(String.valueOf(tabla.getValueAt(seleccionar, 3)));
        entrar.setEnabled(true);
    }//GEN-LAST:event_tablaMouseClicked

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int comprobarSalida;
        comprobarSalida = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea salir?",
                "¿Desea salir?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (comprobarSalida == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_salirActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        
        panelPrincipal.add(cuenta, "cuenta");
        c.show(panelPrincipal, "cuenta");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();

    }//GEN-LAST:event_entrarActionPerformed

    private void peli6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peli6MouseClicked
        
    }//GEN-LAST:event_peli6MouseClicked

    private void peli5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peli5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_peli5MouseClicked

    private void peli4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peli4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_peli4MouseClicked

    private void peli3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peli3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_peli3MouseClicked

    private void peli2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peli2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_peli2MouseClicked

    private void peli1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peli1MouseClicked
        panelPrincipal.add(pelip1, "pelip1");
        c.show(panelPrincipal, "pelip1");
        SwingUtilities.updateComponentTreeUI(this);
        this.repaint();
    }//GEN-LAST:event_peli1MouseClicked

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoEspacio;
    private javax.swing.JButton atras;
    private javax.swing.JButton atras1;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel contraseñaT;
    private javax.swing.JLabel correcto;
    private javax.swing.JPanel crearCuenta;
    private javax.swing.JPanel cuenta;
    private javax.swing.JLabel cuentaT;
    private javax.swing.JSpinner edad;
    private javax.swing.JLabel edadT;
    private javax.swing.JPanel elegir;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel error;
    private javax.swing.JPanel iniciarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaU;
    private javax.swing.JLabel nombreT;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JRadioButton normal;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel peli1;
    private javax.swing.JLabel peli2;
    private javax.swing.JLabel peli3;
    private javax.swing.JLabel peli4;
    private javax.swing.JLabel peli5;
    private javax.swing.JLabel peli6;
    private javax.swing.JPanel pelip1;
    private javax.swing.JMenuItem salir;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JTable tabla;
    private javax.swing.JRadioButton vip;
    // End of variables declaration//GEN-END:variables
}
