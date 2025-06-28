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
import test.drawingml.main.CTTextSpacingModel.*;
import test.XMLSchema.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE MODEL
public class CTTextSpacingModel
{
	
	private final int type;
	
	private final Object value;
	
	public CTTextSpacingModel() {
		this(-1, null);
	}
	
	private CTTextSpacingModel(int type, Object value) {
		this.type = type;
		this.value = value;
	}
	
	public static CTTextSpacingModel createSpcPct(CTTextSpacingPercentModel value) {
		return new CTTextSpacingModel(0, value);
	}
	public static CTTextSpacingModel createSpcPts(CTTextSpacingPointModel value) {
		return new CTTextSpacingModel(1, value);
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public boolean isSpcPct() {
		return this.type == 0;
	}
	
	public CTTextSpacingPercentModel getSpcPct() {
		if (this.type != 0) throw new ClassCastException();
		return (CTTextSpacingPercentModel) value;
	}
	public boolean isSpcPts() {
		return this.type == 1;
	}
	
	public CTTextSpacingPointModel getSpcPts() {
		if (this.type != 1) throw new ClassCastException();
		return (CTTextSpacingPointModel) value;
	}
}
