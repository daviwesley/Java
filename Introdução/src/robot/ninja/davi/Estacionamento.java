package robot.ninja.davi;

public class Estacionamento {
	private Carro[] vagas = new Carro[100];
	private static int totalVagas = 100;
	private static float lucroDia= 0;
	
	public void entrada (Carro carro){
		if (totalVagas >0){
			for (int i = 0; i <vagas.length; i++){
				if (vagas[i]!=null){
					vagas[i]= carro;
					totalVagas--;
					break;
				}
			}
		}
	}
	
	public static float getLucroDia() {
		return lucroDia;
	}

	public static void setLucroDia(float lucroDia) {
		Estacionamento.lucroDia = lucroDia;
	}

	public void saida(String placa){
		for (int i = 0; i <vagas.length; i ++){
			if (vagas[i] !=null && vagas[i].getPlaca().equals(placa)){
				lucroDia+=5.0f;
				vagas[i]=null;
				break;
			}
		}
	}

}
