/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binnursandikci.lessons.lesson06;

/**
 *
 * @author User
 */
public class MyOuter {

    private int x = 7;

    class MyInner {

        public void seeOuter() {
            System.out.println("Outer x is" + x);
            System.out.println("Inner class ref is" + this);
            System.out.println("Outer class ref is" + MyOuter.this);
        }
    }

    public void makeInner() {
        MyInner in = new MyInner();
        in.seeOuter();
    }

    public static void main(String[] args) {
        MyOuter.MyInner inner = new MyOuter().new MyInner();
        inner.seeOuter();
    }
}
