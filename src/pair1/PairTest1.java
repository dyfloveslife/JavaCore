package pair1;

public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        ArrayAlg.Pair<String> mm = ArrayAlg.minmax(words);

        System.out.println("min= " + mm.getFirst());
        System.out.println("max= " + mm.getSecond());
    }
}

class ArrayAlg {
    /**
     * Gets the minimum and maximum of an array of strings.
     *
     * @param a
     * @return
     */
    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }

    public static class Pair<T> {
        private T first;
        private T second;

        public Pair() {
            first = null;
            second = null;
        }

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }

        public void setFirst(T newValue) {
            this.first = newValue;
        }

        public void setSecond(T newValue) {
            this.second = newValue;
        }
    }
}
