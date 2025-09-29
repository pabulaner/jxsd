package jxsd.gen.builder.drawingml.main;

import java.lang.Object;
import jxsd.gen.model.drawingml.main.FlatTextModel;
import jxsd.gen.model.drawingml.main.OfficeArtExtensionListModel;
import jxsd.gen.model.drawingml.main.PresetTextShapeModel;
import jxsd.gen.model.drawingml.main.Scene3DModel;
import jxsd.gen.model.drawingml.main.Shape3DModel;
import jxsd.gen.model.drawingml.main.TextAnchoringTypeValueModel;
import jxsd.gen.model.drawingml.main.TextBodyPropertiesModel;
import jxsd.gen.model.drawingml.main.TextHorzOverflowTypeValueModel;
import jxsd.gen.model.drawingml.main.TextNoAutofitModel;
import jxsd.gen.model.drawingml.main.TextNormalAutofitModel;
import jxsd.gen.model.drawingml.main.TextShapeAutofitModel;
import jxsd.gen.model.drawingml.main.TextVertOverflowTypeValueModel;
import jxsd.gen.model.drawingml.main.TextVerticalTypeValueModel;
import jxsd.gen.model.drawingml.main.TextWrappingTypeValueModel;

/**
 * This is a generated sequence class.
 */
public class TextBodyPropertiesBuilder {
  private boolean compatLnSpc;

  private TextVertOverflowTypeValueModel vertOverflow;

  private int bIns;

  private TextVerticalTypeValueModel vert;

  private boolean anchorCtr;

  private int numCol;

  private int rot;

  private int tIns;

  private int lIns;

  private int spcCol;

  private TextWrappingTypeValueModel wrap;

  private boolean fromWordArt;

  private boolean spcFirstLastPara;

  private boolean upright;

  private TextHorzOverflowTypeValueModel horzOverflow;

  private int rIns;

  private boolean rtlCol;

  private boolean forceAA;

  private TextAnchoringTypeValueModel anchor;

  private PresetTextShapeModel prstTxWarp;

  private TextBodyPropertiesModel.EG_TextAutofit egTextAutofit;

  private Scene3DModel scene3d;

  private TextBodyPropertiesModel.EG_Text3D egText3D;

  private OfficeArtExtensionListModel extLst;

  public TextBodyPropertiesBuilder() {
  }

  public TextBodyPropertiesBuilder setCompatLnSpc(boolean compatLnSpc) {
    this.compatLnSpc = compatLnSpc;
    return this;
  }

  public TextBodyPropertiesBuilder setVertOverflow(TextVertOverflowTypeValueModel vertOverflow) {
    this.vertOverflow = vertOverflow;
    return this;
  }

  public TextBodyPropertiesBuilder setBIns(int bIns) {
    this.bIns = bIns;
    return this;
  }

  public TextBodyPropertiesBuilder setVert(TextVerticalTypeValueModel vert) {
    this.vert = vert;
    return this;
  }

  public TextBodyPropertiesBuilder setAnchorCtr(boolean anchorCtr) {
    this.anchorCtr = anchorCtr;
    return this;
  }

  public TextBodyPropertiesBuilder setNumCol(int numCol) {
    this.numCol = numCol;
    return this;
  }

  public TextBodyPropertiesBuilder setRot(int rot) {
    this.rot = rot;
    return this;
  }

  public TextBodyPropertiesBuilder setTIns(int tIns) {
    this.tIns = tIns;
    return this;
  }

  public TextBodyPropertiesBuilder setLIns(int lIns) {
    this.lIns = lIns;
    return this;
  }

  public TextBodyPropertiesBuilder setSpcCol(int spcCol) {
    this.spcCol = spcCol;
    return this;
  }

  public TextBodyPropertiesBuilder setWrap(TextWrappingTypeValueModel wrap) {
    this.wrap = wrap;
    return this;
  }

  public TextBodyPropertiesBuilder setFromWordArt(boolean fromWordArt) {
    this.fromWordArt = fromWordArt;
    return this;
  }

  public TextBodyPropertiesBuilder setSpcFirstLastPara(boolean spcFirstLastPara) {
    this.spcFirstLastPara = spcFirstLastPara;
    return this;
  }

  public TextBodyPropertiesBuilder setUpright(boolean upright) {
    this.upright = upright;
    return this;
  }

  public TextBodyPropertiesBuilder setHorzOverflow(TextHorzOverflowTypeValueModel horzOverflow) {
    this.horzOverflow = horzOverflow;
    return this;
  }

  public TextBodyPropertiesBuilder setRIns(int rIns) {
    this.rIns = rIns;
    return this;
  }

  public TextBodyPropertiesBuilder setRtlCol(boolean rtlCol) {
    this.rtlCol = rtlCol;
    return this;
  }

  public TextBodyPropertiesBuilder setForceAA(boolean forceAA) {
    this.forceAA = forceAA;
    return this;
  }

  public TextBodyPropertiesBuilder setAnchor(TextAnchoringTypeValueModel anchor) {
    this.anchor = anchor;
    return this;
  }

  public TextBodyPropertiesBuilder setPrstTxWarp(PresetTextShapeModel prstTxWarp) {
    this.prstTxWarp = prstTxWarp;
    return this;
  }

  public TextBodyPropertiesBuilder setEGTextAutofit(
      TextBodyPropertiesModel.EG_TextAutofit egTextAutofit) {
    this.egTextAutofit = egTextAutofit;
    return this;
  }

  public TextBodyPropertiesBuilder setScene3D(Scene3DModel scene3d) {
    this.scene3d = scene3d;
    return this;
  }

  public TextBodyPropertiesBuilder setEGText3D(TextBodyPropertiesModel.EG_Text3D egText3D) {
    this.egText3D = egText3D;
    return this;
  }

  public TextBodyPropertiesBuilder setExtLst(OfficeArtExtensionListModel extLst) {
    this.extLst = extLst;
    return this;
  }

  public TextBodyPropertiesBuilder from(TextBodyPropertiesModel value) {
    this.compatLnSpc = value.getCompatLnSpc();
    this.vertOverflow = value.getVertOverflow();
    this.bIns = value.getBIns();
    this.vert = value.getVert();
    this.anchorCtr = value.getAnchorCtr();
    this.numCol = value.getNumCol();
    this.rot = value.getRot();
    this.tIns = value.getTIns();
    this.lIns = value.getLIns();
    this.spcCol = value.getSpcCol();
    this.wrap = value.getWrap();
    this.fromWordArt = value.getFromWordArt();
    this.spcFirstLastPara = value.getSpcFirstLastPara();
    this.upright = value.getUpright();
    this.horzOverflow = value.getHorzOverflow();
    this.rIns = value.getRIns();
    this.rtlCol = value.getRtlCol();
    this.forceAA = value.getForceAA();
    this.anchor = value.getAnchor();
    this.prstTxWarp = value.getPrstTxWarp();
    this.egTextAutofit = value.getEGTextAutofit();
    this.scene3d = value.getScene3D();
    this.egText3D = value.getEGText3D();
    this.extLst = value.getExtLst();
    return this;
  }

  public TextBodyPropertiesModel build() {
    return new TextBodyPropertiesModel(this.compatLnSpc, this.vertOverflow, this.bIns, this.vert, this.anchorCtr, this.numCol, this.rot, this.tIns, this.lIns, this.spcCol, this.wrap, this.fromWordArt, this.spcFirstLastPara, this.upright, this.horzOverflow, this.rIns, this.rtlCol, this.forceAA, this.anchor, this.prstTxWarp, this.egTextAutofit, this.scene3d, this.egText3D, this.extLst);
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextAutofit {
    private int type;

    private Object value;

    public EG_TextAutofit() {
      this.type = -1;
      this.value = null;
    }

    public EG_TextAutofit setNoAutofit(TextNoAutofitModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_TextAutofit setNormAutofit(TextNormalAutofitModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_TextAutofit setSpAutoFit(TextShapeAutofitModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public EG_TextAutofit from(TextBodyPropertiesModel.EG_TextAutofit value) {
      this.type = -1;
      this.value = null;
      if (value.isNoAutofit()) {
        this.type = 0;
        this.value = value.getNoAutofit();
      }
      if (value.isNormAutofit()) {
        this.type = 1;
        this.value = value.getNormAutofit();
      }
      if (value.isSpAutoFit()) {
        this.type = 2;
        this.value = value.getSpAutoFit();
      }
      return this;
    }

    public TextBodyPropertiesModel.EG_TextAutofit build() {
      if (this.type == -1) return new TextBodyPropertiesModel.EG_TextAutofit();
      if (this.type == 0) return TextBodyPropertiesModel.EG_TextAutofit.newNoAutofit((TextNoAutofitModel) this.value);
      if (this.type == 1) return TextBodyPropertiesModel.EG_TextAutofit.newNormAutofit((TextNormalAutofitModel) this.value);
      if (this.type == 2) return TextBodyPropertiesModel.EG_TextAutofit.newSpAutoFit((TextShapeAutofitModel) this.value);
      return null;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_Text3D {
    private int type;

    private Object value;

    public EG_Text3D() {
      this.type = -1;
      this.value = null;
    }

    public EG_Text3D setSp3D(Shape3DModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public EG_Text3D setFlatTx(FlatTextModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public EG_Text3D from(TextBodyPropertiesModel.EG_Text3D value) {
      this.type = -1;
      this.value = null;
      if (value.isSp3D()) {
        this.type = 0;
        this.value = value.getSp3D();
      }
      if (value.isFlatTx()) {
        this.type = 1;
        this.value = value.getFlatTx();
      }
      return this;
    }

    public TextBodyPropertiesModel.EG_Text3D build() {
      if (this.type == -1) return new TextBodyPropertiesModel.EG_Text3D();
      if (this.type == 0) return TextBodyPropertiesModel.EG_Text3D.newSp3D((Shape3DModel) this.value);
      if (this.type == 1) return TextBodyPropertiesModel.EG_Text3D.newFlatTx((FlatTextModel) this.value);
      return null;
    }
  }
}
