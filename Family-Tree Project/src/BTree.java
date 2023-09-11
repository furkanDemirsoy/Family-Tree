
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.lang.String;
import java.util.ArrayList;
/**
 *
 * @author izemd
 */
public class BTree {
    
    Kişi root;
    public ArrayList<Kişi> arraylist=new ArrayList<>();
    public BTree() {
        this.root = null;//sadece ilk human nesnesi oluşturulurken bu kullanılır
    }

    

   

    

  
   
    
  
    Kişi Kişiekle(String id, String name, String surname, String birthdate,String eşi,String eşid, String momname, String dadname, String kindofblood, String occupation,String evlilik, String maiden, String gender)
    {
        root=new Kişi(id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
        return root;//burada (yani üst satırda kişi sınıfının constractrlarına gönderilir bilgiler bu her gönderidede bu sayede 
        //childlar null olur
    }
    
    int sayac2=0;
    
    
    Kişi rekursive(Kişi root,String id, String name, String surname, String birthdate,String eşi,String eşid, String momname, String dadname, String kindofblood, String occupation,String evlilik, String maiden, String gender)
    {
         if(root.child1!=null&&root.child2!=null&&root.child3!=null)//hepsi doluysa gelen çocuk kimin onu bulmak için aşağıya yazıyoruz
          {
               if(dadname.equals(root.child1.name)||momname.equals(root.child1.name))
               {
                  
                  if(root.child1.child1==null)
                  {
                      
                  
               root.child1.child1=Traverse(root.child1.child1,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child1.child1!=null&&root.child1.child2==null)
                  {
                      root.child1.child2=Traverse(root.child1.child2,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child1.child1!=null&&root.child1.child2!=null&&root.child1.child3==null)
                  {
                      root.child1.child3=Traverse(root.child1.child3,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
               //ancak şu anda hepsini 1. çocuk diye bağlıyoruz
               
               
               }
               else if(dadname.equals(root.child2.name)||momname.equals(root.child2.name))
               {
                            
                  if(root.child2.child1==null)
                  {
                      
                  
               root.child2.child1=Traverse(root.child2.child1,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child2.child1!=null&&root.child2.child2==null)
                  {
                      root.child2.child2=Traverse(root.child2.child2,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child2.child1!=null&&root.child2.child2!=null&&root.child2.child3==null)
                  {
                      root.child2.child3=Traverse(root.child2.child3,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
               }
               else if(dadname.equals(root.child3.name)||momname.equals(root.child3.name))
               {
                    
                  if(root.child3.child1==null)
                  {
                      
                  
               root.child3.child1=Traverse(root.child3.child1,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child3.child1!=null&&root.child3.child2==null)
                  {
                      root.child3.child2=Traverse(root.child3.child2,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child3.child1!=null&&root.child3.child2!=null&&root.child3.child3==null)
                  {
                      root.child3.child3=Traverse(root.child3.child3,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
               }
          
          }
          //22222222222222222222222222222222222222222222222222222222222222222222222222222222
          else if(root.child1!=null&&root.child2!=null&&root.child3==null)//ilk ikisi doluysa
          {
              if(dadname.equals(root.child1.name)||momname.equals(root.child1.name))
               {
                  
                  if(root.child1.child1==null)
                  {
                      
                  
               root.child1.child1=Traverse(root.child1.child1,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child1.child1!=null&&root.child1.child2==null)
                  {
                      root.child1.child2=Traverse(root.child1.child2,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child1.child1!=null&&root.child1.child2!=null&&root.child1.child3==null)
                  {
                      root.child1.child3=Traverse(root.child1.child3,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
               //ancak şu anda hepsini 1. çocuk diye bağlıyoruz
               
               
               }
               else if(dadname.equals(root.child2.name)||momname.equals(root.child2.name))
               {
                            
                  if(root.child2.child1==null)
                  {
                      
                  
               root.child2.child1=Traverse(root.child2.child1,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child2.child1!=null&&root.child2.child2==null)
                  {
                      root.child2.child2=Traverse(root.child2.child2,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child2.child1!=null&&root.child2.child2!=null&&root.child2.child3==null)
                  {
                      root.child2.child3=Traverse(root.child2.child3,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
               }
          }
          //1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
          else if(root.child1!=null&&root.child2==null&&root.child3==null)//sadece 1. doluysa
          {
              if(dadname.equals(root.child1.name)||momname.equals(root.child1.name))
               {
                  
                  if(root.child1.child1==null)
                  {
                      
                  
               root.child1.child1=Traverse(root.child1.child1,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child1.child1!=null&&root.child1.child2==null)
                  {
                      root.child1.child2=Traverse(root.child1.child2,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child1.child1!=null&&root.child1.child2!=null&&root.child1.child3==null)
                  {
                      root.child1.child3=Traverse(root.child1.child3,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
               //ancak şu anda hepsini 1. çocuk diye bağlıyoruz
               
               
               }
          }
         return root;
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    Kişi Traverse(Kişi root,String id, String name, String surname, String birthdate,String eşi,String eşid, String momname, String dadname, String kindofblood, String occupation,String evlilik, String maiden, String gender)
    {int kontrol1=0;
    int kontrol2=0;
    int kontrol3=0;
    int kontrol4=0;
    /*
    if( !arraylist.isEmpty())
    {
        for(int i=0;i<arraylist.size();i++)
        {
            if(momname.equals(arraylist.get(i).name)||dadname.equals(arraylist.get(i).name))
            {
                root=arraylist.get(i);
             root.child1= Traverse(B,id,name,surname,birthdate,eşi,momname,dadname,kindofblood,occupation,evlilik,maiden,gender);
              System.out.println(arraylist.get(i).name);
            }
        }  
    }
    
    */
    
    
    
        if(!(root==null))
        {
           if(root.child2==null &&root.child3==null&&root.child4==null&&root.child1==null)
           {
               if((dadname.equals(root.name)||momname.equals(root.name)))
               {
                   
               
         //   System.out.println("éşkflşd");
               if(root.child1 == null)
               {
                   kontrol1=1;
               root.child1=Traverse(root.child1,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
             //  arraylist.add(root.child1);
               
               }
             //  System.out.println(root.child1.name+sayac2);
               sayac2++;
               }
              
           }    
           else if(!(root.child1==null) && root.child2==null &&root.child3==null&&root.child4==null)
           {
               if(dadname.equals(root.name)||momname.equals(root.name))
               {
                   
               
               if(root.child2 == null)
               {
                   kontrol2=1;
                   root.child2=Traverse(root.child2,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  // arraylist.add(root.child2);
               }
              // System.out.println(root.child2.name+sayac2);
               }
           }
           else if(!(root.child2==null) &&root.child3==null&&root.child4==null)
           {
               
           
            if(dadname.equals(root.name)||momname.equals(root.name))
           {
               if(root.child3 == null)
               {
                   kontrol3=1;
               root.child3=Traverse(root.child3,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
             //  arraylist.add(root.child3);
               }
            //  System.out.println(root.child3.name+sayac2);
           }
           }
           
           else if(!(root.child3==null)&&root.child4==null)
           {
               
           
            if(dadname.equals(root.child3.name)||momname.equals(root.child3.name))
           {
               if(root.child4 == null)
               {
                   kontrol4=1;
               root.child4=Traverse(root.child4,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
              // arraylist.add(root.child4);
               }
           }
           }
           //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
           //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
           
          if(root.child1!=null&&root.child2!=null&&root.child3!=null)//hepsi doluysa gelen çocuk kimin onu bulmak için aşağıya yazıyoruz
          {
               if(dadname.equals(root.child1.name)||momname.equals(root.child1.name))
               {
                  
                  if(root.child1.child1==null)
                  {
                      
                  
               root.child1.child1=Traverse(root.child1.child1,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child1.child1!=null&&root.child1.child2==null)
                  {
                      root.child1.child2=Traverse(root.child1.child2,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child1.child1!=null&&root.child1.child2!=null&&root.child1.child3==null)
                  {
                      root.child1.child3=Traverse(root.child1.child3,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
               //ancak şu anda hepsini 1. çocuk diye bağlıyoruz
               
               
               }
               else if(dadname.equals(root.child2.name)||momname.equals(root.child2.name))
               {
                            
                  if(root.child2.child1==null)
                  {
                      
                  
               root.child2.child1=Traverse(root.child2.child1,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child2.child1!=null&&root.child2.child2==null)
                  {
                      root.child2.child2=Traverse(root.child2.child2,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child2.child1!=null&&root.child2.child2!=null&&root.child2.child3==null)
                  {
                      root.child2.child3=Traverse(root.child2.child3,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
               }
               else if(dadname.equals(root.child3.name)||momname.equals(root.child3.name))
               {
                    
                  if(root.child3.child1==null)
                  {
                      
                  
               root.child3.child1=Traverse(root.child3.child1,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child3.child1!=null&&root.child3.child2==null)
                  {
                      root.child3.child2=Traverse(root.child3.child2,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child3.child1!=null&&root.child3.child2!=null&&root.child3.child3==null)
                  {
                      root.child3.child3=Traverse(root.child3.child3,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
               }
          
          }
          //22222222222222222222222222222222222222222222222222222222222222222222222222222222
          else if(root.child1!=null&&root.child2!=null&&root.child3==null)//ilk ikisi doluysa
          {
              if(dadname.equals(root.child1.name)||momname.equals(root.child1.name))
               {
                  
                  if(root.child1.child1==null)
                  {
                      
                  
               root.child1.child1=Traverse(root.child1.child1,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child1.child1!=null&&root.child1.child2==null)
                  {
                      root.child1.child2=Traverse(root.child1.child2,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child1.child1!=null&&root.child1.child2!=null&&root.child1.child3==null)
                  {
                      root.child1.child3=Traverse(root.child1.child3,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
               //ancak şu anda hepsini 1. çocuk diye bağlıyoruz
               
               
               }
               else if(dadname.equals(root.child2.name)||momname.equals(root.child2.name))
               {
                            
                  if(root.child2.child1==null)
                  {
                      
                  
               root.child2.child1=Traverse(root.child2.child1,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child2.child1!=null&&root.child2.child2==null)
                  {
                      root.child2.child2=Traverse(root.child2.child2,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child2.child1!=null&&root.child2.child2!=null&&root.child2.child3==null)
                  {
                      root.child2.child3=Traverse(root.child2.child3,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
               }
          }
          //1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
          else if(root.child1!=null&&root.child2==null&&root.child3==null)//sadece 1. doluysa
          {
              if(dadname.equals(root.child1.name)||momname.equals(root.child1.name))
               {
                  
                  if(root.child1.child1==null)
                  {
                      
                  
               root.child1.child1=Traverse(root.child1.child1,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child1.child1!=null&&root.child1.child2==null)
                  {
                      root.child1.child2=Traverse(root.child1.child2,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
                  else if(root.child1.child1!=null&&root.child1.child2!=null&&root.child1.child3==null)
                  {
                      root.child1.child3=Traverse(root.child1.child3,id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
                  }
               //ancak şu anda hepsini 1. çocuk diye bağlıyoruz
               
               
               }
          }
          
          //SON NESİİİİİİİİİİİİLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL
          
          
          
          
               if(root.child1!=null&&root.child2!=null&&root.child3!=null)
               {
           
           rekursive(root.child1,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
           rekursive(root.child2,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
           rekursive(root.child3,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
           
               }
               else if(root.child1!=null&&root.child2!=null&&root.child3==null)
               {
                   rekursive(root.child1,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
                   rekursive(root.child2,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
               }
               else if(root.child1!=null&&root.child2==null&&root.child3==null)
               {
                   rekursive(root.child1,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
               }
           //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS
            
           
           
           if(root.child1!=null)
           {
           
               
             if(root.child1.child1!=null&&root.child1.child2!=null&&root.child1.child3!=null)
               {
           
           rekursive(root.child1.child1,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
           rekursive(root.child1.child2,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
           rekursive(root.child1.child3,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
           
               }
               else if(root.child1.child1!=null&&root.child1.child2!=null&&root.child1.child3==null)
               {
                   rekursive(root.child1.child1,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
                   rekursive(root.child1.child2,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
               }
               else if(root.child1.child1!=null&&root.child1.child2==null&&root.child1.child3==null)
               {
                   rekursive(root.child1.child1,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
               }
           
           }
           
           //eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
           
             if(root.child2!=null)
           {
           
               
             if(root.child2.child1!=null&&root.child2.child2!=null&&root.child2.child3!=null)
               {
           
           rekursive(root.child2.child1,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
           rekursive(root.child2.child2,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
           rekursive(root.child2.child3,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
           
               }
               else if(root.child2.child1!=null&&root.child2.child2!=null&&root.child2.child3==null)
               {
                   rekursive(root.child2.child1,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
                   rekursive(root.child2.child2,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
               }
               else if(root.child2.child1!=null&&root.child2.child2==null&&root.child2.child3==null)
               {
                   rekursive(root.child2.child1,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
               }
           
           }
           
           //QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ
           
           
             if(root.child3!=null)
           {
           
               
             if(root.child3.child1!=null&&root.child3.child2!=null&&root.child3.child3!=null)
               {
           
           rekursive(root.child3.child1,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
           rekursive(root.child3.child2,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
           rekursive(root.child3.child3,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
           
               }
               else if(root.child3.child1!=null&&root.child3.child2!=null&&root.child3.child3==null)
               {
                   rekursive(root.child3.child1,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
                   rekursive(root.child3.child2,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
               }
               else if(root.child3.child1!=null&&root.child3.child2==null&&root.child3.child3==null)
               {
                   rekursive(root.child3.child1,id,name,surname,birthdate,eşi,eşid, momname,dadname,kindofblood, occupation,evlilik,maiden,gender);
               }
           
           }
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
          // System.out.println(root.left.name);
        //   System.out.println(root.child4.name);
       //   System.out.println("----");
        } 
        else
        {
            root=Kişiekle(id,name,surname,birthdate,eşi,eşid,momname,dadname,kindofblood,occupation,evlilik, maiden,gender);
        }
       
        return root;
}
    
}
   
    

