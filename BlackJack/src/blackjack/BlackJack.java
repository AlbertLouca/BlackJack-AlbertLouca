/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Chadi N. Louca
 */
public class BlackJack {

   public static   ArrayList<Card> deck=new ArrayList<>();
    public static void main(String[] args) throws IOException {
  
      
        for(int i=2;i<11;i++){
            deck.add(new Card((i+"_of_clubs"),i));
            deck.add(new Card((i+"_of_diamonds"),i));
            deck.add(new Card((i+"_of_hearts"),i));
            deck.add(new Card((i+"_of_spades"),i));
            
        }
        
        String s[]=new String[4];
        s[0]="Jack";
        s[1]="Queen";
        s[2]="King";
        s[3]="Ace";
        for(int i=0;i<3;i++){
            
            deck.add(new Card((s[i]+"_of_clubs"),10));
            deck.add(new Card((s[i]+"_of_diamonds"),10));
            deck.add(new Card((s[i]+"_of_hearts"),10));
            deck.add(new Card((s[i]+"_of_spades"),10));      
        }
         deck.add(new Card(("Ace_of_clubs"),11));
         deck.add(new Card(("Ace_of_diamonds"),11));
         deck.add(new Card(("Ace_of_hearts"),11));
         deck.add(new Card(("Ace_of_spades"),11));
        JGame df=new JGame();
        df.setVisible(true);
    }
    
}
