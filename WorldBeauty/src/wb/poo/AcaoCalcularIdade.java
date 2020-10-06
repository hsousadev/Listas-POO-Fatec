package wb.poo;
	
	import java.util.Calendar;
	import java.util.GregorianCalendar;

	public class AcaoCalcularIdade {

	//Atualizado2
		
	//m�todo para calcular idade:
		public static int calcIdade(String dataNasc) {
			String[] nascimento = dataNasc.split("/");
			int diaNasc = Integer.valueOf(nascimento[0]);
			int mesNasc = Integer.valueOf(nascimento[1]);
			int anoNasc = Integer.valueOf(nascimento[2]);
			
			GregorianCalendar hoje = new GregorianCalendar();
			int diaH = hoje.get(Calendar.DAY_OF_MONTH);
			int mesH = hoje.get(Calendar.MONTH)+ 1;
			int anoH = hoje.get(Calendar.YEAR);
			
			int idade;
			idade = anoH - anoNasc;
			if((mesH < mesNasc) || ((mesH == mesNasc) && (diaH < diaNasc))) {
				idade--;
			}
			return idade;
		}
		
	}




