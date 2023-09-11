
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author izemd
 */
public class stack {
      public ArrayList<Kişi> arraylistnesne=new ArrayList<>();
int back;//arkadaki elemanı gösterir
int front;//öndeki elemanı gösteriri
int maxsize;//bence bu bende olmamalı
int eleman ;//eleman sayısı 
     stack()
     {
         
     }
    public void add(Kişi nesne)
    {
       
       
        arraylistnesne.add(nesne);
        
                
    }
    public Kişi pull()
    {
        int g=arraylistnesne.size();
        g=g-1;
       return  arraylistnesne.get(g);
      
    }
    public void sil()
    {
        int g=arraylistnesne.size();
        g=g-1;
        arraylistnesne.remove(g);
    }
}
