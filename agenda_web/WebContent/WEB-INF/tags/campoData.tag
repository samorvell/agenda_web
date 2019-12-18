<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="agendaweb"%>

<%@ attribute name="id" required="true" %>
<%@ attribute name="place" %>

<input type="text" id="${id}" name="${id}" placeholder="${place}"/>
<script>
$("#${id}").datepicker({dateFormat: 'dd/mm/yy',
	changeMonth: true,
    changeYear: true});
</script>