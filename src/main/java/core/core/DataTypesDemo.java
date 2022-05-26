package core.core;

public class DataTypesDemo {

    private int i;             // -32768 to + 32767
    private short s;             // -32768 to + 32767
    private char c;
    private long l;
    private float f;
    private double d;
    private boolean b;


    private static int is;             // -32768 to + 32767
    private static char cs;
    private static boolean bs;



    public static void main(String[] args) {
//        System.out.println(" static Int " + is);
//        System.out.println(" static Char " + cs);
//        System.out.println(" static Boolean " + bs);

//        int i = 100;
        DataTypesDemo d = new DataTypesDemo();
        d.testEnum(Day.TUESDAY); // calling
//        d.testEnum(Day.WEDNESDAY); // calling
//        d.testEnum(Day.THURSDAY); // calling
//        d.testEnum(Day.FRIDAY); // calling

//        System.out.println(d.i);

//        Integer i1 = new Integer(d.i);
        Integer i2 = d.i;

//        Character
//        Short

        int k = i2;

//        System.out.println(i2);
//        System.out.println(k);

        long l1 = k;
        int k2 = (int)l1;
//        System.out.println(l1);
//        System.out.println(k2);

        long l2 = i2.longValue();


        int j = 5;
/*        System.out.println(j);
        System.out.println(d.b);*/

        d.test();

    }

    public void test() {
        //System.out.println(i);

        b  = true;
        boolean isChecked = true;

        i = 5;

        /*if (i == 0) { //  == != > < >= <=
            System.out.println(" i = 0");
        } else if (i == 1){
            System.out.println(" i = 1");
        } else if (i == 2){
            System.out.println(" i = 2");
        } else {
            System.out.println(" not above");
        }*/

        i = 6;

        /*if (i > 0) {
            if (i <= 2) {
                System.out.println("  not correct");
            } else if (i > 2 && i <= 4) {
                System.out.println("  not correct");
            } else if (i == 5) {
                System.out.println("  Greater or equal 5");
            } else {
                System.out.println("  Above 5");
            }
        } else {
            System.out.println("  not correct");

        }*/
    }

    public void testEnum(Day day) {
        /*if (day == Day.WEDNESDAY) {
            System.out.println("Yes day is wednesday");
        } else if (day == Day.THURSDAY) {
            System.out.println("Day is Thursday");
        } else {
            System.out.println("Day is valid");
        }*/

        String dayString = day.name();

        //System.out.println(day.getNum1());

        /*switch(day.getNum1()) {
            default:
                System.out.println("Day is valid");
                break;

            case 2:
            case 5:
                System.out.println("Yes day is wednesday");
                break;
            case 4:
                System.out.println("Yes day is Thursday");
                break;
        }*/

//        int i = 2;
//        String s = "Test";

        /*switch(s) {
            case "Not A test":
                System.out.println("Yes i == 1");
                break;
            case "Test":
                System.out.println("Yes i == 2");
                break;
            default:
                System.out.println("No");
                break;
        }*/

       /* i = 5;
        while (i < 10) {
            if (i == 6) {
                i++;
                continue;
            }
            System.out.println(" i = " + i);
            i++;
        }*/

       /*i = 1;
       do {
           System.out.println(" i = " + i);
           i++;
       } while(i < 10);*/

//       i = 0;

        /*i = i + 10;
        i += 10;

        i++;
        i--;
        ++i;
        --i;*/

        /*for (int j = 10; j > 1; j-- ) {
            if (j == 6) {
                continue;
            }
            System.out.println(j);
        }*/

        int j = 1;

        ++j;
        j++;
        --j;
        --j;

        System.out.println(j);
//        System.out.println(j);
    }









}
