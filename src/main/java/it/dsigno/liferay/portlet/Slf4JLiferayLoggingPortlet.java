package it.dsigno.liferay.portlet;


import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Slf4JLiferayLoggingPortlet
 */
public class Slf4JLiferayLoggingPortlet extends MVCPortlet {
	
	
	public final static String GREETING_PARAM_NAME = "greeting";
	
	private final Logger _logger = LoggerFactory.getLogger(Slf4JLiferayLoggingPortlet.class);

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		
		super.doView(renderRequest, renderResponse);
			_logger.info("doView(RenderRequest, RenderResponse) !!");
			
			String greetingParamValue = renderRequest.getParameter(GREETING_PARAM_NAME);
			if (_logger.isDebugEnabled()) {
				_logger.debug("Greeting RenderRequest Parameter Value=" + greetingParamValue);
			}
	}
	
	@Override
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		
		if (_logger.isDebugEnabled()) {
			_logger.debug("processAction(ActionRequest, ActionResponse) !!");
		}
		
		String greetingParamValue = actionRequest.getParameter(GREETING_PARAM_NAME);			
		if (greetingParamValue != null) {
			_logger.info("Greeting ActionRequest Parameter Value=" +  greetingParamValue);
			actionResponse.setRenderParameter(GREETING_PARAM_NAME, greetingParamValue);
		}
	}

	@Override
	public void init(PortletConfig config) throws PortletException {
		
		super.init(config);
		if (_logger.isDebugEnabled()) {
			_logger.debug("init(PortletConfig) !!");
		}
	}
	
	@Override
	public void destroy() {
		super.destroy();
			_logger.info("destroy() !!");
	}
}
