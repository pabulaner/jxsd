package jxsd.gen.model.drawingml.main;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.main.TextBodyPropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class TextBodyPropertiesModel {
  private final boolean compatLnSpc;

  private final TextVertOverflowTypeValueModel vertOverflow;

  private final int bIns;

  private final TextVerticalTypeValueModel vert;

  private final boolean anchorCtr;

  private final int numCol;

  private final int rot;

  private final int tIns;

  private final int lIns;

  private final int spcCol;

  private final TextWrappingTypeValueModel wrap;

  private final boolean fromWordArt;

  private final boolean spcFirstLastPara;

  private final boolean upright;

  private final TextHorzOverflowTypeValueModel horzOverflow;

  private final int rIns;

  private final boolean rtlCol;

  private final boolean forceAA;

  private final TextAnchoringTypeValueModel anchor;

  private final PresetTextShapeModel prstTxWarp;

  private final EG_TextAutofit egTextAutofit;

  private final Scene3DModel scene3d;

  private final EG_Text3D egText3D;

  private final OfficeArtExtensionListModel extLst;

  public TextBodyPropertiesModel(boolean compatLnSpc, TextVertOverflowTypeValueModel vertOverflow,
      int bIns, TextVerticalTypeValueModel vert, boolean anchorCtr, int numCol, int rot, int tIns,
      int lIns, int spcCol, TextWrappingTypeValueModel wrap, boolean fromWordArt,
      boolean spcFirstLastPara, boolean upright, TextHorzOverflowTypeValueModel horzOverflow,
      int rIns, boolean rtlCol, boolean forceAA, TextAnchoringTypeValueModel anchor,
      PresetTextShapeModel prstTxWarp, EG_TextAutofit egTextAutofit, Scene3DModel scene3d,
      EG_Text3D egText3D, OfficeArtExtensionListModel extLst) {
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

  public TextBodyPropertiesBuilder builder() {
    return new TextBodyPropertiesBuilder().from(this);
  }

  public boolean getCompatLnSpc() {
    return this.compatLnSpc;
  }

  public TextVertOverflowTypeValueModel getVertOverflow() {
    return this.vertOverflow;
  }

  public int getBIns() {
    return this.bIns;
  }

  public TextVerticalTypeValueModel getVert() {
    return this.vert;
  }

  public boolean getAnchorCtr() {
    return this.anchorCtr;
  }

  public int getNumCol() {
    return this.numCol;
  }

  public int getRot() {
    return this.rot;
  }

  public int getTIns() {
    return this.tIns;
  }

  public int getLIns() {
    return this.lIns;
  }

  public int getSpcCol() {
    return this.spcCol;
  }

  public TextWrappingTypeValueModel getWrap() {
    return this.wrap;
  }

  public boolean getFromWordArt() {
    return this.fromWordArt;
  }

  public boolean getSpcFirstLastPara() {
    return this.spcFirstLastPara;
  }

  public boolean getUpright() {
    return this.upright;
  }

  public TextHorzOverflowTypeValueModel getHorzOverflow() {
    return this.horzOverflow;
  }

  public int getRIns() {
    return this.rIns;
  }

  public boolean getRtlCol() {
    return this.rtlCol;
  }

  public boolean getForceAA() {
    return this.forceAA;
  }

  public TextAnchoringTypeValueModel getAnchor() {
    return this.anchor;
  }

  public PresetTextShapeModel getPrstTxWarp() {
    return this.prstTxWarp;
  }

  public EG_TextAutofit getEGTextAutofit() {
    return this.egTextAutofit;
  }

  public Scene3DModel getScene3D() {
    return this.scene3d;
  }

  public EG_Text3D getEGText3D() {
    return this.egText3D;
  }

  public OfficeArtExtensionListModel getExtLst() {
    return this.extLst;
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_TextAutofit {
    private final int type;

    private final Object value;

    public EG_TextAutofit() {
      this(-1, null);
    }

    private EG_TextAutofit(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public TextBodyPropertiesBuilder.EG_TextAutofit builder() {
      return new TextBodyPropertiesBuilder.EG_TextAutofit().from(this);
    }

    public static EG_TextAutofit newNoAutofit(TextNoAutofitModel value) {
      return new EG_TextAutofit(0, value);
    }

    public boolean isNoAutofit() {
      return this.type == 0;
    }

    public TextNoAutofitModel getNoAutofit() {
      return (TextNoAutofitModel) this.value;
    }

    public static EG_TextAutofit newNormAutofit(TextNormalAutofitModel value) {
      return new EG_TextAutofit(1, value);
    }

    public boolean isNormAutofit() {
      return this.type == 1;
    }

    public TextNormalAutofitModel getNormAutofit() {
      return (TextNormalAutofitModel) this.value;
    }

    public static EG_TextAutofit newSpAutoFit(TextShapeAutofitModel value) {
      return new EG_TextAutofit(2, value);
    }

    public boolean isSpAutoFit() {
      return this.type == 2;
    }

    public TextShapeAutofitModel getSpAutoFit() {
      return (TextShapeAutofitModel) this.value;
    }
  }

  /**
   * This is a generated choice class.
   */
  public static class EG_Text3D {
    private final int type;

    private final Object value;

    public EG_Text3D() {
      this(-1, null);
    }

    private EG_Text3D(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public TextBodyPropertiesBuilder.EG_Text3D builder() {
      return new TextBodyPropertiesBuilder.EG_Text3D().from(this);
    }

    public static EG_Text3D newSp3D(Shape3DModel value) {
      return new EG_Text3D(0, value);
    }

    public boolean isSp3D() {
      return this.type == 0;
    }

    public Shape3DModel getSp3D() {
      return (Shape3DModel) this.value;
    }

    public static EG_Text3D newFlatTx(FlatTextModel value) {
      return new EG_Text3D(1, value);
    }

    public boolean isFlatTx() {
      return this.type == 1;
    }

    public FlatTextModel getFlatTx() {
      return (FlatTextModel) this.value;
    }
  }
}
