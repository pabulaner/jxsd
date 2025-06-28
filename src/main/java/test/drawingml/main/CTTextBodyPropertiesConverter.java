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
import test.drawingml.main.CTTextBodyPropertiesModel.NoAutofitOrNormAutofitOrSpAutoFitModel.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import test.drawingml.main.CTTextBodyPropertiesModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTTextBodyPropertiesModel.Sp3dOrFlatTxModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTTextBodyPropertiesConverter
{
	
	// CHOICE CONVERTER
	public static class NoAutofitOrNormAutofitOrSpAutoFitConverter
	{
		
		private NoAutofitOrNormAutofitOrSpAutoFitConverter() {
			// empty
		}
		
		public static NoAutofitOrNormAutofitOrSpAutoFitModel fromDocx4j(NoAutofitOrNormAutofitOrSpAutoFit value)
		{
			if (value.getNoAutofit() != null) return NoAutofitOrNormAutofitOrSpAutoFitModel.createNoAutofit(
			CTTextNoAutofitConverter.fromDocx4j(value.getNoAutofit())
			);
			if (value.getNormAutofit() != null) return NoAutofitOrNormAutofitOrSpAutoFitModel.createNormAutofit(
			CTTextNormalAutofitConverter.fromDocx4j(value.getNormAutofit())
			);
			if (value.getSpAutoFit() != null) return NoAutofitOrNormAutofitOrSpAutoFitModel.createSpAutoFit(
			CTTextShapeAutofitConverter.fromDocx4j(value.getSpAutoFit())
			);
			
			return new NoAutofitOrNormAutofitOrSpAutoFitModel();
		}
	}
	// CHOICE CONVERTER
	public static class Sp3dOrFlatTxConverter
	{
		
		private Sp3dOrFlatTxConverter() {
			// empty
		}
		
		public static Sp3dOrFlatTxModel fromDocx4j(Sp3dOrFlatTx value)
		{
			if (value.getSp3d() != null) return Sp3dOrFlatTxModel.createSp3d(
			CTShape3DConverter.fromDocx4j(value.getSp3d())
			);
			if (value.getFlatTx() != null) return Sp3dOrFlatTxModel.createFlatTx(
			CTFlatTextConverter.fromDocx4j(value.getFlatTx())
			);
			
			return new Sp3dOrFlatTxModel();
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
