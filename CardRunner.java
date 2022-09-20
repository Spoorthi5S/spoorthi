class CardRunner{
	public static void main(String[] greeting)
	{
		System.out.println("main:nadita ide");
		
		Card.displayDetails();
		
		Card.type="newYearCard";
		Card.height=15.5;
		Card.width=11.2;
		Card.price=25;
		String[] used={"Red","Blue","Black"};
		Card.colors=used;
		
		Card.displayDetails();
		
		System.out.println("main:ready aytu");
	}
}
		