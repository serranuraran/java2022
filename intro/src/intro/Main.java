package intro;

public class Main {
		
		//main, javada baþlangýç noktasýdýr. (metot)
		public static void main(String[] args) {
			System.out.println("Hello World!");

			//degisken isimlendirmeleri java'da camelCase yazýlýr.
			String ortaMetin="Ýlginizi Çekebilir";
			String altMetin="Vade süresi";
			
			System.out.println(ortaMetin);
			
			//integer
			int vade = 12;
			
			double dolarDun = 18.20;
			double dolarBugun = 18.20;
			
			boolean dolarDustuMu = false;
			
			String okYonu = "";
			
			if (dolarBugun<dolarDun) {  //true
				okYonu = "down.svg";
				System.out.println(okYonu);
			} else if(dolarBugun>dolarDun) {
				okYonu = "up.svg";
				System.out.println(okYonu);
			} 
			else {
				okYonu = "equal.svg";
				System.out.println(okYonu);
			}
			
			//array
			
			String[] krediler = {"Hýzlý Kredi","Maaþýný Halkbanktan","Mutlu Emekli"};
			
			for (int i = 0; i < krediler.length; i++) {
				System.out.println(krediler[i]);
			}
			
			System.out.println("github kontrolü");
		}

	}
