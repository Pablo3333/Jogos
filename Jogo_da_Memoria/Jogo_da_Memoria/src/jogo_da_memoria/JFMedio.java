/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo_da_memoria;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Aluno
 */
public class JFMedio extends javax.swing.JFrame {
 JLabel[] jogo;
    //Um seletor de arquivos
    JFileChooser escolhaF;
    Boolean AT = false;
    SystemTray tray;
    TrayIcon ticon;
    int cont;
    Icon ic1, ic2;
    File[] imagens;
    ImageIcon[] ic;
    /**
     * Creates new form JFMedio
     */
    public JFMedio() {
        initComponents();
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
        /*jogo = new JLabel[]{lblImg1, lblImg2, lblImg3, lblImg4, lblImg5, lblImg6,lblImg7,lblImg8,lblImg9,lblImg10};
        escolha = new JFileChooser();
        //Permitir que se escolha vários arquivos
        escolha.setDialogTitle("Escolha pelo menos " + jogo.length + " imagens para o Jogo da Memória");
        escolha.setMultiSelectionEnabled(true);
        //Permitir que se escolha apenas imagens
        escolha.setFileFilter(new FileNameExtensionFilter("Imagens", "bmp", "png", "jpg"));
        escolha.setAcceptAllFileFilterUsed(false);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMedio = new javax.swing.JPanel();
        lblImg1 = new javax.swing.JLabel();
        lblImg2 = new javax.swing.JLabel();
        lblImg3 = new javax.swing.JLabel();
        lblImg4 = new javax.swing.JLabel();
        lblImg5 = new javax.swing.JLabel();
        lblImg6 = new javax.swing.JLabel();
        lblImg7 = new javax.swing.JLabel();
        lblImg14 = new javax.swing.JLabel();
        lblImg15 = new javax.swing.JLabel();
        lblImg8 = new javax.swing.JLabel();
        lblImg16 = new javax.swing.JLabel();
        lblImg17 = new javax.swing.JLabel();
        lblImg18 = new javax.swing.JLabel();
        lblImg19 = new javax.swing.JLabel();
        lblImg20 = new javax.swing.JLabel();
        lblImg9 = new javax.swing.JLabel();
        lblImg10 = new javax.swing.JLabel();
        lblImg11 = new javax.swing.JLabel();
        lblImg12 = new javax.swing.JLabel();
        lblImg13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnSortear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMedio.setLayout(new java.awt.GridLayout(4, 10));

        lblImg1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg1);

        lblImg2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg2);

        lblImg3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg3);

        lblImg4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg4);

        lblImg5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg5);

        lblImg6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg6);

        lblImg7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg7);

        lblImg14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg14);

        lblImg15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg15);

        lblImg8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg8);

        lblImg16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg16);

        lblImg17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg17);

        lblImg18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg18);

        lblImg19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg19);

        lblImg20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg20);

        lblImg9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg9);

        lblImg10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg10);

        lblImg11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg11);

        lblImg12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg12);

        lblImg13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMedio.add(lblImg13);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnSortear.setBackground(new java.awt.Color(255, 255, 255));
        btnSortear.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSortear.setText("SORTEAR");
        btnSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSortear, btnVoltar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSortear)
                    .addComponent(btnVoltar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSortear, btnVoltar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMedio, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearActionPerformed
     try {
         carregaM();
     } catch (IOException ex) {
         Logger.getLogger(JFMedio.class.getName()).log(Level.SEVERE, null, ex);
     } catch (InterruptedException ex) {
         Logger.getLogger(JFMedio.class.getName()).log(Level.SEVERE, null, ex);
     }
        

    }//GEN-LAST:event_btnSortearActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:

        if (Principal.jf1 == null) {
            Principal.jf1 = new JFEscolha();
        } else {
            Principal.jf1.setVisible(true);

        }
        setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(JFMedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMedio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSortear;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImg1;
    private javax.swing.JLabel lblImg10;
    private javax.swing.JLabel lblImg11;
    private javax.swing.JLabel lblImg12;
    private javax.swing.JLabel lblImg13;
    private javax.swing.JLabel lblImg14;
    private javax.swing.JLabel lblImg15;
    private javax.swing.JLabel lblImg16;
    private javax.swing.JLabel lblImg17;
    private javax.swing.JLabel lblImg18;
    private javax.swing.JLabel lblImg19;
    private javax.swing.JLabel lblImg2;
    private javax.swing.JLabel lblImg20;
    private javax.swing.JLabel lblImg3;
    private javax.swing.JLabel lblImg4;
    private javax.swing.JLabel lblImg5;
    private javax.swing.JLabel lblImg6;
    private javax.swing.JLabel lblImg7;
    private javax.swing.JLabel lblImg8;
    private javax.swing.JLabel lblImg9;
    private javax.swing.JPanel pnlMedio;
    // End of variables declaration//GEN-END:variables

    private void carregaM() throws IOException, InterruptedException {
        Jogo j = new Jogo(new JLabel[]{lblImg1, lblImg2, lblImg3, lblImg4, lblImg5, lblImg6,lblImg7,lblImg8,lblImg9,lblImg10,lblImg11, lblImg12, lblImg13, lblImg14, lblImg15, lblImg16,lblImg17,lblImg18,lblImg19,lblImg20});
        j.escolha = new JFileChooser();
        j.escolha.setDialogTitle("Escolha pelo menos " + j.getjogo().length+ " imagens para o Jogo da Memória");
        j.escolha.setMultiSelectionEnabled(true);
        //Permitir que se escolha apenas imagens
        j.escolha.setFileFilter(new FileNameExtensionFilter("Imagens", "bmp", "png", "jpg"));
        j.escolha.setAcceptAllFileFilterUsed(false);
        j.carregaImagens( lblImg1.getWidth(),lblImg1.getHeight(), this);
        //Thread.sleep(8000);
        j.Jogar(lblImg1.getWidth(),lblImg1.getHeight());
    }

   /* private void carregaImagens() throws IOException {
        //Um vetor de arquivos
        File[] imagens = null;
        //Um vetor de icones que serão embaralhados
        Icon[] ic = new Icon[jogo.length];
        //Primeiro armazena todos os caminhos das imagens selecionadas
        if (escolha.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            imagens = escolha.getSelectedFiles();
        }
     //Depois faz a distribuição das imagens nas labels
        //A alocação será aleatória, cada imagem estará em 2 lugares distintos
        int sort1, sort2;
        for (int i = 0; i < ic.length/2; i++) {//Roda só a metade pois carrega de 2 em 2 imagens
            //Faz um sorteio de posição para uma imagem
            do {
                sort1 = (int) (Math.random() * (ic.length));
            } while (ic[sort1] != null);
            ic[sort1] = new ImageIcon(ImageIO.read(imagens[sort1]).
                    getScaledInstance(lblImg1.getWidth(), lblImg1.getHeight(),
                            Image.SCALE_AREA_AVERAGING));;
                            
          //A mesma imagem para uma posição diferente
         do {
                sort2 = (int) (Math.random() * (ic.length));
            } while (ic[sort2] != null);
            ic[sort2] = new ImageIcon(ImageIO.read(imagens[sort1]).
                    getScaledInstance(lblImg1.getWidth(), lblImg1.getHeight(),
                            Image.SCALE_AREA_AVERAGING));;
        }
        //Coloca cada imagem na devida label
        for (int i = 0; i < jogo.length; i++) {
            jogo[i].setIcon(ic[i]);
        }
        
    }*/ 
    
    
    
}
