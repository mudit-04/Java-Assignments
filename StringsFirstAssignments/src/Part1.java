public class Part1 {

    public String findSimpleGene(String DNA){
        int start = DNA.indexOf("atg");
        if (start == -1) return "";

        int stop = DNA.indexOf("taa", start+3);

        return (stop - start) % 3 == 0 ? DNA.substring(start, stop + 3) : "";
    }

    public void testSimpleGene(){
        String DNA = "cccatggggtttaaataataataggagagagagagagagttt";
        System.out.println(findSimpleGene(DNA));
    }

}
