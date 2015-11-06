package ninja.ufc.curso;

public class TesteAparelho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Microondas micro;
        micro = new Microondas();
        Microondas micro2;
        micro2 = new Microondas();
        if(micro.equals(micro2)){
        	System.out.println("Verdadeiro");
        }
        micro.exibir();
	}

}
