
package test.ooxml.drawingml.chart;



public class ST_DepthPercentModel {

    private final Object value;

    public ST_DepthPercentModel(test.ooxml.drawingml.chart.ST_DepthPercentWithSymbolModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test.ooxml.drawingml.chart.ST_DepthPercentWithSymbolModel getST_DepthPercentWithSymbol() {
        return (test.ooxml.drawingml.chart.ST_DepthPercentWithSymbolModel) this.value;
    }
}