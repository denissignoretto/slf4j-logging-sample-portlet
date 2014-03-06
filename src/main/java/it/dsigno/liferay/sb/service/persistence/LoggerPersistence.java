package it.dsigno.liferay.sb.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import it.dsigno.liferay.sb.model.Logger;

/**
 * The persistence interface for the logger service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author @denissignoretto
 * @see LoggerPersistenceImpl
 * @see LoggerUtil
 * @generated
 */
public interface LoggerPersistence extends BasePersistence<Logger> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LoggerUtil} to access the logger persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the logger in the entity cache if it is enabled.
    *
    * @param logger the logger
    */
    public void cacheResult(it.dsigno.liferay.sb.model.Logger logger);

    /**
    * Caches the loggers in the entity cache if it is enabled.
    *
    * @param loggers the loggers
    */
    public void cacheResult(
        java.util.List<it.dsigno.liferay.sb.model.Logger> loggers);

    /**
    * Creates a new logger with the primary key. Does not add the logger to the database.
    *
    * @param loggerId the primary key for the new logger
    * @return the new logger
    */
    public it.dsigno.liferay.sb.model.Logger create(long loggerId);

    /**
    * Removes the logger with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param loggerId the primary key of the logger
    * @return the logger that was removed
    * @throws it.dsigno.liferay.sb.NoSuchLoggerException if a logger with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public it.dsigno.liferay.sb.model.Logger remove(long loggerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            it.dsigno.liferay.sb.NoSuchLoggerException;

    public it.dsigno.liferay.sb.model.Logger updateImpl(
        it.dsigno.liferay.sb.model.Logger logger)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the logger with the primary key or throws a {@link it.dsigno.liferay.sb.NoSuchLoggerException} if it could not be found.
    *
    * @param loggerId the primary key of the logger
    * @return the logger
    * @throws it.dsigno.liferay.sb.NoSuchLoggerException if a logger with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public it.dsigno.liferay.sb.model.Logger findByPrimaryKey(long loggerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            it.dsigno.liferay.sb.NoSuchLoggerException;

    /**
    * Returns the logger with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param loggerId the primary key of the logger
    * @return the logger, or <code>null</code> if a logger with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public it.dsigno.liferay.sb.model.Logger fetchByPrimaryKey(long loggerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the loggers.
    *
    * @return the loggers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<it.dsigno.liferay.sb.model.Logger> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<it.dsigno.liferay.sb.model.Logger> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<it.dsigno.liferay.sb.model.Logger> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the loggers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of loggers.
    *
    * @return the number of loggers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
