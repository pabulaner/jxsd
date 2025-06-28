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
import test.XMLSchema.ENTITYModel.*;
import test.officeDocument.relationships.*;

// RESTRICTION CONVERTER
public class ENTITYConverter
{
	
	private ENTITYConverter() {
		// empty
	}
	
	public static ENTITYModel fromDocx4j(String value) {
		return new ENTITYModel(value);
	}
}
