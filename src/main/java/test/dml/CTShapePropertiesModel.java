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
import test.dml.CTShapePropertiesModel.*;
import test.dml.CTShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import test.dml.CTShapePropertiesModel.EffectLstOrEffectDagModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTShapePropertiesModel.CustGeomOrPrstGeomModel.*;
import test.officeDocument.relationships.*;

public class CTShapePropertiesModel
{
	
	public static class CustGeomOrPrstGeomModel
	{
		
		private final CTCustomGeometry2DModel custGeom;
		private final CTPresetGeometry2DModel prstGeom;
		
		public CustGeomOrPrstGeomModel(CTCustomGeometry2DModel custGeom, CTPresetGeometry2DModel prstGeom) {
			this.custGeom = custGeom;
			this.prstGeom = prstGeom;
		}
		
		public CTCustomGeometry2DModel getCustGeom() {
			return this.custGeom;
		}
		public CTPresetGeometry2DModel getPrstGeom() {
			return this.prstGeom;
		}
	}
	public static class NoFillOrSolidFillOrGradFillModel
	{
		
		private final CTNoFillPropertiesModel noFill;
		private final CTSolidColorFillPropertiesModel solidFill;
		private final CTGradientFillPropertiesModel gradFill;
		private final CTBlipFillPropertiesModel blipFill;
		private final CTPatternFillPropertiesModel pattFill;
		private final CTGroupFillPropertiesModel grpFill;
		
		public NoFillOrSolidFillOrGradFillModel(CTNoFillPropertiesModel noFill, CTSolidColorFillPropertiesModel solidFill, CTGradientFillPropertiesModel gradFill, CTBlipFillPropertiesModel blipFill, CTPatternFillPropertiesModel pattFill, CTGroupFillPropertiesModel grpFill) {
			this.noFill = noFill;
			this.solidFill = solidFill;
			this.gradFill = gradFill;
			this.blipFill = blipFill;
			this.pattFill = pattFill;
			this.grpFill = grpFill;
		}
		
		public CTNoFillPropertiesModel getNoFill() {
			return this.noFill;
		}
		public CTSolidColorFillPropertiesModel getSolidFill() {
			return this.solidFill;
		}
		public CTGradientFillPropertiesModel getGradFill() {
			return this.gradFill;
		}
		public CTBlipFillPropertiesModel getBlipFill() {
			return this.blipFill;
		}
		public CTPatternFillPropertiesModel getPattFill() {
			return this.pattFill;
		}
		public CTGroupFillPropertiesModel getGrpFill() {
			return this.grpFill;
		}
	}
	public static class EffectLstOrEffectDagModel
	{
		
		private final CTEffectListModel effectLst;
		private final CTEffectContainerModel effectDag;
		
		public EffectLstOrEffectDagModel(CTEffectListModel effectLst, CTEffectContainerModel effectDag) {
			this.effectLst = effectLst;
			this.effectDag = effectDag;
		}
		
		public CTEffectListModel getEffectLst() {
			return this.effectLst;
		}
		public CTEffectContainerModel getEffectDag() {
			return this.effectDag;
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
