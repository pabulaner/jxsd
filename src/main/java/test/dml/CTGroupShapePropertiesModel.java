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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import test.dml.CTGroupShapePropertiesModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTGroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.*;
import test.officeDocument.relationships.*;
import test.dml.CTGroupShapePropertiesModel.EffectLstOrEffectDagModel.*;

public class CTGroupShapePropertiesModel
{
	
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
	private final CTGroupTransform2DModel xfrm;
	private final NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;
	private final EffectLstOrEffectDagModel effectLstOrEffectDag;
	private final CTScene3DModel scene3d;
	private final CTOfficeArtExtensionListModel extLst;
	
	public CTGroupShapePropertiesModel(STBlackWhiteModeModel bwMode, CTGroupTransform2DModel xfrm, NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill, EffectLstOrEffectDagModel effectLstOrEffectDag, CTScene3DModel scene3d, CTOfficeArtExtensionListModel extLst) {
		this.bwMode = bwMode;
		this.xfrm = xfrm;
		this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
		this.effectLstOrEffectDag = effectLstOrEffectDag;
		this.scene3d = scene3d;
		this.extLst = extLst;
	}
	
	public STBlackWhiteModeModel getBwMode() {
		return this.bwMode;
	}
	public CTGroupTransform2DModel getXfrm() {
		return this.xfrm;
	}
	public NoFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
		return this.noFillOrSolidFillOrGradFill;
	}
	public EffectLstOrEffectDagModel getEffectLstOrEffectDag() {
		return this.effectLstOrEffectDag;
	}
	public CTScene3DModel getScene3d() {
		return this.scene3d;
	}
	public CTOfficeArtExtensionListModel getExtLst() {
		return this.extLst;
	}
}
