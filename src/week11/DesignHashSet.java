package week11;

class DesignHashSet {
    private boolean[] set;

    public DesignHashSet() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }

    public static void main(String[] args) {
        DesignHashSet set = new DesignHashSet();
        set.add(1);
        set.add(2);
        set.remove(2);
        System.out.println(set.contains(2));
    }
}
