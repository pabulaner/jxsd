package test.drawingml.chartDrawing;

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
import test.drawingml.chartDrawing.CTDrawingModel.*;
import org.docx4j.dml.*;
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// CHOICE MODEL
public class CTDrawingModel
{
	
	private final int type;
	
	private final Object value;
	
	public CTDrawingModel() {
		this(-1, null);
	}
	
	private CTDrawingModel(int type, Object value) {
		this.type = type;
		this.value = value;
	}
	
	public static CTDrawingModel createRelSizeAnchor(CTRelSizeAnchorModel value) {
		return new CTDrawingModel(0, value);
	}
	public static CTDrawingModel createAbsSizeAnchor(CTAbsSizeAnchorModel value) {
		return new CTDrawingModel(1, value);
	}
	
	public Object getRaw() {
		return this.value;
	}
	
	public boolean isRelSizeAnchor() {
		return this.type == 0;
	}
	
	public CTRelSizeAnchorModel getRelSizeAnchor() {
		if (this.type != 0) throw new ClassCastException();
		return (CTRelSizeAnchorModel) value;
	}
	public boolean isAbsSizeAnchor() {
		return this.type == 1;
	}
	
	public CTAbsSizeAnchorModel getAbsSizeAnchor() {
		if (this.type != 1) throw new ClassCastException();
		return (CTAbsSizeAnchorModel) value;
	}
}
