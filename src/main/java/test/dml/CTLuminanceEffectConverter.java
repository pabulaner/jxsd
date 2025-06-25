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
import test.dml.CTLuminanceEffectModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTLuminanceEffectConverter
{
	
	private CTLuminanceEffectConverter() {
		// empty
	}
	
	public static CTLuminanceEffectModel fromDocx4j(CTLuminanceEffect value)
	{
		return new CTLuminanceEffectModel(
		STFixedPercentageConverter.fromDocx4j(value.getContrast())
		,
		STFixedPercentageConverter.fromDocx4j(value.getBright())
		
		);
	}
}
