public class DNAgcPercent
{
    public double percentage(String dnaStrand)
    {
    	char g = 'g';
    	char c = 'c';
    	double count = 0;
    	double len = dnaStrand.length();
    	for(int i = 0;i<dnaStrand.length();i++){
    		if(dnaStrand.charAt(i)== g || dnaStrand.charAt(i)==c){count += 1;}}
    	double retval = count / len;
    	if(count == 0){return 0.0;}
    	return retval;
    	}
    public static void main(String[] args){
       	DNAgcPercent myTest = new DNAgcPercent();
       	System.out.println(myTest.percentage("atcgatgcgttagctag"));
}}