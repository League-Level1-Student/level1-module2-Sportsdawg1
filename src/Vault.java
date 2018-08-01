
public class Vault {
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	private int code;
	
	boolean tryCode (int number) {
		if (this.code == number) {
			return true;
		} else {
			return false;
		}
	}
	
	public Vault (int code) {
		this.code = code;
	}
	
	public static void main(String[] args) {
		Vault vault = new Vault(-3);
		JamesBond james = new JamesBond();
		System.out.println(james.findCode(vault));
		
	}
}
