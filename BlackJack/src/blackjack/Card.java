/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Chadi N. Louca
 */
public class Card {
    Card(){
        
    }
    int value;
    String name;
    BufferedImage img;
    Card(String n,int v) throws IOException{
        //img=ImageIO.read((new File("C:\\Users\\Chadi N. Louca\\Desktop\\Cards\\"+name)));
        
        name=n;
        value=v;
        img=(ImageIO.read(new File("C:\\Users\\Chadi N. Louca\\Desktop\\Cards\\"+name+".png")));
    }
}
