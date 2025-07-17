package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import java.lang.Integer;
import java.lang.Object;

public class CT_TextBodyPropertiesModel {
  private final BooleanModel compatLnSpc;

  private final ST_TextVertOverflowTypeModel vertOverflow;

  private final ST_Coordinate32Model bIns;

  private final ST_TextVerticalTypeModel vert;

  private final BooleanModel anchorCtr;

  private final ST_TextColumnCountModel numCol;

  private final ST_AngleModel rot;

  private final ST_Coordinate32Model tIns;

  private final ST_Coordinate32Model lIns;

  private final ST_PositiveCoordinate32Model spcCol;

  private final ST_TextWrappingTypeModel wrap;

  private final BooleanModel fromWordArt;

  private final BooleanModel spcFirstLastPara;

  private final BooleanModel upright;

  private final ST_TextHorzOverflowTypeModel horzOverflow;

  private final ST_Coordinate32Model rIns;

  private final BooleanModel rtlCol;

  private final BooleanModel forceAA;

  private final ST_TextAnchoringTypeModel anchor;

  private final CT_PresetTextShapeModel prstTxWarp;

  private final NoAutofitOrNormAutofitOrSpAutoFitModel noAutofitOrNormAutofitOrSpAutoFit;

  private final CT_Scene3DModel scene3d;

  private final Sp3dOrFlatTxModel sp3dOrFlatTx;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_TextBodyPropertiesModel(BooleanModel compatLnSpc,
      ST_TextVertOverflowTypeModel vertOverflow, ST_Coordinate32Model bIns,
      ST_TextVerticalTypeModel vert, BooleanModel anchorCtr, ST_TextColumnCountModel numCol,
      ST_AngleModel rot, ST_Coordinate32Model tIns, ST_Coordinate32Model lIns,
      ST_PositiveCoordinate32Model spcCol, ST_TextWrappingTypeModel wrap, BooleanModel fromWordArt,
      BooleanModel spcFirstLastPara, BooleanModel upright,
      ST_TextHorzOverflowTypeModel horzOverflow, ST_Coordinate32Model rIns, BooleanModel rtlCol,
      BooleanModel forceAA, ST_TextAnchoringTypeModel anchor, CT_PresetTextShapeModel prstTxWarp,
      NoAutofitOrNormAutofitOrSpAutoFitModel noAutofitOrNormAutofitOrSpAutoFit,
      CT_Scene3DModel scene3d, Sp3dOrFlatTxModel sp3dOrFlatTx,
      CT_OfficeArtExtensionListModel extLst) {
    this.compatLnSpc = compatLnSpc;
    this.vertOverflow = vertOverflow;
    this.bIns = bIns;
    this.vert = vert;
    this.anchorCtr = anchorCtr;
    this.numCol = numCol;
    this.rot = rot;
    this.tIns = tIns;
    this.lIns = lIns;
    this.spcCol = spcCol;
    this.wrap = wrap;
    this.fromWordArt = fromWordArt;
    this.spcFirstLastPara = spcFirstLastPara;
    this.upright = upright;
    this.horzOverflow = horzOverflow;
    this.rIns = rIns;
    this.rtlCol = rtlCol;
    this.forceAA = forceAA;
    this.anchor = anchor;
    this.prstTxWarp = prstTxWarp;
    this.noAutofitOrNormAutofitOrSpAutoFit = noAutofitOrNormAutofitOrSpAutoFit;
    this.scene3d = scene3d;
    this.sp3dOrFlatTx = sp3dOrFlatTx;
    this.extLst = extLst;
  }

  public BooleanModel getCompatLnSpc() {
    return this.compatLnSpc;
  }

  public ST_TextVertOverflowTypeModel getVertOverflow() {
    return this.vertOverflow;
  }

  public ST_Coordinate32Model getBIns() {
    return this.bIns;
  }

  public ST_TextVerticalTypeModel getVert() {
    return this.vert;
  }

  public BooleanModel getAnchorCtr() {
    return this.anchorCtr;
  }

  public ST_TextColumnCountModel getNumCol() {
    return this.numCol;
  }

  public ST_AngleModel getRot() {
    return this.rot;
  }

  public ST_Coordinate32Model getTIns() {
    return this.tIns;
  }

  public ST_Coordinate32Model getLIns() {
    return this.lIns;
  }

  public ST_PositiveCoordinate32Model getSpcCol() {
    return this.spcCol;
  }

  public ST_TextWrappingTypeModel getWrap() {
    return this.wrap;
  }

  public BooleanModel getFromWordArt() {
    return this.fromWordArt;
  }

  public BooleanModel getSpcFirstLastPara() {
    return this.spcFirstLastPara;
  }

  public BooleanModel getUpright() {
    return this.upright;
  }

  public ST_TextHorzOverflowTypeModel getHorzOverflow() {
    return this.horzOverflow;
  }

  public ST_Coordinate32Model getRIns() {
    return this.rIns;
  }

  public BooleanModel getRtlCol() {
    return this.rtlCol;
  }

  public BooleanModel getForceAA() {
    return this.forceAA;
  }

  public ST_TextAnchoringTypeModel getAnchor() {
    return this.anchor;
  }

  public CT_PresetTextShapeModel getPrstTxWarp() {
    return this.prstTxWarp;
  }

  public NoAutofitOrNormAutofitOrSpAutoFitModel getNoAutofitOrNormAutofitOrSpAutoFit() {
    return this.noAutofitOrNormAutofitOrSpAutoFit;
  }

  public CT_Scene3DModel getScene3d() {
    return this.scene3d;
  }

  public Sp3dOrFlatTxModel getSp3dOrFlatTx() {
    return this.sp3dOrFlatTx;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class NoAutofitOrNormAutofitOrSpAutoFitModel {
    private final int type;

    private final Object value;

    public NoAutofitOrNormAutofitOrSpAutoFitModel() {
      this(-1, null);
    }

    private NoAutofitOrNormAutofitOrSpAutoFitModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static NoAutofitOrNormAutofitOrSpAutoFitModel newNoAutofit(CT_TextNoAutofitModel value) {
      return new NoAutofitOrNormAutofitOrSpAutoFitModel(0, value);
    }

    public boolean isNoAutofit() {
      return this.type == 0;
    }

    public CT_TextNoAutofitModel getNoAutofit() {
      return (CT_TextNoAutofitModel) this.value;
    }

    public static NoAutofitOrNormAutofitOrSpAutoFitModel newNormAutofit(
        CT_TextNormalAutofitModel value) {
      return new NoAutofitOrNormAutofitOrSpAutoFitModel(1, value);
    }

    public boolean isNormAutofit() {
      return this.type == 1;
    }

    public CT_TextNormalAutofitModel getNormAutofit() {
      return (CT_TextNormalAutofitModel) this.value;
    }

    public static NoAutofitOrNormAutofitOrSpAutoFitModel newSpAutoFit(
        CT_TextShapeAutofitModel value) {
      return new NoAutofitOrNormAutofitOrSpAutoFitModel(2, value);
    }

    public boolean isSpAutoFit() {
      return this.type == 2;
    }

    public CT_TextShapeAutofitModel getSpAutoFit() {
      return (CT_TextShapeAutofitModel) this.value;
    }
  }

  public static class Sp3dOrFlatTxModel {
    private final int type;

    private final Object value;

    public Sp3dOrFlatTxModel() {
      this(-1, null);
    }

    private Sp3dOrFlatTxModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static Sp3dOrFlatTxModel newSp3d(CT_Shape3DModel value) {
      return new Sp3dOrFlatTxModel(0, value);
    }

    public boolean isSp3d() {
      return this.type == 0;
    }

    public CT_Shape3DModel getSp3d() {
      return (CT_Shape3DModel) this.value;
    }

    public static Sp3dOrFlatTxModel newFlatTx(CT_FlatTextModel value) {
      return new Sp3dOrFlatTxModel(1, value);
    }

    public boolean isFlatTx() {
      return this.type == 1;
    }

    public CT_FlatTextModel getFlatTx() {
      return (CT_FlatTextModel) this.value;
    }
  }
}
