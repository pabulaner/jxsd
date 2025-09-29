package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import jxsd.gen.builder.drawingml.main.BackgroundFillStyleListBuilder;

/**
 * This is a generated sequence class.
 */
public class BackgroundFillStyleListModel {
  private final List<EG_FillProperties> egFillProperties;

  public BackgroundFillStyleListModel(List<EG_FillProperties> egFillProperties) {
    this.egFillProperties = egFillProperties;
  }

  public BackgroundFillStyleListBuilder builder() {
    return new BackgroundFillStyleListBuilder().from(this);
  }

  public List<EG_FillProperties> getEGFillProperties() {
    return this.egFillProperties;
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_FillProperties {
    private final int type;

    private final Object value;

    public EG_FillProperties() {
      this(-1, null);
    }

    private EG_FillProperties(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public BackgroundFillStyleListBuilder.EG_FillProperties builder() {
      return new BackgroundFillStyleListBuilder.EG_FillProperties().from(this);
    }

    public static EG_FillProperties newNoFill(NoFillPropertiesModel value) {
      return new EG_FillProperties(0, value);
    }

    public boolean isNoFill() {
      return this.type == 0;
    }

    public NoFillPropertiesModel getNoFill() {
      return (NoFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newSolidFill(SolidColorFillPropertiesModel value) {
      return new EG_FillProperties(1, value);
    }

    public boolean isSolidFill() {
      return this.type == 1;
    }

    public SolidColorFillPropertiesModel getSolidFill() {
      return (SolidColorFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newGradFill(GradientFillPropertiesModel value) {
      return new EG_FillProperties(2, value);
    }

    public boolean isGradFill() {
      return this.type == 2;
    }

    public GradientFillPropertiesModel getGradFill() {
      return (GradientFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newBlipFill(BlipFillPropertiesModel value) {
      return new EG_FillProperties(3, value);
    }

    public boolean isBlipFill() {
      return this.type == 3;
    }

    public BlipFillPropertiesModel getBlipFill() {
      return (BlipFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newPattFill(PatternFillPropertiesModel value) {
      return new EG_FillProperties(4, value);
    }

    public boolean isPattFill() {
      return this.type == 4;
    }

    public PatternFillPropertiesModel getPattFill() {
      return (PatternFillPropertiesModel) this.value;
    }

    public static EG_FillProperties newGrpFill(GroupFillPropertiesModel value) {
      return new EG_FillProperties(5, value);
    }

    public boolean isGrpFill() {
      return this.type == 5;
    }

    public GroupFillPropertiesModel getGrpFill() {
      return (GroupFillPropertiesModel) this.value;
    }
  }
}
