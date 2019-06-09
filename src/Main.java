import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

   public static void main(String[] args) {
       /*Scanner scanner = new Scanner(System.in);
       System.out.print("First Name: ");
       String firstName = scanner.next();

       System.out.print("Age");
       int age = scanner.nextInt();

       System.out.print("Amount of money in your pocket: £");
       double money = scanner.nextDouble();

       System.out.println();

       double moneyNeeded = Math.ceil(money) - money;
       System.out.println("Your Name is " + firstName + " and you are " + age + " years old");
       System.out.println("You have lived " + age + " In another " + age + " You will be " + 2*age + "years old" );
       System.out.println("Your name is " + firstName.length() + " character long.");
       System.out.format("You have £%.2f on you and need £%.2f", money, moneyNeeded);

       System.out.print("Restaurant Bill calculator\n ");

       System.out.println("Enter bill total: ");
       double billTotal = scanner.nextInt();

       System.out.println("Enter number of people: ");
       int numberOfPeople = scanner.nextInt();

       System.out.println("Single bill: " + billTotal / numberOfPeople + "£");
       System.out.println("3 > 5");

         Scanner scanner = new Scanner(System.in);
         System.out.println("Welcome to SuperFast Roller coaster!");
         System.out.println("Please enter you height in centimeters: ");
         int height = scanner.nextInt();

         if (height > 130 && height < 210){
          System.out.println("Height accepted. Go ahead.");
       }

          else  {
             System.out.println("Sorry, you are not meet the height requirements.Height accepted. Go ahead");
          }

    }*/
           /* Scanner scanner = new Scanner(System.in);
            System.out.println("The VIP Lounge");
            System.out.print("Age: ");
            int age = scanner.nextInt();


       if (age >=18 && age < 70) {
          System.out.print("Do you have a VIP Pass?");
          String vipPassReply = scanner.next();
         if (vipPassReply.equals("yes")) {
            System.out.print("Thanks, go on in.");
         }
         else {
            System.out.println("Sorry, You need to have a VIP Pass.");
         }

       }
       else if (age < 18){
          System.out.println("Sorry, You must be over 18.");
       }
       else {
          System.out.println("Thanks, go on in");
       }
       }*/
            /*if (age >= 18 && vipPassReply.equals("yes") || age >= 70) {
               System.out.println("Thanks, go on in.");

            }
            else {
            System.out.print("Sorry, no can do.");
            }*/

      /*int x = 12;
      int y = 12;

      if (x > y) {
         System.out.println("X is greater then y by " + (x- y));

      }
      else if (x < y) {
         System.out.println("X is less then y by " + (y- x));

      }
      else {
         System.out.println("X is equals to y");

      }*/

      /*int randomNumber = ThreadLocalRandom.current().nextInt(1, 4);
      System.out.println("I'm thinking about numbers between: 1 to 5, What is your guess: ");
      Scanner scanner = new Scanner(System.in);
      int guess = scanner.nextInt();

      if (guess == randomNumber) {
         System.out.println("Correct answer, you win!");
      }
      else {
         System.out.println("Wrong answer, Try again");
         System.out.println("Do you wany to try again? Your guess is: ");
          guess = scanner.nextInt();
      }
      if (guess == randomNumber) {
         System.out.println("CCorrect answer, You win!");

      }
      else {
         System.out.println("This is wrong answer");
      }*/




     /* int i = 0;
      while (i < 10) {
         System.out.println(i);
         i++;
      }
      for (int z = 0; z < 10; z++) {
         System.out.println("Test");
      }*/
         /*for (int i = 1; i <=5; i++ ) {
            if (i == 4 ) {
               continue;
            }
            System.out.println(i);
         }*/
         /*
         Scanner scanner = new Scanner(System.in);
      int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
      int guess;
      int guessCounter = 0;

      do {
         System.out.println("Try to guess a number: ");
         guess = scanner.nextInt();
         guessCounter++;
         if(guess < randomNumber) {
            System.out.println("Try to enter higher number ");
         }
         else if (guess > randomNumber){
            System.out.println("Try to enter lower number");
         }
         else {
            System.out.println("YOU WIN! This is the CORRECT number.");
            System.out.println("You got it in " + guessCounter + " guesses.");
         }
      } while (guess != randomNumber);*/

              /*int[] n = {75, 78, 340, 730, 4329, 1003};
              int count = 0;
              int sumOfNums = 0;
         for (int i = 0; i < n.length; i++) {
            if (n[i] > 100) {
               count++;

            }
            sumOfNums = sumOfNums + n[i];

      }
         System.out.println(count);
         double mean = (double)sumOfNums / n.length;
         System.out.println("Mean: " + mean); */

               /*Scanner scanner = new Scanner(System.in);
               System.out.println("Number of laps: ");
               int numberOfLaps = scanner.nextInt();
              double[] lapTime= new double[numberOfLaps];
              for (int i = 0; i< numberOfLaps; i++) {
                 System.out.println("Lap time: ");
                 lapTime[i] = scanner.nextDouble();


                  }
               double fastestTime = lapTime[0];
              for (int i = 1; i < lapTime.length; i++){
                 if (lapTime[i] < fastestTime){
                    fastestTime = lapTime[i];
                 }
              }
               System.out.println("Fastest time: "+ fastestTime);*/

               /*int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};

                  for (int i = 0; i<numbers.length; i++) {
                     System.out.println(numbers[i]);
      }*/
      /*
      int[] numbers = new int[20];
      for (int i = 0; i < numbers.length; i++) {
         numbers[i] = i + 1;

      }
      for (int i = numbers.length -1; i >=0;  i--){
         System.out.println(numbers[i]);
      }*/
   /*
      double[] elements = {1.23, 3.34, 3.67, 3.67, 4.1};
      double counter = 0;

      for (int i = 0; i < elements.length; i++){
         counter = counter + elements[i];

      }
      double mean = counter / elements.length;

      System.out.println(counter);
      System.out.println(mean);

    */
        /* Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter your five favourite meals: ");

         String[] food = new String[3];
         for (int i =0; i < food.length; i++){
            System.out.println("Food " + (i +1) + ": " );
            food[i] = scanner.nextLine();
         }

         System.out.println("No more memory available: ");
         System.out.println("Your favourite foods are:");
         for (int i = 0; i < food.length; i++) {
            System.out.println(" - " + food[i]);
         }*/

     /* System.out.println(19);
      System.out.println(24);
      foo();
      bar();
   }


   public static void foo() {
      int x = 50;
      System.out.println(x);
      System.out.println(29);
   }
   public static void bar(){
      System.out.println(100);*/

     /*foo(3);
     int val = bar();
   }
   public static void foo(int a) {
      if (a < 5) {
         return;
      }
      System.out.println(a);
   }
   public static int bar(){
      return 49;
      }*/
     /*System.out.println(add(13, 16));
}
      public static int add (int a, int b){
      return a+b;*/
    /*
     char[] pos = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',};
     Scanner scanner = new Scanner(System.in);
     int input;
     char turn = 'X';
     int currentTurn =1;

     while (true) {
         do {
             System.out.print("Enter a position: ");
             input = scanner.nextInt();
         } while (pos[input - 1] == 'X' || pos[input -1] == '0');


        pos[input - 1] = turn;
        System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
        System.out.println("-----------");
        System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
        System.out.println("-----------");
        System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");

        if (pos[0] == turn && pos[1] == turn && pos[2]== turn
                || pos[3] == turn && pos[4] == turn && pos[5]== turn
                || pos[6] == turn && pos[7] == turn && pos[8]== turn
                || pos[6] == turn && pos[3] == turn && pos[0]== turn
                || pos[7] == turn && pos[4] == turn && pos[1]== turn
                || pos[8] == turn && pos[5] == turn && pos[2]== turn
                || pos[6] == turn && pos[4] == turn && pos[2]== turn
                || pos[8] == turn && pos[4] == turn && pos[0]== turn) {
            System.out.println(turn + " is the winner");
            break;
        }

        if (turn == 'X') {
           turn = '0';
        }
        else if (turn == '0'){
           turn = 'X';
        }
        currentTurn++;
        if (currentTurn > 9) {
            System.out.println("DRAW");
            break;
        }
     }*/
    /*Scanner scanner= new Scanner(System.in);

    System.out.println("Enter the maximum possible score for this exam :");
    int maxScore= scanner.nextInt();



       System.out.println("How many students took the exam? : ");
    int numStudent = scanner.nextInt();

       int[] scores =  new int[numStudent];

    System.out.println("Enter each student score: ");
    for (int i = 0; i <scores.length; i++) {
        System.out.println("Student " + (i + 1) + ": ");
        scores[i] = scanner.nextInt();
    }
    System.out.println("\n --- Statistic ---");

    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
        double studentScore = scores[i];
        double studentPercentage = ((double) scores[i]);
        System.out.println("Student" +(i + 1) + ": " + studentScore + " /" + maxScore + " (" + studentPercentage + "%)");
        sum += studentScore;
       }
        double mean = (double)sum / scores.length;
        double meanPercentage = (mean / maxScore) *100;
        System.out.println("Mean: " + mean + "/" + maxScore + " (" + meanPercentage + "%)");*/
    String[] questions = new String[]{
            "The moon is further away from the earth than the sun is",
            "Goldfish only have a three second memory",
            "Microwaves have a longer wavelength than ultraviolet",
            "Antibiotics are used to treat viral infections",
            "Octopuses have three hearts"
    };
    boolean[] answers = new boolean[] {
            false,
            false,
            true,
            false,
            true
    };
    boolean[] userAnswers = new boolean[5];
    int finalScore = 0;
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i< answers.length; i++) {
        System.out.println("\nQuestion "+ (i+1) + " :" + questions[i] + ". True or False?");
        System.out.println("Your answer: ");
        userAnswers[i] = scanner.nextBoolean();

        if (userAnswers[i] == answers[i]) {
            System.out.println("Correct!");
            finalScore++;
        }
        else {
            System.out.println("Wrong. It's" + answers[i] + ".");
        }
    }
    System.out.println("\nYour final score is " + finalScore + " out of five");
   }
}