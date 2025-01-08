package com.example.project;

public class HorseBarn {
    private Horse[] stalls;

    // Part (a)
    public HorseBarn(int numStalls) {
        stalls = new Horse[numStalls];
    }

    public HorseBarn(Horse[] sampleStalls) {
        stalls = sampleStalls;
    }

    public Horse[] getStalls() {
        return stalls;
    }

    // Part (b)
    public String horseBarnInfo() {
        String result = "";
        Horse h = null;
        for (int i = 0; i < stalls.length; i++) {
            h = stalls[i]; // Corrected to use the current index
            result = result + "Stall " + i + ": ";
            if (h == null) {
                result = result + "empty\n";
            } else {
                result = result + h.horseInfo() + "\n";
            }
        }
        return result;
    }

    // Part (c)
    public void placeHorse(Horse horse, int stall) {
        stalls[stall] = horse;
    }

    // Part (d)
    public int findHorseStall(String name) {
        for (int i = 0; i < stalls.length; i++) {
            if (stalls[i] != null && name.equals(stalls[i].getName())) {
                return i; // Corrected to return the current index
            }
        }
        return -1;
    }

    // Part (e)
    public void consolidate() {
        // create temp array
        Horse[] newStalls = new Horse[stalls.length];
        // variable to track the next index in newStalls array to place a horse
        int nextSpot = 0;
        for (Horse nextHorse : stalls) {
            if (nextHorse != null) {
                newStalls[nextSpot] = nextHorse;
                nextSpot++;
            }
        }
        // assign stalls to the new array object
        stalls = newStalls;
    }
}
