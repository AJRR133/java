package explicacionmapa;

import java.util.Objects;

public class Contacto {

		private String telefono;
		private String nombre;
		private String apellidos;
		
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		@Override
		public int hashCode() {
			return Objects.hash(apellidos, nombre, telefono);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Contacto other = (Contacto) obj;
			return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre)
					&& Objects.equals(telefono, other.telefono);
		}
		public Contacto(String telefono, String nombre, String apellidos) {
			super();
			this.telefono = telefono;
			this.nombre = nombre;
			this.apellidos = apellidos;
		}
		@Override
		public String toString() {
			return "Contacto [telefono=" + telefono + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
		}
		
		
		
		
}
