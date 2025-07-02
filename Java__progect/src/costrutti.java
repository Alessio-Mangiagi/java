public class costrutti {
    public static void main(String[] args) throws Exception {
        System.out.println("\"><(((º> sabusabu <º)))><\"");


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
//da preferire sulle grandi quantità di cambi.
        switch (giorno) {
            case 1:
                System.out.println("no, non è mercoledì ma lunedì");
                break;
            case 2:
                System.out.println("no, non è mercoledì ma martedì");
                break;
            case 3:
                System.out.println("si è mercoledì");
                break;
            case 4:
                System.out.println("no, non è mercoledì ma giovedì");
                break;
            case 5:
                System.out.println("no, non è mercoledì ma venerdì");
            case 6:
                System.out.println("no, non è mercoledì ma sabato");
                break;
            case 7:
                System.out.println("no, non è mercoledì ma domenica");
                break;
            default:
                throw new AssertionError();
                /*Serve per segnalare che si è verificata una situazione che "non dovrebbe mai accadere" 
                (ad esempio, un valore non previsto).
                È utile per il debug, perché ti avvisa subito se qualcosa va storto*/
        }
        
        if(giorno > 0 && giorno < 8)
            System.out.println("giorno valido");
        else
            System.out.println("giorno non valido");

        if(giorno >= 1 && giorno <= 5)
            System.out.println("giorno lavorativo");
        else
            System.out.println("weekend");
    }
}