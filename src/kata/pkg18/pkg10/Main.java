package kata.pkg18.pkg10;

public class Main {

    public static void main(String[] args) {
        HistogramBuilder<Integer> builder = new HistogramBuilder();
        builder.calculate(new Integer[] {1,2,3,5,1,541,1,5,1,5,1,3,8,3,9,56,46,25,13,81,45,77,88,63});
        HistogramViewer viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
    }
}
