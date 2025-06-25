package test.dml;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import test.dml.CTTextSpacingModel.*;
import test.dml.chart.*;
import org.docx4j.dml.chart.*;
import test.dml.chartDrawing.*;
import test.XMLSchema.*;
import test.dml.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTTextSpacingModel
{
	
	private final Object value;
	
	public CTTextSpacingModel() {
		this.value = null;
	}
	
	public CTTextSpacingModel(CTTextSpacingPercentModel value) {
		this.value = value;
	}
	public CTTextSpacingModel(CTTextSpacingPointModel value) {
		this.value = value;
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public CTTextSpacingPercentModel getSpcPct() {
		return (CTTextSpacingPercentModel) value;
	}
	public CTTextSpacingPointModel getSpcPts() {
		return (CTTextSpacingPointModel) value;
	}
}
