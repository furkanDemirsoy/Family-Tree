
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author izemd
 */
public class Kişi {
    public String id;
    public String name;
    public String surname;
    public String birthdate;
    public String eşi;
    public String eşid;
    public String momname;
    public String dadname;
    public String kindofblood;
    public String occupation;
    public String evlilik;
    public String maiden;
    public String gender;
    public Kişi child1;
    public Kişi child2;
    public Kişi child3;
    public Kişi child4;
    public Kişi left;
    public Kişi right;
    
    
    public Kişi(String id, String name, String surname, String birthdate,String eşi,String eşid, String momname, String dadname, String kindofblood, String occupation,String evlilik, String maiden, String gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;//bilgiler her yeni nesne oluşturulduğunda buradan atanıcak
        this.birthdate = birthdate;
        this.eşi=eşi;
        this.eşid=eşid;
        this.momname = momname;
        this.dadname = dadname;
        this.kindofblood = kindofblood;
        this.occupation = occupation;
        this.evlilik=evlilik;
        this.maiden = maiden;
        this.gender = gender;
        
        child1=null;
        child2=null;
        child3=null;
        child4=null;
       
        
        
    }
  
    /**
     * @return the id
     */
    
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the birthdate
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the momname
     */
    public String getMomname() {
        return momname;
    }

    /**
     * @param momname the momname to set
     */
    public void setMomname(String momname) {
        this.momname = momname;
    }

    /**
     * @return the dadname
     */
    public String getDadname() {
        return dadname;
    }

    /**
     * @param dadname the dadname to set
     */
    public void setDadname(String dadname) {
        this.dadname = dadname;
    }

    /**
     * @return the kindofblood
     */
    public String getKindofblood() {
        return kindofblood;
    }

    /**
     * @param kindofblood the kindofblood to set
     */
    public void setKindofblood(String kindofblood) {
        this.kindofblood = kindofblood;
    }

    /**
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return the maiden
     */
    public String getMaiden() {
        return maiden;
    }

    /**
     * @param maiden the maiden to set
     */
    public void setMaiden(String maiden) {
        this.maiden = maiden;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the child1
     */
    public Kişi getChild1() {
        return child1;
    }

    /**
     * @param child1 the child1 to set
     */
    public void setChild1(Kişi child1) {
        this.child1 = child1;
    }

    /**
     * @return the child2
     */
    public Kişi getChild2() {
        return child2;
    }

    /**
     * @param child2 the child2 to set
     */
    public void setChild2(Kişi child2) {
        this.child2 = child2;
    }

    /**
     * @return the child3
     */
    public Kişi getChild3() {
        return child3;
    }

    /**
     * @param child3 the child3 to set
     */
    public void setChild3(Kişi child3) {
        this.child3 = child3;
    }

    /**
     * @return the child4
     */
    public Kişi getChild4() {
        return child4;
    }

    /**
     * @param child4 the child4 to set
     */
    public void setChild4(Kişi child4) {
        this.child4 = child4;
    }
    
    
}
