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
import test.dml.STPositiveCoordinate32Model.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class STPositiveCoordinate32Converter
{
	
	private STPositiveCoordinate32Converter() {
		// empty
	}
	
	public static STPositiveCoordinate32Model fromDocx4j(Long value) {
		return new STPositiveCoordinate32Model(value);
	}
}
