package test.XMLSchema;

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
import test.officeDocument.relationships.*;
import test.XMLSchema.GYearMonthModel.*;

// PRIMITIVE CONVERTER
public class GYearMonthConverter
{
	
	private GYearMonthConverter() {
		// empty
	}
	
	public static GYearMonthModel fromDocx4j(Int value) {
		return new GYearMonthModel(value);
	}
}
