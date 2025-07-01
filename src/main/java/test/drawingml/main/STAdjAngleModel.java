package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Object;

public class STAdjAngleModel {
  private final Object value;

  public STAdjAngleModel() {
    this.value = null;
  }

  public STAdjAngleModel(STAngleModel value) {
    this.value = value;
  }

  public STAdjAngleModel(STGeomGuideNameModel value) {
    this.value = value;
  }

  public Boolean isST_Angle() {
    return this.value instanceof STAngleModel;
  }

  public STAngleModel getST_Angle() {
    return (STAngleModel) this.value;
  }

  public Boolean isST_GeomGuideName() {
    return this.value instanceof STGeomGuideNameModel;
  }

  public STGeomGuideNameModel getST_GeomGuideName() {
    return (STGeomGuideNameModel) this.value;
  }
}
