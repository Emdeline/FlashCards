
public class FlashCard
	{
		private static String question;
		
		private static String answer;
		
		public FlashCard(String q, String a)
			{
				question = q;
				answer = a;
			}
	
		public static String getQuestion()
			{
				return question;
			}
		
		public static void setQuestion(String question)
			{
				FlashCard.question = question;
			}
		
		public static String getAnswer()
			{
				return answer;
			}
		
		public static void setAnswer(String answer)
			{
				FlashCard.answer = answer;
			}
		
	}
