/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo_da_memoria;

/**
 *
 * @author Aluno
 */
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import jdk.nashorn.internal.objects.NativeArray;
import jogo_da_memoria.IconeJogo;

/**
 *
 * @author Aluno
 */
public class Jogo {
    private Thread t1, t2;
    private JLabel[] vetlab;
    private File[] fileimg = null;
    private int contador = 0;
    private JLabel vetimg;
    private int nomeIMG,cont;
    
    //Um vetor de icones que serão embaralhados
    IconeJogo[] ic ;
    //Um seletor de arquivos
    public JFileChooser escolha;

        MouseListener m = new MouseInputListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getButton() == 1) {
                JLabel jl = (JLabel)e.getComponent();
                for(int i = 0; i < vetlab.length; i++) {
                    if(jl.getLocation().equals(vetlab[i].getLocation())){
                        vetlab[i].setIcon(ic[i]);
                        contador++;
                        if(contador == 2 ){
                            
                            if(((IconeJogo)vetlab[i].getIcon()).getChave() == ((IconeJogo)vetimg.getIcon()).getChave()  ){
                                JOptionPane.showMessageDialog(null,"ACERTOU CAMPEÃO!!");
                                vetlab[i].removeMouseListener(this);
                                vetlab[nomeIMG].removeMouseListener(this);
                                contador=0;
                                cont++;
                                if(cont == vetlab.length/2){
                                    JOptionPane.showMessageDialog(null, "PARABÉNS!! VOCÊ VENCEU!!");
                                 
                                }
                            }else{
                             JOptionPane.showMessageDialog(null,"NÃO FOI DESSA VEZ CAMPEÃO!!");
                                contador =0;
                                try {
                                    vetlab[i].setIcon(new ImageIcon(ImageIO.read(new File("AQUI VAI O CAMINHO PARA A IMAGEM")).
                                            getScaledInstance(vetlab[0].getWidth(),vetlab[0].getHeight(),Image.SCALE_AREA_AVERAGING)));
                                    
                                    vetlab[nomeIMG].setIcon(new ImageIcon(ImageIO.read(new File("AQUI VAI O CAMINHO PARA A IMAGEM")).
                                            getScaledInstance(vetlab[0].getWidth(), vetlab[0].getHeight(),Image.SCALE_AREA_AVERAGING)));
                                } catch (IOException ex) {
                                    Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }else{
                             nomeIMG = i;
                            vetimg = vetlab[i];
                        }
                    }
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
             //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
             //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
             //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
             //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseDragged(MouseEvent e) {
             //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseMoved(MouseEvent e) {
             //To change body of generated methods, choose Tools | Templates.
        }

        
    };
    
    public Jogo(JLabel[] jogo) {
        ic = new IconeJogo [jogo.length];
        this.vetlab = jogo;
                for(int i = 0; i < jogo.length; i++) {
                    jogo[i].addMouseListener(m);
                }
    }
    
    public JLabel[] getjogo() {
        return vetlab;
    }

    public void setjogo(JLabel[] jogo) {
        this.vetlab= jogo;
    }

    public JFileChooser getEscolha() {
        return escolha;
    }

    public void setEscolha(JFileChooser escolha) {
        this.escolha = escolha;
    }
    
    
    public void Jogar(int Altura,int Largura){
        cont = 0;
        
    for(int i = 0; i < vetlab.length; i++) {
               try {
                   vetlab[i].setIcon(new ImageIcon(ImageIO.read(new File("AQUI VAI O CAMINHO PARA A IMAGEM")).
                           getScaledInstance(Altura, Largura,Image.SCALE_AREA_AVERAGING)));
               } catch (IOException ex) {
                   System.out.println(ex.getMessage());
               }
        }
    }
    
    public void carregaImagens(int A,int L,JFrame j) throws IOException, InterruptedException {
            int cont=0;
        //Primeiro armazena todos os caminhos das imagens selecionadas
        if (escolha.showOpenDialog(j) == JFileChooser.APPROVE_OPTION) {
            fileimg = escolha.getSelectedFiles();
                SystemTray tray = SystemTray.getSystemTray();
        //Adicionar um Icone para o Tray
              /*  URL image = getClass().getResource("/imagens/Koala.jpg");
                TrayIcon icone = new TrayIcon(new ImageIcon(image, "JAVÃO RAPA!!!").getImage());
                 icone.setImageAutoSize(true);*/
        }
     //Depois faz a distribuição das imagens nas labels
        //A alocação será aleatória, cada imagem estará em 2 lugares distintos
        int sort1, sort2;
        for (int i = 0; i < ic.length/2; i++) {//Roda só a metade pois carrega de 2 em 2 imagens
            //Faz um sorteio de posição para um8a imagem
            do {
                sort1 = (int) (Math.random() * (ic.length));
            } while (ic[sort1] != null);
            ic[sort1] = new IconeJogo( (ImageIO.read(fileimg[sort1]).
                    getScaledInstance(A, L,
                            Image.SCALE_AREA_AVERAGING)));
            cont++;
            ic[sort1].setChave(cont);
                            
          //A mesma imagem para uma posição diferente
         do {
                sort2 = (int) (Math.random() * (ic.length));
            } while (ic[sort2] != null);
            ic[sort2] = new IconeJogo( (ImageIO.read(fileimg[sort1]).
                    getScaledInstance(A, L,
                            Image.SCALE_AREA_AVERAGING)));
            ic[sort2].setChave(cont);
        }
        //Coloca cada imagem na devida label
        for (int i = 0; i < vetlab.length; i++) {
            vetlab[i].setIcon(ic[i]);
        }
        
        
    } 

   
    }

 

