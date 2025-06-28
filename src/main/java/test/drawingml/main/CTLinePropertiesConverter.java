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
import test.drawingml.main.CTLinePropertiesModel.RoundOrBevelOrMiterModel.*;
import test.drawingml.chart.*;
import test.drawingml.main.CTLinePropertiesModel.PrstDashOrCustDashModel.*;
import test.XMLSchema.*;
import test.drawingml.main.CTLinePropertiesModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import test.drawingml.main.CTLinePropertiesModel.NoFillOrSolidFillOrGradFillModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTLinePropertiesConverter
{
	
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
			if (value.getPattFill() != null) return NoFillOrSolidFillOrGradFillModel.createPattFill(
			CTPatternFillPropertiesConverter.fromDocx4j(value.getPattFill())
			);
			
			return new NoFillOrSolidFillOrGradFillModel();
		}
	}
	// CHOICE CONVERTER
	public static class PrstDashOrCustDashConverter
	{
		
		private PrstDashOrCustDashConverter() {
			// empty
		}
		
		public static PrstDashOrCustDashModel fromDocx4j(PrstDashOrCustDash value)
		{
			if (value.getPrstDash() != null) return PrstDashOrCustDashModel.createPrstDash(
			CTPresetLineDashPropertiesConverter.fromDocx4j(value.getPrstDash())
			);
			if (value.getCustDash() != null) return PrstDashOrCustDashModel.createCustDash(
			CTDashStopListConverter.fromDocx4j(value.getCustDash())
			);
			
			return new PrstDashOrCustDashModel();
		}
	}
	// CHOICE CONVERTER
	public static class RoundOrBevelOrMiterConverter
	{
		
		private RoundOrBevelOrMiterConverter() {
			// empty
		}
		
		public static RoundOrBevelOrMiterModel fromDocx4j(RoundOrBevelOrMiter value)
		{
			if (value.getRound() != null) return RoundOrBevelOrMiterModel.createRound(
			CTLineJoinRoundConverter.fromDocx4j(value.getRound())
			);
			if (value.getBevel() != null) return RoundOrBevelOrMiterModel.createBevel(
			CTLineJoinBevelConverter.fromDocx4j(value.getBevel())
			);
			if (value.getMiter() != null) return RoundOrBevelOrMiterModel.createMiter(
			CTLineJoinMiterPropertiesConverter.fromDocx4j(value.getMiter())
			);
			
			return new RoundOrBevelOrMiterModel();
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
