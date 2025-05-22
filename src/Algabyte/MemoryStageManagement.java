package Algabyte;

	import java.time.LocalDateTime;
	import java.util.*;

	public class MemoryStageManagement {

	    // --- Excepciones ---
	    public static class UserMemoryException extends Exception {
	        public UserMemoryException(String message) {
	            super(message);
	        }
	    }

	    public static class PublicacionException extends Exception {
	        public PublicacionException(String message) {
	            super(message);
	        }
	    }

	    // --- Enum Valoracion ---
	    public enum Valoracion {
	        SUPERBUENA(3),
	        MUYBUENA(2),
	        BUENA(1),
	        NORMAL(0),
	        REGULAR(-1),
	        MUYMALA(-2);

	        private final int puntos;

	        Valoracion(int puntos) {
	            this.puntos = puntos;
	        }

	        public int getPuntos() {
	            return puntos;
	        }
	    }

	    // --- Clase Usuario ---
	    public static class Usuario implements Comparable<Usuario> {
	        private String login;
	        private String password;

	        public Usuario(String login, String password) throws UserMemoryException {
	            if (login.length() < 6) {
	                throw new UserMemoryException("Usuario no es correcto");
	            }
	            if (!esPasswordValida(password)) {
	                throw new UserMemoryException("La clave no cumple alguno de estos requisitos: contiene mayúsculas, minúsculas y números y tiene 8 o más caracteres");
	            }
	            this.login = login;
	            this.password = password;
	        }

	        private boolean esPasswordValida(String password) {
	            if (password.length() < 8) return false;
	            boolean mayus = false, minus = false, num = false;
	            for (char c : password.toCharArray()) {
	                if (Character.isUpperCase(c)) mayus = true;
	                else if (Character.isLowerCase(c)) minus = true;
	                else if (Character.isDigit(c)) num = true;
	            }
	            return mayus && minus && num;
	        }

	        public String getLogin() {
	            return login;
	        }

	        @Override
	        public int compareTo(Usuario o) {
	            return this.login.compareTo(o.login);
	        }

	        @Override
	        public boolean equals(Object obj) {
	            if (this == obj) return true;
	            if (!(obj instanceof Usuario)) return false;
	            Usuario u = (Usuario) obj;
	            return login.equals(u.login);
	        }

	        @Override
	        public int hashCode() {
	            return login.hashCode();
	        }

	        @Override
	        public String toString() {
	            return "Usuario{" + "login='" + login + '\'' + '}';
	        }
	    }

	    // --- Clase abstracta Mensaje ---
	    public static abstract class Mensaje {
	        private static int contadorId = 0;

	        protected int id;
	        protected String contenido;
	        protected LocalDateTime fechaCreacion;
	        protected Usuario autor;
	        protected Map<Usuario, Valoracion> valoraciones;

	        public Mensaje(String contenido, Usuario autor) throws PublicacionException {
	            this.id = ++contadorId;
	            this.contenido = contenido;
	            this.fechaCreacion = LocalDateTime.now();
	            this.autor = autor;
	            this.valoraciones = new HashMap<>();
	            validarContenido();
	        }

	        protected abstract void validarContenido() throws PublicacionException;

	        public int getId() {
	            return id;
	        }

	        public Usuario getAutor() {
	            return autor;
	        }

	        public LocalDateTime getFechaCreacion() {
	            return fechaCreacion;
	        }

	        public abstract void valorar(Usuario usuario, Valoracion valoracion) throws Exception;

	        public int calcularPuntuacion() {
	            int total = 0;
	            for (Valoracion v : valoraciones.values()) {
	                total += v.getPuntos();
	            }
	            return total;
	        }

	        public String getContenido() {
	            return contenido;
	        }

	        @Override
	        public String toString() {
	            return "Mensaje{" +
	                    "id=" + id +
	                    ", contenido='" + contenido + '\'' +
	                    ", fechaCreacion=" + fechaCreacion +
	                    ", autor=" + autor +
	                    ", puntuacion=" + calcularPuntuacion() +
	                    '}';
	        }
	    }

	    // --- Tweet ---
	    public static class Tweet extends Mensaje {
	        public Tweet(String contenido, Usuario autor) throws PublicacionException {
	            super(contenido, autor);
	        }

	        @Override
	        protected void validarContenido() throws PublicacionException {
	            if (contenido.length() > 50) {
	                throw new PublicacionException("Tweet excede los 50 caracteres.");
	            }
	        }

	        @Override
	        public void valorar(Usuario usuario, Valoracion valoracion) {
	            valoraciones.put(usuario, valoracion);
	        }

	        @Override
	        public int calcularPuntuacion() {
	            int total = 0;
	            for (Valoracion v : valoraciones.values()) {
	                total += v.getPuntos() * 2;  // Doble para tweet
	            }
	            return total;
	        }

	        @Override
	        public String toString() {
	            return "Tweet " + super.toString();
	        }
	    }

	    // --- Post ---
	    public static class Post extends Mensaje {
	        private int lecturas;

	        public Post(String contenido, Usuario autor) throws PublicacionException {
	            super(contenido, autor);
	            this.lecturas = 0;
	        }

	        @Override
	        protected void validarContenido() throws PublicacionException {
	            if (contenido.trim().isEmpty()) {
	                throw new PublicacionException("Post no puede estar en blanco.");
	            }
	        }

	        @Override
	        public void valorar(Usuario usuario, Valoracion valoracion) {
	            lecturas++;
	            valoraciones.put(usuario, valoracion);
	        }

	        public int getLecturas() {
	            return lecturas;
	        }

	        @Override
	        public int calcularPuntuacion() {
	            int total = 0;
	            for (Valoracion v : valoraciones.values()) {
	                total += v.getPuntos();
	            }
	            return total;
	        }

	        @Override
	        public String toString() {
	            return "Post " + super.toString() + ", lecturas=" + lecturas;
	        }
	    }

	    // --- Recomendacion ---
	    public static class Recomendacion extends Mensaje {
	        public Recomendacion(String contenido, Usuario autor) throws PublicacionException {
	            super(contenido, autor);
	        }

	        @Override
	        protected void validarContenido() throws PublicacionException {
	            if (contenido.length() < 100 || contenido.length() > 200) {
	                throw new PublicacionException("Recomendación debe tener entre 100 y 200 caracteres.");
	            }
	        }

	        @Override
	        public void valorar(Usuario usuario, Valoracion valoracion) {
	            valoraciones.put(usuario, valoracion);
	        }

	        @Override
	        public String toString() {
	            return "Recomendacion " + super.toString();
	        }
	    }

	    // --- MemoryStorage ---
	    public static class MemoryStorage {
	        private static final int MAX_USUARIOS = 15;
	        private static final int MAX_MENSAJES = 50;

	        private TreeSet<Usuario> usuarios; // Ordenados por login
	        private LinkedList<Mensaje> mensajes; // Para controlar el orden y capacidad

	        public MemoryStorage() {
	            usuarios = new TreeSet<>();
	            mensajes = new LinkedList<>();
	        }

	        public void agregarUsuario(Usuario usuario) throws UserMemoryException {
	            if (usuarios.size() >= MAX_USUARIOS) {
	                throw new UserMemoryException("Capacidad máxima de usuarios alcanzada.");
	            }
	            if (usuarios.contains(usuario)) {
	                throw new UserMemoryException("Usuario ya existe.");
	            }
	            usuarios.add(usuario);
	        }

	        public Usuario buscarUsuario(String login) {
	            for (Usuario u : usuarios) {
	                if (u.getLogin().equals(login)) {
	                    return u;
	                }
	            }
	            return null;
	        }

	        public void agregarMensaje(Mensaje mensaje) {
	            if (mensajes.size() >= MAX_MENSAJES) {
	                mensajes.removeFirst(); // Eliminar el más antiguo
	            }
	            mensajes.add(mensaje);
	        }

	        public List<Mensaje> obtenerMensajesPorUsuario(String login) {
	            List<Mensaje> res = new ArrayList<>();
	            for (Mensaje m : mensajes) {
	                if (m.getAutor().getLogin().equals(login)) {
	                    res.add(m);
	                }
	            }
	            return res;
	        }

	        public List<Mensaje> obtenerMensajesPorUsuarioYTipo(String login, Class<? extends Mensaje> tipo) {
	            List<Mensaje> res = new ArrayList<>();
	            for (Mensaje m : mensajes) {
	                if (m.getAutor().getLogin().equals(login) && tipo.isInstance(m)) {
	                    res.add(m);
	                }
	            }
	            return res;
	        }

	        public List<Mensaje> obtenerTodosMensajes() {
	            return new ArrayList<>(mensajes);
	        }
	    }

	    // --- Comparador ---
	    public static class Comparador implements Comparator<Mensaje> {
	        @Override
	        public int compare(Mensaje m1, Mensaje m2) {
	            int puntuacion1 = m1.calcularPuntuacion();
	            int puntuacion2 = m2.calcularPuntuacion();

	            if (puntuacion1 != puntuacion2) {
	                return Integer.compare(puntuacion2, puntuacion1); // Descendente por puntuación
	            } else {
	                return m2.getFechaCreacion().compareTo(m1.getFechaCreacion()); // Más recientes antes
	            }
	        }
	    }

	    // --- Método principal para pruebas ---
	    public static void main(String[] args) {
	        MemoryStorage storage = new MemoryStorage();

	        try {
	            // Crear usuarios válidos
	            Usuario u1 = new Usuario("usuario1", "Passw0rdA");
	            Usuario u2 = new Usuario("usuario2", "Clave123B");
	            Usuario u3 = new Usuario("us3", "Clave123B"); // login < 6 chars -> excepción

	            storage.agregarUsuario(u1);
	            storage.agregarUsuario(u2);

	        } catch (UserMemoryException e) {
	            System.out.println(e.getMessage());
	        }

	        try {
	            // Buscar usuario para crear mensajes
	            Usuario u1 = storage.buscarUsuario("usuario1");
	            Usuario u2 = storage.buscarUsuario("usuario2");
	            Usuario uFake = new Usuario("usuarioFake", "Fake123A");

	            // Crear mensajes válidos
	            Tweet tweet = new Tweet("Este es un tweet válido", u1);
	            Post post = new Post("Este es un post válido con contenido", u2);
	            Recomendacion rec = new Recomendacion(
	                    "Esta es una recomendación válida que debe tener entre 100 y 200 caracteres. " +
	                    "Aquí ponemos un texto que cumple con esa condición, ni muy corto ni muy largo.",
	                    u1);

	            // Agregar mensajes
	            storage.agregarMensaje(tweet);
	            storage.agregarMensaje(post);
	            storage.agregarMensaje(rec);

	            // Intentar crear mensaje con usuario no existente
	            try {
	                Tweet tweetError = new Tweet("Tweet de usuario inexistente", uFake);
	                storage.agregarMensaje(tweetError);
	            } catch (PublicacionException ex) {
	                System.out.println("Error creando mensaje: " + ex.getMessage());
	            }

	            // Valorar mensajes
	            tweet.valorar(u2, Valoracion.SUPERBUENA);
	            post.valorar(u1, Valoracion.MUYBUENA);
	            rec.valorar(u2, Valoracion.BUENA);

	            // Mostrar mensajes de usuario1
	            System.out.println("\nMensajes de usuario1:");
	            for (Mensaje m : storage.obtenerMensajesPorUsuario("usuario1")) {
	                System.out.println(m);
	            }

	            // Mostrar tweets de usuario1
	            System.out.println("\nTweets de usuario1:");
	            for (Mensaje m : storage.obtenerMensajesPorUsuarioYTipo("usuario1", Tweet.class)) {
	                System.out.println(m);
	            }

	            // Mostrar mensajes ordenados
	            System.out.println("\nMensajes ordenados por puntuación y fecha:");
	            List<Mensaje> todos = storage.obtenerTodosMensajes();
	            todos.sort(new Comparador());
	            for (Mensaje m : todos) {
	                System.out.println(m);
	            }

	            // Intentar crear mensajes inválidos (para lanzar excepciones)
	            try {
	                Tweet tweetInvalido = new Tweet("Este tweet tiene más de cincuenta caracteres y debe fallar", u1);
	            } catch (PublicacionException e) {
	                System.out.println(e.getMessage());
	            }

	            try {
	                Post postInvalido = new Post("   ", u2);
	            } catch (PublicacionException e) {
	                System.out.println(e.getMessage());
	            }

	            try {
	                Recomendacion recInvalida = new Recomendacion("Corto", u1);
	            } catch (PublicacionException e) {
	                System.out.println(e.getMessage());
	            }

	        } catch (UserMemoryException | PublicacionException e) {
	            System.out.println(e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


