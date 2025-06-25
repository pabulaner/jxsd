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
import test.dml.chart.CTStrDataModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTStrDataConverter
{
	
	private CTStrDataConverter() {
		// empty
	}
	
	public static CTStrDataModel fromDocx4j(CTStrData value)
	{
		return new CTStrDataModel(
		CTUnsignedIntConverter.fromDocx4j(value.getPtCount())
		,
		value.getPt().stream().map(CTStrValConverter::fromDocx4j).collect(Collectors.toList());
		,
		CTExtensionListConverter.fromDocx4j(value.getExtLst())
		
		);
	}
}
