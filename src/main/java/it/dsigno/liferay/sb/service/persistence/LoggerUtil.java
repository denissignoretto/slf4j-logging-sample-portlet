package it.dsigno.liferay.sb.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import it.dsigno.liferay.sb.model.Logger;

import java.util.List;

/**
 * The persistence utility for the logger service. This utility wraps {@link LoggerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author @denissignoretto
 * @see LoggerPersistence
 * @see LoggerPersistenceImpl
 * @generated
 */
public class LoggerUtil {
    private static LoggerPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Logger logger) {
        getPersistence().clearCache(logger);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Logger> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Logger> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Logger> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Logger update(Logger logger) throws SystemException {
        return getPersistence().update(logger);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Logger update(Logger logger, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(logger, serviceContext);
    }

    /**
    * Caches the logger in the entity cache if it is enabled.
    *
    * @param logger the logger
    */
    public static void cacheResult(it.dsigno.liferay.sb.model.Logger logger) {
        getPersistence().cacheResult(logger);
    }

    /**
    * Caches the loggers in the entity cache if it is enabled.
    *
    * @param loggers the loggers
    */
    public static void cacheResult(
        java.util.List<it.dsigno.liferay.sb.model.Logger> loggers) {
        getPersistence().cacheResult(loggers);
    }

    /**
    * Creates a new logger with the primary key. Does not add the logger to the database.
    *
    * @param loggerId the primary key for the new logger
    * @return the new logger
    */
    public static it.dsigno.liferay.sb.model.Logger create(long loggerId) {
        return getPersistence().create(loggerId);
    }

    /**
    * Removes the logger with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param loggerId the primary key of the logger
    * @return the logger that was removed
    * @throws it.dsigno.liferay.sb.NoSuchLoggerException if a logger with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static it.dsigno.liferay.sb.model.Logger remove(long loggerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            it.dsigno.liferay.sb.NoSuchLoggerException {
        return getPersistence().remove(loggerId);
    }

    public static it.dsigno.liferay.sb.model.Logger updateImpl(
        it.dsigno.liferay.sb.model.Logger logger)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(logger);
    }

    /**
    * Returns the logger with the primary key or throws a {@link it.dsigno.liferay.sb.NoSuchLoggerException} if it could not be found.
    *
    * @param loggerId the primary key of the logger
    * @return the logger
    * @throws it.dsigno.liferay.sb.NoSuchLoggerException if a logger with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static it.dsigno.liferay.sb.model.Logger findByPrimaryKey(
        long loggerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            it.dsigno.liferay.sb.NoSuchLoggerException {
        return getPersistence().findByPrimaryKey(loggerId);
    }

    /**
    * Returns the logger with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param loggerId the primary key of the logger
    * @return the logger, or <code>null</code> if a logger with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static it.dsigno.liferay.sb.model.Logger fetchByPrimaryKey(
        long loggerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(loggerId);
    }

    /**
    * Returns all the loggers.
    *
    * @return the loggers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<it.dsigno.liferay.sb.model.Logger> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<it.dsigno.liferay.sb.model.Logger> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the loggers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.dsigno.liferay.sb.model.impl.LoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of loggers
    * @param end the upper bound of the range of loggers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of loggers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<it.dsigno.liferay.sb.model.Logger> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the loggers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of loggers.
    *
    * @return the number of loggers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LoggerPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LoggerPersistence) PortletBeanLocatorUtil.locate(it.dsigno.liferay.sb.service.ClpSerializer.getServletContextName(),
                    LoggerPersistence.class.getName());

            ReferenceRegistry.registerReference(LoggerUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(LoggerPersistence persistence) {
    }
}
