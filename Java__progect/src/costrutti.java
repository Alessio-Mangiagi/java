public class costrutti {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int giorno = 4;
        if (giorno == 1)
            System.out.println("giorno 1");
        else if (giorno == 2)
            System.out.println("giorno 2");
        else if (giorno == 3)
            System.out.println("giorno 3");
        else if (giorno == 4)
            System.out.println("giorno 4");
        else if (giorno == 5)
            System.out.println("giorno 5");
        else if (giorno == 6)
            System.out.println("giorno 6");
        else if (giorno == 7)
            System.out.println("giorno 7");
        else
            System.out.println("giorno non valido");

        switch (giorno) {
            case 1:
                System.out.println("lunedì");
                break;
            case 2:
                System.out.println("martedì");
                break;
            case 3:
                System.out.println("mercoledì");
                break;
            case 4:
                System.out.println("giovedì");
                break;
            case 5:
                System.out.println("venerdì");
            case 6:
                System.out.println("sabato");
                break;
            case 7:
                System.out.println("domenica");
                break;
            default:
                throw new AssertionError();
        }
        
        if(giorno <= 0 && giorno >= 8)
            System.out.println("giorno valido");
        else
            System.out.println("giorno non valido");

        if(giorno >= 1 && giorno <= 5)
            System.out.println("giorno lavorativo");
        else
            System.out.println("weekend");
    }
}