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
import test.XMLSchema.Base64BinaryModel.*;

// PRIMITIVE CONVERTER
public class Base64BinaryConverter
{
	
	private Base64BinaryConverter() {
		// empty
	}
	
	public static Base64BinaryModel fromDocx4j(Byte[] value) {
		return new Base64BinaryModel(value);
	}
}
