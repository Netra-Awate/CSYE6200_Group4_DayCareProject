
package View;


public class VaccinationDetails extends javax.swing.JPanel {


    public VaccinationDetails() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        immunizationLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        StudentVaxTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1100, 650));
        setPreferredSize(new java.awt.Dimension(1100, 600));

        backButton.setForeground(new java.awt.Color(0, 102, 255));
        backButton.setText("Back");
        backButton.setBorder(null);

        immunizationLabel.setBackground(new java.awt.Color(255, 255, 255));
        immunizationLabel.setFont(new java.awt.Font("Krub", 1, 18)); // NOI18N
        immunizationLabel.setForeground(new java.awt.Color(0, 102, 255));
        immunizationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        immunizationLabel.setText("Immunizations");

        jScrollPane2.setBackground(new java.awt.Color(0, 102, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        StudentVaxTable.setFont(new java.awt.Font("Krub", 1, 13)); // NOI18N
        StudentVaxTable.setForeground(new java.awt.Color(0, 102, 255));
        StudentVaxTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "StudentId", "StudentName", "Age", "Hib", "DTaP", "Polio", "Hepatitis B", "MMR", "Varicella"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentVaxTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        StudentVaxTable.setSelectionForeground(new java.awt.Color(0, 153, 255));
        jScrollPane2.setViewportView(StudentVaxTable);

        jScrollPane1.setBackground(new java.awt.Color(102, 255, 102));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTextPane1.setFont(new java.awt.Font("Krub", 1, 13)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 153, 0));
        jTextPane1.setText("Dosage for students aged less than 24 months,\nHib: 4 doses\nDTaP: 4 doses\nPolio: : 4 doses \nHepatitis B : 3 doses \nMMR: 1 dose \nVaricella: 1 dose");
        jTextPane1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextPane1);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));

        jTextPane2.setFont(new java.awt.Font("Krub", 1, 13)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(255, 153, 0));
        jTextPane2.setText("Dosage for students aged more than 24 months\nHib: 4 doses, \nDTaP: 4 doses,\nPolio: : 4 doses\nHepatitis B: : 3 doses\nMMR: 2 doses\nVaricella: 2 doses");
        jTextPane2.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jTextPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(immunizationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(immunizationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable StudentVaxTable;
    public javax.swing.JButton backButton;
    private javax.swing.JLabel immunizationLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
