package test.drawingml.main;

public class CTPatternFillPropertiesModel {
  private final STPresetPatternValModel prst;

  private final CTColorModel fgClr;

  private final CTColorModel bgClr;

  public CTPatternFillPropertiesModel(STPresetPatternValModel prst, CTColorModel fgClr,
      CTColorModel bgClr) {
    this.prst = prst;
    this.fgClr = fgClr;
    this.bgClr = bgClr;
  }

  public STPresetPatternValModel getPrst() {
    return this.prst;
  }

  public CTColorModel getFgClr() {
    return this.fgClr;
  }

  public CTColorModel getBgClr() {
    return this.bgClr;
  }
}
