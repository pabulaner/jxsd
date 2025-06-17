
package test.ooxml.drawingml.chart;



public class ST_HPercentModel {

    private final Object value;

    public ST_HPercentModel(test.ooxml.drawingml.chart.ST_HPercentWithSymbolModel value) {
        this.value = value;
    }

    public Object getRaw() {
        return this.value;
    }

    public test.ooxml.drawingml.chart.ST_HPercentWithSymbolModel getST_HPercentWithSymbol() {
        return (test.ooxml.drawingml.chart.ST_HPercentWithSymbolModel) this.value;
    }
}