package test.drawingml.main;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import test.XMLSchema.BooleanModel;

public class CTTextBodyPropertiesModel {
  private final BooleanModel compatLnSpc;

  private final STTextVertOverflowTypeModel vertOverflow;

  private final STCoordinate32Model bIns;

  private final STTextVerticalTypeModel vert;

  private final BooleanModel anchorCtr;

  private final STTextColumnCountModel numCol;

  private final STAngleModel rot;

  private final STCoordinate32Model tIns;

  private final STCoordinate32Model lIns;

  private final STPositiveCoordinate32Model spcCol;

  private final STTextWrappingTypeModel wrap;

  private final BooleanModel fromWordArt;

  private final BooleanModel spcFirstLastPara;

  private final BooleanModel upright;

  private final STTextHorzOverflowTypeModel horzOverflow;

  private final STCoordinate32Model rIns;

  private final BooleanModel rtlCol;

  private final BooleanModel forceAA;

  private final STTextAnchoringTypeModel anchor;

  private final CTPresetTextShapeModel prstTxWarp;

  private final NoAutofitOrNormAutofitOrSpAutoFitModel noAutofitOrNormAutofitOrSpAutoFit;

  private final CTScene3DModel scene3d;

  private final Sp3dOrFlatTxModel sp3dOrFlatTx;

  private final CTOfficeArtExtensionListModel extLst;

  public CTTextBodyPropertiesModel(BooleanModel compatLnSpc,
      STTextVertOverflowTypeModel vertOverflow, STCoordinate32Model bIns,
      STTextVerticalTypeModel vert, BooleanModel anchorCtr, STTextColumnCountModel numCol,
      STAngleModel rot, STCoordinate32Model tIns, STCoordinate32Model lIns,
      STPositiveCoordinate32Model spcCol, STTextWrappingTypeModel wrap, BooleanModel fromWordArt,
      BooleanModel spcFirstLastPara, BooleanModel upright, STTextHorzOverflowTypeModel horzOverflow,
      STCoordinate32Model rIns, BooleanModel rtlCol, BooleanModel forceAA,
      STTextAnchoringTypeModel anchor, CTPresetTextShapeModel prstTxWarp,
      NoAutofitOrNormAutofitOrSpAutoFitModel noAutofitOrNormAutofitOrSpAutoFit,
      CTScene3DModel scene3d, Sp3dOrFlatTxModel sp3dOrFlatTx,
      CTOfficeArtExtensionListModel extLst) {
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

  public STTextVertOverflowTypeModel getVertOverflow() {
    return this.vertOverflow;
  }

  public STCoordinate32Model getBIns() {
    return this.bIns;
  }

  public STTextVerticalTypeModel getVert() {
    return this.vert;
  }

  public BooleanModel getAnchorCtr() {
    return this.anchorCtr;
  }

  public STTextColumnCountModel getNumCol() {
    return this.numCol;
  }

  public STAngleModel getRot() {
    return this.rot;
  }

  public STCoordinate32Model getTIns() {
    return this.tIns;
  }

  public STCoordinate32Model getLIns() {
    return this.lIns;
  }

  public STPositiveCoordinate32Model getSpcCol() {
    return this.spcCol;
  }

  public STTextWrappingTypeModel getWrap() {
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

  public STTextHorzOverflowTypeModel getHorzOverflow() {
    return this.horzOverflow;
  }

  public STCoordinate32Model getRIns() {
    return this.rIns;
  }

  public BooleanModel getRtlCol() {
    return this.rtlCol;
  }

  public BooleanModel getForceAA() {
    return this.forceAA;
  }

  public STTextAnchoringTypeModel getAnchor() {
    return this.anchor;
  }

  public CTPresetTextShapeModel getPrstTxWarp() {
    return this.prstTxWarp;
  }

  public NoAutofitOrNormAutofitOrSpAutoFitModel getNoAutofitOrNormAutofitOrSpAutoFit() {
    return this.noAutofitOrNormAutofitOrSpAutoFit;
  }

  public CTScene3DModel getScene3d() {
    return this.scene3d;
  }

  public Sp3dOrFlatTxModel getSp3dOrFlatTx() {
    return this.sp3dOrFlatTx;
  }

  public CTOfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class NoAutofitOrNormAutofitOrSpAutoFitModel {
    private final Integer type;

    private final Object value;

    public NoAutofitOrNormAutofitOrSpAutoFitModel() {
      this(-1, null);
    }

    private NoAutofitOrNormAutofitOrSpAutoFitModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static NoAutofitOrNormAutofitOrSpAutoFitModel newNoAutofit(CTTextNoAutofitModel value) {
      return new NoAutofitOrNormAutofitOrSpAutoFitModel(0, value);
    }

    public Boolean isNoAutofit() {
      return this.type == 0;
    }

    public CTTextNoAutofitModel getNoAutofit() {
      return (CTTextNoAutofitModel) this.value;
    }

    public static NoAutofitOrNormAutofitOrSpAutoFitModel newNormAutofit(
        CTTextNormalAutofitModel value) {
      return new NoAutofitOrNormAutofitOrSpAutoFitModel(1, value);
    }

    public Boolean isNormAutofit() {
      return this.type == 1;
    }

    public CTTextNormalAutofitModel getNormAutofit() {
      return (CTTextNormalAutofitModel) this.value;
    }

    public static NoAutofitOrNormAutofitOrSpAutoFitModel newSpAutoFit(
        CTTextShapeAutofitModel value) {
      return new NoAutofitOrNormAutofitOrSpAutoFitModel(2, value);
    }

    public Boolean isSpAutoFit() {
      return this.type == 2;
    }

    public CTTextShapeAutofitModel getSpAutoFit() {
      return (CTTextShapeAutofitModel) this.value;
    }
  }

  public static class Sp3dOrFlatTxModel {
    private final Integer type;

    private final Object value;

    public Sp3dOrFlatTxModel() {
      this(-1, null);
    }

    private Sp3dOrFlatTxModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static Sp3dOrFlatTxModel newSp3d(CTShape3DModel value) {
      return new Sp3dOrFlatTxModel(0, value);
    }

    public Boolean isSp3d() {
      return this.type == 0;
    }

    public CTShape3DModel getSp3d() {
      return (CTShape3DModel) this.value;
    }

    public static Sp3dOrFlatTxModel newFlatTx(CTFlatTextModel value) {
      return new Sp3dOrFlatTxModel(1, value);
    }

    public Boolean isFlatTx() {
      return this.type == 1;
    }

    public CTFlatTextModel getFlatTx() {
      return (CTFlatTextModel) this.value;
    }
  }
}
