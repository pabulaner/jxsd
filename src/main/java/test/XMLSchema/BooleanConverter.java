package test.XMLSchema;

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
import test.XMLSchema.BooleanModel.*;
import test.officeDocument.relationships.*;

public class BooleanConverter
{
	
	private BooleanConverter() {
		// empty
	}
	
	public static BooleanModel fromDocx4j(Boolean value) {
		return new BooleanModel(value);
	}
}
