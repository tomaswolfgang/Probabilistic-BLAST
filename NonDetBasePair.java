import java.util.Random;

public class NonDetBasePair {
	private char basepair;
	private double probA;
	private double probG;
	private double probC;
	private double probT;
	
	
	public NonDetBasePair(char bp, double prob){
		basepair = bp; 
		double nonprob = (1 - prob)/3;
		if(bp == 'A'){
			probA = prob;
			probG = nonprob;
			probC = nonprob;
			probT = nonprob;
		}
		else if(bp == 'C'){
			probA = nonprob;
			probG = nonprob;
			probC = prob;
			probT = nonprob;
		}
		else if(bp == 'G'){
			probA = nonprob;
			probG = prob;
			probC = nonprob;
			probT = nonprob;
		}
		else{
			probA = nonprob;
			probG = nonprob;
			probC = nonprob;
			probT = prob;
		}
	}
	
	public char getRandomizedBasePair(){
		Random r = new Random();
		double p = r.nextDouble();
		if(p < probA){
			return 'A';
		}
		else if(p < probA + probG){
			return 'G';
		}
		else if( p < probA + probG + probC){
			return 'C';
		}
		else{
			return 'T'; 
		}
	}
	
	public char getChar(){
		return basepair;
	}
	
	public boolean hasNonZeroProb(char bp){
		boolean result = false;
		if(bp == 'A'){
			if(probA != 0){
				result = true;
			}
		}
		else if(bp == 'G'){
			if(probG != 0){
				result = true;
			}
		}
		else if(bp == 'C'){
			if(probC != 0){
				result = true;
			}
		}
		else if(bp == 'T'){
			if(probT != 0){
				result = true;
			}
		}
		
		return result;
	}
	
	public double getBasePairProb(char bp){
		if(bp == 'A'){
			return probA;
		}
		else if(bp == 'G'){
			return probG;
		}
		else if(bp == 'C'){
			return probC;
		}
		else {
			return probT;
		}
	}
	
	public char[] getUnlikelySet(){
		char[] set = new char[3];
		int index = 0;
		
		if('A' != basepair){
			set[index] = 'A';
			index++;
		}
		if('C' != basepair){
			set[index] = 'C';
			index++;
		}
		if('T' != basepair){
			set[index] = 'T';
			index++;
		}
		if('G' != basepair){
			set[index] = 'G';
			index++;
		}
		
		return set;
	}

}



