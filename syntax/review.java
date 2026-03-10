package syntax;

import java.util.Scanner;

class review {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a day: ");
        int day = input.nextInt();
        // Number chNumber = new Number();
        // System.out.print("Enter age: ");
        // int age = input.nextInt();

        // Person profile = new Person(name, age);

        // System.out.println(chNumber.isEven(num));
        
        // input.close();
        // int[] array = new int[5];

        // for(int i = 0; i<5; i++){
        //     System.out.print("Enter an number you want to put in the array: ");
        //     int value = input.nextInt();
        //     array[i] = value;
        // }

        // switch(day){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid day");
        // }

        // int value = switch (day) {
        //     case 1 -> {
        //         int x = 2 * 5;
        //         yield x;

        //     }

        //     default -> 0;
            
        // };
        // System.out.println(value + 2);

        
    }
}

class Number {
    public boolean isEven(int number) {
        if(number % 2 == 0)
            return true;
        return false;
    }
}

class Person {
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "my name is: " + this.name + ", I am " + this.age;
    }
}