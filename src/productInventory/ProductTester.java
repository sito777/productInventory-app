package productInventory;

import java.util.Scanner; //scanner wordt geimporteerd
import java.util.ArrayList; //arraylist wordt geimporteerd

public class ProductTester
{

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);// de input scanner krijgt de variable in
	boolean x = true;
	ArrayList<Product> product = new ArrayList<Product>(); //arraylist op basis van de product klasse

	while (x)//de loopt wordt uitgevoerd zolang x true is
	{
	    try // try de loop
	    {
		System.out.println("\nWhat would you like to do? Enter 1, 2 or 3" + "\n1. Add products"
			+ "\n2. View products" + "\n3. Close the application"
			+ "\n___________________________________________________\n");
		int optie = in.nextInt();
		if (optie == 1)
		{
		    System.out.println("Enter the number of products you would like to add\n" // de gebruiker wordt
											      // gevraagd hoeveel
											      // product
			    + "Enter 0 (zero) if you do not wish to add products:"); // hij/zij wilt toevoegen
		    int maxSize = in.nextInt(); // input voor hoeveel producten de gebruiker wilt toevoegen
		    int i = 0;
		    if (maxSize > 0)
		    {
			do // loop blijft loopen zolang i kleiner is dan maxSize
			{
			    try
			    {
				System.out.println("\nWhat is the name of the product?:");
				String tempName = in.next(); // de input wordt opgeslagen in de variable tempname
				System.out.println("\nWhat is the quantity of the product?:");
				int tempQty = in.nextInt(); // de input wordt opgeslagen in de variable tempQty
				System.out.println("\nWhat is the price of the product?:");
				double tempPrice = in.nextDouble(); // de input wordt opgeslagen in de variable
								    // tempPrice
				System.out.println("\nWhat is the item number of the product?:");
				int tempNum = in.nextInt();// de input wordt opgeslagen in de variable tempNum
				boolean tempStat = true;
				product.add(new Product(tempNum, tempName, tempQty, tempPrice, tempStat)); // de input
													   // wordt
													   // verzameld
													   // en
													   // opgeslagen
													   // als een
													   // nieuwe
													   // product
				System.out.println("___________________________________________________\n");
				i++;
			    } catch (Exception e)
			    {
				System.out.println("Incorrect data type entered! Try again"); // waneer de gebruiker een
											      // verkeerde
											      // input geeft krijgt de
											      // gebruiker dit
											      // te zien
				in.nextLine(); // de gebruiker wordt naar de begin van de try gestuurd om de vragen
					       // opniuew in
					       // te vullen
			    }

			} while (i < maxSize);
			{
			    // zo lang maxSize kleiner is dan i blijft de do loop loopen
			}

		    } else if (maxSize <= 0)
		    {
			System.out.println("No products required!"); // waneer de gebruiker 0 producten wilt toevoegen
								     // ziet de
								     // gebruiker dit
		    } else
		    {
			System.out.println("Incorrect Value entered"); // waneer de input niet herkent wordt ziet de
								       // gebruiker dit
		    }
		} else if (optie == 2)
		{
		    for (int i = 0; i < product.size(); i++)
			System.out.println(product.get(i) + "\n");
		    System.out.println("\nWould you like to change or delete a product?" + "\n1. delete" + "\n2. change"
			    + "\n3. exit" + "\n___________________________________________________\n");
		    int changeOptie = in.nextInt(); 
		    if (changeOptie == 1)
		    {
			System.out.println("Which product would you like to delete? Enter a number");
			int numberDel = in.nextInt();
			System.out.println("Would you really like to delete this product? " + product.get(numberDel - 1) //confirmatie vragen of de aplicatie en de gebruiker het zelfde bedoelen 
				+ "\n1. yes" + "\n2. no");
			int confirmatieDel = in.nextInt();
			if (confirmatieDel == 1)
			{
			    product.remove(numberDel - 1);
			} else if (confirmatieDel == 2)
			{
			    continue;
			} else
			{
			    System.out.println("Incorrect Value entered"); // waneer de input niet herkent wordt ziet de
									   // gebruiker dit
			}
		    } else if (changeOptie == 2)
		    {
			System.out.println("Which product would you like to change? Enter a number");
			int numberChange = in.nextInt();
			System.out.println("Would you really like to change \n" + product.get(numberChange - 1) //confirmatie vragen of de aplicatie en de gebruiker het zelfde bedoelen
				+ "\n1. yes" + "\n2. no");
			int confirmatieChange = in.nextInt();
			if (confirmatieChange == 1)
			{
			    int nummertje = numberChange - 1;
			    	System.out.println("What would you like to change? "
					+ "\n1. name"
					+ "\n2. quantity"
					+ "\n3. price"
					+ "\n4. item number");
			    	int lineChange = in.nextInt();
			    	
			    	
			    switch (lineChange) // gebruiker vragen wat hij van de product wilt veranderen
			    {
			    case 1:
				System.out.println("\nWhat is the name of the product?:");
				String tempName = in.next(); // de input wordt opgeslagen in de variable tempname
				product.get(nummertje).setProductName(tempName);
				break;
			    case 2:
				System.out.println("\nWhat is the quantity of the product?:");
				int tempQty = in.nextInt(); // de input wordt opgeslagen in de variable tempQty
				product.get(nummertje).setStock(tempQty);
				break;
			    case 3:
				System.out.println("\nWhat is the price of the product?:");
				double tempPrice = in.nextDouble(); // de input wordt opgeslagen in de variable tempPrice 
				product.get(nummertje).setProductPrice(tempPrice);
				break;
			    case 4:
				System.out.println("\nWhat is the item number of the product?:");
				int tempNum = in.nextInt();// de input wordt opgeslagen in de variable tempNum
				product.get(nummertje).setPRODUCTID(tempNum);
				break;
			    }	
			    continue;
			} else if (confirmatieChange == 2)
			{
			    continue;
			} else
			{
			    System.out.println("Incorrect Value entered"); // waneer de input niet herkent wordt ziet de
									   // gebruiker dit
			}
		    } else if (changeOptie == 3)
		    {
			continue;
		    } else
		    {
			System.out.println("Incorrect Value entered"); // waneer de input niet herkent wordt ziet de
								       // gebruiker dit
		    }
		} else if (optie == 3)
		{
		    x = false;
		} else
		{
		    System.out.println("Incorrect Value entered"); // waneer de input niet herkent wordt ziet de
								   // gebruiker dit
		}

	    } catch (Exception e)
	    {
		System.out.println("Incorrect Value entered"); // waneer de input niet herkent wordt ziet de gebruiker
							       // dit
		in.nextLine();//gebruiker wordt naar begin van de while loop gestuurd
	    }
	}

    }
}
