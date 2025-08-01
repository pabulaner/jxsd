package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanValueModel;
import java.lang.Integer;
import java.lang.Object;

public class TextBodyPropertiesModel {
  private final BooleanValueModel compatLnSpc;

  private final TextVertOverflowTypeValueModel vertOverflow;

  private final Coordinate32ValueModel bIns;

  private final TextVerticalTypeValueModel vert;

  private final BooleanValueModel anchorCtr;

  private final TextColumnCountValueModel numCol;

  private final AngleValueModel rot;

  private final Coordinate32ValueModel tIns;

  private final Coordinate32ValueModel lIns;

  private final PositiveCoordinate32ValueModel spcCol;

  private final TextWrappingTypeValueModel wrap;

  private final BooleanValueModel fromWordArt;

  private final BooleanValueModel spcFirstLastPara;

  private final BooleanValueModel upright;

  private final TextHorzOverflowTypeValueModel horzOverflow;

  private final Coordinate32ValueModel rIns;

  private final BooleanValueModel rtlCol;

  private final BooleanValueModel forceAA;

  private final TextAnchoringTypeValueModel anchor;

  private final PresetTextShapeModel prstTxWarp;

  private final TextAutofitModel egTextAutofit;

  private final Scene3DModel scene3d;

  private final Text3DModel egText3D;

  private final OfficeArtExtensionListModel extLst;

  public TextBodyPropertiesModel(BooleanValueModel compatLnSpc,
      TextVertOverflowTypeValueModel vertOverflow, Coordinate32ValueModel bIns,
      TextVerticalTypeValueModel vert, BooleanValueModel anchorCtr,
      TextColumnCountValueModel numCol, AngleValueModel rot, Coordinate32ValueModel tIns,
      Coordinate32ValueModel lIns, PositiveCoordinate32ValueModel spcCol,
      TextWrappingTypeValueModel wrap, BooleanValueModel fromWordArt,
      BooleanValueModel spcFirstLastPara, BooleanValueModel upright,
      TextHorzOverflowTypeValueModel horzOverflow, Coordinate32ValueModel rIns,
      BooleanValueModel rtlCol, BooleanValueModel forceAA, TextAnchoringTypeValueModel anchor,
      PresetTextShapeModel prstTxWarp, TextAutofitModel egTextAutofit, Scene3DModel scene3d,
      Text3DModel egText3D, OfficeArtExtensionListModel extLst) {
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
    this.egTextAutofit = egTextAutofit;
    this.scene3d = scene3d;
    this.egText3D = egText3D;
    this.extLst = extLst;
  }

  public BooleanValueModel getCompatLnSpc() {
    return this.compatLnSpc;
  }

  public TextVertOverflowTypeValueModel getVertOverflow() {
    return this.vertOverflow;
  }

  public Coordinate32ValueModel getBIns() {
    return this.bIns;
  }

  public TextVerticalTypeValueModel getVert() {
    return this.vert;
  }

  public BooleanValueModel getAnchorCtr() {
    return this.anchorCtr;
  }

  public TextColumnCountValueModel getNumCol() {
    return this.numCol;
  }

  public AngleValueModel getRot() {
    return this.rot;
  }

  public Coordinate32ValueModel getTIns() {
    return this.tIns;
  }

  public Coordinate32ValueModel getLIns() {
    return this.lIns;
  }

  public PositiveCoordinate32ValueModel getSpcCol() {
    return this.spcCol;
  }

  public TextWrappingTypeValueModel getWrap() {
    return this.wrap;
  }

  public BooleanValueModel getFromWordArt() {
    return this.fromWordArt;
  }

  public BooleanValueModel getSpcFirstLastPara() {
    return this.spcFirstLastPara;
  }

  public BooleanValueModel getUpright() {
    return this.upright;
  }

  public TextHorzOverflowTypeValueModel getHorzOverflow() {
    return this.horzOverflow;
  }

  public Coordinate32ValueModel getRIns() {
    return this.rIns;
  }

  public BooleanValueModel getRtlCol() {
    return this.rtlCol;
  }

  public BooleanValueModel getForceAA() {
    return this.forceAA;
  }

  public TextAnchoringTypeValueModel getAnchor() {
    return this.anchor;
  }

  public PresetTextShapeModel getPrstTxWarp() {
    return this.prstTxWarp;
  }

  public TextAutofitModel getEGTextAutofit() {
    return this.egTextAutofit;
  }

  public Scene3DModel getScene3D() {
    return this.scene3d;
  }

  public Text3DModel getEGText3D() {
    return this.egText3D;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  public static class TextAutofitModel {
    private final int type;

    private final Object value;

    public TextAutofitModel() {
      this(-1, null);
    }

    private TextAutofitModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static TextAutofitModel newNoAutofit(TextNoAutofitModel value) {
      return new TextAutofitModel(0, value);
    }

    public boolean isNoAutofit() {
      return this.type == 0;
    }

    public TextNoAutofitModel getNoAutofit() {
      return (TextNoAutofitModel) this.value;
    }

    public static TextAutofitModel newNormAutofit(TextNormalAutofitModel value) {
      return new TextAutofitModel(1, value);
    }

    public boolean isNormAutofit() {
      return this.type == 1;
    }

    public TextNormalAutofitModel getNormAutofit() {
      return (TextNormalAutofitModel) this.value;
    }

    public static TextAutofitModel newSpAutoFit(TextShapeAutofitModel value) {
      return new TextAutofitModel(2, value);
    }

    public boolean isSpAutoFit() {
      return this.type == 2;
    }

    public TextShapeAutofitModel getSpAutoFit() {
      return (TextShapeAutofitModel) this.value;
    }
  }

  public static class Text3DModel {
    private final int type;

    private final Object value;

    public Text3DModel() {
      this(-1, null);
    }

    private Text3DModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static Text3DModel newSp3D(Shape3DModel value) {
      return new Text3DModel(0, value);
    }

    public boolean isSp3D() {
      return this.type == 0;
    }

    public Shape3DModel getSp3D() {
      return (Shape3DModel) this.value;
    }

    public static Text3DModel newFlatTx(FlatTextModel value) {
      return new Text3DModel(1, value);
    }

    public boolean isFlatTx() {
      return this.type == 1;
    }

    public FlatTextModel getFlatTx() {
      return (FlatTextModel) this.value;
    }
  }
}
