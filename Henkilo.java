/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package henkilorekisteri;

/**
 *
 * @author Satsuma
 */
public class Henkilo {
    
    private String nimi;
    private String sotu;
    
    public Henkilo(String nimi, String sotu){
    
        this.nimi = nimi;
        this.sotu = sotu;
    
    }

    public String getNimi() {
        return nimi;
    }

    public String getSotu() {
        return sotu;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setSotu(String sotu) {
        this.sotu = sotu;
    }
    

    public void tulosta() {
    
    System.out.println("Nimi: " + this.nimi + "\r" + "Sotu: " + this.sotu);
        
    }
    
    
    @Override
   public String toString() {
        return nimi + sotu;
   
   }
    
    
}
