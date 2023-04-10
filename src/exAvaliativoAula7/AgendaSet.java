package exAvaliativoAula7;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class AgendaSet {
	public static void main(String[] args) {
		Set<AgendaTelefonica> conjunto = new TreeSet<>();

		AgendaTelefonica a = new AgendaTelefonica("Maria da Silva", "51981070506", "mariaS@gmail.com",
				LocalDate.of(2000, 01, 14));
		AgendaTelefonica b = new AgendaTelefonica("Antonio Sousa", "51978100607", "antonioS@gmail.com",
				LocalDate.of(1990, 12, 10));
		AgendaTelefonica c = new AgendaTelefonica("Paula Ferreira", "21982774566", "paulaF@gmail.com",
				LocalDate.of(1995, 10, 02));
		AgendaTelefonica d = new AgendaTelefonica("Antonio Sousa", "22849956723", "antonioS@gmail.com",
				LocalDate.of(2022, 10, 25));

		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		System.out.println(conjunto);
		
		//Adicionar mais um registro;

		AgendaTelefonica f = new AgendaTelefonica("Paulo Fonseca", "11982619997", "pauloFonseca@gmail.com",
				LocalDate.of(2000, 10, 10));

		conjunto.add(f);
		System.out.println(conjunto);

		LocalDate hoje = LocalDate.now();
		hoje.getYear();

		// Deve existir uma opção que exiba os aniversariantes do dia;
		for (AgendaTelefonica agendaTelefonica : conjunto) {
			if (hoje.getDayOfMonth() == agendaTelefonica.getDataNascimento().getDayOfMonth()
					&& hoje.getMonthValue() == agendaTelefonica.getDataNascimento().getMonthValue()) {
				System.out.println(agendaTelefonica.getNome());
			}
		}

	}
}

