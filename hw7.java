package lesson.homework;

public class hw7 {

    public static void intValue(){
        int value = 6;
        boolean booleanValue1 = true;
        boolean booleanValue2 = false;
        if (value%2 == 0){
            System.out.println(booleanValue1);
        }
        else {
            System.out.println(booleanValue2);
        }
    }

    public static void intValue2(){
        int value = 6;
        boolean booleanValue1 = true;
        boolean booleanValue2 = false;
        switch (value%2){
            case 0 : {
                System.out.println(booleanValue1);
                break;
            }
            default:{
                System.out.println(booleanValue2);
            }
        }
    }
    public static void main(String[] args) {
        intValue();
        intValue2();
    }
}
