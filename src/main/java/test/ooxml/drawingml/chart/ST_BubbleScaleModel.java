
package test.ooxml.drawingml.chart;



public class ST_BubbleScaleModel {

    private final Object value;

    public ST_BubbleScaleModel(test.ooxml.drawingml.chart.ST_BubbleScalePercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test.ooxml.drawingml.chart.ST_BubbleScalePercentModel getST_BubbleScalePercent() {
        return (test.ooxml.drawingml.chart.ST_BubbleScalePercentModel) this.value;
    }
}