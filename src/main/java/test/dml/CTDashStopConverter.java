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
import test.dml.CTDashStopModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTDashStopConverter
{
	
	private CTDashStopConverter() {
		// empty
	}
	
	public static CTDashStopModel fromDocx4j(CTDashStop value)
	{
		return new CTDashStopModel(
		STPositivePercentageConverter.fromDocx4j(value.getSp())
		,
		STPositivePercentageConverter.fromDocx4j(value.getD())
		
		);
	}
}
