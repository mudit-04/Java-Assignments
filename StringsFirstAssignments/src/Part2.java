public class Part2 {
    public String findSimpleGene(String DNA, String startCodon , String stopCodon){
        int start = DNA.indexOf(startCodon);
        if (start == -1) return "";

        int stop = DNA.indexOf(stopCodon, start+3);

        return (stop - start) % 3 == 0 ? DNA.substring(start, stop + 3) : "";
    }

    public void testSimpleGene(){
        String DNA = "cccatggggtttaaataataataggagagagagagagagttt";
        String startCodon = "atg";
        String stopCodon = "TAG";
        System.out.println(findSimpleGene(DNA.toLowerCase(),startCodon.toLowerCase(),stopCodon.toLowerCase()));
    }
}
