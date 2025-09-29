package jxsd.gen.model.drawingml.chart;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.chart.LegendEntryBuilder;
import jxsd.gen.model.drawingml.main.TextBodyModel;

/**
 * This is a generated sequence class.
 */
public class LegendEntryModel {
  private final UnsignedIntModel idx;

  private final DeleteOrLegendEntryData deleteOrLegendEntryData;

  private final ExtensionListModel extLst;

  public LegendEntryModel(UnsignedIntModel idx, DeleteOrLegendEntryData deleteOrLegendEntryData,
      ExtensionListModel extLst) {
    this.idx = idx;
    this.deleteOrLegendEntryData = deleteOrLegendEntryData;
    this.extLst = extLst;
  }

  public LegendEntryBuilder builder() {
    return new LegendEntryBuilder().from(this);
  }

  public UnsignedIntModel getIdx() {
    return this.idx;
  }

  public DeleteOrLegendEntryData getDeleteOrLegendEntryData() {
    return this.deleteOrLegendEntryData;
  }

  public ExtensionListModel getExtLst() {
    return this.extLst;
  }

  /**
   * This is a generated choice class.
   */
  public static class DeleteOrLegendEntryData {
    private final int type;

    private final Object value;

    public DeleteOrLegendEntryData() {
      this(-1, null);
    }

    private DeleteOrLegendEntryData(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public LegendEntryBuilder.DeleteOrLegendEntryData builder() {
      return new LegendEntryBuilder.DeleteOrLegendEntryData().from(this);
    }

    public static DeleteOrLegendEntryData newDelete(BooleanModel value) {
      return new DeleteOrLegendEntryData(0, value);
    }

    public boolean isDelete() {
      return this.type == 0;
    }

    public BooleanModel getDelete() {
      return (BooleanModel) this.value;
    }

    public static DeleteOrLegendEntryData newTxPr(TextBodyModel value) {
      return new DeleteOrLegendEntryData(1, value);
    }

    public boolean isTxPr() {
      return this.type == 1;
    }

    public TextBodyModel getTxPr() {
      return (TextBodyModel) this.value;
    }
  }
}
