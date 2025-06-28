package test.drawingml.chart;

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
import test.drawingml.chart.STShapeModel.*;
import test.drawingml.chartDrawing.*;
import test.officeDocument.relationships.*;

// ENUM MODEL
public enum STShapeModel {
	
	CONE,
	CONE_TO_MAX,
	BOX,
	CYLINDER,
	PYRAMID,
	PYRAMID_TO_MAX,
}
