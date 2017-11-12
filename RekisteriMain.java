/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package henkilorekisteri;

import java.util.ArrayList;

/**
 *
 * @author Satsuma
 */
public class RekisteriMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Parametrillisessä konstruktorissa arvot annetaan olioita luodessa.
         Parametrittomassa konstruktorissa arvot asetetaan valmiiksi.
         
         Set-metodilla voi muokata arvoa.*/
       
        
        Harjoittelija h = new Harjoittelija("Matu Pajala", "140678-554L");
        
        //h.tulosta();
        
        Johtaja j = new Johtaja("Pekka Kaunokainen", "142561-45L", 5000.00, 2.0);
        
        //Tässä on palkankorotus:
        j.tulosta();
       
        
        j.korotaPalkkaa();
        
        j.tulosta();
        
        j.korotaPalkkaa();
       
        j.tulosta();
        
        Projektipaallikko p = new Projektipaallikko("Leia Sienimetsä", "250190-15JK", 4500.50, 2.5);
       // p.tulosta();
        
        Tyontekija t = new Tyontekija("Sukero Tillikainen", "141200-126S", 4000.78, 3.0);
       // t.tulosta();
        
        
        //luodaan taulukko
        Henkilo[]henkilosto = new Henkilo[4];
        
        
        henkilosto[0] = h;
        henkilosto[1] = j;
        henkilosto[2] = p;
        henkilosto[3] = t;

        
        
        /* for (int i = 0; i < henkilosto.length; i++)
        {
        
            henkilosto[i] = h;
            
        } */
        
        for (int i = 0; i < henkilosto.length; i++)
        {
        
            System.out.println("\r Tässä on työntekijät taulukossa: ");
            
            henkilosto[i].tulosta();           
            
            ///System.out.println(Arrays.toString(henkilosto));
        }
        
        
        
        
        ArrayList<Object> henkilostot = new ArrayList<Object>();
        
        henkilostot.add(h);
        henkilostot.add(j);
        henkilostot.add(p);
        henkilostot.add(t);

        System.out.println("\r ArrayList testi " );

       
        System.out.println(henkilostot.get(0));
        System.out.println(henkilostot.get(1));
        System.out.println(henkilostot.get(2));
        System.out.println(henkilostot.get(3));
        
                
        System.out.println("\r ArrayList testi 2 \r" + henkilostot.toString());
        
        System.out.println("ArrayList testi 3: ");
        
        ArrayList<Henkilo> henkilosto2 = new ArrayList<Henkilo>();
        henkilosto2.add(h);
        henkilosto2.add(j);
        henkilosto2.add(p);
        henkilosto2.add(t);
        
        for (int i=0; i<henkilosto2.size(); i++){
        henkilosto2.get(i).tulosta();
        
        
        
       
    }
    
}
}

