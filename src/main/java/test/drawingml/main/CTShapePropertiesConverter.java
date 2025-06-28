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

// SEQUENCE CONVERTER
public class CTShapePropertiesConverter
{
	
	// CHOICE CONVERTER
	public static class CustGeomOrPrstGeomConverter
	{
		
		private CustGeomOrPrstGeomConverter() {
			// empty
		}
		
		public static CustGeomOrPrstGeomModel fromDocx4j(CustGeomOrPrstGeom value)
		{
			if (value.getCustGeom() != null) return CustGeomOrPrstGeomModel.createCustGeom(
			CTCustomGeometry2DConverter.fromDocx4j(value.getCustGeom())
			);
			if (value.getPrstGeom() != null) return CustGeomOrPrstGeomModel.createPrstGeom(
			CTPresetGeometry2DConverter.fromDocx4j(value.getPrstGeom())
			);
			
			return new CustGeomOrPrstGeomModel();
		}
	}
	// CHOICE CONVERTER
	public static class NoFillOrSolidFillOrGradFillConverter
	{
		
		private NoFillOrSolidFillOrGradFillConverter() {
			// empty
		}
		
		public static NoFillOrSolidFillOrGradFillModel fromDocx4j(NoFillOrSolidFillOrGradFill value)
		{
			if (value.getNoFill() != null) return NoFillOrSolidFillOrGradFillModel.createNoFill(
			CTNoFillPropertiesConverter.fromDocx4j(value.getNoFill())
			);
			// THIS IS A JAVA CHOICE
			if (value.getScrgbClr != null) return CTSolidColorFillPropertiesModel.createScrgbClr(
			CTScRgbColorConverter.fromDocx4j(value.getScrgbClr())
			);
			if (value.getSrgbClr != null) return CTSolidColorFillPropertiesModel.createSrgbClr(
			CTSRgbColorConverter.fromDocx4j(value.getSrgbClr())
			);
			if (value.getHslClr != null) return CTSolidColorFillPropertiesModel.createHslClr(
			CTHslColorConverter.fromDocx4j(value.getHslClr())
			);
			if (value.getSysClr != null) return CTSolidColorFillPropertiesModel.createSysClr(
			CTSystemColorConverter.fromDocx4j(value.getSysClr())
			);
			if (value.getSchemeClr != null) return CTSolidColorFillPropertiesModel.createSchemeClr(
			CTSchemeColorConverter.fromDocx4j(value.getSchemeClr())
			);
			if (value.getPrstClr != null) return CTSolidColorFillPropertiesModel.createPrstClr(
			CTPresetColorConverter.fromDocx4j(value.getPrstClr())
			);
			// THIS IS A JAVA CHOICE END
			if (value.getGradFill() != null) return NoFillOrSolidFillOrGradFillModel.createGradFill(
			CTGradientFillPropertiesConverter.fromDocx4j(value.getGradFill())
			);
			if (value.getBlipFill() != null) return NoFillOrSolidFillOrGradFillModel.createBlipFill(
			CTBlipFillPropertiesConverter.fromDocx4j(value.getBlipFill())
			);
			if (value.getPattFill() != null) return NoFillOrSolidFillOrGradFillModel.createPattFill(
			CTPatternFillPropertiesConverter.fromDocx4j(value.getPattFill())
			);
			if (value.getGrpFill() != null) return NoFillOrSolidFillOrGradFillModel.createGrpFill(
			CTGroupFillPropertiesConverter.fromDocx4j(value.getGrpFill())
			);
			
			return new NoFillOrSolidFillOrGradFillModel();
		}
	}
	// CHOICE CONVERTER
	public static class EffectLstOrEffectDagConverter
	{
		
		private EffectLstOrEffectDagConverter() {
			// empty
		}
		
		public static EffectLstOrEffectDagModel fromDocx4j(EffectLstOrEffectDag value)
		{
			if (value.getEffectLst() != null) return EffectLstOrEffectDagModel.createEffectLst(
			CTEffectListConverter.fromDocx4j(value.getEffectLst())
			);
			if (value.getEffectDag() != null) return EffectLstOrEffectDagModel.createEffectDag(
			CTEffectContainerConverter.fromDocx4j(value.getEffectDag())
			);
			
			return new EffectLstOrEffectDagModel();
		}
	}
	private CTShapePropertiesConverter() {
		// empty
	}
	
	public static CTShapePropertiesModel fromDocx4j(CTShapeProperties value)
	{
		return new CTShapePropertiesModel(
		STBlackWhiteModeConverter.fromDocx4j(value.getBwMode())
		,
		CTTransform2DConverter.fromDocx4j(value.getXfrm())
		,
		CustGeomOrPrstGeomConverter.fromDocx4j(value.getCustGeomOrPrstGeom())
		,
		NoFillOrSolidFillOrGradFillConverter.fromDocx4j(value.getNoFillOrSolidFillOrGradFill())
		,
		CTLinePropertiesConverter.fromDocx4j(value.getLn())
		,
		EffectLstOrEffectDagConverter.fromDocx4j(value.getEffectLstOrEffectDag())
		,
		CTScene3DConverter.fromDocx4j(value.getScene3d())
		,
		CTShape3DConverter.fromDocx4j(value.getSp3d())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
