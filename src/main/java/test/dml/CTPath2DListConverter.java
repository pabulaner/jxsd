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
import test.dml.CTPath2DListModel.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTPath2DListConverter
{
	
	private CTPath2DListConverter() {
		// empty
	}
	
	public static CTPath2DListModel fromDocx4j(CTPath2DList value)
	{
		return new CTPath2DListModel(
		value.getPath().stream().map(CTPath2DConverter::fromDocx4j).collect(Collectors.toList());
		
		);
	}
}
