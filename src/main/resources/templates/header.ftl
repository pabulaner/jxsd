<#if !(is_inner!false)>
    package ${content.type().pkg()?join(".")};

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
</#if>