<%@page import="it.dsigno.liferay.portlet.Slf4JLiferayLoggingPortlet"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>slf4j-liferay</b> logging portlet.

<br />
<div>
	<form id="<portlet:namespace />_form1" name="<portlet:namespace />_form1" action="<portlet:actionURL />" method="post">
		<input type="text" name="<portlet:namespace /><%=Slf4JLiferayLoggingPortlet.GREETING_PARAM_NAME%>" value="<%=ParamUtil.get(request, Slf4JLiferayLoggingPortlet.GREETING_PARAM_NAME, "")%>"/><br />
		<button type="submit">Click me!!!</button>
	</form>
</div> 