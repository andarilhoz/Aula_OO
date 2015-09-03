import javax.swing.JOptionPane;

public class Compila {
	public static void main(String[] args){
		int soma = 0;
		int v[] = {41,2,73,84,35,96,67,28,59,10,88};

		try{
			v[3]=10;v[10]=20;v[8]=30;

		}
		catch(Exception nfe){
			v[1]=40;v[5]=50;v[7]=60;
		}
		finally{
			v[2]=70;v[6]=80;v[9]=90;
		}
		//public int R= 0;
		for(int i=2; i<v.length; i+= 3)
			soma+=v[i];
			
		
		JOptionPane.showMessageDialog(null,soma);
	}
}