class TeaRunner
{
	public static void main(String[] item)
	{
		if(item.length==5)
		{
		String name=item[0];
		String type=item[1];
		String price=item[2];
		String quality=item[3];
		String quantity=item[4];
		
		System.out.println("name:"+name);
		System.out.println("type:"+type);
		System.out.println("price:"+price);
		System.out.println("quality:"+quality);
		System.out.println("quantity:"+quantity);
		
		int convertedPrice=Integer.parseInt(price);
		System.out.println("converted price:"+price);
		if(convertedPrice<=15)
		{
			System.out.println("price of an item is good");
		}
		else
		{
			System.out.println("price of item is not good");
		}
		
		int convertedQuantity=Integer.parseInt(quantity);
		System.out.println("converted quantity:"+quantity);
		if(convertedQuantity<=5)
		{
			System.out.println("Quantity of item is worthy");
		}
		else
		{
			System.out.println("Quantity of item is not worthy");
		}
		
		int convertedQuality=Integer.parseInt(quality);
		System.out.println("converted quality:"+quality);
		if(convertedQuality<=10)
		{
			System.out.println("quality of item is good");
		}
		else
		{
			System.out.println("quality of item is not good");
		}
	}	
	}	
}