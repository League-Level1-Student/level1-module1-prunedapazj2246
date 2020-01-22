package _05_vault;

public class JamesBond {
	
	public static void main(String[] args) {
		
		JamesBond j = new JamesBond();
		Vault vault = new Vault(23212);

		int f =j.findCode(vault);
		System.out.println(f);
	}
int findCode(Vault a) {
	boolean code = false;
	for (int i = 0; i < 1000000; i++) {
		
	code=a.tryCode(i);
	if (code == true) {
		return i;
	}
	
	}
	return -1;
}
}	

