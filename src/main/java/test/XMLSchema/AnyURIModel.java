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
import test.XMLSchema.AnyURIModel.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class AnyURIModel
{
	
	private final String value;
	
	public AnyURIModel(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
