public class Whille_And_DoWhile_Theory {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("****************************");

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("************FOR_LOOP****************");
        for (int i = 1; i < 6; i++) {
            System.out.println("Count value is " + i);
        }

        /*
        int count = 6;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 6; i != 6; i++) {
            System.out.println("Count value is " + i);
        }
//        >>>>> Because of the conditions we put WHILE and FOR loops WONT RUN

        int count = 1;
        while (count == 6) {
            System.out.println("Count value is " + count);
//            No incrementation "count++;"
        }
//        >>>>>> Infinite LOOP
        */

        System.out.println("***************DO{}_WHILE();*************");

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);

        /*count = 6;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);
//        INFITITE LOOP
        */
        System.out.println("\n **************************\n");

        count = 6;
        do {
            System.out.println("Count value is " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);

        System.out.println("\n **************************\n");

        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
                /* >>>>>
                Key word CONTINUE allows the loop to continue
                but it doesn't actually process any more code
                any futhre down in the while loop. It just goes
                straight to the end of the loop and then back on
                start from NEXT NUMBER.                 <<<<<<*/
            }
            System.out.println("Even number " + number);
        }
        System.out.println("\n **************************\n");

        number = 0;
        while (number < 15) {
            number++;
            if (number <= 5) {
                System.out.println("Skipping number :" + number);
                continue;
            }

            System.out.println("number = " + number);

            if (number >=10){
                System.out.println("Breaking at " + number);
                break;
            }
        }
//         >>>>>>>>>>>>>>> Challenge <<<<<<<<<<<<<<<<<
        System.out.println("\n************ 5 even numbers and their SUM ***********");
        number = 4;
        finishNumber = 20;
        int sum = 0;
        count = 0;
        while ((number <= finishNumber) && (count < 5)) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
                /* >>>>>
                Key word CONTINUE allows the loop to continue
                but it doesn't actually process any more code
                any futhre down in the while loop. It just goes
                straight to the end of the loop and then back on
                start from NEXT NUMBER.                 <<<<<<*/
            }
            count++;
            sum = sum + number;
            System.out.println("Even number " + number + "\nCount " + count + "\n\n");
        }
        System.out.println("\nSum of even numbers " + sum);
    }

    public static boolean isEvenNumber(int number) {
        while (number > 0) {
            return number % 2 == 0;
        }
        return false;
    }
}
