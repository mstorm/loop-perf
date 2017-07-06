import java.util.concurrent.TimeUnit;

class perf {
    public static void main(String[] args) {
        long start = System.nanoTime();
        double sum = 0;

        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; ++i) {
            sum += Math.log(i) / Math.log(2);
        }

        double elapsed = (System.nanoTime() - start) / (double)TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS);

        System.out.println(String.format("Java: %.9fs\t%f", elapsed, sum));
    }
}