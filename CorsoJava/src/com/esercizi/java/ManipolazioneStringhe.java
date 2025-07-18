package com.esercizi.java;

public class ManipolazioneStringhe {

	public static void main(String[] args) {


			System.out.println("\"><(((º> sabusabu <º)))><\"");
			//manipolazione delle stringhe
			String testoDiEsempio= "Alessio";
			int txt = testoDiEsempio.length(); //lunghezza della stringa
			String txt2 = testoDiEsempio.toUpperCase(); //trasformazione in maiuscolo
			String txt3 = testoDiEsempio.toLowerCase(); //trasformazione in minuscolo
			String txt4 = testoDiEsempio.replace("s", "5"); //sostituzione di caratteri
			String testiDiEsempio2 = "  Mangiagi";
			
			String testo = """
				    Questa è una stringa
				    su più righa
				    in Java 15 o superiore.
				    """;
			String testo3 = """
					Il corso in oggetto è rapresnentato da 
					240 ore di formazione divise da tecnologie 
					backend e front end
					""";
			
			
			System.out.println(testo3);
			System.out.println(txt);//lunghezza della stringa
			System.out.println(txt2);
			System.out.println(txt3);
			System.out.println(txt4);
			System.out.println("concatenazione :" + txt + testiDiEsempio2.trim() + " " + txt3.concat(txt2));
			System.out.println(testoDiEsempio.substring(1, 3));
			
			StringBuilder testo4 = new StringBuilder ("testo di prova\n");
			testo4.append(txt4);
			System.out.println(testo4);
			StringBuilder color = new StringBuilder ("red");
			color.insert(1, "blue");
			System.out.println(color);
			StringBuilder car = new StringBuilder ("Porsche");
			car.delete(1, 3);
			System.out.println(car);
			car.reverse();
			System.out.println(car);
			car.append("911");
			car.insert(0, "tette");
			System.out.println(car);
			
			
			
			
			


	}

}
