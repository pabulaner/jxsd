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
import test.dml.CTFillOverlayEffectModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTFillOverlayEffectModel.NoFillOrSolidFillOrGradFillModel.*;
import test.officeDocument.relationships.*;

public class CTFillOverlayEffectModel
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
	private final STBlendModeModel blend;
	private final NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill;
	
	public CTFillOverlayEffectModel(STBlendModeModel blend, NoFillOrSolidFillOrGradFillModel noFillOrSolidFillOrGradFill) {
		this.blend = blend;
		this.noFillOrSolidFillOrGradFill = noFillOrSolidFillOrGradFill;
	}
	
	public STBlendModeModel getBlend() {
		return this.blend;
	}
	public NoFillOrSolidFillOrGradFillModel getNoFillOrSolidFillOrGradFill() {
		return this.noFillOrSolidFillOrGradFill;
	}
}
