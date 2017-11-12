/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package henkilorekisteri;

/**
 *
 * @author Satsuma
 */
public class Tyontekija extends Vakituinen {
    
    public Tyontekija (String nimi, String sotu, double palkka, double palkankorotusprosentti) {
    
        super(nimi,sotu,palkka,palkankorotusprosentti);
        
    }
    
        @Override
    public void tulosta(){
    
        System.out.println("\r Työntekijän tiedot:");
        super.tulosta();
        
    
    
        }
}
