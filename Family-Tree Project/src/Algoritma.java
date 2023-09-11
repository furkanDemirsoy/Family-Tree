

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author izemd
 */
public class Algoritma {
   int sayac1=0;
   int sayac2=0;
   int sayac3=0;
     public void fonksiyon(Kişi root)
    {
        
    
    if(root.child1!=null)
    {
        
    
   if(root.occupation.equals(root.child1.occupation))
   {
       System.out.println(root.child1.name+root.child1.surname+" in mesleği ve "+root.name+root.surname+"mesleği aynıdır bu meslek:"+root.occupation);
   }
   if(root.child2!=null)
   {
       
   
   if(root.occupation.equals(root.child2.occupation))
   {
       
       System.out.println(root.child2.name+root.child2.surname+" in mesleği ve "+root.name+root.surname+"mesleği aynıdır bu meslek:"+root.occupation);
   }
   }
   if(root.child3!=null)
   {
       
   
   if(root.occupation.equals(root.child3.occupation))
   {
       System.out.println(root.child3.name+root.child3.surname+" in mesleği ve "+root.name+root.surname+"mesleği aynıdır bu meslek:"+root.occupation);
   }
   }
   if(root.child1!=null)
   {
       fonksiyon(root.child1);
       sayac1++;
   }
   if(root.child2!=null)
   {
       fonksiyon(root.child2);
       sayac2++;
   }
   if(root.child3!=null)
   {
       fonksiyon(root.child3);
       sayac3++;
   }
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    }
   
    
   
    }
     int maxDepth(Kişi root)  
  { 
    
    if (root == null) 
      return 0; 

    
    int sayac1 = maxDepth(root.child1); 
    int sayac2 = maxDepth(root.child1); 
    int sayac3=maxDepth(root.child3);
   
     if(sayac1>=sayac2)
   {
       if(sayac1>=sayac3)
       {
           return sayac1+1;
       }
       else
       {
           return sayac3+1;
       }
   }
   else
   {
       if(sayac2>=sayac3)
       {
           return sayac2+1;
       }
       else
       {
           return sayac3+1;
       }
   }
    
  }

     public void agacfonksiyonu()
     {
          if(sayac1>=sayac2)
   {
       if(sayac1>=sayac3)
       {
           System.out.println("Ağacın denliği yani kaç soydan oluştuğu:"+sayac1);
       }
       else
       {
           System.out.println("Ağacın derinliği yani kaç soydan oluştuğu:"+sayac3);
       }
   }
   else
   {
       if(sayac2>=sayac3)
       {
           System.out.println("Ağacın derinliği yani kaç soydan oluştuğu:"+sayac2);
       }
       else
       {
           System.out.println("Ağacın derinliği yani kaç soydan oluştuğu:"+sayac3);
       }
   }
     }
    public void insanbulma(Kişi root)
    {
        
    if(root.child1!=null)
    {
        
    
   if(root.name.equals(root.child1.name))
   {
       System.out.println(root.child1.name+root.child1.surname+" in adı ve "+root.name+root.surname+"nin adı aynıdır ve bu ad:"+root.name);
   }
   if(root.child2!=null)
   {
       
   
   if(root.name.equals(root.child2.name))
   {
       
       System.out.println(root.child1.name+root.child1.surname+" in adı ve "+root.name+root.surname+"nin adı aynıdır ve bu ad:"+root.name);
   }
   }
   if(root.child3!=null)
   {
       
   
   if(root.name.equals(root.child3.name))
   {
       System.out.println(root.child1.name+root.child1.surname+" in adı ve "+root.name+root.surname+"nin adı aynıdır ve bu ad:"+root.name);
   }
   }
   if(root.child1!=null)
   {
       fonksiyon(root.child1);
       sayac1++;
   }
   if(root.child2!=null)
   {
       fonksiyon(root.child2);
       sayac2++;
   }
   if(root.child3!=null)
   {
       fonksiyon(root.child3);
       sayac3++;
   }
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    }
   
    }
}
