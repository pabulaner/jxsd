
package test.ooxml.drawingml.chart;



public class ST_GapAmountModel {

    private final Object value;

    public ST_GapAmountModel(test.ooxml.drawingml.chart.ST_GapAmountPercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test.ooxml.drawingml.chart.ST_GapAmountPercentModel getST_GapAmountPercent() {
        return (test.ooxml.drawingml.chart.ST_GapAmountPercentModel) this.value;
    }
}