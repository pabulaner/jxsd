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
import test.dml.chart.CTExtensionListModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTExtensionListConverter
{
	
	private CTExtensionListConverter() {
		// empty
	}
	
	public static CTExtensionListModel fromDocx4j(CTExtensionList value)
	{
		return new CTExtensionListModel(
		value.getExt().stream().map(CTExtensionConverter::fromDocx4j).collect(Collectors.toList());
		
		);
	}
}
