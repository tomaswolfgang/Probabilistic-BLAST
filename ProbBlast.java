import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

//The main class

public class ProbBlast {
	static int softenFactor = 5;
	
	public static void main(String[] args) throws IOException{
		
		//Calculate memory usage
		Runtime runtime = Runtime.getRuntime();
	    long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
	    
	    final long startTime = System.currentTimeMillis();
	    
	    
	    
	    //>L2#LINE/L2 @Monotremata @Eutheria @Theria_Mammalia  [S:60] RepbaseID: L2
		//String query = "acctccnagcctccatcggcaggagtcaagagggagccccatgcgctcngagtaagaccgccctccccaggcctccatgtcnccatcagcaggagtcaagagagggccccagaactctgcgtgctcctggcaagactccaactccccanttccncctcaacactcacagcctcnccaccactatctgccttgagaccatcaggactaatctcatcatgccctttatccctgtttatgtcagtcaccacaagaagcccaagactcccaggtcatccctcatcccccagactctnatccccatanggctctgtacatctccttttctgaccccatctcccatccctccccaactcctgaaacccttccactgtgccctctggaactcacggtccgtcatcagcaaaatcccccgtatcctcaacctcttctctgaacgttcccttcaccttcttgctctaacngaaacctggctctcccctgaggacactgcttcccctgcagccttctcaagtggtggccgttttctctcccacanccctcgtaccactgggcctggaggtggggtaggtgtcctccttgctcctcattgctgcttccagaccattctccctccctcctccctaaaacaccccagctttgaatctcatgtcatcagactacatcacccgctacccctccttgttgcagtcatctacngacctccgggtcactccccctcattccttgaagattttagctcctggctcactgtcactctctccaacactactcctgtcntaattcttggtgatttcaatatccacatagatgatccttccaataccctggcctctcagttccttgacctcctctcctccaatgatcttgtcctccaccctacctcagccactcactcccatggtcataccctagaccttgtcattaccaataactgcaacccctccataatctcaatttcaagcatcccactctctgaccaccacctcctatctttccagctcactccctctagtaccctaactccaacaattcttcgaccccaccgggacctccaatccattgatcctaccaccttttcactgtccctcacccccctnatgtcctcacttccctccttacccagcttaaattccatggtcaatcattataatcactcccttgcatataccctcaactcccttgcccctctctcgcttcgtcntactcgcctggcaaaaccacaaccctggttaaatccaactctccgcctactccgcgcctgcacccgtgcagctgaacgtggctggagaaaaacacacaaccatgctgactggtctcgctttaaattcatgaccacgaacctcaagtgggcccttaatgctgcccggcaatcatactacatttccctagtccattcactctcccactctcctagatnactatttcacaccttctcctctctcctcaaacctccaacacctcctcccctatcctcactctcagctgatgaccttgcttcctatttcactgagaaaatwgaagcaatcagaagagaacttccacanactcccaccaccacatctacccacctacctgcatctgtgcccacatactctgccttccttcctgttactacggatgaactgtccgtgctcctatctaaggccaacccctccacttgtgcactagatcccatcccctctcgcctactcaaggacatcgctccagcaattctcccctctctctcctgcatcatcaatttttccctctctactggatcattcccatcagcatacaaacatgctgttatttctcccatctttaaaaaacaaaaattctcccttgaccccacttccccctccagctaccgccccatttctctgctcccctttacagcaaaactcctcaaaagagttgtctatactcgctgtctccaattcctctcctcccattctctcttaaacccactccaatcaggctttcgtccccaccactccaccgaaactgctcttgtcaaggtcaccaatgacctccatgttgctaaatccaatggtcaattctcagtcctcatcttacttgacctatcagcagcatttgacacagttgatcactccctccttcttgaaacactttcttcacttggcttccaggacaccacactctcttggttttcctcctacctcactggccgctccttctcagtctcctttgctggttcctcctcatctccccgacctctnaacgttggagtgccccagggctcagtccttggacctcttctcttctctatctacactcactcccttggtgatctcatccagtctcatggctttaaataccatctatatgctgatgactcccaaatttatatctccagcccagacctctcccctgaactccagactcgtatatccaactgcctactcgacatctccacttggatgtctaataggcatctcaaacttaacatgtccaaaactgaactcctgatcttccccctcaaacctgctcctcccacagtcttccccatctcagttaatggcaactccatccttccagttgctcaggccaaaaaccttggagtcatccttgactcctctctttctctcacaccccacatccaatccatcagcaaatcctgttggctctaccttcaaaatatatccagaatccgaccacttctcaccacctccactgccaccaccctggtccaagccaccatcatctctcgcctggattactgcaatagcctcctaactggtctccctgcttccacccttgcccccctncagtctattctcaacacagcagccagagtgatccttttaaaacataagtcagatcatgtcactcctctgctcaaaaccctccagtggcttcccatctcactcagagtaaaagccaaagtccttacagtggcctacaaggccctacatgatctggtcccccgttacctctctgacctcatctcctaccactctccccctcgctcactccgctccagccacactggcctccttgctgttcctcgaacacgccaggcacgctcctgcctcagggcctttgcacttgctgttccctctgcctggaacgctcttccccc";
		
	    //>L3#LINE/CR1 @Theria_Mammalia  [S:60] RepbaseID: L3
	    // NO MATCHES WTF
	    //String query = "ccagcggccgggannccaagaagccgtttnccgcggcagtttacaggagggancttcnagagggagccacaaaagactgtagttcancttgagacccaggaggtatggacaccgagggaactgttccagtgacctgcagggtatgtgctatgtttgtcttcctgcctgaggcgntcaccaattatgtgtgctataaatgcaagctggtctccctgctagaggagaaggtgaaagggcttgaggaacgcctctctacgctccggcttattagagaggatgaagggttcctaganaggatggaagaaataatccaggaaggaaancagaaggaaaaagattctgaggaggcggaagggaatcaaaaccagcgtcaagaggttggcgagtggaagaatgtgacacagaggaaaaggagaaagagaagaaactccgcaccgctggagctanacaacaggtntgaggctcttcccacggagggtgaatccggaccttctgaagaagaagcagcatcccatgctccacggaacaataaggaggattcgcaggcactagcaggtgcgaggaatcctgttnctgcccccaggaagaagagacgnatngtggtggttggtgactccccgctgagggatacggaggcagccgtatgcagacctgacgtggctaatcaggaggtgtgctgtcttcctggagcgtgtatccgagacgtgacggagagcctgccaagactcatcaaacccgccgaccgctacccactcctgctgattcacgtgggaacgaatgacacagtcagaagaaacctggaatgcatctctagtgactttgaagtcctgggtaggaaactgaaggacttgggggcacaggtggtgttttcatctcttcttccagttgaaggtcgtgactttggaagagaaaggaggatatgggaagtgaacagctggctacgtagatggtgtcgaagaacaggatttggttttctggaccatggcttangataccagaacgatgggctcctggcnagggacggagtgcatctcacgaagaccgggaagaacgtgtttgncnggagactcgccgacctgatcaagaggactttaaactgaaatttgagggaaaggaaaaaaaatgcccagataaaactgtaaaaccggatactatggaggatancaggtatgacatagaaagaagaacaacagtggaggaggtgcccagtaattcncaggagaaaataacnggaaaagaagctagaaacaatacttatggcctcagatgtctatataccaatgcacagagtatgggtaataaannaagtnaacttgaaattttaacacaaggaggtaaatatgatctcataggtatcaccgagacttggtgggatgggactcacgactggaatacggcgatggaagggtanaccttgttcaaaagaaacagatctantagaaggggaggtagagtagcactgtatgtcaagaagntatacacctgcgcggaaatccacgaacctgagggtagaagcgtgntggagagcatttgggtgaggataaaaggagagagaaacagaagtgatatcgttgtgggagtatactacagaccgcccggccagatggagganatggatgatgcnttcctgatacagattacaaaactggcacagaggcaagatncagtagtgatgggggacttcaactatccggacatctgctggaagtctcattcngctaaaagcagagcatctgataaattcttgacttgccttgctgacaatttcatctctcagaaggtagaggaagcaacgaggggaactgctactctggacttaattctgaccaacaaggaagaactggttggtgaagtggaagttgataggaaccttgggagaaagtgccatgtcatcttagagttcataatagccaagaaaggaaaagttaaaagtccacatatgttccagactttacaaggaaaagcagatttcaaaaaattcagagaaaagaggtatgattccatggcccgagactcaaaaagaaagatggctcaagagggttgggaagctcttaaaaatgaaattctgattacaattacaaatgatccaatgaggaagaaaagagggagggcatttaagaaaccaacatggcctcatagagtattctctgatgtcagatttcaaaaggacatgtatcagaagatggaaagaggacatataaccaaggacaaagagagagtatcacaagcctataagaatagtgtcaggaaggctaaagctcagaacgagctgaggcttgcaaaaaaaaatgctaaggacaacaaaaanaaggcttttcaaagctatgttcggagcagaaggaaaaagaaagngacaggtccgctgcttgggacaggtggcgtaatgttaacagatgacagagagaaagcagaactactcaactcctattttgcttccgtcttctctatcaaggagaatgatcttcagactggaaagggtagaacaaacatcgttaagagggaattgaagcccaagataggcgaggagatagtaagagagcacctagccgctttaaatgagttcaagtctccaggcccagacgaattacatcccagggtactgaaagaacttgcagatgtgatcgcggaaccgctgtcggtaatctttgagaaatcacggagaacggaagaggtgccagaagactggagacgggcaaatgtggtncctnnttttaaaaagggaaaaaagatggattctgnaaactacagaccggtaagcttgacgtcgatccccggcaaaattctagaacggattattaaacagatggtttgtgagcacttagaaaaggaagcggtgatcactaggagccagcatgggttcactaagaacaagtcatgccaaactaacctcatttccttttttgatagggttactagactggtagatcaggggaatgccgtagacanagtgtatctggatttcagcaaggcatttgacaaagtctctcatgatatccttgtggacaagatggagaaatatgggctggatgatagtacagttaggtggattcgtagctggttgaacgactatacccaaaaggtgttgattaatggatcgatgtcaacctggagggaggtctctagtggcgtgccacagggctctgtccttggccctgtcctgttcaacatttttatcaatgacttggatgaagacatagaaggcatgcttatcaaatttgcagatgacacaaagctgggagggatagctaatacgntggatgacagaatcaagattcaaaangatctcgacaggctggaacgatgggccgaaaccaacaagatgaaatttaacagggataaatgtaaagtcctgcatttaggttcaaaaaatcaactgcacaagtacaggatggagaggatctggcttagcagcagttcacgtgaaaaagacctaggggttttagttgaccgcaagctcaatatgagccaacagtgtgatgtggctgccaaaaaagctaatgcaatcttaggctgcattaatagaagtatagtgtccagawcaagggaggtaatagtcccgctgtactctgcgctggtcagaccacatctggagtattgcgttcagttctgggcgccacattttaagagggacattgacaaactggagcgcgtccagaggagagcgaccaggatggtgaagggtctggaaaccatgtcatatgaggaacggttgaaggaactggggatgtttagcctggagaagagaagacttagaggagacatgatagctgtcttcaaatatttgaagggctgtcatgtggaagagggattagacttattctgtgtggctccagagggcagaactaggaccaatgggtggaagttacagggaggcagatttcggctcaatataaggaagaactttctaacaatcagagctgtccaaaaatggaatgggctgcctcgggaggtagtgagctccccgtcactggaggtgttcaagcagaggctggatgaccacttgtcagggatgttgtagaagggattcctgcattggatgggaggttggactagatgacctctaaggtcccttccaactctgagattctgtgattctatc";
	    
	    //>MIR#SINE/MIR @Mammalia  [S:40,60,65] RepbaseID: MIR
	    //String query = "acagtatagcatagtggttaagagcacggactctggagccagactgcctgggttcgaatcccggctctgccacttactagctgtgtgaccttgggcaagttacttaacctctctgtgcctcagtttcctcatctgtaaaatggggataataatagtacctacctcatagggttgttgtgaggattaaatgagttaatacatgtaaagcgcttagaacagtgcctggcacatagtaagcgctcaataaatgttggttattatt";
		
	    //>MamGyp-int#LTR/Gypsy @Theria_Mammalia  [S:55]    
	    // NO MATCHES WTF
	    //String query = "attttggggtcccgtccgggattgttangaatcctngtgcagcgtacatctgcaccacggactaattacnacccctagaattggagccaattgatgtttgggacaatggcngtgacactgttggaggactggtgcacggagatgggtgtggactctcagaggtcactgctggtttgggggataccagtggactgtgatgaggctgaaattgaagagaccttacagaatgctttaaagcccctgggcaggtacagagtgcttggcaagatgttcaggagggaagagaacgcgaatgcagccttgttagagtttgctgaagangttaatttctctgcgatccccaggagaataccnagaaagggaggngcntggaaagtgatctttaagncccctatctcggacnctgaatttctaaaaaaactgaacctcttcctggaaagagaagggcagacngtgncagacgtggccagagtccttgggtatgagaacacccctgtagccccaagcctggacatgccaccngagacatgggcccangtgctggggcaggcggtgggaaaggctattcagcctattgcggaagccactgantaccgaaagctgaggntgttctcagggagtgctactccagcnccaggggaagaggcatttgaaccctggctggggcanactactgagatgctgcaagaatggcaggtaccagaggcngagaaaaganggaggctgatggaangtctnagaggcccagcctttgaggtcattcgtgtcctcaaggcgaacaacgcttcggtgactgtggccgaatgcctgaggactctngagcaggcgtttgggaacgttgagagccgnagggctgtgcaggtcaantttctgaacacttatcagaaggcgggagaaaaggtgtctgcttatgtnctgaggctggagactctgntacagagggcgctgganagaggagctttagactcaggaagcgtggatcaggcccgcttagaacaggtgnnggccggggctannctgagcgnaacgcttcgctcnaagctccagctgaccggacncaggccgcctcccaacttcttccagttactgaagctaatcggaggaggaagaggaaggaggaggaagcggctgctcanntccgcgagnaaaggaagccangtacagannggganatgnccgtggcaccggccnaggccctggcggctagnacagatgaggactancacagcagntgaaagccttgacngcngctctacaggctttcgggaagccgggtgagggtgcccttctgcaggccccctaagagccagctgctaaggcaagggganctnagtancccgcnaaatgggnatccaccttaatctgctatcatgtggaggcccagggcacatgcagagagactgtgatnaggaagaagagcccgggcctcatagcgagactgggaaagttgcnnaggntcagaganggaactttctnagacagcctccgagaaggnccatgccaggctgtcctcaagcttanatttctcccaggactggtnngnccccgatggaggtggcagcgaagatagaagggatttggngctcagtggtnctggatagtgggtcacaagtgaccatnatnttcaagtcattctatgacaaacacctgagccatctcccattacaaaaattgantggactgggnctntgtggcttgagtacngaagcctacccatatctcggntacgtgattgtnaggctggaatttcctgaaggagtggtgggggtcagngaggaggtggacactgccgcggttgtatgcccggatccaggaggcgtgcagggagtggtggcattgatngggacnaactccaacctntttaaagtgctngcccagtactgtnggcagcangcaggcacagagtanctagatgttcttcctatccacgtcctgtgtgcagaagcctacaagaagatggaggcnaaacagagncanatgccccccgcttctnctcctggagttgtnccaaccggatcccccaaattaaatccagagagctttgatttcggggactccccagtacccgaggagtggaaggagaggttgagaaggaaactccaagccaggagtaangttttctctctccatgaatgggacgtgggctgtgttcagggngagcagcataaaatagagctgnangaccctngaccttttagggaacgntctagaaggattgctctgtctgagatcaatgatttgagagancacattaaagagttgctaattaatggcatnatntctgagtcccatagcccatatgcattccccatcgtggtagtgcggaagaaatcaggnaaaatntggatgtgtgtggattatcgtactctgaatagatgnactaaaatagatcagtacaccgtaccccgagttcaggatgccctggactgcttgctagggagtcagtggttttcagtgttggatttgaggagtgggtattatcagatacctatggctgangaggacaaagaaaagacagccttcatctgtccngtggggttctatcaatttgaaaggatgcctcagggnatctcnggggcccctgctaccttccagcggctgatggaaaaggtgattggggatatgaattatctggaagtgctggtttatttagatgacataattgtnttcggcaggactttggaggagcatgagcaacgactccttaaggtgctggaccgcctggaagaggcaggnttgaaattgtcccttgacaaatgccaattctgccgnacctcngtgaaatatgtngggcatatagtgtcccaacagggagtgagcacagaccctgaaaagatntctgccatcaccaattggccccgtcccaccaattatagagaattaaagacnttcttggggttcagtggntactataggaggtttgtgaagaactattccaggattgccaagccnctcaatgacctaacccggggttatcaggtcagggctggggcnccaacaagaaaggggcagcccacaggacaagaggaagccagggtcctccacccctttgaaccctttggggagcgntgngggaaggcctgtgagcaggcgttcaggaccttggtggactgnctagtcnaggctcctgncttagcatttgctgaccctaccaagcccttcattntacacacngatgccagttttgagggcctaggggcggtgctatatcagganaatgnagggaagnagaagccnatagctttcgccagcngaagtctgtctgatagtgagactcgataccctattcacaaattagagttcctggctctaaagtgggcnatcacggacaagtttnaggagtatgtatatggagtgccttttcaagtgtggactgacaacaatccnctcacntacgtgctcaccagtgccaaactagatgctacggggcaacggtgggtggccgcgttagctgactataatttcagcattnattacagatcaggnctcagcaacaaggatgcagatgctcttttccgctggccccatccncaggncgctgaaactatccccagcgagggagtcagggccatttggggactccaaaggggtnaggcgtnncctgaagggaggtatggcngaaagcttggggctncctccaagactgtgcccatggtagccgtcaattatgtggccctgggcaaatcgtcactgccccagntgggagtggaggactggaggaaagcncaatgggcagaccccgagctaagggaagtgatgaaagggaaaanccgaggnctcctggcagaaaggatcagggccttctccaagggcatcagaattttgctccgagantggcagaaantannactnattaatggggtactgtactaggtactgcagtgccccgtaaatgggctgtggaaacaattggtnttgccccaggaataccgccccntggtnctgagagcatcgcatgatgactttggncatctggggagggaaaggannctagaactaattagggcncggttcttctggcccaagatggcagaggatgtcaaatccaaatgtgagacctgtgcccantgcattcagcggaaaaccttgcccacacgggcagcttatctggaaactattcagagcagcaagcccctggaattagtgtgcatngacttcttgtccttagaaccgganagccggaacctngggaacatacttgtggtgacngatcacttcacccgctatgcncaggcntatcccaccagggaccagaaagcatccacagttgcncgggtgttatgggagaaatncttctcagtntatgggtttcctgctngaattcactcagatcaagggagagattttgagagtcgnttactgcgggaagtacttcanttagctgggatacagaaatccaggactactccctatcatccccaaggggacccacaaccngagagatttaacagaactttattaaacatgctggggacactncgccctgagcagaaggggcagtggagccagcacgtggcattcctggtncatgcctacaatgccaccaggaatgatgccactggctttacctctcgtttcttgatgtttgggcgggagcctcggctgcccattgatctctgctttggggtgggcgagggaggtgaganntcgggaaacctcactcagtatgcagctaanctnagggacaaattncaggaatcttancggttagccactgctgcagctcggcgcaacacagannggaataagcacnagtatgatgccagggtacggtgccaggagctgcaagaaggggaccgagtnctgctgtggaatttggggctncccggtaagcacaaaatagctgaccgctggaaggcgaccccntatctngtggtagggagacttgggaccctgccagtgtacaaagtgcaggcagagagtgggncagggcaagtcaaggtgatccaccgaaataacttactgcccataggggaactggtggggaaaactgcccccacatncctcaacgcagacggagtctgccaagcagaagccgagagnaactccccaagnggaacttgaggaatgctgctcctgactcnncggggagcggagaganga";
	   
	    String query = "";
	    
	    String queryFile = "query.txt";
		String BasePairFile = "basepairs.txt";
		String ProbabilityFile = "probabilities.txt";
		String GenomesFile = "randomizedGenomes.fsa";
		String QueryOutputFile = "queryOutput.txt";
		String resultDataFile = "resultData.csv";
		int randGenomeCount = 100;
		int parameterTestCount = 500;
		int topMatchCount = 100;
		
		NonDetBasePair[] ProbGenome = InitNonDetGenome(BasePairFile, ProbabilityFile);
		
		createRandomizedGenomeFile(randGenomeCount, ProbGenome, GenomesFile);
		createGenomeDatabaseInstance(GenomesFile);
		
	    final long postDBTime = System.currentTimeMillis();

	    
		
		long usedMemoryAfterDB = runtime.totalMemory() - runtime.freeMemory();
		
		try{
			File fout = new File(resultDataFile);
			FileOutputStream fos = new FileOutputStream(fout);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			
		
	    
		
		for(int i = 0; i < parameterTestCount; i++){
			System.out.println("QUERY " + i);
			ParameterSet param = new ParameterSet(ProbGenome);
			query = param.getQuery();
			query = query.toUpperCase();
			//System.out.println(query);
			HashMap<String, QueryMatch> matches = new HashMap<String, QueryMatch>();
			HashMap<String, QueryMatch> controlMatches = new HashMap<String, QueryMatch>();
			
			createQueryFile(query, queryFile);
			queryDB(queryFile, GenomesFile, QueryOutputFile);
			HashMap<String, HashMap<String, QueryMatch>> res = parseResultFile(query, QueryOutputFile, matches, controlMatches);
			
			matches = res.get("test");
			controlMatches = res.get("control");
			int finalMatchAbove100 = 0;
			int controlMatchAbove100 = 0;
			QueryMatch[] finalMatches = getBestMatches(matches, topMatchCount, randGenomeCount);
			QueryMatch[] finalControlMatches = getBestMatches(controlMatches, topMatchCount, 1);
			System.out.println( "final match length "+ finalMatches.length);
			System.out.println("TEST MATCHES: ------------");
			for(int j = 0; j < finalMatches.length; j++){
				System.out.println("FINAL match score: " + finalMatches[j].getFinalScore() +" || start score: " + finalMatches[j].getScore()+ " match genome index: " + finalMatches[j].getGind() + " || raw score" + finalMatches[j].getRawScore() + " || count " + finalMatches[j].getCount() + "    actual genome index: " + param.getGenomeIndex());
				System.out.println(finalMatches[j].getMatchString());
				if(finalMatches[j] != null){
					if(finalMatches[j].getFinalScore() > 100){
						finalMatchAbove100++;
					}
					//System.out.println("match score: " + finalMatches[j].getScore()/finalMatches[j].getMatchString().length() +" match genome index: " + finalMatches[j].getGind() + "    actual genome index: " + param.getGenomeIndex());
					if(finalMatches[j].getGind() > param.getGenomeIndex() + 1 - softenFactor && finalMatches[j].getGind() < param.getGenomeIndex() + 1 + softenFactor){
						System.out.println("test SUCCESS!");
					}
					else {
						System.out.println("FAIL -- match is farther than 5 bp away");
					}
				}	
			}
			
			System.out.println( "final MLS match length "+ finalControlMatches.length);
			System.out.println("CONTROL MATCHES: ------------");
			for(int j = 0; j < finalControlMatches.length; j++){

				if(finalControlMatches[j] != null){
					
					if(finalControlMatches[j].getFinalScore() > 100){
						controlMatchAbove100++;
					}
					System.out.println("match score: " + finalControlMatches[j].getScore()  + " match genome index: " + finalControlMatches[j].getGind() + "    actual genome index: " + param.getGenomeIndex());
					
					if(finalControlMatches[j].getGind() > param.getGenomeIndex() + 1 - softenFactor && finalControlMatches[j].getGind() < param.getGenomeIndex() + 1 + softenFactor){
						System.out.println("control SUCCESS!");
					}
					else {
						System.out.println("FAIL -- match is farther than 5 bp away");
					}
				}	
			}
			
			System.out.println("------------");
			System.out.println("");
			
			
			//generating stats for time and memory usage
			final long postExecTime = System.currentTimeMillis();
			
			bw.write((float)finalMatchAbove100/finalMatches.length + "," + (float)controlMatchAbove100 /finalControlMatches.length);
		    bw.newLine();
				
//			System.out.println("Time creating DB: " + (postDBTime - startTime)/1000.0 );
//		    System.out.println("Time spent querying DB: " + (postExecTime - postDBTime)/1000.0/(i+1) );
			
//			System.out.println("Initial Used Memory: " + usedMemoryBefore/1000000 + "MB");
//			System.out.println("Memory Required for DB creation:" + (usedMemoryAfterDB-usedMemoryBefore)/1000000.0 + "MB");
//		    long usedMemoryAfterExec = runtime.totalMemory() - runtime.freeMemory();
//		    System.out.println("Memory Used For Queries:" + (usedMemoryAfterExec-usedMemoryAfterDB)/1000000.0/(i+1) + "MB");
		    
		    
//		    System.out.println("test match list --- ");
//			printMatchesArray(finalMatches);
//			
//			System.out.println("control match list --- ");
//			printMatchesArray(finalControlMatches);
		}
		bw.close();
		}
		catch(IOException e){
			
		}
	}
	
	
	private static void printMatchesArray(QueryMatch[] q){
		for( int i = 0; i < q.length; i++){
			if(q[i] != null){
				System.out.println("match # " + i);
				q[i].printDetails();
				System.out.println("");
			}
		}
	}
	
	private static QueryMatch[] trimMatches(QueryMatch[] matches){
		//Trimming matches that are within the softenFactor distance from eachother and have the same raw score 
		
		return matches;
	}
	
	private static QueryMatch[] getBestMatches(HashMap<String, QueryMatch> matches, int count, int genomeCount){
		
		LinkedList<QueryMatch> resultList = new LinkedList<QueryMatch>();
		for(int i = 0; i < count; i++){
			QueryMatch curr = findBestMatch(matches, genomeCount);
			
			if(curr != null){
				boolean isNewCluster = true;
				Iterator trimmer = resultList.iterator();
				while(trimmer.hasNext()){
					QueryMatch comparer = (QueryMatch) trimmer.next();
					if(curr.getFinalScore() >= comparer.getFinalScore() && Math.abs(curr.getGind() - comparer.getGind()) <= softenFactor){
						isNewCluster = false;
						resultList.add(curr);
						resultList.remove(comparer);
						//System.out.println("Current score: " + curr.getFinalScore() + " at " + curr.getGind() + "  is better than Comparer with score " + comparer.getFinalScore() + " at " + comparer.getGind());
					}
					else if(curr.getFinalScore() < comparer.getFinalScore() && Math.abs(curr.getGind() - comparer.getGind()) <= softenFactor){
						isNewCluster = false;
						//System.out.println("Current score: " + curr.getFinalScore() + " at " + curr.getGind() + "  is worse than Comparer with score " + comparer.getFinalScore() + " at " + comparer.getGind());
					}
				}
				
				if(isNewCluster){
					//System.out.println("NEW SCORE: " + curr.getFinalScore() + " at index " + curr.getGind());
					resultList.add(curr);
				}
				matches.remove(curr.getGind() + "");
				//System.out.println("test this out! " + curr.getGind() +" , " + curr.getScore() + " , " + curr.getMatchString());
				
			}
		}
		
		QueryMatch[] result = new QueryMatch[resultList.size()];
		int index = 0;
		Iterator iter = resultList.iterator();
		while(iter.hasNext()){
			result[index] = (QueryMatch) iter.next();
			index++;
		}
		
		return result;
		
	}
	
	private static QueryMatch findBestMatch(HashMap<String, QueryMatch> matches, int genomeCount){
		Set s1 = matches.keySet();
		QueryMatch max = null;
		Object[] keys = s1.toArray();
		for( int i = 0;  i < keys.length; i++){
			QueryMatch curr = matches.get((String)keys[i]); 
				if(max != null){
					if(max.getFinalScore() < curr.getFinalScore()){
						max = curr;
					}
				}
				else{
					max = curr;
					//curr.printDetails();
				}
		}
		return max;
	}
	
	private static HashMap<String, HashMap<String, QueryMatch>> parseResultFile(String query, String outputFile, HashMap<String, QueryMatch> matches, HashMap<String, QueryMatch> controlMatches) throws IOException{
		BufferedReader br;
		HashMap<String, HashMap<String, QueryMatch>> res = new HashMap<String, HashMap<String, QueryMatch>>();
		try {
			br = new BufferedReader(new FileReader(outputFile)); // output file

			String line = null;
	    
		    while ((line = br.readLine()) != null) {
		    	//query1 , title ,  -- , -- , -- , -- , query start , query end , db start , db end , e-value 10 , score 11
		    	//System.out.println(line);
		    	 String[] matchData = line.split(",");
		    	 if(!matchData[1].equals("0")){
		    		 //System.out.print("In a test query || ");
		    		 QueryMatch q = new QueryMatch(query.substring(Integer.parseInt(matchData[6]), Integer.parseInt(matchData[7])), Integer.parseInt(matchData[6]), Integer.parseInt(matchData[8]), Float.parseFloat(matchData[11]), Double.parseDouble(matchData[10]));
		    		 matches = addMatch(matches, q, Integer.parseInt(matchData[8]));
		    		 
		    	 }
		    	 else{
		    		 //System.out.print("In a control query || ");
		    		 QueryMatch q = new QueryMatch(query.substring(Integer.parseInt(matchData[6]), Integer.parseInt(matchData[7])), Integer.parseInt(matchData[6]), Integer.parseInt(matchData[8]), Float.parseFloat(matchData[11]), Double.parseDouble(matchData[10]));
		    		 controlMatches = addMatch(controlMatches, q, Integer.parseInt(matchData[8]));
		    		 
		    	 }
		     
		     }


		    Set s1 = matches.keySet();
			Object[] keys = s1.toArray();
			for( int i = 0;  i < keys.length; i++){
				QueryMatch curr = matches.get((String)keys[i]); 
				matches = recountMatch( matches, curr);
			}
		    
		    res.put("test",matches );
		    res.put("control", controlMatches);
		    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}

	
	private static void queryDB(String query, String db, String outputFile){
		try {
			//Will return results as:
			//query1 , title ,  -- , -- , query start , query end , db start , db end , score , e-value
			Process p=Runtime.getRuntime().exec("blastn -db " + db + " -query " + query + " -out " + outputFile + " -outfmt 10"); 
            p.waitFor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private static void createGenomeDatabaseInstance(String filename){
		try {
			Process p=Runtime.getRuntime().exec("makeblastdb -in " + filename + " -parse_seqids -dbtype nucl"); 
            p.waitFor();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void createQueryFile(String query, String queryFile){
		try{
			File fout = new File(queryFile);
			FileOutputStream fos = new FileOutputStream(fout);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		 
			bw.write(query);
			bw.newLine();
			bw.close();
		}
		catch(IOException e){
			
		}
	}
	
	private static void createRandomizedGenomeFile(int limitNumber, NonDetBasePair[] pgenome, String filename){
		try{
			File fout = new File(filename);
			FileOutputStream fos = new FileOutputStream(fout);
		 
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			
			bw.write(">0");
			bw.newLine();
			for(int j = 0; j < pgenome.length; j++){
				bw.write(pgenome[j].getChar());
			}
			bw.newLine();
		 
			for (int i = 1; i < limitNumber + 1; i++) {
				bw.write(">" + i);
				bw.newLine();
				for(int j = 0; j < pgenome.length; j++){
					bw.write(pgenome[j].getRandomizedBasePair());
				}
				bw.newLine();
			}
		 
			bw.close();
		}
		catch(IOException e) {
			
		}
	}
	
	private static HashMap<String, QueryMatch> recountMatch(HashMap<String, QueryMatch> hm, QueryMatch match){
		
		//increments other matches scores that are close in the genome to the current match (all matches within the soften factor are added) 
		int gind = match.getGind();
		for(int i = gind - softenFactor; i < gind + softenFactor; i++){ 
			if(hm.get(i + "") != null && i != gind){
				hm.get(i + "").incrementScore(match);
				hm.get(i + "").incrementMatchCount();
			}
		}
		return hm;
	}
	
	private static HashMap<String, QueryMatch> addMatch(HashMap<String, QueryMatch> hm, QueryMatch match, int gind){
		
		//Adds matches at specific genome indexes into the hashmap
		
		if(hm.get(gind +"") == null){
			//System.out.println(gind + "is a new gind");
			hm.put(gind + "", match );
		}
		
		return hm;
	}

	
	private static NonDetBasePair[] InitNonDetGenome(String basepairFile, String probabilityFile) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(basepairFile)); // base pair file
		BufferedReader br2 = new BufferedReader(new FileReader(probabilityFile)); // probability file

		int index = 0;
	    String genome = br.readLine();
	    String genomeProb = br2.readLine();
	    NonDetBasePair[] myGenome = new NonDetBasePair[genome.length()];
	    StringTokenizer st = new StringTokenizer(genomeProb);
	    
	     while (st.hasMoreTokens()) {
	    	 myGenome[index] = new NonDetBasePair(genome.charAt(index), Double.parseDouble(st.nextToken()));
	    	 
	    	 index++;
	     }  
	     
	    System.out.println(index);
	
	    br.close();
	    br2.close();
	    
	    return myGenome;
	}
	
	
}
