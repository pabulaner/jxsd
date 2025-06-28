package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.main.CTGroupShapePropertiesModel.EffectLstOrEffectDagModel.*;
import test.drawingml.chart.*;
import test.drawingml.main.CTGroupShapePropertiesModel.NoFillOrSolidFillOrGradFillModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.main.CTGroupShapePropertiesModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTGroupShapePropertiesModel
{
	
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
