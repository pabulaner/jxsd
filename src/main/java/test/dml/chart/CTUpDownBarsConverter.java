package test.dml.chart;

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
import test.dml.chart.CTUpDownBarsModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTUpDownBarsConverter
{
	
	private CTUpDownBarsConverter() {
		// empty
	}
	
	public static CTUpDownBarsModel fromDocx4j(CTUpDownBars value)
	{
		return new CTUpDownBarsModel(
		CTGapAmountConverter.fromDocx4j(value.getGapWidth())
		,
		CTUpDownBarConverter.fromDocx4j(value.getUpBars())
		,
		CTUpDownBarConverter.fromDocx4j(value.getDownBars())
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
