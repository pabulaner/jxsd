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

public class CTShapePropertiesConverter
{
	
	public static class CustGeomOrPrstGeomConverter
	{
		
		private CTShapePropertiesConverter() {
			// empty
		}
		
		public static CTShapePropertiesModel fromDocx4j(CTShapeProperties value)
		{
			return new CustGeomOrPrstGeomModel(
			CTCustomGeometry2DConverter.fromDocx4j(value.getCustGeom())
			,
			CTPresetGeometry2DConverter.fromDocx4j(value.getPrstGeom())
			
			);
		}
	}
	public static class NoFillOrSolidFillOrGradFillConverter
	{
		
		private CTShapePropertiesConverter() {
			// empty
		}
		
		public static CTShapePropertiesModel fromDocx4j(CTShapeProperties value)
		{
			return new NoFillOrSolidFillOrGradFillModel(
			CTNoFillPropertiesConverter.fromDocx4j(value.getNoFill())
			,
			CTSolidColorFillPropertiesConverter.fromDocx4j(value.getSolidFill())
			,
			CTGradientFillPropertiesConverter.fromDocx4j(value.getGradFill())
			,
			CTBlipFillPropertiesConverter.fromDocx4j(value.getBlipFill())
			,
			CTPatternFillPropertiesConverter.fromDocx4j(value.getPattFill())
			,
			CTGroupFillPropertiesConverter.fromDocx4j(value.getGrpFill())
			
			);
		}
	}
	public static class EffectLstOrEffectDagConverter
	{
		
		private CTShapePropertiesConverter() {
			// empty
		}
		
		public static CTShapePropertiesModel fromDocx4j(CTShapeProperties value)
		{
			return new EffectLstOrEffectDagModel(
			CTEffectListConverter.fromDocx4j(value.getEffectLst())
			,
			CTEffectContainerConverter.fromDocx4j(value.getEffectDag())
			
			);
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
