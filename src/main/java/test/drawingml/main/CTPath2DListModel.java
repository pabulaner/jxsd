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
import test.drawingml.main.*;
import org.docx4j.dml.chartDrawing.*;
import test.drawingml.chartDrawing.*;
import test.drawingml.main.CTPath2DListModel.*;
import test.officeDocument.relationships.*;

// SEQUENCE MODEL
public class CTPath2DListModel
{
	
	private final List<CTPath2DModel> path;
	
	public CTPath2DListModel(List<CTPath2DModel> path) {
		this.path = path;
	}
	
	public List<CTPath2DModel> getPath() {
		return this.path;
	}
}
