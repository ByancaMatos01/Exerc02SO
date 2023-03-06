package Controller;

public class ThreadMat  extends Thread {
	
	private int[] l;
	private int numero;
	public ThreadMat(int[] l, int numero) {
		this.l=l;
		this.numero=numero;
		
	}
	@Override
	public void run() {
		int soma=0;
		for(int i: l) {
			soma= soma+ i;
		}
		System.out.println("Soma das linhas é ====> #"+ (numero  +1)+ ": "+ soma);
	}

}
