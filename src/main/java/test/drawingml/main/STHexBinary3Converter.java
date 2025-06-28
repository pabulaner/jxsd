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
import test.drawingml.main.STHexBinary3Model.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// RESTRICTION CONVERTER
public class STHexBinary3Converter
{
	
	private STHexBinary3Converter() {
		// empty
	}
	
	public static STHexBinary3Model fromDocx4j(Byte[] value) {
		return new STHexBinary3Model(value);
	}
}
