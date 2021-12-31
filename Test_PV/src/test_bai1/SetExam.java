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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExam {

    /**
     * Step 1: Create display menu
     */
    public static void createDisplayMenu() {
        System.out.println("WELCOME TO STUDENT MANAGEMENT");
        System.out.println("1.  Add Element");
        System.out.println("2.  Remove Element");
        System.out.println("3.  Check Exist Element");
        System.out.println("4.  Count Element");
        System.out.println("5.  Flush Element");
        System.out.println("6.  Exit");
    }

    public static void menu() {

        Set<Element> setA = new HashSet<Element>();
        //list default
        setA.add(new Element("Java"));
        setA.add(new Element("Python"));
        setA.add(new Element("PHP"));
        while (true) {// step 2 : Choose options
            createDisplayMenu();
            int choice = GetInput.inputInt("Enter your choice: ", 1, 6);
            switch (choice) {
                case 1:
                    // Step 3 : Add Element
                    addElement(setA);
                    break;
                case 2:
                    // Step 4 : Remove Element
                    removeElement(setA);
                    break;
                case 3:
                    // Step 5 : Check Exist Element
                    fnCheckExistElement(setA);
                    break;
                case 4:
                    // Step 6 : Count Element
                    countElement(setA);
                    break;
                case 5:
                    // Step 7 : Flush Element
                    flushElement(setA);
                    break;
                case 6:
                    // Exit
                    return;

            }
        }

    }

    //Step 3 : Step 3 : Add Element
    public static boolean addElement(Set<Element> setA) {
        System.out.println("==========ADD ELEMENT==========");
        String element = GetInput.inputString("Enter element : ");
        if (checkExistElement(setA, element)) {
            System.out.println("false");
            return false;
        }else{
            setA.add( new Element(element));
            System.out.println("true");
            System.out.println("" +setA);
            return true;
            
        }
    }

    /**
     * check Exist Element
     *
     * @param setA
     * @param element
     * @return
     */
    public static boolean checkExistElement(Set<Element> setA, String element) {
        for (Element element1 : setA) {
            if (element.equals(element1.getElement())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Step 3 : Check Exist Element
     *
     * @param setA
     */
    public static void fnCheckExistElement(Set<Element> setA) {
        String element = GetInput.inputString("Enter element : ");
        if (checkExistElement(setA, element)) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
    
    /**
     * // Step 4 : Remove Element
     * @param setA
     * @return 
     */
    public static boolean removeElement(Set<Element> setA) {
        System.out.println("==========REMOVE ELEMENT==========");
        String element = GetInput.inputString("Enter element : ");
        if (checkExistElement(setA, element)) {
            setA.remove(element);
            System.out.println("true");
            System.out.println("" +setA);
            return true;
        }else{
            setA.add( new Element(element));
            System.out.println("flase");
            return false;
            
        }
    }
    
    /**
     * // Step 6 : Count Element
     * @param setA 
     */
    public static void countElement(Set<Element> setA) {
        System.out.println("==========COUNT ELEMENT==========");
         System.out.println("Số phần tử của setA: " + setA.size());
    }
    
    /**
     * // Step 7 : Flush Element
     * @param setA
     * @return 
     */
    public static boolean flushElement(Set<Element> setA) {
        System.out.println("==========FLUSH ELEMENT==========");
        setA.clear();
        if (setA.isEmpty()) {
            System.out.println("true");
            return true;
        }else{
            System.out.println("flase");
            return false;
        }
    }

}
