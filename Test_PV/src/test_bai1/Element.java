/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_bai1;

/**
 *
 * @author Duy Manh
 */
public class Element {
    private String element;

    public Element() {
    }

    public Element(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Element{" + "element=" + element + '}';
    }

    
    
    
}
