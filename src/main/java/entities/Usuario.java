package entities;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "TB_USUARIO", uniqueConstraints = {
		@UniqueConstraint(name = "uk__tb_usuario__login", columnNames = { "login" }) })
public class Usuario implements Identificavel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	private String nome;

	private String sobreNome;

	@Temporal(TemporalType.DATE)
	private Date dataDeAniversario;

	// XXX Renomeando coluna, pois "group" é uma palavra reservada do PostgreSQL:
	// https://www.postgresql.org/docs/9.6/static/sql-keywords-appendix.html
	@Column(name = "usuario_group")
	@Enumerated(EnumType.STRING)
	private Group group;

	private String login;

	private String password;

	public Usuario() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobrenome) {
		this.sobreNome = sobrenome;
	}

	public Date getDataDeAniversario() {
		return dataDeAniversario;
	}

	public void setDataDeAniversario(Date dataDeAniversario) {
		this.dataDeAniversario = dataDeAniversario;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataDeAniversario == null) ? 0 : removeTime(dataDeAniversario).hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((sobreNome == null) ? 0 : sobreNome.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (dataDeAniversario == null) {
			if (other.dataDeAniversario != null)
				return false;
		} else if (!removeTime(dataDeAniversario).equals(removeTime(other.dataDeAniversario)))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (group != other.group)
			return false;
		if (sobreNome == null) {
			if (other.sobreNome != null)
				return false;
		} else if (!sobreNome.equals(other.sobreNome))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	private Date removeTime(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + ", dataDeAniversario="
				+ dataDeAniversario + ", group=" + group + ", login=" + login + ", password=" + password + "]";
	}

	@Override
	public Usuario clone() {
		Usuario clone = new Usuario();
		clone.setId(id);
		clone.setNome(nome);
		clone.setSobreNome(sobreNome);
		clone.setDataDeAniversario(dataDeAniversario);
		clone.setGroup(group);
		clone.setLogin(login);
		clone.setPassword(password);
		return clone;
	}
}
