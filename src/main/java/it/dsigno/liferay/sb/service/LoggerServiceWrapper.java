package it.dsigno.liferay.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LoggerService}.
 *
 * @author @denissignoretto
 * @see LoggerService
 * @generated
 */
public class LoggerServiceWrapper implements LoggerService,
    ServiceWrapper<LoggerService> {
    private LoggerService _loggerService;

    public LoggerServiceWrapper(LoggerService loggerService) {
        _loggerService = loggerService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _loggerService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _loggerService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _loggerService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LoggerService getWrappedLoggerService() {
        return _loggerService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLoggerService(LoggerService loggerService) {
        _loggerService = loggerService;
    }

    @Override
    public LoggerService getWrappedService() {
        return _loggerService;
    }

    @Override
    public void setWrappedService(LoggerService loggerService) {
        _loggerService = loggerService;
    }
}
