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
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.chart.CTNumDataModel.*;
import test.officeDocument.relationships.*;

public class CTNumDataConverter
{
	
	private CTNumDataConverter() {
		// empty
	}
	
	public static CTNumDataModel fromDocx4j(CTNumData value)
	{
		return new CTNumDataModel(
		STXstringConverter.fromDocx4j(value.getFormatCode())
		,
		CTUnsignedIntConverter.fromDocx4j(value.getPtCount())
		,
		value.getPt().stream().map(CTNumValConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
