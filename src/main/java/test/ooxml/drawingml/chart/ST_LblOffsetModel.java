
package test.ooxml.drawingml.chart;



public class ST_LblOffsetModel {

    private final Object value;

    public ST_LblOffsetModel(test.ooxml.drawingml.chart.ST_LblOffsetPercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test.ooxml.drawingml.chart.ST_LblOffsetPercentModel getST_LblOffsetPercent() {
        return (test.ooxml.drawingml.chart.ST_LblOffsetPercentModel) this.value;
    }
}