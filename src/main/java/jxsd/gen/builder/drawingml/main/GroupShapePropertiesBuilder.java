package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.BlackWhiteModeValueModel;
import jxsd.gen.model.drawingml.main.BlipFillPropertiesModel;
import jxsd.gen.model.drawingml.main.EffectContainerModel;
import jxsd.gen.model.drawingml.main.EffectListModel;
import jxsd.gen.model.drawingml.main.GradientFillPropertiesModel;
import jxsd.gen.model.drawingml.main.GroupFillPropertiesModel;
import jxsd.gen.model.drawingml.main.GroupShapePropertiesModel;
import jxsd.gen.model.drawingml.main.GroupTransform2DModel;
import jxsd.gen.model.drawingml.main.NoFillPropertiesModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.PatternFillPropertiesModel;
import jxsd.gen.model.drawingml.main.Scene3DModel;
import jxsd.gen.model.drawingml.main.SolidColorFillPropertiesModel;

/**
 * This is a generated sequence class.
 */
public class GroupShapePropertiesBuilder {
  private BlackWhiteModeValueModel bwMode;

  private GroupTransform2DModel xfrm;

  private GroupShapePropertiesModel.EG_FillProperties egFillProperties;

  private GroupShapePropertiesModel.EG_EffectProperties egEffectProperties;

  private Scene3DModel scene3d;

  private OfficeArtExtensionListModel extLst;

  public GroupShapePropertiesBuilder() {
  }

  public GroupShapePropertiesBuilder setBwMode(BlackWhiteModeValueModel bwMode) {
    this.bwMode = bwMode;
    return this;
  }

  public GroupShapePropertiesBuilder setXfrm(GroupTransform2DModel xfrm) {
    this.xfrm = xfrm;
    return this;
  }

  public GroupShapePropertiesBuilder setEGFillProperties(
      GroupShapePropertiesModel.EG_FillProperties egFillProperties) {
    this.egFillProperties = egFillProperties;
    return this;
  }

  public GroupShapePropertiesBuilder setEGEffectProperties(
      GroupShapePropertiesModel.EG_EffectProperties egEffectProperties) {
    this.egEffectProperties = egEffectProperties;
    return this;
  }

  public GroupShapePropertiesBuilder setScene3D(Scene3DModel scene3d) {
    this.scene3d = scene3d;
    return this;
  }

  public GroupShapePropertiesBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public GroupShapePropertiesBuilder from(GroupShapePropertiesModel value) {
    this.bwMode = value.getBwMode();
    this.xfrm = value.getXfrm();
    this.egFillProperties = value.getEGFillProperties();
    this.egEffectProperties = value.getEGEffectProperties();
    this.scene3d = value.getScene3D();
    this.extLst = value.getExtLst();
    return this;
  }

  public GroupShapePropertiesModel build() {
    return new GroupShapePropertiesModel(this.bwMode, this.xfrm, this.egFillProperties, this.egEffectProperties, this.scene3d, this.extLst);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_FillProperties {
    private int type;

    private Object value;

    public EG_FillProperties() {
      this.type = -1;
      this.value = null;
    }

    public EG_FillProperties setNoFill(NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_FillProperties setSolidFill(SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_FillProperties setGradFill(GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_FillProperties setBlipFill(BlipFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public EG_FillProperties setPattFill(PatternFillPropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public EG_FillProperties setGrpFill(GroupFillPropertiesModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public EG_FillProperties from(GroupShapePropertiesModel.EG_FillProperties value) {
      this.type = -1;
      this.value = null;
      if (value.isNoFill()) {
        this.type = 0;
        this.value = value.getNoFill();
      }
      if (value.isSolidFill()) {
        this.type = 1;
        this.value = value.getSolidFill();
      }
      if (value.isGradFill()) {
        this.type = 2;
        this.value = value.getGradFill();
      }
      if (value.isBlipFill()) {
        this.type = 3;
        this.value = value.getBlipFill();
      }
      if (value.isPattFill()) {
        this.type = 4;
        this.value = value.getPattFill();
      }
      if (value.isGrpFill()) {
        this.type = 5;
        this.value = value.getGrpFill();
      }
      return this;
    }

    public GroupShapePropertiesModel.EG_FillProperties build() {
      if (this.type == -1) return new GroupShapePropertiesModel.EG_FillProperties();
      if (this.type == 0) return GroupShapePropertiesModel.EG_FillProperties.newNoFill((NoFillPropertiesModel) this.value);
      if (this.type == 1) return GroupShapePropertiesModel.EG_FillProperties.newSolidFill((SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return GroupShapePropertiesModel.EG_FillProperties.newGradFill((GradientFillPropertiesModel) this.value);
      if (this.type == 3) return GroupShapePropertiesModel.EG_FillProperties.newBlipFill((BlipFillPropertiesModel) this.value);
      if (this.type == 4) return GroupShapePropertiesModel.EG_FillProperties.newPattFill((PatternFillPropertiesModel) this.value);
      if (this.type == 5) return GroupShapePropertiesModel.EG_FillProperties.newGrpFill((GroupFillPropertiesModel) this.value);
      return null;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_EffectProperties {
    private int type;

    private Object value;

    public EG_EffectProperties() {
      this.type = -1;
      this.value = null;
    }

    public EG_EffectProperties setEffectLst(EffectListModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_EffectProperties setEffectDag(EffectContainerModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_EffectProperties from(GroupShapePropertiesModel.EG_EffectProperties value) {
      this.type = -1;
      this.value = null;
      if (value.isEffectLst()) {
        this.type = 0;
        this.value = value.getEffectLst();
      }
      if (value.isEffectDag()) {
        this.type = 1;
        this.value = value.getEffectDag();
      }
      return this;
    }

    public GroupShapePropertiesModel.EG_EffectProperties build() {
      if (this.type == -1) return new GroupShapePropertiesModel.EG_EffectProperties();
      if (this.type == 0) return GroupShapePropertiesModel.EG_EffectProperties.newEffectLst((EffectListModel) this.value);
      if (this.type == 1) return GroupShapePropertiesModel.EG_EffectProperties.newEffectDag((EffectContainerModel) this.value);
      return null;
    }
  }
}
