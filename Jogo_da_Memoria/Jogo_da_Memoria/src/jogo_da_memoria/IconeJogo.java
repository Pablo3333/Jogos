/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo_da_memoria;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Aluno
 */
public class IconeJogo extends ImageIcon{
    
    //Chave para validação
    private int chave;

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }
    
    //Construtor

    public IconeJogo(Image image) {
        super(image);
    }
    
    
    
}
