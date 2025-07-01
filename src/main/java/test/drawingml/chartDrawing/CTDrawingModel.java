package test.drawingml.chartDrawing;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTDrawingModel {
  private final Integer type;

  private final Object value;

  public CTDrawingModel() {
    this(-1, null);
  }

  private CTDrawingModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTDrawingModel newRelSizeAnchor(CTRelSizeAnchorModel value) {
    return new CTDrawingModel(0, value);
  }

  public Boolean isRelSizeAnchor() {
    return this.type == 0;
  }

  public CTRelSizeAnchorModel getRelSizeAnchor() {
    return (CTRelSizeAnchorModel) this.value;
  }

  public static CTDrawingModel newAbsSizeAnchor(CTAbsSizeAnchorModel value) {
    return new CTDrawingModel(1, value);
  }

  public Boolean isAbsSizeAnchor() {
    return this.type == 1;
  }

  public CTAbsSizeAnchorModel getAbsSizeAnchor() {
    return (CTAbsSizeAnchorModel) this.value;
  }
}
