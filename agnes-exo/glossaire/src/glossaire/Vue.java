package glossaire;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author agnes extends ruben Faire une petit soft permettant de crée lire
 * mettre à jour supprimer CRUD Un glossaire contenant diverses informations un
 * mot sa définitions etc etc Premierement on place notre mot dans un premier
 * text area Deuxiemement on place notre definiton dans un second text et enfin
 * lors du clique sur le bouton envoie on recupere les deux saisis et on les
 * envoie dans la base de donnée
 */
public class Vue extends javax.swing.JFrame {

    ////Instanciation du controlleur et du Modele////
    Controleur controleur = new Controleur();
    Lexique lexique = new Lexique(); // good

    ///Mise en place du modelTab///
    DefaultTableModel modelTab;

    /**
     * Creates new form Vue
     */
    public Vue() {
        initComponents();
        modelTab = (DefaultTableModel) motAndType.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selector = new javax.swing.JTabbedPane();
        javax.swing.JPanel create = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
        definitionArea = new javax.swing.JTextArea();
        envoieButton = new javax.swing.JButton();
        javax.swing.JLabel motLabel = new javax.swing.JLabel();
        javax.swing.JLabel definitionLabel = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        fieldMot = new javax.swing.JTextField();
        fieldCategorie = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JPanel read = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane3 = new javax.swing.JScrollPane();
        readArea = new javax.swing.JTextArea();
        javax.swing.JLabel afficheLabel = new javax.swing.JLabel();
        afficheBtn = new javax.swing.JButton();
        javax.swing.JScrollPane listeMot = new javax.swing.JScrollPane();
        motAndType = new javax.swing.JTable();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JPanel update = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        javax.swing.JLabel searchTitle = new javax.swing.JLabel();
        javax.swing.JLabel updateTitle = new javax.swing.JLabel();
        updateMotField = new javax.swing.JTextField();
        javax.swing.JLabel motTitle = new javax.swing.JLabel();
        javax.swing.JLabel catTitle = new javax.swing.JLabel();
        updateCatField = new javax.swing.JTextField();
        javax.swing.JScrollPane updateDefArea = new javax.swing.JScrollPane();
        updateDefiArea = new javax.swing.JTextArea();
        javax.swing.JLabel updateDefTitle = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        javax.swing.JPanel delete = new javax.swing.JPanel();
        javax.swing.JLabel deteleSearchTitle = new javax.swing.JLabel();
        deleteSearchField = new javax.swing.JTextField();
        deleteSearchBtn = new javax.swing.JButton();
        javax.swing.JLabel deleteTitle = new javax.swing.JLabel();
        deleteMotField = new javax.swing.JTextField();
        javax.swing.JLabel deleteMotTitle = new javax.swing.JLabel();
        javax.swing.JLabel deleteDefTitle = new javax.swing.JLabel();
        deleteCatField = new javax.swing.JTextField();
        javax.swing.JLabel deleteCatTitle = new javax.swing.JLabel();
        javax.swing.JScrollPane updateDefArea1 = new javax.swing.JScrollPane();
        deleteDefiArea = new javax.swing.JTextArea();
        javax.swing.JButton deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("glossaire");
        setResizable(false);

        selector.setBorder(new javax.swing.border.MatteBorder(null));
        selector.setToolTipText("");
        selector.setName(""); // NOI18N

        definitionArea.setColumns(20);
        definitionArea.setRows(5);
        jScrollPane2.setViewportView(definitionArea);

        envoieButton.setText("Envoie");
        envoieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envoieButtonActionPerformed(evt);
            }
        });

        motLabel.setText("Mot");

        definitionLabel.setText("Definition");

        jLabel2.setText("Catégorie");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Ajouter un nouveau mot:");

        javax.swing.GroupLayout createLayout = new javax.swing.GroupLayout(create);
        create.setLayout(createLayout);
        createLayout.setHorizontalGroup(
            createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(envoieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
            .addGroup(createLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(createLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                        .addGap(128, 128, 128))
                    .addGroup(createLayout.createSequentialGroup()
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fieldMot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(motLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(definitionLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldCategorie, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        createLayout.setVerticalGroup(
            createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(motLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldMot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(definitionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(envoieButton)
                .addGap(50, 50, 50))
        );

        selector.addTab("Create", create);

        readArea.setColumns(20);
        readArea.setRows(5);
        jScrollPane3.setViewportView(readArea);

        afficheLabel.setText("Liste de mots");

        afficheBtn.setText("Affiche/Update");
        afficheBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficheBtnActionPerformed(evt);
            }
        });

        motAndType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mot", "Langage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        motAndType.setAutoscrolls(false);
        motAndType.setColumnSelectionAllowed(true);
        motAndType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                motAndTypeMouseClicked(evt);
            }
        });
        listeMot.setViewportView(motAndType);
        motAndType.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (motAndType.getColumnModel().getColumnCount() > 0) {
            motAndType.getColumnModel().getColumn(0).setResizable(false);
            motAndType.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setText("Définitions");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Affichage du glossaire");

        javax.swing.GroupLayout readLayout = new javax.swing.GroupLayout(read);
        read.setLayout(readLayout);
        readLayout.setHorizontalGroup(
            readLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(afficheLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, readLayout.createSequentialGroup()
                .addGroup(readLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(readLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(afficheBtn))
                    .addComponent(listeMot, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(readLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        readLayout.setVerticalGroup(
            readLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(readLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(afficheBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(afficheLabel)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(readLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(listeMot, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        selector.addTab("Read", read);

        searchBtn.setText("GO");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        searchTitle.setText("Recherche");

        updateTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        updateTitle.setText("Mettre à jour une entrée");

        motTitle.setText("Mot");

        catTitle.setText("Categorie");

        updateDefiArea.setColumns(20);
        updateDefiArea.setRows(5);
        updateDefArea.setViewportView(updateDefiArea);

        updateDefTitle.setText("definition");

        updateBtn.setText("Mise à jour");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateDefArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                                .addComponent(updateBtn)
                                .addGap(281, 281, 281)))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                        .addComponent(updateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))))
            .addGroup(updateLayout.createSequentialGroup()
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(updateDefTitle))
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(searchTitle))
                    .addGroup(updateLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateMotField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(motTitle))
                        .addGap(57, 57, 57)
                        .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catTitle)
                            .addComponent(updateCatField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(searchTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(motTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(catTitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateMotField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateCatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(updateDefTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateDefArea, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        selector.addTab("Update", update);

        deteleSearchTitle.setText("Recherche");

        deleteSearchBtn.setText("GO");
        deleteSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSearchBtnActionPerformed(evt);
            }
        });

        deleteTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        deleteTitle.setText("Supprimer une entrée");

        deleteMotTitle.setText("Mot");

        deleteDefTitle.setText("definition");

        deleteCatTitle.setText("Categorie");

        deleteDefiArea.setColumns(20);
        deleteDefiArea.setRows(5);
        updateDefArea1.setViewportView(deleteDefiArea);

        deleteBtn.setText("Supression");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                        .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateDefArea1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                                .addComponent(deleteBtn)
                                .addGap(281, 281, 281)))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                        .addComponent(deleteTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))))
            .addGroup(deleteLayout.createSequentialGroup()
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(deleteDefTitle))
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(deleteSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(deteleSearchTitle))
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteMotField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteMotTitle))
                        .addGap(57, 57, 57)
                        .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteCatTitle)
                            .addComponent(deleteCatField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(deteleSearchTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteCatTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteMotTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteMotField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(deleteDefTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateDefArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        selector.addTab("Delete", delete);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selector)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selector, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        selector.getAccessibleContext().setAccessibleName("Create");

        getAccessibleContext().setAccessibleName("Glossaire");
        getAccessibleContext().setAccessibleDescription("Definition de mot");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Selection d'une cellule lors du clique envoie en info le mot contenue
     * dans la cellule et renvoie la definition correspondante
     *
     * @param evt
     */
    private void motAndTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motAndTypeMouseClicked
        readArea.setLineWrap(true);
        int row = motAndType.getSelectedRow();
        String mot = (String) motAndType.getValueAt(row, 0);
        readArea.setText(ModeleLexique.afficheDefinition(mot));
    }//GEN-LAST:event_motAndTypeMouseClicked

//GEN-FIRST:event_envoieBtnActionPerformed
 
//GEN-LAST:event_envoieBtnActionPerformed
    /**
     * Bouton d'affichage sur l'onglet read Il affiche les éléments dans le
     * tableau
     *
     * @param evt
     */
    private void afficheBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficheBtnActionPerformed
        ///Creation de l'arratList contenant les élément récolter avec la méthode afficheEnsemble///
        ArrayList<Lexique> array = ModeleLexique.afficheEnsemble();

        ///Vide le tableau lors du clique pour eviter les doublons///
        modelTab.setRowCount(0);
        //Pour chaque élément contenus dans array 
        //Crée une nouvelle ligne 
        for (Lexique l : array) {
            modelTab.addRow(l.toArray());
        }
    }//GEN-LAST:event_afficheBtnActionPerformed
    /**
     * Bouton d'envoie dans l'onglet create prend les champ mot, type et
     * definition et envoie la requete a l'aide de la méthode ajouterMot (voir
     * doc)
     *
     * @param evt
     */
    private void envoieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envoieButtonActionPerformed
        //Recuperation des info dans les champ
        String mot = fieldMot.getText();
        String definition = definitionArea.getText();
        String type = fieldCategorie.getText();

        //Envoie vers la méthode de controle 
        controleur.controlCreate(mot, definition, type, this);

        //reinit des case une fois le mot envoyer
        fieldMot.setText("");
        fieldCategorie.setText("");
        definitionArea.setText("");
    }//GEN-LAST:event_envoieButtonActionPerformed
    /**
     * Bouton de mise à jour dans l'onglet update Prend les saisis et envoie la
     * requete via la methode updateMot
     *
     * @param evt
     */
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        //Recuperation des info dans les champ
        String originalMot = searchField.getText();
        String mot = updateMotField.getText();
        String definition = updateDefiArea.getText();
        String type = updateCatField.getText();

        //Envoie vers la méthode
        controleur.controlUpdate(originalMot, mot, definition, type, this);

        //Remise à zero des champ textuel//
        searchField.setText("");
        updateMotField.setText("");
        updateDefiArea.setText("");
        updateCatField.setText("");

    }//GEN-LAST:event_updateBtnActionPerformed
    /**
     * Permet de rechercher des éléments dans l'onglet update Definis les champ
     * vide avec le tableau renvoyer par la méhotde rechercheGlossaire
     *
     * @param evt
     */
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        //Recuperation des info 
        lexique = ModeleLexique.rechercheGlossaire(searchField.getText());
        updateDefiArea.setLineWrap(true);
        int id = lexique.getId();

        if (id == 0) {
            JOptionPane.showMessageDialog(this, "L'entrée n'existe pas");
        } else {
        //Attribution des info dans leur champ respectif
        updateMotField.setText(lexique.getMot());
        updateDefiArea.setText(lexique.getDefinition());
        updateCatField.setText(lexique.getType());
        }
    }//GEN-LAST:event_searchBtnActionPerformed
    /**
     * Même methode de recherche réutilisé
     *
     * @param evt
     */
    private void deleteSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSearchBtnActionPerformed
        //appel la méthode de control 
    Controleur.controlSearchDelete(this);
    }//GEN-LAST:event_deleteSearchBtnActionPerformed
    /**
     * Boutton de supression recupere les info dans le camp mot et crée la
     * requete avec la methode supprimerCategorie
     *
     * @param evt
     */
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        //Recupere les info dans le champ mot//
        String mot = deleteMotField.getText();

        //Appel la méthode et supprime //
        controleur.controlDelete(mot, lexique.getId(), this);

        //Remise à zero des champ textuel//
        deleteDefiArea.setText("");
        deleteMotField.setText("");
        deleteCatField.setText("");
    }//GEN-LAST:event_deleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Vue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton afficheBtn;
    javax.swing.JTextArea definitionArea;
    javax.swing.JTextField deleteCatField;
    javax.swing.JTextArea deleteDefiArea;
    javax.swing.JTextField deleteMotField;
    javax.swing.JButton deleteSearchBtn;
    javax.swing.JTextField deleteSearchField;
    javax.swing.JButton envoieButton;
    javax.swing.JTextField fieldCategorie;
    javax.swing.JTextField fieldMot;
    javax.swing.JTable motAndType;
    javax.swing.JTextArea readArea;
    javax.swing.JButton searchBtn;
    javax.swing.JTextField searchField;
    javax.swing.JTabbedPane selector;
    javax.swing.JButton updateBtn;
    javax.swing.JTextField updateCatField;
    javax.swing.JTextArea updateDefiArea;
    javax.swing.JTextField updateMotField;
    // End of variables declaration//GEN-END:variables
}
