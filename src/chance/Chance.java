package chance;

import java.util.ArrayList;

public class Chance {
    public ArrayList<String> sampleSpace;

    private Chance(ArrayList<String> sampleSpace) {
        this.sampleSpace = sampleSpace;
    }

    public static Chance createSampleSpace(String[] sampleSpace){
        ArrayList<String> strings = new ArrayList<String>();
        for (String aSampleSpace : sampleSpace) {
            strings.add(aSampleSpace);
        }
        return  new Chance(strings);
    }

    public double chanceOfGetting(String chanceOf) {
        double numberOfOccurrences = 0;
        for (String item : sampleSpace) {
            if (item.toUpperCase().contains(chanceOf.toUpperCase()))
                numberOfOccurrences++;
        }
        return numberOfOccurrences/sampleSpace.size();
    }

    public double chanceOfNotGetting(String face) {
        return 1-chanceOfGetting(face);
    }
}
