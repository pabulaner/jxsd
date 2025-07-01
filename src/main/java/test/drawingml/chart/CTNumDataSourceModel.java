package test.drawingml.chart;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;

public class CTNumDataSourceModel {
  private final Integer type;

  private final Object value;

  public CTNumDataSourceModel() {
    this(-1, null);
  }

  private CTNumDataSourceModel(Integer type, Object value) {
    this.type = type;
    this.value = value;
  }

  public static CTNumDataSourceModel newNumRef(CTNumRefModel value) {
    return new CTNumDataSourceModel(0, value);
  }

  public Boolean isNumRef() {
    return this.type == 0;
  }

  public CTNumRefModel getNumRef() {
    return (CTNumRefModel) this.value;
  }

  public static CTNumDataSourceModel newNumLit(CTNumDataModel value) {
    return new CTNumDataSourceModel(1, value);
  }

  public Boolean isNumLit() {
    return this.type == 1;
  }

  public CTNumDataModel getNumLit() {
    return (CTNumDataModel) this.value;
  }
}
