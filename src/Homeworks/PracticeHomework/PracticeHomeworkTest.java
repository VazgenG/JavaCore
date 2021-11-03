package Homeworks.PracticeHomework;

public class PracticeHomeworkTest {

    public static void main(String[] args) {


        PracticeHomework ph = new PracticeHomework();

        //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել

        int minutes = 1;
        long secunds = 60;
        long result = ph.convert(minutes, secunds);
        System.out.println(result);

        //ընդունել տարին, վերադարձնել օրերի քանակը։

        result = ph.calcAge(2, 365);
        System.out.println(result);

        //վերադարձնել տրված թվի հաջորդ թիվը

        result = ph.nextNumber(14);
        System.out.println(result);

        //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false

        boolean result1 = ph.isSameNum(10, 5);
        System.out.println(result1);

        //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
        //մնացած դեպքերում վերադարձնել false

        int number = 1;
        boolean result3 = ph.lessThanOrEqualToZero(number);
        if (number <= 0) {
            result3 = true;
        } else result3 = false;
        {
            System.out.println(result3);
        }

        //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։



        //վերադարձնել երկու մասիվի ամենամեծ length-ը
        



    }
}