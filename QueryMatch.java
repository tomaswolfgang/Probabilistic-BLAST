
public class QueryMatch {
	private String matchString;
	private int queryIndex;
	private int genomeIndex;
	private float score;
	private double eValue;
	private int count;
	private float rawScore;
	
	public QueryMatch(String match, int qind, int gind, float score, double e){
		matchString = match;
		queryIndex = qind; 
		genomeIndex = gind;
		this.score = score; 
		rawScore = score;
		eValue = e; 
		count = 1; 
	}
	
	public void incrementMatchCount(){
		count++;	
	}
	
	
	public String getMatchString(){
		return matchString;
	}
	
	public int getCount(){
		return count;
	}
	
	public int getGind(){
		return genomeIndex;
	}
	
	public float getScore(){
		return score;
	}
	
	public float getRawScore(){
		return rawScore;
	}
	
	public float getFinalScore(){
		return rawScore/count;
	}
	
	
	public void incrementScore(QueryMatch q){
		rawScore += q.getScore();
	}
	
	public void printDetails(){
		System.out.println("match: " + matchString);
		System.out.println("q index: " + queryIndex);
		System.out.println("genome index: " + genomeIndex);
		System.out.println("score: " + score);
		System.out.println("eValue: " + eValue);
		System.out.println("Count: " + count);
	}
	
	
	

}
