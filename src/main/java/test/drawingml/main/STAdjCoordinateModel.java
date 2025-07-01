package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Object;

public class STAdjCoordinateModel {
  private final Object value;

  public STAdjCoordinateModel() {
    this.value = null;
  }

  public STAdjCoordinateModel(STCoordinateModel value) {
    this.value = value;
  }

  public STAdjCoordinateModel(STGeomGuideNameModel value) {
    this.value = value;
  }

  public Boolean isST_Coordinate() {
    return this.value instanceof STCoordinateModel;
  }

  public STCoordinateModel getST_Coordinate() {
    return (STCoordinateModel) this.value;
  }

  public Boolean isST_GeomGuideName() {
    return this.value instanceof STGeomGuideNameModel;
  }

  public STGeomGuideNameModel getST_GeomGuideName() {
    return (STGeomGuideNameModel) this.value;
  }
}
