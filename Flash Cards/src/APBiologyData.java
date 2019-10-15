import java.util.ArrayList;
public class APBiologyData
	{
		static ArrayList <FlashCard> APBioCards = new ArrayList <FlashCard> ();

		public static void main(String[] args)
			{
				APBiologyData.loadData();
				System.out.println(APBiologyData.APBioCards.get(0).getQuestion());
			}
		public static void loadData()
			{
				APBioCards.add(new FlashCard("Phospolipid Bilayer" , "A layer of a cell"));

			}

	}
