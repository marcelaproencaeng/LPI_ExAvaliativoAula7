package exAvaliativoAula7;

import java.time.LocalDate;
import java.util.Objects;

public class AgendaTelefonica implements Comparable<AgendaTelefonica> {
	private String nome;
	private String telefone;
	private String email;
	private LocalDate dataNascimento;

	AgendaTelefonica(String nome, String telefone, String email, LocalDate dataNascimento) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null || getClass() != o.getClass())
			return false;

		AgendaTelefonica agendaTelefonica = (AgendaTelefonica) o;
		return Objects.equals(nome, agendaTelefonica.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public int compareTo(AgendaTelefonica agendaTelefonica) {
		return this.nome.compareTo(agendaTelefonica.getNome());
	}

	@Override
	public String toString() {
		return "AgendaTelefonica [nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", dataNascimento="
				+ dataNascimento + "]";
	}

}
