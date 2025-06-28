package test.drawingml.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTPath2DListModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE CONVERTER
public class CTPath2DListConverter
{
	
	private CTPath2DListConverter() {
		// empty
	}
	
	public static CTPath2DListModel fromDocx4j(CTPath2DList value)
	{
		return new CTPath2DListModel(
		value.getPath().stream().map(CTPath2DConverter::fromDocx4j).collect(Collectors.toList())
		
		);
	}
}
