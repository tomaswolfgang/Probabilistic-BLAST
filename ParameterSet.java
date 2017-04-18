import java.util.Random;

public class ParameterSet {
	private String query;
	private int wordLength;
	private int genomeIndex;
	private double subChance = .05;
	private double indelChance = subChance / 10;
	private int qlengthUpper = 150;
	private int qlengthLower = 100;
	
	
	public ParameterSet(NonDetBasePair[] genome){
		Random rand = new Random();
		
		query = "";

		
		//query length is random between qlengthLower and Upper
	    int randomQLen = rand.nextInt((qlengthUpper - qlengthLower) + 1) + qlengthLower;
	    
	    //genome index is random between genome.length - wordLength and wordLength
	    genomeIndex = rand.nextInt((genome.length - randomQLen) + 1) ;
	    
	    for(int i = 0; i < randomQLen; i++){
	    	
	    	//indel
	    	double randomValue = rand.nextDouble();
	    	if(randomValue < indelChance){
	    		//System.out.println("Random indel!");
	    		randomValue = rand.nextDouble();
	    		if(randomValue > .5){
	    			//deletion
	    			continue;
	    		}
	    		else{
	    			//insertion
	    			randomValue = rand.nextDouble();
	    			if(randomValue < 1/4){
		    			query += 'A';
		    		}
		    		else if(randomValue < 2/4){
		    			query += 'G';
		    		}
		    		else if(randomValue < 3/4){
		    			query += 'C';
		    		}
		    		else{
		    			query+= 'T';
		    		}
	    		}
	    	}
	    	
	    	//Substitution
	    	randomValue = rand.nextDouble();
	    	if(randomValue < subChance){
	    		
	    		randomValue = rand.nextDouble();
	    		char bp = genome[genomeIndex + i].getRandomizedBasePair();
	    		char[] set = getOtherBasepairs(bp);
	    		if(randomValue < 1/3){
	    			query += set[0];
	    		}
	    		else if(randomValue < 2/3){
	    			query += set[1];
	    		}
	    		else{
	    			query+= set[2];
	    		}
	    		continue;
	    	}
	    	
	    	
	    	//Normal
	    	query += genome[genomeIndex + i].getRandomizedBasePair();
	    }
	}
	
	public int getGenomeIndex(){
		return genomeIndex;
	}
	
	public String getQuery(){
		return query;
	}
	
	public int getWordLength(){
		return wordLength;
	}
	
	private char[] getOtherBasepairs(char bp){
		char[] otherBps = new char[3];
		int index = 0; 
		if(bp != 'A'){
			otherBps[index] = 'A';
			index++;
		}
		
		if(bp != 'G'){
			otherBps[index] = 'G';
			index++;
		}
		
		if(bp != 'C'){
			otherBps[index] = 'C';
			index++;
		}
		
		if(bp != 'T'){
			otherBps[index] = 'T';
			index++;
		}
		
		return otherBps;
	}
}
