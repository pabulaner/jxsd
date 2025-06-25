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
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.dml.CTCustomColorListModel.*;
import test.officeDocument.relationships.*;

public class CTCustomColorListConverter
{
	
	private CTCustomColorListConverter() {
		// empty
	}
	
	public static CTCustomColorListModel fromDocx4j(CTCustomColorList value)
	{
		return new CTCustomColorListModel(
		value.getCustClr().stream().map(CTCustomColorConverter::fromDocx4j).collect(Collectors.toList());
		
		);
	}
}
