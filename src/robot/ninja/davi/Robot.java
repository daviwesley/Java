package robot.ninja.davi;

public class Robot {
	 // as variaveis dentro da classe sao chamadas de variaveis de instancia
    private int nivelBateria;
    public int getNivelBateria() {
		return nivelBateria;
	}
	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getCoordX() {
		return coordX;
	}
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}
	public int getCoordY() {
		return coordY;
	}
	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
	private String nome;
    private char sexo;
    private int coordX;
    private int coordY;
    

}
