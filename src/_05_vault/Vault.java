package _05_vault;

public class Vault {
	int secretCode = 49678;
	public static void main(String[] args) {
		Vault vault = new Vault(5670);
	boolean correct =	vault.tryCode(49678);
	System.out.println(correct);
	}
Vault(int secretCode){
	this.secretCode = secretCode;
}


 Boolean tryCode(int number){
	
	if(number == secretCode) {
		 return true;
	}else {
		return false;
	}
}
}