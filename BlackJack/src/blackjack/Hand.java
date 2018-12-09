/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import static blackjack.BlackJack.deck;
import java.util.ArrayList;

/**
 *
 * @author Chadi N. Louca
 */
public class Hand {
    int sum;
    Hand()
    {sum=0;
    }
    ArrayList<Card>hands=new ArrayList<Card>(2);
    void addHand(Card x){
        sum+=x.value;
        hands.add(x);
        
    }
    
}
