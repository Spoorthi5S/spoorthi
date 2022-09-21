class ToothPasteRunner{
	public static void main(String[] paste)
	{
		ToothPaste.setInventer("WilliamNebergall");
		ToothPaste.setBrand("Meswek");
		ToothPaste.setPrice(150);
		ToothPaste.setSalt(false);
		ToothPaste.setSolid(true);
		ToothPaste.setQuantity(250);
		ToothPaste.setDensity(1.499f);
		ToothPaste.setFluoride(true);
		ToothPaste.setColor("red");
		ToothPaste.setBrand2("Sensodyne");
		ToothPaste.setCarbonates(false);
		ToothPaste.setPH(6.83f);
		ToothPaste.setFlavour("FreshMint");
		ToothPaste.setBase(true);
		ToothPaste.setBoilingPoint(248);
		String inventer=ToothPaste.getInventer();
		String Brand=ToothPaste.getBrand();
		int price=ToothPaste.getPrice();
		boolean salt=ToothPaste.getSalt();
		boolean solid=ToothPaste.getSolid();
		int quantity=ToothPaste.getQuantity();
		float density=ToothPaste.getDensity();
		boolean fluoride=ToothPaste.getFluoride();
		String color=ToothPaste.getColor();
		String Brand2=ToothPaste.getBrand2();
		boolean carbonates=ToothPaste.getCarbonates();
		float pH=ToothPaste.getPH();
		String flavour=ToothPaste.getFlavour();
		boolean base=ToothPaste.getBase();
		int BoilingPoint=ToothPaste.getBoilingPoint();
		if(inventer=="WilliamNebergall" && Brand=="Meswek" && price==150 && salt==false && solid==true && quantity==250 
		&& density==1.499f && fluoride==true && color=="red" && Brand2=="Sensodyne" && carbonates==false && pH==6.83f && 
		flavour=="FreshMint" && base==true && BoilingPoint==248)
		{
			System.out.println("chanag ide");
		}
		else
		{
			System.out.println("chanag illa");
		}
	}
}