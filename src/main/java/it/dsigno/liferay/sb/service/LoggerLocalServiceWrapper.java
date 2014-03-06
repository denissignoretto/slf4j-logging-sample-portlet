package it.dsigno.liferay.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LoggerLocalService}.
 *
 * @author @denissignoretto
 * @see LoggerLocalService
 * @generated
 */
public class LoggerLocalServiceWrapper implements LoggerLocalService,
    ServiceWrapper<LoggerLocalService> {
    private LoggerLocalService _loggerLocalService;

    public LoggerLocalServiceWrapper(LoggerLocalService loggerLocalService) {
        _loggerLocalService = loggerLocalService;
    }

    /**
    * Adds the logger to the database. Also notifies the appropriate model listeners.
    *
    * @param logger the logger
    * @return the logger that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public it.dsigno.liferay.sb.model.Logger addLogger(
        it.dsigno.liferay.sb.model.Logger logger)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.addLogger(logger);
    }

    /**
    * Creates a new logger with the primary key. Does not add the logger to the database.
    *
    * @param loggerId the primary key for the new logger
    * @return the new logger
    */
    @Override
    public it.dsigno.liferay.sb.model.Logger createLogger(long loggerId) {
        return _loggerLocalService.createLogger(loggerId);
    }

    /**
    * Deletes the logger with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param loggerId the primary key of the logger
    * @return the logger that was removed
    * @throws PortalException if a logger with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public it.dsigno.liferay.sb.model.Logger deleteLogger(long loggerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.deleteLogger(loggerId);
    }

    /**
    * Deletes the logger from the database. Also notifies the appropriate model listeners.
    *
    * @param logger the logger
    * @return the logger that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public it.dsigno.liferay.sb.model.Logger deleteLogger(
        it.dsigno.liferay.sb.model.Logger logger)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.deleteLogger(logger);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _loggerLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.dsigno.liferay.sb.model.impl.LoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.dsigno.liferay.sb.model.impl.LoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public it.dsigno.liferay.sb.model.Logger fetchLogger(long loggerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.fetchLogger(loggerId);
    }

    /**
    * Returns the logger with the primary key.
    *
    * @param loggerId the primary key of the logger
    * @return the logger
    * @throws PortalException if a logger with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public it.dsigno.liferay.sb.model.Logger getLogger(long loggerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.getLogger(loggerId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the loggers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.dsigno.liferay.sb.model.impl.LoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of loggers
    * @param end the upper bound of the range of loggers (not inclusive)
    * @return the range of loggers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<it.dsigno.liferay.sb.model.Logger> getLoggers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.getLoggers(start, end);
    }

    /**
    * Returns the number of loggers.
    *
    * @return the number of loggers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getLoggersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.getLoggersCount();
    }

    /**
    * Updates the logger in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param logger the logger
    * @return the logger that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public it.dsigno.liferay.sb.model.Logger updateLogger(
        it.dsigno.liferay.sb.model.Logger logger)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.updateLogger(logger);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _loggerLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _loggerLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _loggerLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public it.dsigno.liferay.sb.model.Logger addLogMessage(long userId,
        java.lang.String logMessage)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _loggerLocalService.addLogMessage(userId, logMessage);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LoggerLocalService getWrappedLoggerLocalService() {
        return _loggerLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLoggerLocalService(
        LoggerLocalService loggerLocalService) {
        _loggerLocalService = loggerLocalService;
    }

    @Override
    public LoggerLocalService getWrappedService() {
        return _loggerLocalService;
    }

    @Override
    public void setWrappedService(LoggerLocalService loggerLocalService) {
        _loggerLocalService = loggerLocalService;
    }
}
