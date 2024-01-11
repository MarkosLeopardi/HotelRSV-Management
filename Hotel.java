import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Hotel extends javax.swing.JFrame {
    
        static String     driverClassName = "org.postgresql.Driver" ;
        static String     url = "jdbc:postgresql://dblabs.iee.ihu.gr:5432/it185158" ;
        static Connection dbConnection = null;
        static String     username = "it185158";
        static String     passwd = "tecvasded123!";
        static Statement statement = null;   
   
    public Hotel() {
       
        initComponents();
        results.setRowSelectionAllowed(true);            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        epitheto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IDno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        onoma = new javax.swing.JTextField();
        single = new javax.swing.JRadioButton();
        dual = new javax.swing.JRadioButton();
        threefold = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        checkin = new javax.swing.JTextField();
        checkout = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        searchtype = new javax.swing.JComboBox<>();
        CheckOut = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        searchfield = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        results = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mono = new javax.swing.JRadioButton();
        diplo = new javax.swing.JRadioButton();
        triplo = new javax.swing.JRadioButton();
        name = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        kinito = new javax.swing.JTextField();
        gid = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tsekin = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tsekaout = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        log = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        logtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 18, 72, 29));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Last Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 32));
        jPanel1.add(epitheto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Room Type:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 66, 123, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("ID No.:");
        jLabel4.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(80, 25));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 80, 33));
        jPanel1.add(IDno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 250, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Mobile:");
        jLabel5.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel5.setMinimumSize(new java.awt.Dimension(80, 25));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, 33));
        jPanel1.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 250, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Check Out Date:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        create.setBackground(new java.awt.Color(204, 204, 204));
        create.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        jPanel1.add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 90, 30));
        jPanel1.add(onoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 250, 40));

        single.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(single);
        single.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        single.setText("Single");
        jPanel1.add(single, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 130, 30));

        dual.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(dual);
        dual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dual.setText("Double");
        jPanel1.add(dual, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 110, 30));

        threefold.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(threefold);
        threefold.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        threefold.setText("Threefold");
        jPanel1.add(threefold, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 110, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Check In Date:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        checkin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                checkinFocusGained(evt);
            }
        });
        jPanel1.add(checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 290, 40));

        checkout.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                checkoutFocusGained(evt);
            }
        });
        jPanel1.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 290, 40));

        jTabbedPane1.addTab("Check IN", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchtype.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guest ID:", "Room ID.", "Date: (YYYY-MM-DD)" }));
        jPanel2.add(searchtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 40));

        CheckOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CheckOut.setText("Check Out");
        CheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutActionPerformed(evt);
            }
        });
        jPanel2.add(CheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 174, 40));

        SearchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 110, 40));
        jPanel2.add(searchfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 320, 40));

        cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 160, 40));

        results.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        results.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(results);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 680, 270));

        jTabbedPane1.addTab("Reservations", jPanel2);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Name:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 32, 86, 33));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Last Name:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 84, 86, 34));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Mobile No.:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 137, 86, 33));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("ID No.:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 189, 86, 33));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Room No.:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 86, 33));

        mono.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(mono);
        mono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mono.setText("Single");
        jPanel4.add(mono, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 78, 33));

        diplo.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(diplo);
        diplo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        diplo.setText("Double");
        jPanel4.add(diplo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, 33));

        triplo.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(triplo);
        triplo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        triplo.setText("Threefold");
        jPanel4.add(triplo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, 33));
        jPanel4.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 33, 216, 33));
        jPanel4.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 86, 216, 33));
        jPanel4.add(kinito, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 138, 216, 33));
        jPanel4.add(gid, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 190, 216, 33));

        Update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel4.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 121, 34));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Check In Date:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 241, 107, 35));
        jPanel4.add(tsekin, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 242, 216, 35));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Check Out Date:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 295, -1, 36));
        jPanel4.add(tsekaout, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 296, 216, 36));

        jTabbedPane1.addTab("Update", jPanel4);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        log.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        log.setText("Show Log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        jPanel3.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 6, 109, 33));

        logtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operation", "Timestamp", "User ID", "Reservation ID", "Room No.", "Guest ID", "Check In", "Check Out"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(logtable);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 677, 414));

        jTabbedPane1.addTab("Log", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

        int id_user = Integer.parseInt(gid.getText());
        String u_name = name.getText();
        String  u_lastname = lastname.getText();
        String kinitoNo = kinito.getText();
        String comein = (String) tsekin.getText();
        String leaves = (String) tsekaout.getText();
        int roomtype;

        if(mono.isSelected()){
            roomtype = 1;
        }else if(diplo.isSelected()){
            roomtype = 2;
        }else{
            roomtype = 3;
        }

        try{
            Class.forName (driverClassName);
            dbConnection = (Connection) DriverManager.getConnection (url, username, passwd);
            statement = dbConnection.createStatement();
            statement.executeQuery("select updatereservation(" + id_user+ ", '" + u_name + "', '" + u_lastname + "', '" + kinitoNo + "', " + roomtype + ", '" + comein + "', '" + leaves + "')");
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    //Cancel------>Delete/Cancel reservation
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        int value = results.getSelectedRow();
        Object cell = results.getValueAt(value, 0);
        int res = Integer.parseInt(cell.toString());

        try {
            Class.forName (driverClassName);
            dbConnection = DriverManager.getConnection (url, username, passwd);
            statement = dbConnection.createStatement();
            statement.executeQuery("SELECT reservationcanceled(" + res + ")");
            System.out.println("Reservation Canceled Successfully");
            DefaultTableModel model = (DefaultTableModel) results.getModel();
            model.removeRow(value);
            statement.close();
            dbConnection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelActionPerformed

    //Search based on text field
    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        String type = (String) searchtype.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) results.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new String[]{"idreservation", "room_id", "guest_id", "since_when", "check_out"});

        try {
            Class.forName (driverClassName);
            dbConnection = DriverManager.getConnection (url, username, passwd);
            statement = dbConnection.createStatement();

            //Search by Guest ID
            if(type.equals("Guest ID:")){
                int guestid = Integer.parseInt(searchfield.getText());
                ResultSet rs = statement.executeQuery("select searchid(" + guestid + ")");
                while (rs.next()) {
                    String resultSetString = rs.getString("searchid");
                    String[] values = resultSetString.replaceAll("[()]", "").split(",");
                    if (values.length >= 5) {
                        String idreservation = values[0].trim();
                        String room_id = values[1].trim();
                        String guest_id = values[2].trim();
                        String since_when = values[3].trim();
                        String check_out = values[4].trim();
                        model.addRow(new Object[]{idreservation, room_id, guest_id, since_when, check_out});
                    }
                }
            }

            //Search By Date
            else if(type.equals("Date: (YYYY-MM-DD)")){
                ResultSet rs = statement.executeQuery("select searchdate('" + searchfield.getText() + "')");
                while (rs.next()) {
                    String resultSetString = rs.getString("searchdate");
                    String[] values = resultSetString.replaceAll("[()]", "").split(",");
                    if (values.length >= 5) {
                        String idreservation = values[0].trim();
                        String room_id = values[1].trim();
                        String guest_id = values[2].trim();
                        String since_when = values[3].trim();
                        String check_out = values[4].trim();
                        model.addRow(new Object[]{idreservation, room_id, guest_id, since_when, check_out});
                    }
                }
            }

            //Search By Room ID
            else{

                int room = Integer.parseInt(searchfield.getText());
                ResultSet rs = statement.executeQuery("select searchroom(" + room + ")");
                while (rs.next()) {
                    String resultSetString = rs.getString("searchroom");
                    String[] values = resultSetString.replaceAll("[()]", "").split(",");
                    if (values.length >= 5) {
                        String idreservation = values[0].trim();
                        String room_id = values[1].trim();
                        String guest_id = values[2].trim();
                        String since_when = values[3].trim();
                        String check_out = values[4].trim();
                        model.addRow(new Object[]{idreservation, room_id, guest_id, since_when, check_out});
                    }
                }
            }
            statement.close();
            dbConnection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    //Check Out------>Complete reservation
    private void CheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutActionPerformed

        int value = results.getSelectedRow();
        Object cell = results.getValueAt(value, 0);
        int res = Integer.parseInt(cell.toString());

        try {
            Class.forName (driverClassName);
            dbConnection = DriverManager.getConnection (url, username, passwd);
            statement = dbConnection.createStatement();
            statement.executeQuery("select pastreservation("+ res +")");
            System.out.println("Reservation Completed Successfully");
            DefaultTableModel model = (DefaultTableModel) results.getModel();
            model.removeRow(value);
            statement.close();
            dbConnection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CheckOutActionPerformed

    //JCalendars
    private void checkoutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_checkoutFocusGained
        DateSelectionHandler.addDateSelectionFunctionality(checkout);
    }//GEN-LAST:event_checkoutFocusGained

    private void checkinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_checkinFocusGained
        DateSelectionHandler.addDateSelectionFunctionality(checkin);
    }//GEN-LAST:event_checkinFocusGained

   //Check In------>Insert reservation/user
    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed

        try {
            int id_user = Integer.parseInt(IDno.getText());
            String u_name = onoma.getText();
            String  u_lastname = epitheto.getText();
            String kinitoNo = mobile.getText();
            String comein = (String) checkin.getText();
            String leaves = (String) checkout.getText();
            int room_type;

            if(single.isSelected()){
                room_type = 1;
            }else if(dual.isSelected()){
                room_type = 2;
            }else{
                room_type = 3;
            }

            Class.forName (driverClassName);
            dbConnection = DriverManager.getConnection (url, username, passwd);
            statement = dbConnection.createStatement();
            statement.executeQuery("select createreservation('" + u_name + "', '" + u_lastname + "', " + id_user + ", '" + kinitoNo + "', " + room_type + ", '" + comein + "', '" + leaves + "')");
            System.out.println("Reservation Created Successfully");
            statement.close();
            dbConnection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createActionPerformed

    //Change the Update tab JTextFields on a Row click
    private void resultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultsMouseClicked
        int value = results.getSelectedRow();
        Object cell = results.getValueAt(value, 2);
        int res = Integer.parseInt(cell.toString());
        gid.setText(cell.toString());
        try {
            Class.forName (driverClassName);
            dbConnection = DriverManager.getConnection (url, username, passwd);
            statement = dbConnection.createStatement();
            ResultSet rs = statement.executeQuery("select getreservations(" + res + ")");
            if(rs.next()){
                String resultSetString = rs.getString("getreservations");
                String[] values = resultSetString.replaceAll("[()]", "").split(",");
                name.setText(values[0].trim());
                lastname.setText(values[1].trim());
                kinito.setText(values[2].trim());
                if(Integer.parseInt(values[3].trim()) <200){
                    mono.setSelected(true);
                }else if(Integer.parseInt(values[3].trim()) <300){
                    diplo.setSelected(true);
                }else{
                    triplo.setSelected(true);
                }
                tsekin.setText(values[4].trim());
                tsekaout.setText(values[5].trim());      
            }                         
            statement.close();
            dbConnection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_resultsMouseClicked

    
    //Log File
    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) logtable.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new String[]{"oper", "timestamp", "userid", "reservationid", "roomid", "guestid", "indate", "outdate"});
        try {
            Class.forName (driverClassName);
            dbConnection = DriverManager.getConnection (url, username, passwd);
            statement = dbConnection.createStatement();
            ResultSet rs = statement.executeQuery("select getlogfile()");
            while (rs.next()) {
                    String resultSetString = rs.getString("getlogfile");
                    String[] values = resultSetString.replaceAll("[()]", "").split(",");
                    if (values.length >= 8) {
                        String oper = values[0].trim();
                        String timestamp = values[1].trim();
                        String userid = values[2].trim();
                        String reservationid = values[3].trim();
                        String roomid = values[4].trim();
                        String guestid = values[5].trim();
                        String indate = values[6].trim();
                        String outdate = values[7].trim();
                        model.addRow(new Object[]{oper, timestamp, userid, reservationid, roomid, guestid, indate, outdate});
                    }
                }
            statement.close();
            dbConnection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logActionPerformed

    
    public static void main(String args[]) throws Exception {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Hotel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckOut;
    private javax.swing.JTextField IDno;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton Update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField checkin;
    private javax.swing.JTextField checkout;
    private javax.swing.JButton create;
    private javax.swing.JRadioButton diplo;
    private javax.swing.JRadioButton dual;
    private javax.swing.JTextField epitheto;
    private javax.swing.JTextField gid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField kinito;
    private javax.swing.JTextField lastname;
    private javax.swing.JButton log;
    private javax.swing.JTable logtable;
    private javax.swing.JTextField mobile;
    private javax.swing.JRadioButton mono;
    private javax.swing.JTextField name;
    private javax.swing.JTextField onoma;
    private javax.swing.JTable results;
    private javax.swing.JTextField searchfield;
    private javax.swing.JComboBox<String> searchtype;
    private javax.swing.JRadioButton single;
    private javax.swing.JRadioButton threefold;
    private javax.swing.JRadioButton triplo;
    private javax.swing.JTextField tsekaout;
    private javax.swing.JTextField tsekin;
    // End of variables declaration//GEN-END:variables
}
