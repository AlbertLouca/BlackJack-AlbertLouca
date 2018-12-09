/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import static blackjack.BlackJack.deck;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Chadi N. Louca
 */
public class JGame extends JFrame{
    JPanel p1;
    Graphics myg;
    JLabel icon;
    JButton hit;
    JButton stand;
    Random rand;
    Hand h1;
    int xcor;
    int ycor;
    //JLabel PlayerN;
    //JTextField Name;
    JLabel PlayerS;
    JLabel EnemyS;
    JLabel result;
    BufferedImage img;
    //Card x1;
  //  Card x2;
    JLabel c1;
    JLabel c2;
    Hand h2;
    int n=52;
    int rn;
    JGame() throws IOException {
      //  this.setLayout(null);
        xcor=40;
        ycor=50;
        h2=new Hand();
        EnemyS=new JLabel("opponent Score: "+h2.sum);
        //EnemyS.setForeground(Color.red);
        EnemyS.setBounds(800,0,300,50);
      
    p1=new JPanel();
      p1.add(EnemyS);
    h1=new Hand();
    rand=new Random();
    rn=rand.nextInt(n)+1;
    //Card x1=deck.get(rn);
    c1=new JLabel();
    c1.setIcon(new ImageIcon(new ImageIcon(deck.get(rn).img).getImage().getScaledInstance(240, 320,Image.SCALE_SMOOTH)));
   // h1.addHand(x1);
   h1.addHand(deck.get(rn));
   deck.remove(rn);
   n=n-1;
   c1.setBounds(xcor,ycor,500,726);
   p1.add(c1);
    //h2.addHand();
     rn=rand.nextInt(n)+1;
     c2=new JLabel();
      c2.setIcon(new ImageIcon(new ImageIcon(deck.get(rn).img).getImage().getScaledInstance(240, 320,Image.SCALE_DEFAULT) ));
 c2.setBounds(xcor+100,ycor,500,726);
 p1.add(c2);
     h1.addHand(deck.get(rn));
     deck.remove(rn);
     n=n-1;
    p1.setLayout(null);
    this.add(p1);
    p1.setBackground(Color.black);
    setExtendedState(JFrame.MAXIMIZED_BOTH); 
    PlayerS=new JLabel("your score :"+h1.sum, JLabel.CENTER);
    
    PlayerS.setForeground(Color.white);
    PlayerS.setBounds(0,0,100,50);
    p1.add(PlayerS);
    setBounds(300,300,455,339);
    setTitle("BlackJack MIU edition");
    hit=new JButton("Hit");
    hit.setBounds(300,500,100,50);
    hit.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
           
      
       JLabel j=new JLabel();
       n=n-1;
         rn=rand.nextInt(n);
       
           j.setIcon(new ImageIcon(new ImageIcon(deck.get(rn).img).getImage().getScaledInstance(240, 320, Image.SCALE_DEFAULT)));
        j.setBounds(xcor+200,ycor,500,726);
       p1.add(j);
       h1.addHand(deck.get(rn));
        PlayerS.setText("your score :"+h1.sum);
       xcor=xcor+100;
      // j.setVisible(true);
      deck.remove(rn);
      
      repaint();
      if(h1.sum>21){
          JOptionPane.showMessageDialog(null,"You Lost ");
          
         if(0==JOptionPane.OK_OPTION)
         System.exit(0);
        
          
      }
        }
        
    });
    
    stand=new JButton("Stand");
    stand.setBounds(800,500,100,50);
    p1.add(hit);
    p1.add(stand);
    stand.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                while(h2.sum<11){
    rn=rand.nextInt(n)+1;
         h2.addHand(deck.get(rn));
          // PlayerS.setText("opponent Score :"+h2.sum);
         deck.remove(rn);
         n--;
                
            }
               if(h1.sum>h2.sum)
                   JOptionPane.showMessageDialog(null,"You won with a difference of "+(h1.sum-h2.sum));
               else if(h2.sum>h1.sum) JOptionPane.showMessageDialog(null,"RNG defeated u with a sore of "+h2.sum);
               else JOptionPane.showMessageDialog(null,"its a Draw ");
                 System.exit(0);
    repaint();
    
    
    
    
    
    }});
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    //workinggggg
//    File x=new File("C:\\\\Users\\\\Chadi N. Louca\\\\Desktop\\\\Cards\\\\Blackjack_dealer_table_455x339.jpg");
//        img=ImageIO.read(x);
//        icon=new JLabel();
//        icon.setIcon(new ImageIcon(img));
//        p1.add(icon);
//        icon.setBounds(0,0,455,339);
//        
//        
    
//        icon=new JLabel();
//        icon.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Chadi N. Louca\\Desktop\\Cards\\Blackjack_dealer_table_455x339").getImage().getScaledInstance(455,339,Image.SCALE_DEFAULT)));
//        p1.add(icon);
//        icon.setBounds(0,0,455,339);
    }  
//    public void paint(Graphics g){
//        
//        
//        
//        try {
//            myg=g;
//            
//            super.paint(g);  
//            img = ImageIO.read(new File("C:\\Users\\Chadi N. Louca\\Desktop\\Cards\\Blackjack_dealer_table_455x339"));
//            g.drawImage(img,0,0,null);
//        } catch (IOException ex) {
//            Logger.getLogger(JGame.class.getName()).log(Level.SEVERE, null, ex);
//        }
   
      
    }
    

