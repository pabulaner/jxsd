package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.CTTextBodyPropertiesModel.*;
import test.dml.CTTextBodyPropertiesModel.NoAutofitOrNormAutofitOrSpAutoFitModel.*;
import test.dml.CTTextBodyPropertiesModel.Sp3dOrFlatTxModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTTextBodyPropertiesModel
{
	
	public static class NoAutofitOrNormAutofitOrSpAutoFitModel
	{
		
		private final CTTextNoAutofitModel noAutofit;
		private final CTTextNormalAutofitModel normAutofit;
		private final CTTextShapeAutofitModel spAutoFit;
		
		public NoAutofitOrNormAutofitOrSpAutoFitModel(CTTextNoAutofitModel noAutofit, CTTextNormalAutofitModel normAutofit, CTTextShapeAutofitModel spAutoFit) {
			this.noAutofit = noAutofit;
			this.normAutofit = normAutofit;
			this.spAutoFit = spAutoFit;
		}
		
		public CTTextNoAutofitModel getNoAutofit() {
			return this.noAutofit;
		}
		public CTTextNormalAutofitModel getNormAutofit() {
			return this.normAutofit;
		}
		public CTTextShapeAutofitModel getSpAutoFit() {
			return this.spAutoFit;
		}
	}
	public static class Sp3dOrFlatTxModel
	{
		
		private final CTShape3DModel sp3d;
		private final CTFlatTextModel flatTx;
		
		public Sp3dOrFlatTxModel(CTShape3DModel sp3d, CTFlatTextModel flatTx) {
			this.sp3d = sp3d;
			this.flatTx = flatTx;
		}
		
		public CTShape3DModel getSp3d() {
			return this.sp3d;
		}
		public CTFlatTextModel getFlatTx() {
			return this.flatTx;
		}
	}
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
	
	public CTTextBodyPropertiesModel(BooleanModel compatLnSpc, STTextVertOverflowTypeModel vertOverflow, STCoordinate32Model bIns, STTextVerticalTypeModel vert, BooleanModel anchorCtr, STTextColumnCountModel numCol, STAngleModel rot, STCoordinate32Model tIns, STCoordinate32Model lIns, STPositiveCoordinate32Model spcCol, STTextWrappingTypeModel wrap, BooleanModel fromWordArt, BooleanModel spcFirstLastPara, BooleanModel upright, STTextHorzOverflowTypeModel horzOverflow, STCoordinate32Model rIns, BooleanModel rtlCol, BooleanModel forceAA, STTextAnchoringTypeModel anchor, CTPresetTextShapeModel prstTxWarp, NoAutofitOrNormAutofitOrSpAutoFitModel noAutofitOrNormAutofitOrSpAutoFit, CTScene3DModel scene3d, Sp3dOrFlatTxModel sp3dOrFlatTx, CTOfficeArtExtensionListModel extLst) {
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
}
