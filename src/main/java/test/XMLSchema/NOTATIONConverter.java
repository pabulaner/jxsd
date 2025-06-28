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
import test.XMLSchema.NOTATIONModel.*;
import test.officeDocument.relationships.*;

// PRIMITIVE CONVERTER
public class NOTATIONConverter
{
	
	private NOTATIONConverter() {
		// empty
	}
	
	public static NOTATIONModel fromDocx4j(String value) {
		return new NOTATIONModel(value);
	}
}
