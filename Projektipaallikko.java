/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package henkilorekisteri;

/**
 *
 * @author Satsuma
 */
public class Projektipaallikko extends Vakituinen {
    
    public Projektipaallikko(String nimi, String sotu, double palkka, double palkankorotusprosentti) {
    
        super(nimi,sotu,palkka,palkankorotusprosentti);
        
    }
    
        @Override
    public void tulosta(){
    
        System.out.println("\r Projektipäällikön tiedot:");
        super.tulosta();
        
    }
    
}
