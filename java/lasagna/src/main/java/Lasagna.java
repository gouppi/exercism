public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }
    
    public int remainingMinutesInOven(int hasBeenInOven) {
        return 40 - hasBeenInOven;
    }

    public int preparationTimeInMinutes(int layerCount) {
        return layerCount * 2;
    }

    public int totalTimeInMinutes(int layerCount, int preparationTime) {
         return (preparationTime + preparationTimeInMinutes(layerCount));
    }
}

