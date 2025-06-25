package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTAlphaModulateFixedEffectModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTAlphaModulateFixedEffectConverter
{
	
	private CTAlphaModulateFixedEffectConverter() {
		// empty
	}
	
	public static CTAlphaModulateFixedEffectModel fromDocx4j(CTAlphaModulateFixedEffect value)
	{
		return new CTAlphaModulateFixedEffectModel(
		STPositivePercentageConverter.fromDocx4j(value.getAmt())
		
		);
	}
}
