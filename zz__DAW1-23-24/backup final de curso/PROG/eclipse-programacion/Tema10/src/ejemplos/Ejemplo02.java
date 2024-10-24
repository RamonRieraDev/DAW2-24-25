package ejemplos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost/Libreria";
		String usuario = "librero";
		String password = "Ageofempires2";

		listar("Robert Louis Stevenson", url, usuario, password);

		Libro libro = new Libro(1007, "La ecuación de Dios", "Michio Kaku", 10, 1);
		
		// insertarLibro(url, usuario, password, libro);

		// actualizarTitulo(url, usuario, password, 1002, "El Conde de Montecristo");
		
		// borrarTabla(url, usuario, password);

	}

	private static void listar(String autor, String url, String usuario, String password) {

		String sql = "select * from libros where autor=?";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

			preparedStatement.setString(1, autor);

			ResultSet resultados = preparedStatement.executeQuery();

			System.out.println("LIBROS ESCRITOS POR: " + autor.toUpperCase());
			while (resultados.next()) {

				System.out.println(resultados.getInt("id"));
				System.out.println(resultados.getString("titulo"));
				System.out.println(resultados.getString("autor"));
				System.out.println(resultados.getFloat("precio"));
				System.out.println(resultados.getInt("cantidad"));
				System.out.println("-------------");

			}

		} catch (SQLException e) {
			System.out.println("Error de acceso a la base de datos.");
			e.printStackTrace();
		}
	}

	private static void insertarLibro(String url, String usuario, String password, Libro libro) {

		String sql = "insert into libros values (?, ?, ?, ?, ?)";
		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

			preparedStatement.setInt(1, libro.getId());
			preparedStatement.setString(2, libro.getTitulo());
			preparedStatement.setString(3, libro.getAutor());
			preparedStatement.setFloat(4, libro.getPrecio());
			preparedStatement.setInt(5, libro.getUnidades());

			int registrosModificados = preparedStatement.executeUpdate();
			System.out.println("Se han modificado " + registrosModificados + " registros.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void actualizarTitulo(String url, String usuario, String password, int id, String titulo) {

		String sql = "update libros set titulo=? where id=?";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

			preparedStatement.setString(1, titulo);
			preparedStatement.setInt(2, id);

			int registrosModificados = preparedStatement.executeUpdate();

			System.out.println("Se han modificado " + registrosModificados + " registros.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void borrarTabla(String url, String usuario, String password) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Está seguro de querer eliminar el contenido de la tabla Libros? (s/n)");
		String confirmacion = entrada.nextLine();

		if (!confirmacion.equals("s")) {
			System.out.println("No se ha borrado nada.");
			return;
		}

		String sql = "delete from libros";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

			int registrosBorrados = preparedStatement.executeUpdate();

			System.out.println("Se han borrado " + registrosBorrados + " registros.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}