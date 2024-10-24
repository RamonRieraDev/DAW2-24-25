package ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

public class Ejemplo03 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost/inversiones";
		String usuario = "java";
		String password = "Ageofempires2";

		// addEmpresas(url, usuario, password);

		//addAcciones(url, usuario, password);
		
		// listaEmpresas(url, usuario, password);
		
		informe(url, usuario, password);
	}

	private static void addEmpresas(String url, String usuario, String password) {

		String[][] empresas = { { "1", "Navantia", "2005", }, { "2", "Red Eléctrica Española", "1985" },
				{ "3", "Indra", "1992" } };

		String sql = "insert into empresas values (?, ?, ?)";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

			System.out.println("Insertando registros en la tabla Empresas...");

			for (int i = 0; i < empresas.length; i++) {
				preparedStatement.setInt(1, Integer.parseInt(empresas[i][0]));
				preparedStatement.setString(2, empresas[i][1]);
				preparedStatement.setString(3, empresas[i][2]);

				int registrosIntroducidos = preparedStatement.executeUpdate();
				System.out.println(registrosIntroducidos + " registro(s) modificados.");
			}

		} catch (NumberFormatException e) {
			System.out.println("No se ha convertido el string a entero.");

		} catch (SQLException e) {
			System.out.println("Error al insertar datos.");
			e.printStackTrace();
		}
	}

	private static void addAcciones(String url, String usuario, String password) {

		String[][] acciones = { { "1", "Carlos Pérez", "1", "100" }, { "2", "Lucía Martínez", "1", "55" },
				{ "3", "José López", "2", "70" }, { "4", "Marcos Jiménez", "3", "125" } };

		String sql = "insert into acciones values (?, ?, ?, ?)";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

			System.out.println("Insertando registros en la tabla Acciones...");

			for (int i = 0; i < acciones.length; i++) {
				preparedStatement.setInt(1, Integer.parseInt(acciones[i][0]));
				preparedStatement.setString(2, acciones[i][1]);
				preparedStatement.setString(3, acciones[i][2]);
				preparedStatement.setString(4, acciones[i][3]);

				int registrosIntroducidos = preparedStatement.executeUpdate();
				System.out.println(registrosIntroducidos + " registro(s) modificados.");
			}

		} catch (NumberFormatException e) {
			System.out.println("No se ha convertido el string a entero.");

		} catch (SQLException e) {
			System.out.println("Error al insertar datos.");
			e.printStackTrace();
		}

	}

	private static void listaEmpresas(String url, String usuario, String password) {

		String sql = "select * from inversiones.empresas";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				Statement statement = conexion.createStatement()) {

			ResultSet resultados = statement.executeQuery(sql);
			
			System.out.println("Tabla Empresas");
			System.out.println("-----------------------------------");
			
			//System.out.printf("%-4s", "%-24s", "%-10" ,"ID", "NOMBRE", "FUNDACIÓN");
			
			while(resultados.next()) {
				System.out.println("ID: " + resultados.getString(1));
				System.out.println("NOMBRE: " + resultados.getString(2));
				System.out.println("FUNDACIÓN: " + resultados.getString(3));
				System.out.println();
			}
			
		} catch (SQLException e) {
			System.out.println("Error al insertar datos.");
			e.printStackTrace();
		}

	}
	
	private static void informe(String url, String usuario, String password) {
		
		String sql = "select propietario, nombre, cantidad from acciones join empresas where ;";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				Statement statement = conexion.createStatement()) {

			ResultSet resultados = statement.executeQuery(sql);
			
			System.out.println("Tabla de acciones");
			System.out.println("-----------------------------------");
			
			//System.out.printf("%-4s", "%-24s", "%-10" ,"ID", "NOMBRE", "FUNDACIÓN");
			
			while(resultados.next()) {
				System.out.println("PROPIETARIO: " + resultados.getString(1));
				System.out.println("NOMBRE: " + resultados.getString(2));
				System.out.println("CANT: " + resultados.getInt(3));
				System.out.println();
			}
			
		} catch (SQLException e) {
			System.out.println("Error al insertar datos.");
			e.printStackTrace();
		}
		
	}
}
