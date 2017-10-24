/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
import java.util.Arrays;

/**
 *
 * @author HP SPECTRE X360
 */
public class VectorHelper {
    
 

    /**
     * @param args the command line arguments
     
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] tab = {55,102,76,11,339,770,30};
       
        
   
        VectorHelper controller = new VectorHelper();
         controller.TrierElement(tab);
         controller.Max_Min_Vecteut(tab);
         controller.MultiplierVecteur(tab);
         controller.InverserVecteur(tab);

        
        
    }
    public void TrierElement ( int tabInitial[]){ 
     Arrays.sort(tabInitial);
   
               System.out.print("votre tableau est desormais trie \n");
                for(int j =0; j<tabInitial.length;j++)
            System.out.print(tabInitial[j]+"  ");            
    }
    
    public void Max_Min_Vecteut (int tabInitial[])
    {
        int leMax = Integer.MAX_VALUE;
        int leMin = Integer.MIN_VALUE;
        
        for (int i=0;i<tabInitial.length;i++)
        {
            if (tabInitial[i]<leMax)
                leMax = tabInitial[i];
        if (tabInitial[i]>leMin)
                leMin = tabInitial[i];
        }
        System.out.print("\nla valeur maximale de votre tableau est:"+leMin);
        System.out.print("\nla valeur minimale de votre tableau est:"+leMax+"\n");
        
        
    }
    
    public void MultiplierVecteur(int tabInitial[]){
        for(int i=0;i<tabInitial.length;i++)
            tabInitial[i]=2*tabInitial[i];
        
           System.out.print("La multiplication des elements du vecteur par deux \n");
                for(int j =0; j<tabInitial.length;j++)
            System.out.print(tabInitial[j]+"  ");    
        
    }
    
    public void InverserVecteur(int tabInitial[]){
        int var = tabInitial[0];
        for (int i =1;i<tabInitial.length;i++)
            tabInitial[i-1]=tabInitial[i];
        tabInitial[tabInitial.length-1]=var;
        
              System.out.print("\nL inversion du vecteur \n");
                for(int j =0; j<tabInitial.length;j++)
            System.out.print(tabInitial[j]+"  ");   
       
        
    }
}
