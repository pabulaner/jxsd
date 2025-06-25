package test.dml.chart;

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
import test.dml.chart.CTExtensionListModel.*;
import org.docx4j.dml.*;
import org.docx4j.dml.chartDrawing.*;
import test.officeDocument.relationships.*;

public class CTExtensionListModel
{
	
	private final List<CTExtensionModel> ext;
	
	public CTExtensionListModel(List<CTExtensionModel> ext) {
		this.ext = ext;
	}
	
	public List<CTExtensionModel> getExt() {
		return this.ext;
	}
}
