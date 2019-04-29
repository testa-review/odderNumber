/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncr;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author sergio
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       List lista = new ArrayList<>();
       lista.add(3);
       lista.add(2);
       lista.add(1);
       lista.add(5);
       int k = 5;
       
       int l=2;
       int r=5;
        
       System.out.println(odderNumber(l, r)); // encuentra los impares entre l y r incluidos.
    }
    
    
    static List<Integer> odderNumber(int l, int r){
        List<Integer> lista = new ArrayList<>();
    
        for (int i = l; i <= r; i++) {
            if(i%2!=0) lista.add(i);
        }
        
        return lista;
    
    }
    
}
