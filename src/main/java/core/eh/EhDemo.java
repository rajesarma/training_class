package core.eh;

import core.core.Employee;

public class EhDemo {

    int i = 10;

    public static void main(String[] args) {

        int i = 10;
        int j = 0;
        int k;
        Employee emp = null;

        try {
//            k = i / j;
//            String s = "abc";
//            System.out.println(s.charAt(5));
            System.out.println(emp.getName());

        } catch (StringIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
            System.out.println( e.getMessage());
        }/* catch (ArithmeticException e) {
            System.out.println("Divide by Zero Exception");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }*/ catch (Exception e) {
            System.out.println("Exception");
        } finally {
//            System.out.println("Divide by Zero Exception");
        }

//        System.out.println("Test ");

    }
}
