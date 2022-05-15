package Modelo;

public class Video {

	private String tittle;
	private String director;
	private Integer id_cli;
	
	
	public Video() {
		
	}
	
	

	public Video(String tittle, String director) {
		this.tittle = tittle;
		this.director = director;
		this.id_cli = null;
	}



	public Video(String tittle, String director, int id_cli) {
		this.tittle = tittle;
		this.director = director;
		this.id_cli = id_cli;
	}

	//Getters & Setters

	public String getTittle() {
		return tittle;
	}



	public void setTittle(String tittle) {
		this.tittle = tittle;
	}



	public String getDirector() {
		return director;
	}



	public void setDirector(String director) {
		this.director = director;
	}



	public Integer getId_cli() {
		return id_cli;
	}



	public void setId_cli(Integer id_cli) {
		this.id_cli = id_cli;
	}


	@Override
	public String toString() {
		return "Video [tittle=" + tittle + ", director=" + director + ", id_cli=" + id_cli + "]";
	}
	
	
	
}
