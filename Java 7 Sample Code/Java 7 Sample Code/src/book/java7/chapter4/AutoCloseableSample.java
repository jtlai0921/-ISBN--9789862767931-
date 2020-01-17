/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package book.java7.chapter4;

public class AutoCloseableSample {
    public static void main(String[] args) {
        try(MyResource res = new MyResource()) {
            res.doSomething();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
