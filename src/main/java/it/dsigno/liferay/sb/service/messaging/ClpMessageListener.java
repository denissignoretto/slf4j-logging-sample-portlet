package it.dsigno.liferay.sb.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import it.dsigno.liferay.sb.service.ClpSerializer;
import it.dsigno.liferay.sb.service.LoggerLocalServiceUtil;
import it.dsigno.liferay.sb.service.LoggerServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            LoggerLocalServiceUtil.clearService();

            LoggerServiceUtil.clearService();
        }
    }
}
