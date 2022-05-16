package Modelo;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloVideos {

	private ConexionMySQL mysql;

	public ModeloVideos(ConexionMySQL mysql) {
		this.mysql = mysql;
	}

	public void insertar(Video video) {

		try {
			String sqlQuery = "INSERT INTO videos (Titulo, Director, ID_cli) VALUE (\""
					+ video.getTitle() + "\",\"" + video.getDirector() + "\",\"" + video.getId_cli() + ");";
			mysql.insertQuery("VideoClub", sqlQuery);
		} catch (Exception e) {
			System.out.println("Fallo insercion modelo video");
		}
	}

	public ArrayList<Video> mostrarTodos() {

		try {
			String sqlQuery = "SELECT * FROM videos;";
			ResultSet rs = mysql.getAllRows("VideoClub", sqlQuery);

			ArrayList<Video> arrvideos = new ArrayList<Video>();

			while (rs.next()) {
				// Crear video y anadirlo al array
				Video video = new Video(rs.getLong("ID"), rs.getString("Title"), rs.getString("Director"), rs.getInt("ID_cli"));

				arrvideos.add(video);
			}

			return arrvideos;

		} catch (Exception e) {
			System.out.println("Fallo mostrar registros");
			System.out.println(e);

			return new ArrayList<Video>();
		}

	}

	public void update(Video video) {

		try {
			String sqlQuery = "UPDATE videos SET (Title, Director, ID_cli) WHERE ID = "
					+ video.getID() + ";";
			mysql.insertQuery("VideoClub", sqlQuery);

		} catch (Exception e) {
			System.out.println("Fallo Update modelo video");
		}

	}
}
