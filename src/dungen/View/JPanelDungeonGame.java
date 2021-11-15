package dungen.View;

import Dungeon.Controler.GameControler;
import dungenModel.Items;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class JPanelDungeonGame extends javax.swing.JPanel {

    private GameControler gc;
    private String[] commandoList = {"Help", "Attack", "Pickup", "Load", "Save", "NewPlay", "Quit", "Use"};

    public JPanelDungeonGame(String name) {

        initComponents();
        gc = new GameControler(name);

        for (String string : commandoList) {
            jComboBoxACtionList.addItem(string);
        }
        for (Items items : gc.playerItemsCollection()) {

            jComboBoxPlayerItems.addItem(items.getNavn());
        }
        jTextDirectionRoom.setText("This is where a Dungeon begins" +
                "\nThere are buttons that pointing"+
                "\nNorth, South, Sast and West\n"+ 
                "As you enter each room,"
                + "\nroom information will appears"
                + "\nin the box on the right."
                + "\nInside each room may be a treasure"
                + "\nthat you can add to your wealth"
                + "\nor there may be monster "
                + "\nthat will attack you to kill you."
                + "\nIf the monster don't kill you,"
                + "\nyou will reach the last room "
                + "\nand win the Dungeon game"
                + "\nand your score will be recorded.");
        jTextPlayer.setText(gc.playerToString());
        jTextAMonsterAndtems.setText(gc.currentRoomMonsterToString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDirectionRoom = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPlayer = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAMonsterAndtems = new javax.swing.JTextArea();
        jComboBoxACtionList = new javax.swing.JComboBox<>();
        jButtonEast = new javax.swing.JButton();
        jButtonNorth = new javax.swing.JButton();
        jButtonSouth = new javax.swing.JButton();
        jButtonWest = new javax.swing.JButton();
        jComboBoxPlayerItems = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaHelpCommando = new javax.swing.JTextArea();
        jButtonAddItemstoComboboks = new javax.swing.JButton();

        setAutoscrolls(true);

        jTextDirectionRoom.setColumns(20);
        jTextDirectionRoom.setRows(5);
        jScrollPane1.setViewportView(jTextDirectionRoom);

        jTextPlayer.setEditable(false);
        jTextPlayer.setColumns(20);
        jTextPlayer.setRows(5);
        jScrollPane2.setViewportView(jTextPlayer);

        jTextAMonsterAndtems.setEditable(false);
        jTextAMonsterAndtems.setColumns(20);
        jTextAMonsterAndtems.setForeground(new java.awt.Color(255, 0, 0));
        jTextAMonsterAndtems.setRows(5);
        jScrollPane3.setViewportView(jTextAMonsterAndtems);

        jComboBoxACtionList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ActionList" }));
        jComboBoxACtionList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxACtionListActionPerformed(evt);
            }
        });

        jButtonEast.setText("East");
        jButtonEast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEastActionPerformed(evt);
            }
        });

        jButtonNorth.setText("North");
        jButtonNorth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNorthActionPerformed(evt);
            }
        });

        jButtonSouth.setText("South");
        jButtonSouth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSouthActionPerformed(evt);
            }
        });

        jButtonWest.setText("West");
        jButtonWest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWestActionPerformed(evt);
            }
        });

        jComboBoxPlayerItems.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Use Items Player" }));
        jComboBoxPlayerItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPlayerItemsActionPerformed(evt);
            }
        });

        jTextAreaHelpCommando.setColumns(20);
        jTextAreaHelpCommando.setRows(5);
        jScrollPane4.setViewportView(jTextAreaHelpCommando);

        jButtonAddItemstoComboboks.setText("Add Item toList");
        jButtonAddItemstoComboboks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddItemstoComboboksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonAddItemstoComboboks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxPlayerItems, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSouth)
                            .addComponent(jButtonNorth))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxACtionList, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonWest)
                                .addGap(97, 97, 97)
                                .addComponent(jButtonEast))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxACtionList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonNorth)
                                    .addComponent(jComboBoxPlayerItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEast)
                            .addComponent(jButtonWest))
                        .addGap(16, 16, 16)
                        .addComponent(jButtonSouth)
                        .addGap(5, 5, 5)
                        .addComponent(jButtonAddItemstoComboboks)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNorthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNorthActionPerformed
        if (gc.isPlayerAlive() && gc.haveNotEndTreasureChest()) {
            jTextDirectionRoom.setText(gc.goNorth());
            jTextPlayer.setText(gc.playerToString());
            jTextAMonsterAndtems.setText(gc.currentRoomMonsterToString());
        } else {
            JOptionPane.showMessageDialog(null, gc.gameOver());
        }

    }//GEN-LAST:event_jButtonNorthActionPerformed

    private void jButtonSouthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSouthActionPerformed
        if (gc.isPlayerAlive() && gc.haveNotEndTreasureChest()) {
            jTextDirectionRoom.setText(gc.goSouth());
            jTextPlayer.setText(gc.playerToString());
            jTextAMonsterAndtems.setText(gc.currentRoomMonsterToString());
        } else {
            JOptionPane.showMessageDialog(null, gc.gameOver());
        }
    }//GEN-LAST:event_jButtonSouthActionPerformed

    private void jButtonEastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEastActionPerformed
        if (gc.isPlayerAlive() && gc.haveNotEndTreasureChest()) {
            jTextDirectionRoom.setText(gc.goEast());
            jTextPlayer.setText(gc.playerToString());
            jTextAMonsterAndtems.setText(gc.currentRoomMonsterToString());
        } else {
            JOptionPane.showMessageDialog(null, gc.gameOver());
        }
    }//GEN-LAST:event_jButtonEastActionPerformed

    private void jButtonWestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWestActionPerformed
        if (gc.isPlayerAlive() && gc.haveNotEndTreasureChest()) {
            jTextDirectionRoom.setText(gc.goWest());
            jTextPlayer.setText(gc.playerToString());
            jTextAMonsterAndtems.setText(gc.currentRoomMonsterToString());
        } else {
            JOptionPane.showMessageDialog(null, gc.gameOver());
        }
    }//GEN-LAST:event_jButtonWestActionPerformed

    private void jComboBoxACtionListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxACtionListActionPerformed

        if (gc.isPlayerAlive() && gc.haveNotEndTreasureChest()) {
            String choose = jComboBoxACtionList.getSelectedItem().toString();
            if (choose.equals("Help")) {
                jTextAreaHelpCommando.setText(gc.command(choose));
            } else {
                jTextDirectionRoom.setText(gc.command(choose));
            }
            if (choose.equals("Save")) {
                try {
                    FileOutputStream fileOut = new FileOutputStream("gc.ser");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    gc.setInforplayer(jTextPlayer.getText());
                    gc.setInfoMonsterItems(jTextAMonsterAndtems.getText());
                    gc.setInforRoom(jTextDirectionRoom.getText());

                    out.writeObject(gc);
                    out.close();
                    fileOut.close();
                    System.out.printf("Serialized data is saved in /tmp/employee.ser");
                } catch (IOException i) {
                    System.out.println("There is some ting wrong");;
                }
            }

            if (choose.equals("Load")) {

                try {
                    FileInputStream fileIn = new FileInputStream("gc.ser");
                    ObjectInputStream in = new ObjectInputStream(fileIn);
                    gc = (GameControler) in.readObject();
                    jTextDirectionRoom.setText(gc.getInforplayer());
                    jTextAMonsterAndtems.setText(gc.getInfoMonsterItems());
                    jTextDirectionRoom.setText(gc.getInforRoom());
                    in.close();
                    fileIn.close();
                } catch (IOException i) {
                    System.out.println("Employee class not found");
                    return;
                } catch (ClassNotFoundException c) {
                    System.out.println("Employee class not found");

                    return;
                }
            }
            if (choose.equals("NewPlay")) {
                JFrame f = (JFrame) SwingUtilities.getWindowAncestor(this);
                f.remove(this);
                JPanelLogInDungeonGame jpl;
                jpl = new JPanelLogInDungeonGame();
                f.add(jpl);
                f.setTitle("Login");
                f.pack();
            }

            jTextPlayer.setText(gc.playerToString());
            jTextAMonsterAndtems.setText(gc.currentRoomMonsterToString());

        } else if (!gc.isPlayerAlive()) {
            jTextDirectionRoom.setText("You died!");
            jTextDirectionRoom.append(" \ngame over");
            JOptionPane.showMessageDialog(null, gc.gameOver());
        } else {
            jTextDirectionRoom.setText("you win");
            jTextDirectionRoom.append("\ngame over");
            JOptionPane.showMessageDialog(null, gc.gameOver());
        }


    }//GEN-LAST:event_jComboBoxACtionListActionPerformed


    private void jComboBoxPlayerItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPlayerItemsActionPerformed

        
        if (gc.isPlayerAlive() && gc.haveNotEndTreasureChest()) {
            String selectet = jComboBoxPlayerItems.getSelectedItem().toString();
            jTextDirectionRoom.setText(gc.use(selectet));
            jTextPlayer.setText(gc.playerToString());
            jTextAMonsterAndtems.setText(gc.currentRoomMonsterToString());
            ArrayList<Items> pi = gc.playerItemsCollection();
            jComboBoxPlayerItems.removeAllItems();           
            for (Items items : pi) {
                jComboBoxPlayerItems.addItem(items.getNavn());
            }
        } else {
            JOptionPane.showMessageDialog(null, gc.gameOver());
        }

    }//GEN-LAST:event_jComboBoxPlayerItemsActionPerformed

    private void jButtonAddItemstoComboboksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddItemstoComboboksActionPerformed
        if (!gc.getMonsterItems().isEmpty()) {
            for (Items items : gc.getMonsterItems()) {

                jComboBoxPlayerItems.addItem(items.getNavn());
            }
            for (int i = 0; i < gc.getMonsterItems().size(); i++) {
                gc.getMonsterItems().remove(i);
            }
        } else {

        }
    }//GEN-LAST:event_jButtonAddItemstoComboboksActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddItemstoComboboks;
    private javax.swing.JButton jButtonEast;
    private javax.swing.JButton jButtonNorth;
    private javax.swing.JButton jButtonSouth;
    private javax.swing.JButton jButtonWest;
    private javax.swing.JComboBox<String> jComboBoxACtionList;
    private javax.swing.JComboBox<String> jComboBoxPlayerItems;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAMonsterAndtems;
    private javax.swing.JTextArea jTextAreaHelpCommando;
    private javax.swing.JTextArea jTextDirectionRoom;
    private javax.swing.JTextArea jTextPlayer;
    // End of variables declaration//GEN-END:variables
}
