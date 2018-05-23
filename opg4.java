package ch16;

/*
4. Write a method called lastIndexOf that accepts an integer value as a parameter and that returns the index in the
list of the last occurrence of that value, or  1 if the value is not found in the list. For example, if a variable
list stores the values [1, 18, 2, 7, 18, 39, 18, 40], then the call of list.lastIndexOf(18) should return 6.
If the call had instead been list.lastIndexOf(3), the method would return –1.
 */

public class opg4
{
    public static void main(String[] args) {
        LinkedIntList liste = new LinkedIntList();
        liste.add(1);
        liste.add(18);
        liste.add(2);
        liste.add(7);
        liste.add(18);
        liste.add(39);
        liste.add(18);
        liste.add(40);
        System.out.println(liste.lastIndexOf(24));

    }
}
