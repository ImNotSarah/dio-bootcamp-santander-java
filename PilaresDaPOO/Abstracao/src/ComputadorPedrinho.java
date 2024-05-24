public class ComputadorPedrinho {
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		
		System.out.println("MSN");
		msn.enviarMensagem();
		msn.receberMensagem();

		System.out.println("FACEBOOK");
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();

		System.out.println("TELEGRAM");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}

}