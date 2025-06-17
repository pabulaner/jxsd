
package test.ooxml.drawingml.chart;



public class ST_OverlapModel {

    private final Object value;

    public ST_OverlapModel(test.ooxml.drawingml.chart.ST_OverlapPercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test.ooxml.drawingml.chart.ST_OverlapPercentModel getST_OverlapPercent() {
        return (test.ooxml.drawingml.chart.ST_OverlapPercentModel) this.value;
    }
}