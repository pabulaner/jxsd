package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.drawingml.main.CTShapePropertiesModel.CustGeomOrPrstGeomModel.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.drawingml.main.CTShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.*;
import test.XMLSchema.*;
import test.drawingml.main.CTShapePropertiesModel.EffectLstOrEffectDagModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;
import test.drawingml.main.CTShapePropertiesModel.*;

// SEQUENCE MODEL
public class CTShapePropertiesModel
{
	
	// CHOICE MODEL
	public static class CustGeomOrPrstGeomModel
	{
		
		private final int type;
		
		private final Object value;
		
		public CustGeomOrPrstGeomModel() {
			this(-1, null);
		}
		
		private CustGeomOrPrstGeomModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static CustGeomOrPrstGeomModel createCustGeom(CTCustomGeometry2DModel value) {
			return new CustGeomOrPrstGeomModel(0, value);
		}
		public static CustGeomOrPrstGeomModel createPrstGeom(CTPresetGeometry2DModel value) {
			return new CustGeomOrPrstGeomModel(1, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isCustGeom() {
			return this.type == 0;
		}
		
		public CTCustomGeometry2DModel getCustGeom() {
			if (this.type != 0) throw new ClassCastException();
			return (CTCustomGeometry2DModel) value;
		}
		public boolean isPrstGeom() {
			return this.type == 1;
		}
		
		public CTPresetGeometry2DModel getPrstGeom() {
			if (this.type != 1) throw new ClassCastException();
			return (CTPresetGeometry2DModel) value;
		}
	}
	// CHOICE MODEL
	public static class NoFillOrSolidFillOrGradFillModel
	{
		
		private final int type;
		
		private final Object value;
		
		public NoFillOrSolidFillOrGradFillModel() {
			this(-1, null);
		}
		
		private NoFillOrSolidFillOrGradFillModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static NoFillOrSolidFillOrGradFillModel createNoFill(CTNoFillPropertiesModel value) {
			return new NoFillOrSolidFillOrGradFillModel(0, value);
		}
		public static NoFillOrSolidFillOrGradFillModel createSolidFill(CTSolidColorFillPropertiesModel value) {
			return new NoFillOrSolidFillOrGradFillModel(1, value);
		}
		public static NoFillOrSolidFillOrGradFillModel createGradFill(CTGradientFillPropertiesModel value) {
			return new NoFillOrSolidFillOrGradFillModel(2, value);
		}
		public static NoFillOrSolidFillOrGradFillModel createBlipFill(CTBlipFillPropertiesModel value) {
			return new NoFillOrSolidFillOrGradFillModel(3, value);
		}
		public static NoFillOrSolidFillOrGradFillModel createPattFill(CTPatternFillPropertiesModel value) {
			return new NoFillOrSolidFillOrGradFillModel(4, value);
		}
		public static NoFillOrSolidFillOrGradFillModel createGrpFill(CTGroupFillPropertiesModel value) {
			return new NoFillOrSolidFillOrGradFillModel(5, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isNoFill() {
			return this.type == 0;
		}
		
		public CTNoFillPropertiesModel getNoFill() {
			if (this.type != 0) throw new ClassCastException();
			return (CTNoFillPropertiesModel) value;
		}
		public boolean isSolidFill() {
			return this.type == 1;
		}
		
		public CTSolidColorFillPropertiesModel getSolidFill() {
			if (this.type != 1) throw new ClassCastException();
			return (CTSolidColorFillPropertiesModel) value;
		}
		public boolean isGradFill() {
			return this.type == 2;
		}
		
		public CTGradientFillPropertiesModel getGradFill() {
			if (this.type != 2) throw new ClassCastException();
			return (CTGradientFillPropertiesModel) value;
		}
		public boolean isBlipFill() {
			return this.type == 3;
		}
		
		public CTBlipFillPropertiesModel getBlipFill() {
			if (this.type != 3) throw new ClassCastException();
			return (CTBlipFillPropertiesModel) value;
		}
		public boolean isPattFill() {
			return this.type == 4;
		}
		
		public CTPatternFillPropertiesModel getPattFill() {
			if (this.type != 4) throw new ClassCastException();
			return (CTPatternFillPropertiesModel) value;
		}
		public boolean isGrpFill() {
			return this.type == 5;
		}
		
		public CTGroupFillPropertiesModel getGrpFill() {
			if (this.type != 5) throw new ClassCastException();
			return (CTGroupFillPropertiesModel) value;
		}
	}
	// CHOICE MODEL
	public static class EffectLstOrEffectDagModel
	{
		
		private final int type;
		
		private final Object value;
		
		public EffectLstOrEffectDagModel() {
			this(-1, null);
		}
		
		private EffectLstOrEffectDagModel(int type, Object value) {
			this.type = type;
			this.value = value;
		}
		
		public static EffectLstOrEffectDagModel createEffectLst(CTEffectListModel value) {
			return new EffectLstOrEffectDagModel(0, value);
		}
		public static EffectLstOrEffectDagModel createEffectDag(CTEffectContainerModel value) {
			return new EffectLstOrEffectDagModel(1, value);
		}
		
		public Object getRaw() {
			return this.value;
		}
		
		public boolean isEffectLst() {
			return this.type == 0;
		}
		
		public CTEffectListModel getEffectLst() {
			if (this.type != 0) throw new ClassCastException();
			return (CTEffectListModel) value;
		}
		public boolean isEffectDag() {
			return this.type == 1;
		}
		
		public CTEffectContainerModel getEffectDag() {
			if (this.type != 1) throw new ClassCastException();
			return (CTEffectContainerModel) value;
		}
	}
	private final STBlackWhiteModeModel bwMode;
	private final CTTransform2DModel xfrm;
	private final CustGeomOrPrstGeomModel custGeomOrPrstGeom;
	private final NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;
	private final CTLinePropertiesModel ln;
	private final EffectLstOrEffectDagModel effectLstOrEffectDag;
	private final CTScene3DModel scene3d;
	private final CTShape3DModel sp3d;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTShapePropertiesModel(STBlackWhiteModeModel bwMode, CTTransform2DModel xfrm, CustGeomOrPrstGeomModel custGeomOrPrstGeom, NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill, CTLinePropertiesModel ln, EffectLstOrEffectDagModel effectLstOrEffectDag, CTScene3DModel scene3d, CTShape3DModel sp3d, CTOfficeArtExtensionListModel extLst) {
		this.bwMode = bwMode;
		this.xfrm = xfrm;
		this.custGeomOrPrstGeom = custGeomOrPrstGeom;
		this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
		this.ln = ln;
		this.effectLstOrEffectDag = effectLstOrEffectDag;
		this.scene3d = scene3d;
		this.sp3d = sp3d;
		this.extLst = extLst;
	}
	
	public STBlackWhiteModeModel getBwMode() {
		return this.bwMode;
	}
	public CTTransform2DModel getXfrm() {
		return this.xfrm;
	}
	public CustGeomOrPrstGeomModel getCustGeomOrPrstGeom() {
		return this.custGeomOrPrstGeom;
	}
	public NoFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
		return this.noFillOrSolidFillOrGradFill;
	}
	public CTLinePropertiesModel getLn() {
		return this.ln;
	}
	public EffectLstOrEffectDagModel getEffectLstOrEffectDag() {
		return this.effectLstOrEffectDag;
	}
	public CTScene3DModel getScene3d() {
		return this.scene3d;
	}
	public CTShape3DModel getSp3d() {
		return this.sp3d;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
