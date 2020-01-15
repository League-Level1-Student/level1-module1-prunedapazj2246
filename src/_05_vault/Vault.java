package _05_vault;

public class Vault {
int secretCode = 49678;


 Boolean tryCode(int number){
	
	if(number == secretCode) {
		 return true;
	}else {
		return false;
	}
}
}