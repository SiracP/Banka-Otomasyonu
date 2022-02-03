/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka.otomasyonu;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sirac
 */
public class PersonelEkran extends javax.swing.JFrame {
    Personel yeniP = null;
    /**
     * Creates new form PersonelEkran
     */
    public PersonelEkran(String TC, String sifre) {
        
        try {
            FileReader okuyucu = new FileReader("PersonelBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (TC.equals(bilgiler[2]) && sifre.equals(bilgiler[4])) {
                    yeniP = new Personel(bilgiler[0], bilgiler[1], TC, bilgiler[3], sifre, bilgiler[5]);
                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
           
        }
        initComponents();
        KartOnayEkran.setVisible(false);
        KrediOnayEkran.setVisible(false);
        setColor(GirisEkranıPanel);
        GirisEkran.setVisible(true);
        GirisEkranıPanel.setOpaque(true);
        resetColor(
            new JPanel[]{KartOnayPanel, KrediOnayPanel,CikisYapPanel},
            new JPanel[]{KartOnayPanel, KrediOnayPanel,CikisYapPanel}
        );
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPanel = new javax.swing.JPanel();
        KrediOnayPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        KartOnayPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        GirisEkranıPanel = new javax.swing.JPanel();
        IlkEkranPanel = new javax.swing.JLabel();
        CikisYapPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        KrediOnayEkran = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        KredilerOnayTablo = new javax.swing.JTable();
        KrediOnaylaButton = new javax.swing.JButton();
        KartOnayEkran = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        KartlarOnayTablo = new javax.swing.JTable();
        KartOnaylaButton = new javax.swing.JButton();
        GirisEkran = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IsımYeri = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(822, 445));
        setMinimumSize(new java.awt.Dimension(822, 445));
        setPreferredSize(new java.awt.Dimension(822, 445));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPanel.setBackground(new java.awt.Color(23, 35, 51));

        KrediOnayPanel.setBackground(new java.awt.Color(41, 57, 80));
        KrediOnayPanel.setPreferredSize(new java.awt.Dimension(86, 36));
        KrediOnayPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KrediOnayPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                KrediOnayPanelMouseReleased(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Kredi Onay");

        javax.swing.GroupLayout KrediOnayPanelLayout = new javax.swing.GroupLayout(KrediOnayPanel);
        KrediOnayPanel.setLayout(KrediOnayPanelLayout);
        KrediOnayPanelLayout.setHorizontalGroup(
            KrediOnayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KrediOnayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
        );
        KrediOnayPanelLayout.setVerticalGroup(
            KrediOnayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        KartOnayPanel.setBackground(new java.awt.Color(41, 57, 80));
        KartOnayPanel.setPreferredSize(new java.awt.Dimension(86, 36));
        KartOnayPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KartOnayPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                KartOnayPanelMouseReleased(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Kart Onay");

        javax.swing.GroupLayout KartOnayPanelLayout = new javax.swing.GroupLayout(KartOnayPanel);
        KartOnayPanel.setLayout(KartOnayPanelLayout);
        KartOnayPanelLayout.setHorizontalGroup(
            KartOnayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KartOnayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        KartOnayPanelLayout.setVerticalGroup(
            KartOnayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        GirisEkranıPanel.setBackground(new java.awt.Color(41, 57, 80));
        GirisEkranıPanel.setPreferredSize(new java.awt.Dimension(86, 36));
        GirisEkranıPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GirisEkranıPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GirisEkranıPanelMouseReleased(evt);
            }
        });

        IlkEkranPanel.setForeground(new java.awt.Color(240, 240, 240));
        IlkEkranPanel.setText("Giriş Ekranı");

        javax.swing.GroupLayout GirisEkranıPanelLayout = new javax.swing.GroupLayout(GirisEkranıPanel);
        GirisEkranıPanel.setLayout(GirisEkranıPanelLayout);
        GirisEkranıPanelLayout.setHorizontalGroup(
            GirisEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GirisEkranıPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IlkEkranPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GirisEkranıPanelLayout.setVerticalGroup(
            GirisEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IlkEkranPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        CikisYapPanel.setBackground(new java.awt.Color(41, 57, 80));
        CikisYapPanel.setPreferredSize(new java.awt.Dimension(86, 36));
        CikisYapPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CikisYapPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CikisYapPanelMouseReleased(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Çıkış Yap");

        javax.swing.GroupLayout CikisYapPanelLayout = new javax.swing.GroupLayout(CikisYapPanel);
        CikisYapPanel.setLayout(CikisYapPanelLayout);
        CikisYapPanelLayout.setHorizontalGroup(
            CikisYapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CikisYapPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CikisYapPanelLayout.setVerticalGroup(
            CikisYapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KrediOnayPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
            .addComponent(GirisEkranıPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
            .addComponent(KartOnayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
            .addComponent(CikisYapPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(GirisEkranıPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KartOnayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KrediOnayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CikisYapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(564, Short.MAX_VALUE))
        );

        getContentPane().add(MenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 819));

        KrediOnayEkran.setBackground(new java.awt.Color(64, 113, 147));

        KredilerOnayTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Müşteri TC", "Neden", "Miktar", "Son Ödeme Tarihi", "Faiz", "Ödencek Miktar", "Onay"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        KredilerOnayTablo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        KredilerOnayTablo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        KredilerOnayTablo.setShowGrid(true);
        KredilerOnayTablo.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(KredilerOnayTablo);
        KredilerOnayTablo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (KredilerOnayTablo.getColumnModel().getColumnCount() > 0) {
            KredilerOnayTablo.getColumnModel().getColumn(0).setResizable(false);
            KredilerOnayTablo.getColumnModel().getColumn(1).setResizable(false);
            KredilerOnayTablo.getColumnModel().getColumn(2).setResizable(false);
            KredilerOnayTablo.getColumnModel().getColumn(3).setResizable(false);
            KredilerOnayTablo.getColumnModel().getColumn(4).setResizable(false);
            KredilerOnayTablo.getColumnModel().getColumn(5).setResizable(false);
            KredilerOnayTablo.getColumnModel().getColumn(6).setResizable(false);
        }

        KrediOnaylaButton.setText("Onayla");
        KrediOnaylaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KrediOnaylaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KrediOnayEkranLayout = new javax.swing.GroupLayout(KrediOnayEkran);
        KrediOnayEkran.setLayout(KrediOnayEkranLayout);
        KrediOnayEkranLayout.setHorizontalGroup(
            KrediOnayEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KrediOnayEkranLayout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(KrediOnaylaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KrediOnayEkranLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addContainerGap())
        );
        KrediOnayEkranLayout.setVerticalGroup(
            KrediOnayEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KrediOnayEkranLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KrediOnaylaButton))
        );

        getContentPane().add(KrediOnayEkran, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 0, 680, 420));

        KartOnayEkran.setBackground(new java.awt.Color(64, 113, 147));
        KartOnayEkran.setMinimumSize(new java.awt.Dimension(600, 812));

        KartlarOnayTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", "", "", "", null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Müşteri TC", "Kart İsmi", "Kart No", "Limit", "Bakiye", "Borç", "Onay"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        KartlarOnayTablo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        KartlarOnayTablo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        KartlarOnayTablo.setShowGrid(true);
        KartlarOnayTablo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(KartlarOnayTablo);
        KartlarOnayTablo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (KartlarOnayTablo.getColumnModel().getColumnCount() > 0) {
            KartlarOnayTablo.getColumnModel().getColumn(0).setResizable(false);
            KartlarOnayTablo.getColumnModel().getColumn(1).setResizable(false);
            KartlarOnayTablo.getColumnModel().getColumn(2).setResizable(false);
            KartlarOnayTablo.getColumnModel().getColumn(3).setResizable(false);
            KartlarOnayTablo.getColumnModel().getColumn(4).setResizable(false);
            KartlarOnayTablo.getColumnModel().getColumn(5).setResizable(false);
            KartlarOnayTablo.getColumnModel().getColumn(6).setResizable(false);
        }

        KartOnaylaButton.setText("Onayla");
        KartOnaylaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KartOnaylaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KartOnayEkranLayout = new javax.swing.GroupLayout(KartOnayEkran);
        KartOnayEkran.setLayout(KartOnayEkranLayout);
        KartOnayEkranLayout.setHorizontalGroup(
            KartOnayEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KartOnayEkranLayout.createSequentialGroup()
                .addGroup(KartOnayEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KartOnayEkranLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(KartOnaylaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(KartOnayEkranLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        KartOnayEkranLayout.setVerticalGroup(
            KartOnayEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KartOnayEkranLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KartOnaylaButton)
                .addGap(429, 429, 429))
        );

        getContentPane().add(KartOnayEkran, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 0, 670, 414));
        KartOnayEkran.getAccessibleContext().setAccessibleName("");

        GirisEkran.setBackground(new java.awt.Color(64, 113, 147));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hoşgeldiniz");

        IsımYeri.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        IsımYeri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IsımYeri.setText(yeniP.isim+" "+yeniP.soyisim);

        jButton2.setText("Hesap Ayarları");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GirisEkranLayout = new javax.swing.GroupLayout(GirisEkran);
        GirisEkran.setLayout(GirisEkranLayout);
        GirisEkranLayout.setHorizontalGroup(
            GirisEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GirisEkranLayout.createSequentialGroup()
                .addGap(0, 89, Short.MAX_VALUE)
                .addGroup(GirisEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GirisEkranLayout.createSequentialGroup()
                        .addGroup(GirisEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IsımYeri, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GirisEkranLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(279, 279, 279))))
        );
        GirisEkranLayout.setVerticalGroup(
            GirisEkranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GirisEkranLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(IsımYeri, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton2)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        getContentPane().add(GirisEkran, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 0, 670, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KrediOnayPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KrediOnayPanelMousePressed
        // TODO add your handling code here:
        setColor(KrediOnayPanel);
        KrediOnayPanel.setOpaque(true);
        kredileriEkleOnay();
        resetColor(
            new JPanel[]{KartOnayPanel, GirisEkranıPanel,CikisYapPanel},
            new JPanel[]{KartOnayPanel, GirisEkranıPanel,CikisYapPanel}
        );
        KartOnayEkran.setVisible(false);
        KrediOnayEkran.setVisible(true);
        GirisEkran.setVisible(false);
    }//GEN-LAST:event_KrediOnayPanelMousePressed

    private void KrediOnayPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KrediOnayPanelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_KrediOnayPanelMouseReleased

    private void KartOnayPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KartOnayPanelMousePressed
        // TODO add your handling code here:
        setColor(KartOnayPanel);
        kartlarıEkleOnay();
        KartOnayPanel.setOpaque(true);
        resetColor(
            new JPanel[]{KrediOnayPanel, GirisEkranıPanel,CikisYapPanel},
            new JPanel[]{KrediOnayPanel, GirisEkranıPanel,CikisYapPanel}
        );
       KartOnayEkran.setVisible(true);
       KrediOnayEkran.setVisible(false);
       GirisEkran.setVisible(false);
    }//GEN-LAST:event_KartOnayPanelMousePressed

    private void KartOnayPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KartOnayPanelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_KartOnayPanelMouseReleased

    private void GirisEkranıPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GirisEkranıPanelMousePressed
        // TODO add your handling code here:
        setColor(GirisEkranıPanel);
        GirisEkranıPanel.setOpaque(true);
        resetColor(
            new JPanel[]{KartOnayPanel, KrediOnayPanel,CikisYapPanel},
            new JPanel[]{KartOnayPanel, KrediOnayPanel,CikisYapPanel}
        );
        KartOnayEkran.setVisible(false);
        KrediOnayEkran.setVisible(false);
        GirisEkran.setVisible(true);
    }//GEN-LAST:event_GirisEkranıPanelMousePressed

    private void GirisEkranıPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GirisEkranıPanelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_GirisEkranıPanelMouseReleased

    private void KartOnaylaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KartOnaylaButtonActionPerformed
        // TODO add your handling code here:
        int row;
        DefaultTableModel model = (DefaultTableModel) KartlarOnayTablo.getModel();
        if (-1 == KartlarOnayTablo.getSelectedRow()) {
            JOptionPane.showMessageDialog(this, "Lütfen onaylamak istediğiniz kartı seçiniz", "Hata", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
             row = KartlarOnayTablo.getSelectedRow();
        }
        if (model.getValueAt(row, 6).toString().equals("+")) {
            JOptionPane.showMessageDialog(this, "Bu kart zaten onaylanmış", "Hata", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if(model.getValueAt(row, 6).toString().equals("-")){
            String KartNo = model.getValueAt(row, 2).toString();
            String musteriTC =model.getValueAt(row, 0).toString();
            yeniP.kartOnay(musteriTC,KartNo);
        }
        kartlarıEkleOnay();
    }//GEN-LAST:event_KartOnaylaButtonActionPerformed

    private void KrediOnaylaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KrediOnaylaButtonActionPerformed
        // TODO add your handling code here:
        int row;
        DefaultTableModel model = (DefaultTableModel) KredilerOnayTablo.getModel();
        if (-1 == KredilerOnayTablo.getSelectedRow()) {
            JOptionPane.showMessageDialog(this, "Lütfen onaylamak istediğiniz krediyi seçiniz", "Hata", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
             row = KredilerOnayTablo.getSelectedRow();
        }
        if (model.getValueAt(row, 6).toString().equals("+")) {
            JOptionPane.showMessageDialog(this, "Bu kredi zaten onaylanmış", "Hata", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if(model.getValueAt(row, 6).toString().equals("-")){
            String neden = model.getValueAt(row, 1).toString();
            String musteriTC =model.getValueAt(row, 0).toString();
            String faiz =model.getValueAt(row, 4).toString();
            String miktar =model.getValueAt(row, 2).toString();
            yeniP.krediOnay(musteriTC,neden,faiz,miktar);
        }
        kredileriEkleOnay();
    }//GEN-LAST:event_KrediOnaylaButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        HesapBilgileri hesap = new HesapBilgileri(this, true, yeniP);
        hesap.setVisible(true);
        IsımYeri.setText(yeniP.isim+" "+yeniP.soyisim);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CikisYapPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CikisYapPanelMousePressed
        // TODO add your handling code here:
        setColor(CikisYapPanel);
        CikisYapPanel.setOpaque(true);
        resetColor(
            new JPanel[]{KartOnayPanel, KrediOnayPanel,GirisEkranıPanel},
            new JPanel[]{KartOnayPanel, KrediOnayPanel,GirisEkranıPanel}
        );
        this.dispose();
        Giris yeniG = new Giris();
        yeniG.setVisible(true);
    }//GEN-LAST:event_CikisYapPanelMousePressed

    private void CikisYapPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CikisYapPanelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_CikisYapPanelMouseReleased

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
            java.util.logging.Logger.getLogger(PersonelEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonelEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonelEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
    }
    private void setColor(JPanel pane) {
        pane.setBackground(new Color(41, 57, 80));
    }

    private void resetColor(JPanel[] pane, JPanel[] ind) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(23, 35, 51));
        }
        for (int i = 0; i < ind.length; i++) {
            ind[i].setOpaque(false);
        }
    }

    private void kartlarıEkleOnay() {
        try {
            DefaultTableModel model = (DefaultTableModel) KartlarOnayTablo.getModel();
            model.setRowCount(0);
            FileReader okuyucu = new FileReader("KartBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                model.addRow(new Object[]{bilgiler[0],bilgiler[1], bilgiler[2], bilgiler[3], bilgiler[4], bilgiler[5], bilgiler[6]});
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
    }

    private void kredileriEkleOnay() {
        try {
            DefaultTableModel model = (DefaultTableModel) KredilerOnayTablo.getModel();
            model.setRowCount(0);
            FileReader okuyucu = new FileReader("KrediBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                model.addRow(new Object[]{bilgiler[0],bilgiler[2], bilgiler[1], bilgiler[3], bilgiler[4], bilgiler[5], bilgiler[6]});
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CikisYapPanel;
    private javax.swing.JPanel GirisEkran;
    private javax.swing.JPanel GirisEkranıPanel;
    private javax.swing.JLabel IlkEkranPanel;
    private javax.swing.JLabel IsımYeri;
    private javax.swing.JPanel KartOnayEkran;
    private javax.swing.JPanel KartOnayPanel;
    private javax.swing.JButton KartOnaylaButton;
    private javax.swing.JTable KartlarOnayTablo;
    private javax.swing.JPanel KrediOnayEkran;
    private javax.swing.JPanel KrediOnayPanel;
    private javax.swing.JButton KrediOnaylaButton;
    private javax.swing.JTable KredilerOnayTablo;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
