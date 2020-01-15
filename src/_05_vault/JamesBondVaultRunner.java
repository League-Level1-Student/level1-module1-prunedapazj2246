package _05_vault;

public class JamesBondVaultRunner {
	
	public static void main(String[] args) {
		Vault vault = new Vault();
		
	}
int findCode(Vault a) {
	boolean code = false;
	for (int i = 0; i < 1000000; i++) {
		
	code=a.tryCode(i);
	if (code == true) {
		return i;
	}
	return -1;
	}
	
}
}	

