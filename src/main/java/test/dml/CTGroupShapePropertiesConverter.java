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

public class CTGroupShapePropertiesConverter
{
	
	public static class NoFillOrSolidFillOrGradFillConverter
	{
		
		private CTGroupShapePropertiesConverter() {
			// empty
		}
		
		public static CTGroupShapePropertiesModel fromDocx4j(CTGroupShapeProperties value)
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
		
		private CTGroupShapePropertiesConverter() {
			// empty
		}
		
		public static CTGroupShapePropertiesModel fromDocx4j(CTGroupShapeProperties value)
		{
			return new EffectLstOrEffectDagModel(
			CTEffectListConverter.fromDocx4j(value.getEffectLst())
			,
			CTEffectContainerConverter.fromDocx4j(value.getEffectDag())
			
			);
		}
	}
	private CTGroupShapePropertiesConverter() {
		// empty
	}
	
	public static CTGroupShapePropertiesModel fromDocx4j(CTGroupShapeProperties value)
	{
		return new CTGroupShapePropertiesModel(
		STBlackWhiteModeConverter.fromDocx4j(value.getBwMode())
		,
		CTGroupTransform2DConverter.fromDocx4j(value.getXfrm())
		,
		NoFillOrSolidFillOrGradFillConverter.fromDocx4j(value.getNoFillOrSolidFillOrGradFill())
		,
		EffectLstOrEffectDagConverter.fromDocx4j(value.getEffectLstOrEffectDag())
		,
		CTScene3DConverter.fromDocx4j(value.getScene3d())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
