
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author izemd
 */
public class Queue {
    
  public ArrayList<Kişi> arraylistnesne=new ArrayList<>();
int back;//arkadaki elemanı gösterir
int front;//öndeki elemanı gösteriri
int maxsize;//bence bu bende olmamalı
int eleman ;//eleman sayısı 
     Queue()
     {
         
     }
    public void add(Kişi nesne)
    {
       
        arraylistnesne.add(nesne);
        
                
    }
    public Kişi poll()
    {
       return  arraylistnesne.get(0);
      
    }
    public void sil()
    {
        arraylistnesne.remove(0);
    }
            
    }

    
    
     
