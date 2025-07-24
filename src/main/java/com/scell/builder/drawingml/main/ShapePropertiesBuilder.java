package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BlackWhiteModeModel;
import com.scell.model.drawingml.main.BlipFillPropertiesModel;
import com.scell.model.drawingml.main.CustomGeometry2DModel;
import com.scell.model.drawingml.main.EffectContainerModel;
import com.scell.model.drawingml.main.EffectListModel;
import com.scell.model.drawingml.main.GradientFillPropertiesModel;
import com.scell.model.drawingml.main.GroupFillPropertiesModel;
import com.scell.model.drawingml.main.LinePropertiesModel;
import com.scell.model.drawingml.main.NoFillPropertiesModel;
import com.scell.model.drawingml.main.OfficeArtExtensionListModel;
import com.scell.model.drawingml.main.PatternFillPropertiesModel;
import com.scell.model.drawingml.main.PresetGeometry2DModel;
import com.scell.model.drawingml.main.Scene3DModel;
import com.scell.model.drawingml.main.Shape3DModel;
import com.scell.model.drawingml.main.ShapePropertiesModel;
import com.scell.model.drawingml.main.SolidColorFillPropertiesModel;
import com.scell.model.drawingml.main.Transform2DModel;
import java.lang.Object;

public class ShapePropertiesBuilder {
  private BlackWhiteModeModel bwMode;

  private Transform2DModel xfrm;

  private ShapePropertiesModel.GeometryModel egGeometry;

  private ShapePropertiesModel.FillPropertiesModel egFillProperties;

  private LinePropertiesModel ln;

  private ShapePropertiesModel.EffectPropertiesModel egEffectProperties;

  private Scene3DModel scene3d;

  private Shape3DModel sp3d;

  private OfficeArtExtensionListModel extLst;

  public ShapePropertiesBuilder() {
  }

  public ShapePropertiesBuilder setBwMode(BlackWhiteModeModel bwMode) {
    this.bwMode = bwMode;
    return this;
  }

  public ShapePropertiesBuilder setXfrm(Transform2DModel xfrm) {
    this.xfrm = xfrm;
    return this;
  }

  public ShapePropertiesBuilder setEGGeometry(ShapePropertiesModel.GeometryModel egGeometry) {
    this.egGeometry = egGeometry;
    return this;
  }

  public ShapePropertiesBuilder setEGFillProperties(
      ShapePropertiesModel.FillPropertiesModel egFillProperties) {
    this.egFillProperties = egFillProperties;
    return this;
  }

  public ShapePropertiesBuilder setLn(LinePropertiesModel ln) {
    this.ln = ln;
    return this;
  }

  public ShapePropertiesBuilder setEGEffectProperties(
      ShapePropertiesModel.EffectPropertiesModel egEffectProperties) {
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

  public ShapePropertiesModel build() {
    return new ShapePropertiesModel(this.bwMode, this.xfrm, this.egGeometry, this.egFillProperties, this.ln, this.egEffectProperties, this.scene3d, this.sp3d, this.extLst);
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

  public static class GeometryBuilder {
    private int type;

    private Object value;

    public GeometryBuilder() {
      this.type = -1;
      this.value = null;
    }

    public GeometryBuilder setCustGeom(CustomGeometry2DModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public GeometryBuilder setPrstGeom(PresetGeometry2DModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public ShapePropertiesModel.GeometryModel build() {
      if (this.type == -1) return new ShapePropertiesModel.GeometryModel();
      if (this.type == 0) return ShapePropertiesModel.GeometryModel.newCustGeom((CustomGeometry2DModel) this.value);
      if (this.type == 1) return ShapePropertiesModel.GeometryModel.newPrstGeom((PresetGeometry2DModel) this.value);
      return null;
    }

    public GeometryBuilder from(ShapePropertiesModel.GeometryModel value) {
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
  }

  public static class FillPropertiesBuilder {
    private int type;

    private Object value;

    public FillPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public FillPropertiesBuilder setNoFill(NoFillPropertiesModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setSolidFill(SolidColorFillPropertiesModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setGradFill(GradientFillPropertiesModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setBlipFill(BlipFillPropertiesModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setPattFill(PatternFillPropertiesModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public FillPropertiesBuilder setGrpFill(GroupFillPropertiesModel value) {
      this.type = 5;
      this.value = value;
      return this;
    }

    public ShapePropertiesModel.FillPropertiesModel build() {
      if (this.type == -1) return new ShapePropertiesModel.FillPropertiesModel();
      if (this.type == 0) return ShapePropertiesModel.FillPropertiesModel.newNoFill((NoFillPropertiesModel) this.value);
      if (this.type == 1) return ShapePropertiesModel.FillPropertiesModel.newSolidFill((SolidColorFillPropertiesModel) this.value);
      if (this.type == 2) return ShapePropertiesModel.FillPropertiesModel.newGradFill((GradientFillPropertiesModel) this.value);
      if (this.type == 3) return ShapePropertiesModel.FillPropertiesModel.newBlipFill((BlipFillPropertiesModel) this.value);
      if (this.type == 4) return ShapePropertiesModel.FillPropertiesModel.newPattFill((PatternFillPropertiesModel) this.value);
      if (this.type == 5) return ShapePropertiesModel.FillPropertiesModel.newGrpFill((GroupFillPropertiesModel) this.value);
      return null;
    }

    public FillPropertiesBuilder from(ShapePropertiesModel.FillPropertiesModel value) {
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
  }

  public static class EffectPropertiesBuilder {
    private int type;

    private Object value;

    public EffectPropertiesBuilder() {
      this.type = -1;
      this.value = null;
    }

    public EffectPropertiesBuilder setEffectLst(EffectListModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EffectPropertiesBuilder setEffectDag(EffectContainerModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public ShapePropertiesModel.EffectPropertiesModel build() {
      if (this.type == -1) return new ShapePropertiesModel.EffectPropertiesModel();
      if (this.type == 0) return ShapePropertiesModel.EffectPropertiesModel.newEffectLst((EffectListModel) this.value);
      if (this.type == 1) return ShapePropertiesModel.EffectPropertiesModel.newEffectDag((EffectContainerModel) this.value);
      return null;
    }

    public EffectPropertiesBuilder from(ShapePropertiesModel.EffectPropertiesModel value) {
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
  }
}
