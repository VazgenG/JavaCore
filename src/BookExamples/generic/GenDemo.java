package BookExamples.generic;

//Ցույց տալ generic դասի օգտագործումը

public class GenDemo {

    public static void main(String[] args) {

        // ստեղծել Gen տիպի հղումը ամբողջ թվերի համար
        Gen<Integer> iOb;

        // ստեղծել  Gen<Integer> տիպի օբյեկտ և նշանակել
        // հղում  նրա iOb փոփոխականի վրա. Обратите внимание на
        //применение автоупаковки для инкапсуляции значения 88
        iOb = new Gen<>(88);

        // ցույց տալ iOb փոփոխականում պահվող տվյալների տեսակը

        iOb.showType();

        //получить значение переменной iOb. Обратите
        // внимание на то, что для этого не требуется
        //никакого приведения типов

        int v = iOb.getOb();
        System.out.println("Արժեքը:" + v);
        System.out.println();

        // создать объект типа Gen для символьных строк

        Gen<String> strOb = new Gen<String> (" Թեսթ generic ");

        // ցույց տալ strOb փոփոխականում պահվող տվյալների տեսակը

        strOb.showType();

        // ստացիր strOb փոփոխականի արժեքը:Եվ սրա մեջ
        // տիպի ձուլման դեպքում չի պահանջվում
        String str = strOb.getOb();
        System.out.println ("Արժեք:" + str);

    }
}