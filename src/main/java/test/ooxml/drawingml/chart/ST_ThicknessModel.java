
package test.ooxml.drawingml.chart;



public class ST_ThicknessModel {

    private final Object value;

    public ST_ThicknessModel(test.ooxml.drawingml.chart.ST_ThicknessPercentModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test.ooxml.drawingml.chart.ST_ThicknessPercentModel getST_ThicknessPercent() {
        return (test.ooxml.drawingml.chart.ST_ThicknessPercentModel) this.value;
    }
}