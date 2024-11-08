/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */


public class SuperHotel {
    static int x[];


    public void reserver(){
              try {
                  System.out.println("test");
                  x[0] = 1;
                  System.out.println("tab");
              } catch (NullPointerException e) {
                  System.out.println(e);
              }
        System.out.println("fin");
    }
    
    public static void main(String args[]) {
        
        SuperHotel s = new SuperHotel();
        s.reserver();
    }
}

