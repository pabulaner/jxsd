package com.scell.model.drawingml.main;

import com.scell.model.XMLSchema.BooleanModel;
import java.lang.Integer;
import java.lang.Object;

public class TextBodyPropertiesModel {
  private final BooleanModel compatLnSpc;

  private final TextVertOverflowTypeModel vertOverflow;

  private final Coordinate32Model bIns;

  private final TextVerticalTypeModel vert;

  private final BooleanModel anchorCtr;

  private final TextColumnCountModel numCol;

  private final AngleModel rot;

  private final Coordinate32Model tIns;

  private final Coordinate32Model lIns;

  private final PositiveCoordinate32Model spcCol;

  private final TextWrappingTypeModel wrap;

  private final BooleanModel fromWordArt;

  private final BooleanModel spcFirstLastPara;

  private final BooleanModel upright;

  private final TextHorzOverflowTypeModel horzOverflow;

  private final Coordinate32Model rIns;

  private final BooleanModel rtlCol;

  private final BooleanModel forceAA;

  private final TextAnchoringTypeModel anchor;

  private final PresetTextShapeModel prstTxWarp;

  private final TextAutofitModel egTextAutofit;

  private final Scene3DModel scene3d;

  private final Text3DModel egText3D;

  private final OfficeArtExtensionListModel extLst;

  public TextBodyPropertiesModel(BooleanModel compatLnSpc, TextVertOverflowTypeModel vertOverflow,
      Coordinate32Model bIns, TextVerticalTypeModel vert, BooleanModel anchorCtr,
      TextColumnCountModel numCol, AngleModel rot, Coordinate32Model tIns, Coordinate32Model lIns,
      PositiveCoordinate32Model spcCol, TextWrappingTypeModel wrap, BooleanModel fromWordArt,
      BooleanModel spcFirstLastPara, BooleanModel upright, TextHorzOverflowTypeModel horzOverflow,
      Coordinate32Model rIns, BooleanModel rtlCol, BooleanModel forceAA,
      TextAnchoringTypeModel anchor, PresetTextShapeModel prstTxWarp,
      TextAutofitModel egTextAutofit, Scene3DModel scene3d, Text3DModel egText3D,
      OfficeArtExtensionListModel extLst) {
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

  public BooleanModel getCompatLnSpc() {
    return this.compatLnSpc;
  }

  public TextVertOverflowTypeModel getVertOverflow() {
    return this.vertOverflow;
  }

  public Coordinate32Model getBIns() {
    return this.bIns;
  }

  public TextVerticalTypeModel getVert() {
    return this.vert;
  }

  public BooleanModel getAnchorCtr() {
    return this.anchorCtr;
  }

  public TextColumnCountModel getNumCol() {
    return this.numCol;
  }

  public AngleModel getRot() {
    return this.rot;
  }

  public Coordinate32Model getTIns() {
    return this.tIns;
  }

  public Coordinate32Model getLIns() {
    return this.lIns;
  }

  public PositiveCoordinate32Model getSpcCol() {
    return this.spcCol;
  }

  public TextWrappingTypeModel getWrap() {
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

  public TextHorzOverflowTypeModel getHorzOverflow() {
    return this.horzOverflow;
  }

  public Coordinate32Model getRIns() {
    return this.rIns;
  }

  public BooleanModel getRtlCol() {
    return this.rtlCol;
  }

  public BooleanModel getForceAA() {
    return this.forceAA;
  }

  public TextAnchoringTypeModel getAnchor() {
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
