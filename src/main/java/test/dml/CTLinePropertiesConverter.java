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
import test.dml.CTLinePropertiesModel.PrstDashOrCustDashModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import test.dml.CTLinePropertiesModel.*;
import org.docx4j.dml.*;
import test.dml.CTLinePropertiesModel.NoFillOrSolidFillOrGradFillModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTLinePropertiesModel.RoundOrBevelOrMiterModel.*;
import test.officeDocument.relationships.*;

public class CTLinePropertiesConverter
{
	
	public static class NoFillOrSolidFillOrGradFillConverter
	{
		
		private CTLinePropertiesConverter() {
			// empty
		}
		
		public static CTLinePropertiesModel fromDocx4j(CTLineProperties value)
		{
			return new NoFillOrSolidFillOrGradFillModel(
			CTNoFillPropertiesConverter.fromDocx4j(value.getNoFill())
			,
			CTSolidColorFillPropertiesConverter.fromDocx4j(value.getSolidFill())
			,
			CTGradientFillPropertiesConverter.fromDocx4j(value.getGradFill())
			,
			CTPatternFillPropertiesConverter.fromDocx4j(value.getPattFill())
			
			);
		}
	}
	public static class PrstDashOrCustDashConverter
	{
		
		private CTLinePropertiesConverter() {
			// empty
		}
		
		public static CTLinePropertiesModel fromDocx4j(CTLineProperties value)
		{
			return new PrstDashOrCustDashModel(
			CTPresetLineDashPropertiesConverter.fromDocx4j(value.getPrstDash())
			,
			CTDashStopListConverter.fromDocx4j(value.getCustDash())
			
			);
		}
	}
	public static class RoundOrBevelOrMiterConverter
	{
		
		private CTLinePropertiesConverter() {
			// empty
		}
		
		public static CTLinePropertiesModel fromDocx4j(CTLineProperties value)
		{
			return new RoundOrBevelOrMiterModel(
			CTLineJoinRoundConverter.fromDocx4j(value.getRound())
			,
			CTLineJoinBevelConverter.fromDocx4j(value.getBevel())
			,
			CTLineJoinMiterPropertiesConverter.fromDocx4j(value.getMiter())
			
			);
		}
	}
	private CTLinePropertiesConverter() {
		// empty
	}
	
	public static CTLinePropertiesModel fromDocx4j(CTLineProperties value)
	{
		return new CTLinePropertiesModel(
		STLineWidthConverter.fromDocx4j(value.getW())
		,
		STLineCapConverter.fromDocx4j(value.getCap())
		,
		STCompoundLineConverter.fromDocx4j(value.getCmpd())
		,
		STPenAlignmentConverter.fromDocx4j(value.getAlgn())
		,
		NoFillOrSolidFillOrGradFillConverter.fromDocx4j(value.getNoFillOrSolidFillOrGradFill())
		,
		PrstDashOrCustDashConverter.fromDocx4j(value.getPrstDashOrCustDash())
		,
		RoundOrBevelOrMiterConverter.fromDocx4j(value.getRoundOrBevelOrMiter())
		,
		CTLineEndPropertiesConverter.fromDocx4j(value.getHeadEnd())
		,
		CTLineEndPropertiesConverter.fromDocx4j(value.getTailEnd())
		,
		CTOfficeArtExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
