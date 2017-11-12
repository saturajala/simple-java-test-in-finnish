/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package henkilorekisteri;

/**
 *
 * @author Satsuma
 */
public class Harjoittelija extends Henkilo {
    
    public Harjoittelija(String nimi, String sotu){
    super(nimi, sotu);
    }
    
    @Override
    public void tulosta(){
   
    System.out.println("\r Harjoittelijan tiedot");
    super.tulosta();
    
    }
    
}
