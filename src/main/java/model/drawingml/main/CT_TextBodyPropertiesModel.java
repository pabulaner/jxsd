package model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import model.XMLSchema.booleanModel;

public class CT_TextBodyPropertiesModel {
  private final booleanModel compatLnSpc;

  private final ST_TextVertOverflowTypeModel vertOverflow;

  private final ST_Coordinate32Model bIns;

  private final ST_TextVerticalTypeModel vert;

  private final booleanModel anchorCtr;

  private final ST_TextColumnCountModel numCol;

  private final ST_AngleModel rot;

  private final ST_Coordinate32Model tIns;

  private final ST_Coordinate32Model lIns;

  private final ST_PositiveCoordinate32Model spcCol;

  private final ST_TextWrappingTypeModel wrap;

  private final booleanModel fromWordArt;

  private final booleanModel spcFirstLastPara;

  private final booleanModel upright;

  private final ST_TextHorzOverflowTypeModel horzOverflow;

  private final ST_Coordinate32Model rIns;

  private final booleanModel rtlCol;

  private final booleanModel forceAA;

  private final ST_TextAnchoringTypeModel anchor;

  private final CT_PresetTextShapeModel prstTxWarp;

  private final noAutofitOrNormAutofitOrSpAutoFitModel noAutofitOrNormAutofitOrSpAutoFit;

  private final CT_Scene3DModel scene3d;

  private final sp3dOrFlatTxModel sp3dOrFlatTx;

  private final CT_OfficeArtExtensionListModel extLst;

  public CT_TextBodyPropertiesModel(booleanModel compatLnSpc,
      ST_TextVertOverflowTypeModel vertOverflow, ST_Coordinate32Model bIns,
      ST_TextVerticalTypeModel vert, booleanModel anchorCtr, ST_TextColumnCountModel numCol,
      ST_AngleModel rot, ST_Coordinate32Model tIns, ST_Coordinate32Model lIns,
      ST_PositiveCoordinate32Model spcCol, ST_TextWrappingTypeModel wrap, booleanModel fromWordArt,
      booleanModel spcFirstLastPara, booleanModel upright,
      ST_TextHorzOverflowTypeModel horzOverflow, ST_Coordinate32Model rIns, booleanModel rtlCol,
      booleanModel forceAA, ST_TextAnchoringTypeModel anchor, CT_PresetTextShapeModel prstTxWarp,
      noAutofitOrNormAutofitOrSpAutoFitModel noAutofitOrNormAutofitOrSpAutoFit,
      CT_Scene3DModel scene3d, sp3dOrFlatTxModel sp3dOrFlatTx,
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

  public booleanModel getCompatLnSpc() {
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

  public booleanModel getAnchorCtr() {
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

  public booleanModel getFromWordArt() {
    return this.fromWordArt;
  }

  public booleanModel getSpcFirstLastPara() {
    return this.spcFirstLastPara;
  }

  public booleanModel getUpright() {
    return this.upright;
  }

  public ST_TextHorzOverflowTypeModel getHorzOverflow() {
    return this.horzOverflow;
  }

  public ST_Coordinate32Model getRIns() {
    return this.rIns;
  }

  public booleanModel getRtlCol() {
    return this.rtlCol;
  }

  public booleanModel getForceAA() {
    return this.forceAA;
  }

  public ST_TextAnchoringTypeModel getAnchor() {
    return this.anchor;
  }

  public CT_PresetTextShapeModel getPrstTxWarp() {
    return this.prstTxWarp;
  }

  public noAutofitOrNormAutofitOrSpAutoFitModel getNoAutofitOrNormAutofitOrSpAutoFit() {
    return this.noAutofitOrNormAutofitOrSpAutoFit;
  }

  public CT_Scene3DModel getScene3d() {
    return this.scene3d;
  }

  public sp3dOrFlatTxModel getSp3dOrFlatTx() {
    return this.sp3dOrFlatTx;
  }

  public CT_OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class noAutofitOrNormAutofitOrSpAutoFitModel {
    private final int type;

    private final Object value;

    public noAutofitOrNormAutofitOrSpAutoFitModel() {
      this(-1, null);
    }

    private noAutofitOrNormAutofitOrSpAutoFitModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static noAutofitOrNormAutofitOrSpAutoFitModel newNoAutofit(CT_TextNoAutofitModel value) {
      return new noAutofitOrNormAutofitOrSpAutoFitModel(0, value);
    }

    public boolean isNoAutofit() {
      return this.type == 0;
    }

    public CT_TextNoAutofitModel getNoAutofit() {
      return (CT_TextNoAutofitModel) this.value;
    }

    public static noAutofitOrNormAutofitOrSpAutoFitModel newNormAutofit(
        CT_TextNormalAutofitModel value) {
      return new noAutofitOrNormAutofitOrSpAutoFitModel(1, value);
    }

    public boolean isNormAutofit() {
      return this.type == 1;
    }

    public CT_TextNormalAutofitModel getNormAutofit() {
      return (CT_TextNormalAutofitModel) this.value;
    }

    public static noAutofitOrNormAutofitOrSpAutoFitModel newSpAutoFit(
        CT_TextShapeAutofitModel value) {
      return new noAutofitOrNormAutofitOrSpAutoFitModel(2, value);
    }

    public boolean isSpAutoFit() {
      return this.type == 2;
    }

    public CT_TextShapeAutofitModel getSpAutoFit() {
      return (CT_TextShapeAutofitModel) this.value;
    }
  }

  public static class sp3dOrFlatTxModel {
    private final int type;

    private final Object value;

    public sp3dOrFlatTxModel() {
      this(-1, null);
    }

    private sp3dOrFlatTxModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static sp3dOrFlatTxModel newSp3d(CT_Shape3DModel value) {
      return new sp3dOrFlatTxModel(0, value);
    }

    public boolean isSp3d() {
      return this.type == 0;
    }

    public CT_Shape3DModel getSp3d() {
      return (CT_Shape3DModel) this.value;
    }

    public static sp3dOrFlatTxModel newFlatTx(CT_FlatTextModel value) {
      return new sp3dOrFlatTxModel(1, value);
    }

    public boolean isFlatTx() {
      return this.type == 1;
    }

    public CT_FlatTextModel getFlatTx() {
      return (CT_FlatTextModel) this.value;
    }
  }
}
