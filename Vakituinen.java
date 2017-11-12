/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package henkilorekisteri;

/**
 *
 * @author Satsuma
 */
public class Vakituinen extends Henkilo {
    
    private double palkka;
    private double palkankorotusprosentti; 
    
    public Vakituinen (String nimi, String sotu , double palkka, double palkankorotusprosentti){
        
        super(nimi,sotu);
        this.palkka = palkka;
        this.palkankorotusprosentti = palkankorotusprosentti;
    }

    public double getPalkka() {
        return palkka;
    }

    public double getPalkankorotusprosentti() {
        return palkankorotusprosentti;
    }

    public void setPalkka(double palkka) {
        this.palkka = palkka;
    }

    public void setPalkankorotusprosentti(double palkankorotusprosentti) {
        this.palkankorotusprosentti = palkankorotusprosentti;
    }
    
    
   @Override
    public void tulosta(){
    
        super.tulosta();
        System.out.println("Palkka: " + this.palkka + "€" + "\r" + "Palkankorotusprosentti: " + this.palkankorotusprosentti + "%");   
    
    }
   
   public void korotaPalkkaa() {
   
   System.out.println("\r Tehdäämpä palkankorotus.");
   this.palkka = (this.getPalkankorotusprosentti() / 100 + 1.0) * this.palkka;
       
   }
    
    
    }

