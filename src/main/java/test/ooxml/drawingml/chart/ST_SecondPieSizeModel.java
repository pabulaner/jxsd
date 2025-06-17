
package test.ooxml.drawingml.chart;



public class ST_SecondPieSizeModel {

    private final Object value;

    public ST_SecondPieSizeModel(test.ooxml.drawingml.chart.ST_SecondPieSizePercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test.ooxml.drawingml.chart.ST_SecondPieSizePercentModel getST_SecondPieSizePercent() {
        return (test.ooxml.drawingml.chart.ST_SecondPieSizePercentModel) this.value;
    }
}