
package GUI;

import Evaluation.Evaluation;
import SaveTable.DeSerialization;
import SaveTable.ExcelExporter;
import SaveTable.Serialization;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


public class MyJFrame extends javax.swing.JFrame {

    int editingRow;
    int editingColumn;
    boolean isFocusOut = false;

    public MyJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();
        FileChooser2 = new javax.swing.JFileChooser();
        SaveOptionPane = new javax.swing.JOptionPane();
        ExitOptionPane = new javax.swing.JOptionPane();
        TableColorChooser = new javax.swing.JColorChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        cell_address = new javax.swing.JTextField();
        cell_value = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cell_type = new javax.swing.JTextField();
        FontPanel = new javax.swing.JPanel();
        ThemeFontsComboBox = new javax.swing.JComboBox();
        FontStyleComboBox = new javax.swing.JComboBox();
        FontSizeComboBox = new javax.swing.JComboBox();
        ChooseColourButton = new javax.swing.JButton();
        AlignmentComboBox = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        SaveButton = new javax.swing.JButton();
        PreviousButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        TextFormulasComboBox = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        SaveAs = new javax.swing.JMenuItem();
        Open = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setBorder(new javax.swing.border.MatteBorder(null));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"   1", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   2", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   3", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   4", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   5", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   6", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   7", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   8", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   9", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   10", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   11", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   12", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   13", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   14", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   15", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   16", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   17", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   18", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   19", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"   20", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 3, 11)); // NOI18N
        jLabel1.setText("Fx");

        FontPanel.setBackground(new java.awt.Color(153, 153, 255));
        FontPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Font", 0, 0, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N

        ThemeFontsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arial", "Arial Black", "Calibri", "David", "Serif", "Tahoma", "Terminal", "Times New Roman", "Verdana" }));
        ThemeFontsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemeFontsComboBoxActionPerformed(evt);
            }
        });

        FontStyleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plain", "Bold", "Italic", "Bold Italic" }));
        FontStyleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontStyleComboBoxActionPerformed(evt);
            }
        });

        FontSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40" }));
        FontSizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontSizeComboBoxActionPerformed(evt);
            }
        });

        ChooseColourButton.setText("Change Font Colour");
        ChooseColourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseColourButtonActionPerformed(evt);
            }
        });

        AlignmentComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Left Alignment", "Right Alignment", "Center Alignment" }));
        AlignmentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlignmentComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FontPanelLayout = new javax.swing.GroupLayout(FontPanel);
        FontPanel.setLayout(FontPanelLayout);
        FontPanelLayout.setHorizontalGroup(
            FontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FontPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ThemeFontsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(AlignmentComboBox, 0, 178, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(FontStyleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FontSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChooseColourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        FontPanelLayout.setVerticalGroup(
            FontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FontPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ChooseColourButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FontSizeComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(FontStyleComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                    .addComponent(AlignmentComboBox, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ThemeFontsComboBox, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Save", 0, 0, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        PreviousButton.setText("Previous");
        PreviousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(SaveButton)
                .addGap(18, 18, 18)
                .addComponent(PreviousButton, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(PreviousButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulas", 0, 0, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        TextFormulasComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UPPER", "LOWER", "LEN", "REPEAT" }));
        TextFormulasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFormulasComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TextFormulasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextFormulasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 255));

        jMenu1.setText("File");

        SaveAs.setText("SaveAs");
        SaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsActionPerformed(evt);
            }
        });
        jMenu1.add(SaveAs);

        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu1.add(Open);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(cell_value, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cell_address, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cell_type, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(FontPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FontPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cell_address, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(cell_value)
                    .addComponent(cell_type)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
         if ( JOptionPane.showConfirmDialog( ExitOptionPane,"Do you want to exit ?","Question",JOptionPane.YES_NO_OPTION) != 1){
             System.exit(0);
         }       

    }//GEN-LAST:event_ExitActionPerformed

    private void SaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsActionPerformed
        JFileChooser saveFile = new JFileChooser();
        if (saveFile.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File xyz = saveFile.getSelectedFile();
            try {
                ExcelExporter ex = new ExcelExporter();
                ex.exportTable(table, xyz);

            }catch (IOException ex ) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }catch ( NullPointerException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_SaveAsActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        int returnVal = FileChooser2.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = FileChooser2.getSelectedFile();
        } else {
            System.out.println("File access cancelled by user.");
        }      
    }//GEN-LAST:event_OpenActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        Display();
    }//GEN-LAST:event_tableMouseClicked

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            editingColumn = table.getEditingColumn();
            editingRow = table.getEditingRow();
        }
    }//GEN-LAST:event_tableKeyPressed

    private void tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyReleased
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                String expression = String.valueOf(table.getValueAt(editingRow, editingColumn));
                if (expression.startsWith("=")) {
                    String value = Evaluation.Evaluation(expression,table);
                    table.setValueAt(value, editingRow, editingColumn);
                    cell_value.setText(expression);
                    cell_type.setText("number");
                }
            }else{
                Display();
            }
        } catch (ArrayIndexOutOfBoundsException e ){
            e.printStackTrace();
        }
    }//GEN-LAST:event_tableKeyReleased

    private void FontSizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FontSizeComboBoxActionPerformed
        //table.getColumn("").setEditable(false);
        String s = (String) FontSizeComboBox.getModel().getSelectedItem();
        int fontSize = Integer.parseInt(s);
        Font myFont = new Font("Arial", Font.PLAIN, fontSize);
        table.setFont(myFont);
                                                                                         
    }//GEN-LAST:event_FontSizeComboBoxActionPerformed

    private void FontStyleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FontStyleComboBoxActionPerformed
        String s =  (String) FontStyleComboBox.getModel().getSelectedItem();
        Font myFont ;
        switch (s) {
            case "Bold":
                myFont = new Font("Arial", Font.BOLD, 12);
                break;
            case "Italic":
                myFont = new Font("Arial", Font.ITALIC, 12);
                break;
            case "Bold Italic":
                myFont = new Font("Arial", Font.ITALIC | Font.BOLD, 12);
                break;
            default:
                myFont = new Font("Arial", Font.PLAIN, 12);
                break;
        }

        table.setFont(myFont);
            
    }//GEN-LAST:event_FontStyleComboBoxActionPerformed

    private void ThemeFontsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemeFontsComboBoxActionPerformed
        
        String s =  (String) ThemeFontsComboBox.getModel().getSelectedItem();
        Font myFont = new Font(s, Font.PLAIN, 12);
        table.setFont(myFont);
    }//GEN-LAST:event_ThemeFontsComboBoxActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        
        int rows = table.getRowCount();
        int columns = table.getColumnCount();

        Object[][] ob = new Object[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int col = 1; col < table.getColumnCount(); col++) {
                ob[row][col] = table.getValueAt(row, col);
            }
        }

        Serialization ser = new Serialization(ob);
        JOptionPane.showMessageDialog(SaveOptionPane, "saved successfully");
        
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void ChooseColourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseColourButtonActionPerformed
        table.setForeground(JColorChooser.showDialog(TableColorChooser,"Choose background color", Color.white));        
    }//GEN-LAST:event_ChooseColourButtonActionPerformed

    private void AlignmentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlignmentComboBoxActionPerformed
        String s =  (String) AlignmentComboBox.getModel().getSelectedItem();
        
        DefaultTableCellRenderer Renderer = new DefaultTableCellRenderer();
        
        switch (s) {
            case "Right Alignment":
                Renderer.setHorizontalAlignment( SwingConstants.RIGHT);
                break;
            case "Left Alignment":
                Renderer.setHorizontalAlignment( SwingConstants.LEFT);
                break;
            case "Center Alignment":
                Renderer.setHorizontalAlignment( SwingConstants.CENTER);
                break;
            
        }
        for (int col = 1; col < table.getColumnCount(); col++) {
            table.getColumnModel().getColumn(col).setCellRenderer(Renderer);
        }
    }//GEN-LAST:event_AlignmentComboBoxActionPerformed

    private void PreviousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousButtonActionPerformed

        try {
            int rows = table.getRowCount();
            int columns = table.getColumnCount();

            Object[][] ob2 = new Object[rows][columns];

            DeSerialization deSer = new DeSerialization(ob2,table);
        }catch (Exception e) {
            System.out.println("problem accessing file");
        }
    }//GEN-LAST:event_PreviousButtonActionPerformed

    private void TextFormulasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFormulasComboBoxActionPerformed
        int row = table.getSelectedRow();
        int col = table.getSelectedColumn();
        String s =  (String) TextFormulasComboBox.getModel().getSelectedItem();
        switch (s) {
            case "UPPER":
                table.setValueAt("=UPPER", row, col);
                break;
            case "LOWER":
                table.setValueAt("=LOWER", row, col);
                break;
            case "LEN":
                table.setValueAt("=LEN", row, col);
                break;
            case "REPEAT":
                table.setValueAt("=REPEAT", row, col);
                break;
        }
    }//GEN-LAST:event_TextFormulasComboBoxActionPerformed

    public Object GetCellValue(String cell_add) {
        return table.getValueAt(cell_add.charAt(1), cell_add.charAt(0) - 'A' + 1);
    }

    public void Display() {
        try {
            int row = table.getSelectedRow();
            int column = table.getSelectedColumn();
            Object ob = table.getValueAt(row, column);

            if (column != 0 ) {

                String c = table.getColumnName(column);
                cell_address.setText(c + (row + 1));
                String s = ob.toString();
                
                cell_value.setText(s);
                DataTypes.DataTypes d = new DataTypes.StringParser().GetDataTypes(s);
                cell_type.setText(d.get_datatype(s));
                
            } else {
                cell_address.setText("");
                cell_value.setText("");
                cell_type.setText("");
            }

        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
            cell_value.setText("");
            cell_type.setText("");
        }

    }
    
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
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AlignmentComboBox;
    private javax.swing.JButton ChooseColourButton;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JOptionPane ExitOptionPane;
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JFileChooser FileChooser2;
    private javax.swing.JPanel FontPanel;
    private javax.swing.JComboBox FontSizeComboBox;
    private javax.swing.JComboBox FontStyleComboBox;
    private javax.swing.JMenuItem Open;
    private javax.swing.JButton PreviousButton;
    private javax.swing.JMenuItem SaveAs;
    private javax.swing.JButton SaveButton;
    private javax.swing.JOptionPane SaveOptionPane;
    private javax.swing.JColorChooser TableColorChooser;
    private javax.swing.JComboBox TextFormulasComboBox;
    private javax.swing.JComboBox ThemeFontsComboBox;
    private javax.swing.JTextField cell_address;
    private javax.swing.JTextField cell_type;
    private javax.swing.JTextField cell_value;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
