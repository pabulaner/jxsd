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
import test.dml.CTTintEffectModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTTintEffectConverter
{
	
	private CTTintEffectConverter() {
		// empty
	}
	
	public static CTTintEffectModel fromDocx4j(CTTintEffect value)
	{
		return new CTTintEffectModel(
		STPositiveFixedAngleConverter.fromDocx4j(value.getHue())
		,
		STFixedPercentageConverter.fromDocx4j(value.getAmt())
		
		);
	}
}
