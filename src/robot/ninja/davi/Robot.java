package robot.ninja.davi;

public class Robot {
	 // as variaveis dentro da classe sao chamadas de variaveis de instancia
    private int nivelBateria;
    private String nome;
    private char sexo;
    private int coordX;
    private int coordY;
    public int getNivelBateria() {
		return nivelBateria;
	}
	public void setNivelBateria(int nivelBateria) {
		if (nivelBateria >=0 && nivelBateria<=10)
		{
			this.nivelBateria= nivelBateria;
		}
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
	
	public int qualMes(int mes)
	{
		switch (mes){//
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Marco");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		}
		return mes;
	}
	
	public void andarx(int andar)
	{ 
		/*coordx = andar + coordX
		 * while (coordX!=passos)
		 * {
		 *   coordX++
		 * }
		 * else {
		 * coordX--;  */
		while (this.coordX<andar)
		{
			this.coordX++;
			System.out.println("estou na coodernada..." + this.coordX);
		}
		while (this.coordX>andar)
		{
			this.coordX--;
			System.out.println("estou na coodernada..." + this.coordX);
		}
	}
	
    

}
