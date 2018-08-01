
public class JamesBond {
	boolean unlocked = false;
	
	int findCode (Vault vault) {
		for (int i = 0; i < 1000001; i++) {
			if (vault.getCode() == i) {
				unlocked = true;
				return i;
			} else if (unlocked == false) {
				System.out.println(i + "is not the code");
			}
			
		}
		if (unlocked == false) {
			return -1;
		}
		return 0;
		
	}
}
