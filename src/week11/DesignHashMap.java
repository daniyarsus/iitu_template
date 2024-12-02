package week11;

import java.util.Arrays;

class DesignHashMap {
    private final int[] map;

    public DesignHashMap() {
        map = new int[1000001];
        Arrays.fill(map, -1);
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }

    public static void main(String[] args) {
        DesignHashMap designHashMap = new DesignHashMap();
        designHashMap.put(1, 1);
        designHashMap.put(2, 2);
        designHashMap.remove(2);
        designHashMap.get(1);
    }
}
