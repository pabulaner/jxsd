<#import "var.ftl" as var>
<#import "util.ftl" as util>

package ${content.type().pkg()};

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

<#list imports as import>
import ${import};
</#list>