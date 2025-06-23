<#import "var.ftl" as var>
<#import "util.ftl" as util>

package ${content.type().pkg()};

import java.stream.Collectors;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

<#list imports as import>
import ${import}Model;
import ${import}Converter;
</#list>