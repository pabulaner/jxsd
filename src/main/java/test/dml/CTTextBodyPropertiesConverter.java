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

public class CTTextBodyPropertiesConverter
{
	
	public static class NoAutofitOrNormAutofitOrSpAutoFitConverter
	{
		
		private CTTextBodyPropertiesConverter() {
			// empty
		}
		
		public static CTTextBodyPropertiesModel fromDocx4j(CTTextBodyProperties value)
		{
			return new NoAutofitOrNormAutofitOrSpAutoFitModel(
			CTTextNoAutofitConverter.fromDocx4j(value.getNoAutofit())
			,
			CTTextNormalAutofitConverter.fromDocx4j(value.getNormAutofit())
			,
			CTTextShapeAutofitConverter.fromDocx4j(value.getSpAutoFit())
			
			);
		}
	}
	public static class Sp3dOrFlatTxConverter
	{
		
		private CTTextBodyPropertiesConverter() {
			// empty
		}
		
		public static CTTextBodyPropertiesModel fromDocx4j(CTTextBodyProperties value)
		{
			return new Sp3dOrFlatTxModel(
			CTShape3DConverter.fromDocx4j(value.getSp3d())
			,
			CTFlatTextConverter.fromDocx4j(value.getFlatTx())
			
			);
		}
	}
	private CTTextBodyPropertiesConverter() {
		// empty
	}
	
	public static CTTextBodyPropertiesModel fromDocx4j(CTTextBodyProperties value)
	{
		return new CTTextBodyPropertiesModel(
		BooleanConverter.fromDocx4j(value.getCompatLnSpc())
		,
		STTextVertOverflowTypeConverter.fromDocx4j(value.getVertOverflow())
		,
		STCoordinate32Converter.fromDocx4j(value.getBIns())
		,
		STTextVerticalTypeConverter.fromDocx4j(value.getVert())
		,
		BooleanConverter.fromDocx4j(value.getAnchorCtr())
		,
		STTextColumnCountConverter.fromDocx4j(value.getNumCol())
		,
		STAngleConverter.fromDocx4j(value.getRot())
		,
		STCoordinate32Converter.fromDocx4j(value.getTIns())
		,
		STCoordinate32Converter.fromDocx4j(value.getLIns())
		,
		STPositiveCoordinate32Converter.fromDocx4j(value.getSpcCol())
		,
		STTextWrappingTypeConverter.fromDocx4j(value.getWrap())
		,
		BooleanConverter.fromDocx4j(value.getFromWordArt())
		,
		BooleanConverter.fromDocx4j(value.getSpcFirstLastPara())
		,
		BooleanConverter.fromDocx4j(value.getUpright())
		,
		STTextHorzOverflowTypeConverter.fromDocx4j(value.getHorzOverflow())
		,
		STCoordinate32Converter.fromDocx4j(value.getRIns())
		,
		BooleanConverter.fromDocx4j(value.getRtlCol())
		,
		BooleanConverter.fromDocx4j(value.getForceAA())
		,
		STTextAnchoringTypeConverter.fromDocx4j(value.getAnchor())
		,
		CTPresetTextShapeConverter.fromDocx4j(value.getPrstTxWarp())
		,
		NoAutofitOrNormAutofitOrSpAutoFitConverter.fromDocx4j(value.getNoAutofitOrNormAutofitOrSpAutoFit())
		,
		CTScene3DConverter.fromDocx4j(value.getScene3d())
		,
		Sp3dOrFlatTxConverter.fromDocx4j(value.getSp3dOrFlatTx())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
