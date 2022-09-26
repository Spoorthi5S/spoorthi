class MovieDataOperatorRunner{
	public static void main(String[] film)
	{
		System.out.println("main: nadita ide");
		
		String Movie1="Googly";
		MovieDataOperator.save(Movie1);
		
		MovieDataOperator.save("KGF");
		MovieDataOperator.save("Kirataka");
		MovieDataOperator.save("RajaHuli");
		MovieDataOperator.displayDetails();
		System.out.println("main:mugitu");
	}
}