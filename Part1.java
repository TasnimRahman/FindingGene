

public class Part1
{
    String findGene(String DNA)
 {
   String result = "";   
   int startIndex = DNA.indexOf("ATG");   
   if(startIndex == -1)
   return result;
   int stopIndex = DNA.indexOf("TAA", startIndex + 3);
   if(stopIndex == -1)
   return result;
   if((stopIndex - startIndex) % 3 != 0)
    return "";
   result = DNA.substring(startIndex,stopIndex+3);
   return result;
 }
 void testGene()
 {
  String DNAStrand;
  String gene;
  DNAStrand = "ACTGCTAATATGCTATAA";
  gene = findGene(DNAStrand);
  System.out.println("DNA: " + DNAStrand + "\nGENA: " + gene);
  
   }
}
