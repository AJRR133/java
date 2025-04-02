package Modeloboletinordenacionejercicio2;

import java.time.LocalDate;
import java.util.Objects;

public class Paginaweb  implements Comparable<Paginaweb> {
	private String url;
	private LocalDate fechayhora;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public LocalDate getFechayhora() {
		return fechayhora;
	}
	public void setFechayhora(LocalDate fechayhora) {
		this.fechayhora = fechayhora;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fechayhora);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paginaweb other = (Paginaweb) obj;
		return Objects.equals(fechayhora, other.fechayhora);
	}
	public Paginaweb(String url, LocalDate  fechayhora) {
		super();
		this.url = url;
		this.fechayhora = fechayhora;
	}
	

	@Override
	public int compareTo(Paginaweb o) {
		   return this.fechayhora.compareTo(o.fechayhora);
	}
	
	
}
