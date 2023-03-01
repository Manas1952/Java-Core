package GC;

public class GC {
    public static void main(String[] args) {
        GC object = new GC();

        object = null;

        System.gc();

        System.out.println("done");
    }

    @Override
    protected void finalize() {
        System.out.println("finalize");
    }

}
