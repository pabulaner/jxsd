package test.XMLSchema;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.XMLSchema.GMonthDayModel.*;
import org.docx4j.dml.chart.*;
import test.drawingml.chart.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// PRIMITIVE CONVERTER
public class GMonthDayConverter
{
	
	private GMonthDayConverter() {
		// empty
	}
	
	public static GMonthDayModel fromDocx4j(Int value) {
		return new GMonthDayModel(value);
	}
}
