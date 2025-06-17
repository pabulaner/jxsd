
package test.ooxml.drawingml.chart;



public class ST_HoleSizeModel {

    private final Object value;

    public ST_HoleSizeModel(test.ooxml.drawingml.chart.ST_HoleSizePercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test.ooxml.drawingml.chart.ST_HoleSizePercentModel getST_HoleSizePercent() {
        return (test.ooxml.drawingml.chart.ST_HoleSizePercentModel) this.value;
    }
}