package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.BlackWhiteModeValueModel;
import jxsd.gen.model.drawingml.main.BlipFillPropertiesModel;
import jxsd.gen.model.drawingml.main.CustomGeometry2DModel;
import jxsd.gen.model.drawingml.main.EffectContainerModel;
import jxsd.gen.model.drawingml.main.EffectListModel;
import jxsd.gen.model.drawingml.main.GradientFillPropertiesModel;
import jxsd.gen.model.drawingml.main.GroupFillPropertiesModel;
import jxsd.gen.model.drawingml.main.LinePropertiesModel;
import jxsd.gen.model.drawingml.main.NoFillPropertiesModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.PatternFillPropertiesModel;
import jxsd.gen.model.drawingml.main.PresetGeometry2DModel;
import jxsd.gen.model.drawingml.main.Scene3DModel;
import jxsd.gen.model.drawingml.main.Shape3DModel;
import jxsd.gen.model.drawingml.main.ShapePropertiesModel;
import jxsd.gen.model.drawingml.main.SolidColorFillPropertiesModel;
import jxsd.gen.model.drawingml.main.Transform2DModel;

/**
 * This is a generated sequence class.
 */
public class ShapePropertiesBuilder {
  private BlackWhiteModeValueModel bwMode;

  private Transform2DModel xfrm;

  private ShapePropertiesModel.EG_Geometry egGeometry;

  private ShapePropertiesModel.EG_FillProperties egFillProperties;

  private LinePropertiesModel ln;

  private ShapePropertiesModel.EG_EffectProperties egEffectProperties;

  private Scene3DModel scene3d;

  private Shape3DModel sp3d;

  private OfficeArtExtensionListModel extLst;

  public ShapePropertiesBuilder() {
  }

  public ShapePropertiesBuilder setBwMode(BlackWhiteModeValueModel bwMode) {
    this.bwMode = bwMode;
    return this;
  }

  public ShapePropertiesBuilder setXfrm(Transform2DModel xfrm) {
    this.xfrm = xfrm;
    return this;
  }

  public ShapePropertiesBuilder setEGGeometry(ShapePropertiesModel.EG_Geometry egGeometry) {
    this.egGeometry = egGeometry;
    return this;
  }

  public ShapePropertiesBuilder setEGFillProperties(
      ShapePropertiesModel.EG_FillProperties egFillProperties) {
    this.egFillProperties = egFillProperties;
    return this;
  }

  public ShapePropertiesBuilder setLn(LinePropertiesModel ln) {
    this.ln = ln;
    return this;
  }

  public ShapePropertiesBuilder setEGEffectProperties(
      ShapePropertiesModel.EG_EffectProperties egEffectProperties) {
    this.egEffectProperties = egEffectProperties;
    return this;
  }

  public ShapePropertiesBuilder setScene3D(Scene3DModel scene3d) {
    this.scene3d = scene3d;
    return this;
  }

  public ShapePropertiesBuilder setSp3D(Shape3DModel sp3d) {
    this.sp3d = sp3d;
    return this;
  }

  public ShapePropertiesBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public ShapePropertiesBuilder from(ShapePropertiesModel value) {
    this.bwMode = value.getBwMode();
    this.xfrm = value.getXfrm();
    this.egGeometry = value.getEGGeometry();
    this.egFillProperties = value.getEGFillProperties();
    this.ln = value.getLn();
    this.egEffectProperties = value.getEGEffectProperties();
    this.scene3d = value.getScene3D();
    this.sp3d = value.getSp3D();
    this.extLst = value.getExtLst();
    return this;
  }

  public ShapePropertiesModel build() {
    return new ShapePropertiesModel(this.bwMode, this.xfrm, this.egGeometry, this.egFillProperties, this.ln, this.egEffectProperties, this.scene3d, this.sp3d, this.extLst);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_Geometry {
    private int type;

    private Object value;

    public EG_Geometry() {
      this.type = -1;
      this.value = null;
    }

    public EG_Geometry setCustGeom(CustomGeometry2DModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_Geometry setPrstGeom(PresetGeometry2DModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_Geometry from(ShapePropertiesModel.EG_Geometry value) {
      this.type = -1;
      this.value = null;
      if (value.isCustGeom()) {
        this.type = 0;
        this.value = value.getCustGeom();
      }
      if (value.isPrstGeom()) {
        this.type = 1;
        this.value = value.getPrstGeom();
      }
      return this;
    }

    public ShapePropertiesModel.EG_Geometry build() {
      if (this.type == -1) return new ShapePropertiesModel.EG_Geometry();
      if (this.type == 0) return ShapePropertiesModel.EG_Geometry.newCustGeom((CustomGeometry2DModel) this.value);
      if (this.type == 1) return ShapePropertiesModel.EG_Geometry.newPrstGeom((PresetGeometry2DModel) this.value);
      return null;
    }
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

    public EG_FillProperties from(ShapePropertiesModel.EG_FillProperties value) {
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

    public ShapePropertiesModel.EG_FillProperties build() {
      if (this.type == -1) return new ShapePropertiesModel.EG_FillProperties();
      if (this.type == 0) return ShapePropertiesModel.EG_FillProperties.newNoFill((NoFillPropertiesModel) this.value);
      if (this.type == 1) return ShapePropertiesModel.EG_FillProperties.newSolidFill((SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return ShapePropertiesModel.EG_FillProperties.newGradFill((GradientFillPropertiesModel) this.value);
      if (this.type == 3) return ShapePropertiesModel.EG_FillProperties.newBlipFill((BlipFillPropertiesModel) this.value);
      if (this.type == 4) return ShapePropertiesModel.EG_FillProperties.newPattFill((PatternFillPropertiesModel) this.value);
      if (this.type == 5) return ShapePropertiesModel.EG_FillProperties.newGrpFill((GroupFillPropertiesModel) this.value);
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

    public EG_EffectProperties from(ShapePropertiesModel.EG_EffectProperties value) {
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

    public ShapePropertiesModel.EG_EffectProperties build() {
      if (this.type == -1) return new ShapePropertiesModel.EG_EffectProperties();
      if (this.type == 0) return ShapePropertiesModel.EG_EffectProperties.newEffectLst((EffectListModel) this.value);
      if (this.type == 1) return ShapePropertiesModel.EG_EffectProperties.newEffectDag((EffectContainerModel) this.value);
      return null;
    }
  }
}
