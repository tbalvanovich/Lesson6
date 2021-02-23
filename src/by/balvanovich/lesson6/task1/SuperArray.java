package by.balvanovich.lesson6.task1;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class SuperArray implements MySuperArrAY{
    private int mass[];

    @Override
    public int getLength() {
        return mass.length;
    }

    @Override
    public int addElement(Integer element) {
        int array [];
        if (mass == null)
            array = new int[1];
        else {
            array = new int[mass.length + 1];
            for (int i = 0; i < mass.length; i++) {
                array[i] = mass[i];
            }
        }


        array[array.length - 1] = element.intValue();
        mass = array;
        return element.intValue();
    }

    @Override
    public Integer getElement(int index) {
        return mass[index];
    }

    @Override
    public void removeAllElements() {
        int array[] = new int[0];
        mass = array;

    }

    @Override
    public Integer[] getAllElements() {
        Integer array[] = new Integer[mass.length];
        for (int i = 0; i < mass.length; i++) {
            array[i] = mass[i];

        }
        return array;
    }

    public static void main(String[] args) {
        SuperArray mass = new SuperArray();
        mass.addElement(5);
        mass.addElement(12);
        mass.addElement(13);
        Integer array[] = mass.getAllElements();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].intValue());

        }
    }
}

