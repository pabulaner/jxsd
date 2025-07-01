package test.drawingml.chart;

import test.drawingml.main.CTShapePropertiesModel;
import test.drawingml.main.CTTextBodyModel;

public class CTLegendModel {
  private final CTLegendPosModel legendPos;

  private final CTLegendEntryModel legendEntry;

  private final CTLayoutModel layout;

  private final CTBooleanModel overlay;

  private final CTShapePropertiesModel spPr;

  private final CTTextBodyModel txPr;

  private final CTExtensionListModel extLst;

  public CTLegendModel(CTLegendPosModel legendPos, CTLegendEntryModel legendEntry,
      CTLayoutModel layout, CTBooleanModel overlay, CTShapePropertiesModel spPr,
      CTTextBodyModel txPr, CTExtensionListModel extLst) {
    this.legendPos = legendPos;
    this.legendEntry = legendEntry;
    this.layout = layout;
    this.overlay = overlay;
    this.spPr = spPr;
    this.txPr = txPr;
    this.extLst = extLst;
  }

  public CTLegendPosModel getLegendPos() {
    return this.legendPos;
  }

  public CTLegendEntryModel getLegendEntry() {
    return this.legendEntry;
  }

  public CTLayoutModel getLayout() {
    return this.layout;
  }

  public CTBooleanModel getOverlay() {
    return this.overlay;
  }

  public CTShapePropertiesModel getSpPr() {
    return this.spPr;
  }

  public CTTextBodyModel getTxPr() {
    return this.txPr;
  }

  public CTExtensionListModel getExtLst() {
    return this.extLst;
  }
}
